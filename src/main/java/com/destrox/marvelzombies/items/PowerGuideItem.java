package com.destrox.marvelzombies.items;

import com.destrox.marvelzombies.entity.ShadowMinionEntity;
import com.destrox.marvelzombies.init.ModEntities;
import com.destrox.marvelzombies.util.PlayerProgress;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ShadowArmyTotemItem extends Item {
    public ShadowArmyTotemItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!(player instanceof ServerPlayer serverPlayer)) {
            return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
        }

        if (PlayerProgress.getLevel(serverPlayer) < 3) {
            player.displayClientMessage(Component.literal("§cNecesitas llegar al nivel 3 para despertar al Ejército de Sombras."), true);
            return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
        }

        if (!level.isClientSide && level instanceof ServerLevel serverLevel) {
            var existing = serverLevel.getEntitiesOfClass(ShadowMinionEntity.class, player.getBoundingBox().inflate(24.0D), entity -> entity.getOwner() == player);
            if (!existing.isEmpty()) {
                for (ShadowMinionEntity entity : existing) {
                    entity.discard();
                }
                player.displayClientMessage(Component.literal("§7Has descartado a tus sombras."), false);
                return InteractionResultHolder.sidedSuccess(stack, true);
            }

            BlockPos pos = player.blockPosition();
            for (int i = 0; i < 3; i++) {
                BlockPos spawnPos = pos.offset(player.getRandom().nextInt(5) - 2, 0, player.getRandom().nextInt(5) - 2);
                ShadowMinionEntity minion = ModEntities.SHADOW_MINION.get().create(serverLevel);
                if (minion != null) {
                    minion.moveTo(spawnPos.getX() + 0.5D, spawnPos.getY(), spawnPos.getZ() + 0.5D, 0.0F, 0.0F);
                    minion.setOwner(player);
                    minion.finalizeSpawn(serverLevel, serverLevel.getCurrentDifficultyAt(spawnPos), MobSpawnType.MOB_SUMMONED, null, null);
                    serverLevel.addFreshEntity(minion);
                }
            }

            player.displayClientMessage(Component.literal("§eEl Ejército de Sombras ha sido convocado."), false);
            player.getCooldowns().addCooldown(this, 200);
        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }
}
