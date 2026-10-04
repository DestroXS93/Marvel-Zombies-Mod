package com.destrox.marvelzombies.items;

import com.destrox.marvelzombies.entity.ShadowMinionEntity;
import com.destrox.marvelzombies.init.ModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
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
        if (!level.isClientSide && level instanceof ServerLevel serverLevel) {
            BlockPos pos = player.blockPosition();
            for (int i = 0; i < 3; i++) {
                BlockPos spawnPos = pos.offset(player.getRandom().nextInt(3) - 1, 0, player.getRandom().nextInt(3) - 1);
                ShadowMinionEntity minion = ModEntities.SHADOW_MINION.get().create(serverLevel);
                if (minion != null) {
                    minion.moveTo(spawnPos.getX() + 0.5D, spawnPos.getY(), spawnPos.getZ() + 0.5D, 0.0F, 0.0F);
                    minion.setOwner(player);
                    minion.finalizeSpawn(serverLevel, serverLevel.getCurrentDifficultyAt(spawnPos), MobSpawnType.MOB_SUMMONED, null, null);
                    serverLevel.addFreshEntity(minion);
                }
            }
            player.getCooldowns().addCooldown(this, 200);
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }
}
