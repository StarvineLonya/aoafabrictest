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
    public static final Block AROMATIC_STONE = registerBlock("aromatic_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.MAGENTA)));
    public static final Block BARON_STONE = registerBlock("baron_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block BRIGHT_ROCK = registerBlock("bright_rock",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block CORAL_ROCK = registerBlock("coral_rock",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.RED)));
    public static final Block CREEP_STONE = registerBlock("creep_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GREEN)));
    public static final Block CRYSTALLISED_ROCK = registerBlock("crystallised_rock",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PURPLE)));
    public static final Block DARKENED_ROCK = registerBlock("darkened_rock",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLACK)));
    public static final Block DENSE_STONE = registerBlock("dense_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.LIGHT_GRAY)));
    public static final Block FUNGAL_ROCK = registerBlock("fungal_rock",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BLUE)));
    public static final Block GRECKON_STONE = registerBlock("greckon_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_PURPLE)));
    public static final Block HELLSTONE = registerBlock("hellstone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BRIGHT_RED)));
    public static final Block IROSTONE = registerBlock("irostone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY)));
    public static final Block LELYETIAN_STONE = registerBlock("lelyetian_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.PALE_YELLOW)));
    public static final Block POLLUTED_STONE = registerBlock("polluted_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_GRAY)));
    public static final Block PRECASIAN_STONE = registerBlock("precasian_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block PRESSED_CREEP_STONE = registerBlock("pressed_creep_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIME)));
    public static final Block PRIMED_STONE = registerBlock("primed_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.GRAY)));
    public static final Block RUNIC_STONE = registerBlock("runic_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.BLUE)));
    public static final Block WEIGHTLESS_STONE = registerBlock("weightless_stone",new Block(FabricBlockSettings.copyOf(Blocks.STONE).mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));




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
