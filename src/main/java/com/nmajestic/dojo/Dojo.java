package com.nmajestic.dojo;

import com.nmajestic.dojo.block.ModBlocks;
import com.nmajestic.dojo.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dojo implements ModInitializer {
	public static final String MOD_ID = "dojo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
		ModItems.initialize();
	}
}