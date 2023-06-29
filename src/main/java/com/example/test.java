package com.example;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class test implements ModInitializer {
	public static final String MOD_ID = "test";
    public static final Logger LOGGER = LoggerFactory.getLogger("test");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
		LOGGER.info("Hello Fabric world!");
	}
}