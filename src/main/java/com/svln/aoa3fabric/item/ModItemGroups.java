package com.svln.aoa3fabric.item;

import com.svln.aoa3fabric.AoA3Fabric;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    //misc
    public static final ItemGroup MISC_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AoA3Fabric.MOD_ID,"miscellaneous"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.aoa3fabric.miscellaneous"))
                    .icon(() -> new ItemStack(ModItems.LIMONITE_INGOT)).entries(((displayContext, entries) -> { //icon here
                        //entries here
                        entries.add(ModItems.JADE);
                        entries.add(ModItems.LIMONITE_INGOT);

                    })).build());

    //
    public static final ItemGroup A_ITEMS = Registry.register(Registries.ITEM_GROUP,
            //miscellaneous
            new Identifier(AoA3Fabric.MOD_ID,"miscellaneous"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.aoa3fabric.a"))
                    .icon(() -> new ItemStack(ModItems.LIMONITE_INGOT)).entries(((displayContext, entries) -> { //icon here
                        //entries here
                        entries.add(ModItems.JADE);
                        entries.add(ModItems.LIMONITE_INGOT);

                    })).build());

    //
    public static void registerItemGroup(){
        AoA3Fabric.LOGGER.info("Registering Item Groups For" + AoA3Fabric.MOD_ID);
    }
}
