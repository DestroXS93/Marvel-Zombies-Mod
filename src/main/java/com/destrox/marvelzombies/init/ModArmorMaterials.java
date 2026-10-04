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

    public static final RegistryObject<Item> TECH_KIT = ITEMS.register("tech_kit",
            () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard",
            () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> VOID_ESSENCE = ITEMS.register("void_essence",
            () -> new Item(new Item.Properties().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> PLASMA_PISTOL = ITEMS.register("plasma_pistol",
            () -> new FuturisticWeaponItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 6, 0.95F));

    public static final RegistryObject<Item> PLASMA_RIFLE = ITEMS.register("plasma_rifle",
            () -> new FuturisticWeaponItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 9, 0.9F));

    public static final RegistryObject<Item> FUTURISTIC_RIFLE = ITEMS.register("futuristic_rifle",
            () -> new FuturisticWeaponItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 11, 0.85F));

    public static final RegistryObject<Item> VOID_BLADE = ITEMS.register("void_blade",
            () -> new FuturisticWeaponItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 12, 0.8F));

    public static final RegistryObject<Item> ADVANCED_ENERGY_WEAPON = ITEMS.register("advanced_energy_weapon",
            () -> new FuturisticWeaponItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 14, 0.75F));

    public static final RegistryObject<Item> RAY_CANNON = ITEMS.register("ray_cannon",
            () -> new FuturisticWeaponItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC), 16, 0.7F));

    public static final RegistryObject<Item> EXO_HELMET_BASIC = ITEMS.register("exo_helmet_basic",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_BASIC, net.minecraft.world.item.ArmorItem.Type.HELMET,
                    new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));

    public static final RegistryObject<Item> EXO_CHESTPLATE_BASIC = ITEMS.register("exo_chestplate_basic",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_BASIC, net.minecraft.world.item.ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));

    public static final RegistryObject<Item> EXO_LEGGINGS_BASIC = ITEMS.register("exo_leggings_basic",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_BASIC, net.minecraft.world.item.ArmorItem.Type.LEGGINGS,
                    new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));

    public static final RegistryObject<Item> EXO_BOOTS_BASIC = ITEMS.register("exo_boots_basic",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_BASIC, net.minecraft.world.item.ArmorItem.Type.BOOTS,
                    new Item.Properties().rarity(Rarity.RARE).stacksTo(1)));

    public static final RegistryObject<Item> EXO_HELMET_ADVANCED = ITEMS.register("exo_helmet_advanced",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_ADVANCED, net.minecraft.world.item.ArmorItem.Type.HELMET,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_CHESTPLATE_ADVANCED = ITEMS.register("exo_chestplate_advanced",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_ADVANCED, net.minecraft.world.item.ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_LEGGINGS_ADVANCED = ITEMS.register("exo_leggings_advanced",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_ADVANCED, net.minecraft.world.item.ArmorItem.Type.LEGGINGS,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_BOOTS_ADVANCED = ITEMS.register("exo_boots_advanced",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_ADVANCED, net.minecraft.world.item.ArmorItem.Type.BOOTS,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_HELMET_LEGENDARY = ITEMS.register("exo_helmet_legendary",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_LEGENDARY, net.minecraft.world.item.ArmorItem.Type.HELMET,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_CHESTPLATE_LEGENDARY = ITEMS.register("exo_chestplate_legendary",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_LEGENDARY, net.minecraft.world.item.ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_LEGGINGS_LEGENDARY = ITEMS.register("exo_leggings_legendary",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_LEGENDARY, net.minecraft.world.item.ArmorItem.Type.LEGGINGS,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_BOOTS_LEGENDARY = ITEMS.register("exo_boots_legendary",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_LEGENDARY, net.minecraft.world.item.ArmorItem.Type.BOOTS,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_HELMET_ULTIMATE = ITEMS.register("exo_helmet_ultimate",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_ULTIMATE, net.minecraft.world.item.ArmorItem.Type.HELMET,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_CHESTPLATE_ULTIMATE = ITEMS.register("exo_chestplate_ultimate",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_ULTIMATE, net.minecraft.world.item.ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_LEGGINGS_ULTIMATE = ITEMS.register("exo_leggings_ultimate",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_ULTIMATE, net.minecraft.world.item.ArmorItem.Type.LEGGINGS,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    public static final RegistryObject<Item> EXO_BOOTS_ULTIMATE = ITEMS.register("exo_boots_ultimate",
            () -> new ExoSuitItem(ModArmorMaterials.EXO_SUIT_ULTIMATE, net.minecraft.world.item.ArmorItem.Type.BOOTS,
                    new Item.Properties().rarity(Rarity.EPIC).stacksTo(1)));

    private ModItems() {
    }
}
