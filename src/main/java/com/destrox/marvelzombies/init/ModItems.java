package com.destrox.marvelzombies.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PowerGuideItem extends Item {
    public PowerGuideItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("§6Guía de Poderes"));
            player.sendSystemMessage(Component.literal("§7=== NIVEL 1–3 ==="));
            player.sendSystemMessage(Component.literal("§7Nivel 1: Espada de Energía. Nivel 2: Kit tecnológico. Nivel 3: Ejército de Sombras."));
            player.sendSystemMessage(Component.literal("§7=== ARMAS Y RECOMPENSAS ==="));
            player.sendSystemMessage(Component.literal("§7Nivel 3: Ejército de Sombras permanente."));
            player.sendSystemMessage(Component.literal("§7Nivel 10: Rifle de plasma."));
            player.sendSystemMessage(Component.literal("§7Nivel 20: Hoja del Vacío."));
            player.sendSystemMessage(Component.literal("§7Nivel 35: Tropas de sombras reforzadas."));
            player.sendSystemMessage(Component.literal("§7Nivel 50: Exotraje intermedio / definitivo."));
            player.sendSystemMessage(Component.literal("§7Nivel 75: Cañón de rayos."));
            player.sendSystemMessage(Component.literal("§7Nivel 100: Poder máximo / final."));
            player.sendSystemMessage(Component.literal("§7También se mantienen las recompensas extra previas: exotrajes básicos, avanzados, legendarios y arma de energía avanzada."));
            player.sendSystemMessage(Component.literal("§7Derrota monstruos y jefes para subir de nivel, conseguir materiales del mundo y reforzar tu ejército."));
            player.sendSystemMessage(Component.literal("§7El Tótem de Sombras invoca o desecha a tus guerreros si los necesitas."));
        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }
}
