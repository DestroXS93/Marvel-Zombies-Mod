package com.destrox.marvelzombies;

import com.destrox.marvelzombies.init.ModBlocks;
import com.destrox.marvelzombies.init.ModCreativeModeTabs;
import com.destrox.marvelzombies.init.ModEntities;
import com.destrox.marvelzombies.init.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MarvelZombiesMod.MODID)
public class MarvelZombiesMod {
    public static final String MODID = "marvelzombiesmod";

    public MarvelZombiesMod() {
        IEventBus modBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        ModItems.ITEMS.register(modBus);
        ModBlocks.BLOCKS.register(modBus);
        ModEntities.ENTITY_TYPES.register(modBus);
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(modBus);

        modBus.addListener(this::commonSetup);
        forgeBus.register(com.destrox.marvelzombies.event.ModEvents.class);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Configuración inicial del mod.
    }
}
