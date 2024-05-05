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
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.aoa3fabric.food"))
                    .icon(() -> new ItemStack(AoAItems.LIMONITE_INGOT)).entries(((displayContext, entries) -> { //icon here
                        //generation blocks entries here
                        entries.add(AoABlocks.ABYSSAL_STONE);

                        //
                    })).build());



    public static void registerItemGroup(){
        AoA3Fabric.LOGGER.info("Registering Item Groups For" + AoA3Fabric.MOD_ID);
    }
}
