package com.destrox.marvelzombies.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class EnergySwordItem extends SwordItem {
    public EnergySwordItem(Properties properties) {
        super(new Tier() {
            @Override
            public int getUses() { return 4096; }

            @Override
            public float getSpeed() { return 12.0F; }

            @Override
            public float getAttackDamageBonus() { return 7.0F; }

            @Override
            public int getLevel() { return 4; }

            @Override
            public int getEnchantmentValue() { return 25; }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(net.minecraft.world.item.Items.IRON_INGOT);
            }
        }, 3, -2.4F, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (target.isAlive()) {
            target.setSecondsOnFire(2);
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
