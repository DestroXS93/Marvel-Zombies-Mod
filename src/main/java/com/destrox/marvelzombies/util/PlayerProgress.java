package com.destrox.marvelzombies.init;

import com.destrox.marvelzombies.items.EnergySwordItem;
import com.destrox.marvelzombies.items.ExoSuitItem;
import com.destrox.marvelzombies.items.FuturisticWeaponItem;
import com.destrox.marvelzombies.items.PowerGuideItem;
import com.destrox.marvelzombies.items.ShadowArmyTotemItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "marvelzombiesmod");

    public static final RegistryObject<Item> POWER_GUIDE = ITEMS.register("power_guide",
            () -> new PowerGuideItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ENERGY_SWORD = ITEMS.register("energy_sword",
            () -> new EnergySwordItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> SHADOW_ARMY_TOTEM = ITEMS.register("shadow_army_totem",
            () -> new ShadowArmyTotemItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> NEON_INGOT = ITEMS.register("neon_ingot",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> SHADOW_CORE = ITEMS.register("shadow_core",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> VOID_CIRCUIT = ITEMS.register("void_circuit",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> PLASMA_RIFLE = ITEMS.register("plasma_rifle",
            () -> new FuturisticWeaponItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 9, 0.9F));

    public static final RegistryObject<Item> VOID_BLADE = ITEMS.register("void_blade",
            () -> new FuturisticWeaponItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 11, 0.8F));

    public static final RegistryObject<Item> RAY_CANNON = ITEMS.register("ray_cannon",
            () -> new FuturisticWeaponItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 12, 0.7F));

    public static final RegistryObject<Item> EXO_HELMET = ITEMS.register("exo_helmet",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT, net.minecraft.world.item.ArmorItem.Type.HELMET,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_CHESTPLATE = ITEMS.register("exo_chestplate",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT, net.minecraft.world.item.ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_LEGGINGS = ITEMS.register("exo_leggings",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT, net.minecraft.world.item.ArmorItem.Type.LEGGINGS,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_BOOTS = ITEMS.register("exo_boots",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT, net.minecraft.world.item.ArmorItem.Type.BOOTS,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    private ModItems() {
    }
}
