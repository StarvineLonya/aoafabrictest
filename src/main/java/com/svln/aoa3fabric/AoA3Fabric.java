package com.svln.aoa3fabric;

import com.svln.aoa3fabric.registry.AoABlocks;
import com.svln.aoa3fabric.registry.AoAItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AoA3Fabric implements ModInitializer {
	public static final String MOD_ID = "aoa3fabric";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	//loads in the order 有加载先后
	@Override
	public void onInitialize() {
		AoABlocks.registerModBlocks();
		AoAItems.registerModItems();
	}
	//
}