package com.svln.aoa3fabric.registry;

import com.svln.aoa3fabric.AoA3Fabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AoABlocks {
    //
    public static final Block ABYSSAL_STONE = registerBlock("abyssal_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.DARK_RED)));




    //
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AoA3Fabric.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AoA3Fabric.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        //
    }
    public static void registerModBlocks() {
        AoA3Fabric.LOGGER.info("Registering AoABlocks for" + AoA3Fabric.MOD_ID);
    }
}
