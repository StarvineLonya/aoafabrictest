package com.svln.aoa3fabric.item;

import com.svln.aoa3fabric.AoA3Fabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //here to add new items
    public static final Item LIMONITE_INGOT = registerItem("limonite_ingot",new Item(new FabricItemSettings()));
    public static final Item JADE = registerItem("jade",new Item(new FabricItemSettings()));

    //end


    //here is the item register method
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AoA3Fabric.MOD_ID,name), item);
    }
    //end

    //registers mod things idk
    public static void registerModItems(){
        AoA3Fabric.LOGGER.info("Registering Mod Items for" + AoA3Fabric.MOD_ID);

    }
    //end
}
