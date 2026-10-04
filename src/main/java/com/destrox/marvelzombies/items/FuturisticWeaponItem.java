package com.destrox.marvelzombies.items;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class FuturisticWeaponItem extends Item {
    private final int damage;
    private final float cooldown;

    public FuturisticWeaponItem(Properties properties, int damage, float cooldown) {
        super(properties);
        this.damage = damage;
        this.cooldown = cooldown;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            player.getCooldowns().addCooldown(this, Math.round(20.0F * cooldown));
        }
        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }

    public int getDamageValue() {
        return damage;
    }
}
