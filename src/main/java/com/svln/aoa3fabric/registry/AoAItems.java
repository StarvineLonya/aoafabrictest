package com.svln.aoa3fabric.registry;

import com.svln.aoa3fabric.AoA3Fabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AoAItems {
    //here to add new items
    public static final Item LIMONITE_INGOT = registerItem("limonite_ingot",new Item(new FabricItemSettings()));
    public static final Item JADE = registerItem("jade",new Item(new FabricItemSettings()));




    //


    //
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AoA3Fabric.MOD_ID,name), item);
    }
    //
    public static void registerModItems() {
        AoA3Fabric.LOGGER.info("Registering Mod Items for" + AoA3Fabric.MOD_ID);
    }
}
