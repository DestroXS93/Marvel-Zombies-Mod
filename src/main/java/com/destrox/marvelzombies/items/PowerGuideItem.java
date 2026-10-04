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
            player.sendSystemMessage(Component.literal("§7Nivelación: derrota monstruos y jefes para ganar experiencia."));
            player.sendSystemMessage(Component.literal("§7Al llegar al nivel 3, despiertas tu Ejército de Sombras."));
            player.sendSystemMessage(Component.literal("§7Recoge materiales del mundo para crear armas futuristas y exotrajes."));
            player.sendSystemMessage(Component.literal("§7Usa la Espada de Energía para abrir paso en la batalla."));
            player.sendSystemMessage(Component.literal("§7El Ejército de Sombras es permanente y puede ser descartado cuando lo necesites."));
        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }
}
