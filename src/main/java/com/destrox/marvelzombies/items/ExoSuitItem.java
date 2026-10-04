package com.destrox.marvelzombies.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterials implements ArmorMaterial {
    public static final ModArmorMaterials EXO_SUIT = new ModArmorMaterials();

    private static final int[] DURABILITY = { 200, 230, 250, 180 };
    private static final int[] DEFENSE = { 3, 7, 8, 3 };

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return DURABILITY[type.ordinal()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return DEFENSE[type.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return 25;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(ModItems.SHADOW_CORE.get(), ModItems.VOID_CIRCUIT.get(), Items.IRON_INGOT);
    }

    @Override
    public String getName() {
        return "marvelzombiesmod:exo_suit";
    }

    @Override
    public float getToughness() {
        return 3.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.12F;
    }
}
