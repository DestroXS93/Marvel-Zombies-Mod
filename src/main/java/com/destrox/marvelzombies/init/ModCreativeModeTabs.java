package com.destrox.marvelzombies.init;

import com.destrox.marvelzombies.MarvelZombiesMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MarvelZombiesMod.MODID);

    public static final RegistryObject<CreativeModeTab> MARVEL_ZOMBIES = CREATIVE_MODE_TABS.register("marvel_zombies_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.literal("Marvel Zombies"))
                    .icon(() -> new ItemStack(ModItems.ENERGY_SWORD.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.POWER_GUIDE.get());
                        output.accept(ModItems.ENERGY_SWORD.get());
                        output.accept(ModItems.SHADOW_ARMY_TOTEM.get());
                        output.accept(ModItems.NEON_INGOT.get());
                        output.accept(ModItems.SHADOW_CORE.get());
                        output.accept(ModItems.VOID_CIRCUIT.get());
                        output.accept(ModItems.PLASMA_RIFLE.get());
                        output.accept(ModItems.VOID_BLADE.get());
                        output.accept(ModItems.RAY_CANNON.get());
                        output.accept(ModBlocks.NEON_ORE_ITEM.get());
                        output.accept(ModBlocks.STARLIGHT_BLOCK_ITEM.get());
                    })
                    .build());

    private ModCreativeModeTabs() {
    }
}
