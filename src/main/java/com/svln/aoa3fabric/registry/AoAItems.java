package com.svln.aoa3fabric.registry;

import com.svln.aoa3fabric.AoA3Fabric;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AoAItems {

    //minerals
    public static final Item BLOODSTONE = registerItem("bloodstone",new Item(new FabricItemSettings()));
    public static final  Item CRYSTALLITE = registerItem("crystallite", new Item(new FabricItemSettings()));
    public static final  Item GEMENYTE = registerItem("gemenyte", new Item(new FabricItemSettings()));
    public static final  Item JADE = registerItem("jade", new Item(new FabricItemSettings()));
    public static final  Item JEWELYTE = registerItem("jewelyte", new Item(new FabricItemSettings()));
    public static final  Item ORNAMYTE = registerItem("ornamyte", new Item(new FabricItemSettings()));
    public static final  Item SHYREGEM = registerItem("shyregem", new Item(new FabricItemSettings()));
    public static final  Item RUNIUM_CHUNK = registerItem("runium_chunk", new Item(new FabricItemSettings()));
    public static final  Item CHESTBONE_FRAGMENT = registerItem("chestbone_fragment", new Item(new FabricItemSettings()));
    public static final  Item FOOTBONE_FRAGMENT = registerItem("footbone_fragment", new Item(new FabricItemSettings()));
    public static final  Item LEGBONE_FRAGMENT = registerItem("legbone_fragment", new Item(new FabricItemSettings()));
    public static final  Item SKULLBONE_FRAGMENT = registerItem("skullbone_fragment", new Item(new FabricItemSettings()));
    public static final  Item CHARGED_RUNIUM_CHUNK = registerItem("charged_runium_chunk", new Item(new FabricItemSettings()));
    public static final  Item BLUE_CRYSTAL = registerItem("blue_crystal", new Item(new FabricItemSettings()));
    public static final  Item GREEN_CRYSTAL = registerItem("green_crystal", new Item(new FabricItemSettings()));
    public static final  Item PURPLE_CRYSTAL = registerItem("purple_crystal", new Item(new FabricItemSettings()));
    public static final  Item RED_CRYSTAL = registerItem("red_crystal", new Item(new FabricItemSettings()));
    public static final  Item WHITE_CRYSTAL = registerItem("white_crystal", new Item(new FabricItemSettings()));
    public static final  Item YELLOW_CRYSTAL = registerItem("yellow_crystal", new Item(new FabricItemSettings()));
    public static final  Item BARONYTE_INGOT = registerItem("baronyte_ingot", new Item(new FabricItemSettings()));
    public static final  Item BLAZIUM_INGOT = registerItem("blazium_ingot", new Item(new FabricItemSettings()));
    public static final  Item ELECANIUM_INGOT = registerItem("elecanium_ingot", new Item(new FabricItemSettings()));
    public static final  Item EMBERSTONE_INGOT = registerItem("emberstone_ingot", new Item(new FabricItemSettings()));
    public static final  Item GHASTLY_INGOT = registerItem("ghastly_ingot", new Item(new FabricItemSettings()));
    public static final  Item GHOULISH_INGOT = registerItem("ghoulish_ingot", new Item(new FabricItemSettings()));
    public static final  Item LIMONITE_INGOT = registerItem("limonite_ingot", new Item(new FabricItemSettings()));
    public static final  Item LUNAR_INGOT = registerItem("lunar_ingot", new Item(new FabricItemSettings()));
    public static final  Item LYON_INGOT = registerItem("lyon_ingot", new Item(new FabricItemSettings()));
    public static final  Item MYSTITE_INGOT = registerItem("mystite_ingot", new Item(new FabricItemSettings()));
    public static final  Item SHYRESTONE_INGOT = registerItem("shyrestone_ingot", new Item(new FabricItemSettings()));
    public static final  Item SKELETAL_INGOT = registerItem("skeletal_ingot", new Item(new FabricItemSettings()));
    public static final  Item VARSIUM_INGOT = registerItem("varsium_ingot", new Item(new FabricItemSettings()));

    //raw ore OWIP
    public static final Item RAW_LIMONITE = registerItem("raw_limonite", new Item(new FabricItemSettings()));
    public static final Item RAW_EMBERSTONE = registerItem("raw_emberstone", new Item(new FabricItemSettings()));
    
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
