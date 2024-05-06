package com.svln.aoa3fabric.registry;

import com.svln.aoa3fabric.AoA3Fabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class AoACreativeModeTab {
    public static final ItemGroup MISC_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AoA3Fabric.MOD_ID,"miscellaneous"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.aoa3fabric.miscellaneous"))
                    .icon(() -> new ItemStack(AoAItems.LIMONITE_INGOT)).entries(((displayContext, entries) -> { //icon here
                        //misc entries here
                        entries.add(AoAItems.JADE);
                        entries.add(AoAItems.LIMONITE_INGOT);
                        //
                    })).build());

    public static final ItemGroup GENERATION_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AoA3Fabric.MOD_ID,"worldgen_blocks"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.aoa3fabric.worldgen_blocks"))
                    .icon(() -> new ItemStack(AoABlocks.ABYSSAL_STONE)).entries(((displayContext, entries) -> { //icon here
                        //generation blocks entries here
                        //stone
                        entries.add(AoABlocks.ABYSSAL_STONE);
                        entries.add(AoABlocks.AROMATIC_STONE);
                        entries.add(AoABlocks.BARON_STONE);
                        entries.add(AoABlocks.BRIGHT_ROCK);
                        entries.add(AoABlocks.CORAL_ROCK);
                        entries.add(AoABlocks.CREEP_STONE);
                        entries.add(AoABlocks.CRYSTALLISED_ROCK);
                        entries.add(AoABlocks.DARKENED_ROCK);
                        entries.add(AoABlocks.DENSE_STONE);
                        entries.add(AoABlocks.FUNGAL_ROCK);
                        entries.add(AoABlocks.GRECKON_STONE);
                        entries.add(AoABlocks.HELLSTONE);
                        entries.add(AoABlocks.IROSTONE);
                        entries.add(AoABlocks.LELYETIAN_STONE);
                        entries.add(AoABlocks.POLLUTED_STONE);
                        entries.add(AoABlocks.PRECASIAN_STONE);
                        entries.add(AoABlocks.PRESSED_CREEP_STONE);
                        entries.add(AoABlocks.PRIMED_STONE);
                        entries.add(AoABlocks.RUNIC_STONE);
                        entries.add(AoABlocks.WEIGHTLESS_STONE);
                        //dirt
                        entries.add(AoABlocks.ARCHAIC_DIRT);
                        entries.add(AoABlocks.AROMATIC_DIRT);
                        entries.add(AoABlocks.BLACKENED_SOIL);
                        entries.add(AoABlocks.CANDIED_DIRT);
                        entries.add(AoABlocks.CELEVIAN_DIRT);
                        entries.add(AoABlocks.CORAL_SOIL);
                        entries.add(AoABlocks.CREEP_DIRT);
                        entries.add(AoABlocks.FUNGAL_DIRT);
                        entries.add(AoABlocks.GRECKON_DIRT);
                        entries.add(AoABlocks.LUNALYTE_DIRT);
                        entries.add(AoABlocks.LUNASOLE_DIRT);
                        entries.add(AoABlocks.POLLUTED_SOIL);
                        entries.add(AoABlocks.PRECASIAN_SOIL);
                        entries.add(AoABlocks.WEIGHTLESS_DIRT);
                        //grass
                        entries.add(AoABlocks.ABYSSAL_GRASS);
                        entries.add(AoABlocks.AROMATIC_GRASS);
                        entries.add(AoABlocks.BRIGHT_GRASS);
                        entries.add(AoABlocks.CANDIED_GRASS);
                        entries.add(AoABlocks.CELEVIAN_GRASS);
                        entries.add(AoABlocks.CORAL_GRASS);
                        entries.add(AoABlocks.CREEP_GRASS);
                        entries.add(AoABlocks.FADED_GRASS);
                        entries.add(AoABlocks.FUNGAL_GRASS);
                        entries.add(AoABlocks.GRECKON_GRASS);
                        entries.add(AoABlocks.INVERTED_LELYETIAN_GRASS);
                        entries.add(AoABlocks.IROGRASS);
                        entries.add(AoABlocks.LELYETIAN_GRASS);
                        entries.add(AoABlocks.LUNALYTE_GRASS);
                        entries.add(AoABlocks.LUNASOLE_GRASS);
                        entries.add(AoABlocks.POLLUTED_GRASS);
                        entries.add(AoABlocks.PRECASIAN_GRASS);
                        entries.add(AoABlocks.RUNIC_GRASS);
                        entries.add(AoABlocks.WEIGHTLESS_GRASS);
                        //ore
                        entries.add(AoABlocks.LIMONITE_ORE);
                        entries.add(AoABlocks.DEEPSLATE_LIMONITE_ORE);
                        entries.add(AoABlocks.JADE_ORE);
                        entries.add(AoABlocks.DEEPSLATE_JADE_ORE);
                        //
                    })).build());



    public static void registerItemGroup(){
        AoA3Fabric.LOGGER.info("Registering Item Groups For" + AoA3Fabric.MOD_ID);
    }
}
