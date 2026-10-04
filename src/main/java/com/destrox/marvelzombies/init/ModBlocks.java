package com.destrox.marvelzombies.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "marvelzombiesmod");

    public static final RegistryObject<Block> NEON_ORE = BLOCKS.register("neon_ore",
            () -> new Block(BlockBehaviour.Properties.of().strength(4.0F, 12.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> STARLIGHT_BLOCK = BLOCKS.register("starlight_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(5.0F, 14.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<BlockItem> NEON_ORE_ITEM = ModItems.ITEMS.register("neon_ore",
            () -> new BlockItem(NEON_ORE.get(), new Item.Properties()));

    public static final RegistryObject<BlockItem> STARLIGHT_BLOCK_ITEM = ModItems.ITEMS.register("starlight_block",
            () -> new BlockItem(STARLIGHT_BLOCK.get(), new Item.Properties()));

    private ModBlocks() {
    }
}
