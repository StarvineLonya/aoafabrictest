package com.svln.aoa3fabric.registry;

import com.svln.aoa3fabric.AoA3Fabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class AoABlocks {
    //stone
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

    //dirt
    public static final  Block ARCHAIC_DIRT = registerBlock("archaic_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.DIRT_BROWN).strength(1.5f,4f)));
    public static final Block AROMATIC_DIRT = registerBlock("aromatic_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.MAGENTA)));
    public static final Block BLACKENED_SOIL = registerBlock("blackened_soil", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.GRAY)));
    public static final Block CANDIED_DIRT = registerBlock("candied_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.PINK)));
    public static final Block CELEVIAN_DIRT = registerBlock("celevian_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.WHITE)));
    public static final Block CORAL_SOIL = registerBlock("coral_soil", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.TERRACOTTA_MAGENTA)));
    public static final Block CREEP_DIRT = registerBlock("creep_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.DARK_GREEN)));
    public static final Block FUNGAL_DIRT = registerBlock("fungal_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.MAGENTA)));
    public static final Block GRECKON_DIRT = registerBlock("greckon_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.TERRACOTTA_BROWN)));
    public static final Block LUNALYTE_DIRT = registerBlock("lunalyte_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.PINK)));
    public static final Block LUNASOLE_DIRT = registerBlock("lunasole_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.PALE_PURPLE)));
    public static final Block POLLUTED_SOIL = registerBlock("polluted_soil", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.TERRACOTTA_CYAN)));
    public static final Block PRECASIAN_SOIL = registerBlock("precasian_soil", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.BROWN)));
    public static final Block WEIGHTLESS_DIRT = registerBlock("weightless_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT).mapColor(MapColor.MAGENTA)));

    //Grass without generation
    public static final Block ABYSSAL_GRASS = registerBlock("abyssal_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.DARK_CRIMSON)));
    public static final Block AROMATIC_GRASS = registerBlock("aromatic_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.LIME)));
    public static final Block BRIGHT_GRASS = registerBlock("bright_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.GOLD)));
    public static final Block CANDIED_GRASS = registerBlock("candied_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.TERRACOTTA_PINK)));
    public static final Block CELEVIAN_GRASS = registerBlock("celevian_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.RED)));
    public static final Block CORAL_GRASS = registerBlock("coral_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.DIAMOND_BLUE)));
    public static final Block CREEP_GRASS = registerBlock("creep_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.EMERALD_GREEN)));
    public static final Block FADED_GRASS = registerBlock("faded_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.BLACK)));
    public static final Block FUNGAL_GRASS = registerBlock("fungal_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.CYAN)));
    public static final Block GRECKON_GRASS = registerBlock("greckon_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.PURPLE)));
    public static final Block INVERTED_LELYETIAN_GRASS = registerBlock("inverted_lelyetian_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.PALE_YELLOW)));
    public static final Block IROGRASS = registerBlock("irograss", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.TERRACOTTA_YELLOW)));
    public static final Block LELYETIAN_GRASS = registerBlock("lelyetian_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.ORANGE)));
    public static final Block LUNALYTE_GRASS = registerBlock("lunalyte_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.MAGENTA)));
    public static final Block LUNASOLE_GRASS = registerBlock("lunasole_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.BLUE)));
    public static final Block POLLUTED_GRASS = registerBlock("polluted_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.TERRACOTTA_GREEN)));
    public static final Block PRECASIAN_GRASS = registerBlock("precasian_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).mapColor(MapColor.PALE_GREEN)));
    public static final Block RUNIC_GRASS = registerBlock("runic_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.LAPIS_BLUE)));
    public static final Block WEIGHTLESS_GRASS = registerBlock("weightless_grass", new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.NYLIUM).mapColor(MapColor.DIAMOND_BLUE)));

    //Ores WIP
    public static final Block LIMONITE_ORE = registerBlock("limonite_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_LIMONITE_ORE = registerBlock("deepslate_limonite_ore", new ExperienceDroppingBlock(ConstantIntProvider.create(0), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block JADE_ORE = registerBlock("jade_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 8), FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));
    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 8), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));

    //


    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AoA3Fabric.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AoA3Fabric.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    //
    public static void registerModBlocks() {
        AoA3Fabric.LOGGER.info("Registering AoABlocks for" + AoA3Fabric.MOD_ID);
    }
}
