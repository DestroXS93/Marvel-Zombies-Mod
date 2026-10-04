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
            player.sendSystemMessage(Component.literal("§7Sistema de nivelación: derrota monstruos y jefes para ganar experiencia."));
            player.sendSystemMessage(Component.literal("§7Al llegar al nivel 3, despiertas al Ejército de Sombras permanente."));
            player.sendSystemMessage(Component.literal("§7Recoge mineral de neón, núcleo de sombra y circuitos del vacío para fabricar armas futuristas."));
            player.sendSystemMessage(Component.literal("§7Crea exotrajes con piezas de shadow_core y void_circuit para obtener habilidades especiales."));
            player.sendSystemMessage(Component.literal("§7La Espada de Energía es tu arma inicial. El Tótem de Sombras invoca o descarta a tus sombras."));
            player.sendSystemMessage(Component.literal("§7Recompensas por nivel: nivel 3, 10, 20, 35, 50, 75 y 100."));
        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }
}
