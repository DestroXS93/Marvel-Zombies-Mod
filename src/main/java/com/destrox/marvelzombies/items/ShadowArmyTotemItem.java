package com.destrox.marvelzombies.event;

import com.destrox.marvelzombies.init.ModItems;
import com.destrox.marvelzombies.util.PlayerProgress;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "marvelzombiesmod")
public final class ModEvents {
    private ModEvents() {
    }

    @SubscribeEvent
    public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) {
            return;
        }

        CompoundTag data = player.getPersistentData();
        if (!data.getBoolean("starter_pack_given")) {
            player.getInventory().add(new ItemStack(ModItems.POWER_GUIDE.get()));
            player.getInventory().add(new ItemStack(ModItems.ENERGY_SWORD.get()));
            player.getInventory().add(new ItemStack(ModItems.SHADOW_ARMY_TOTEM.get()));
            data.putBoolean("starter_pack_given", true);
            player.displayClientMessage(Component.literal("§aBienvenido al mundo de Marvel Zombies. Tu viaje comienza ahora."), false);
            player.displayClientMessage(Component.literal("§7Abre la Guía de Poderes para aprender a subir de nivel, crear armas y usar los exotrajes."), false);
        }

        PlayerProgress.grantStarterPack(player);
    }

    @SubscribeEvent
    public static void onLivingDeath(LivingDeathEvent event) {
        if (event.getEntity().level().isClientSide) {
            return;
        }

        if (!(event.getSource().getEntity() instanceof ServerPlayer player)) {
            return;
        }

        Entity killed = event.getEntity();
        if (killed instanceof Player) {
            return;
        }

        int xp = (int) Math.max(8.0F, Math.ceil(killed.getMaxHealth() / 3.0F));
        PlayerProgress.addXp(player, xp);

        if (PlayerProgress.getLevel(player) >= 3) {
            CompoundTag data = player.getPersistentData();
            if (!data.getBoolean("shadow_ability_unlocked")) {
                data.putBoolean("shadow_ability_unlocked", true);
                player.displayClientMessage(Component.literal("§eTu Ejército de Sombras ha despertado."), false);
            }
        }
    }
}
