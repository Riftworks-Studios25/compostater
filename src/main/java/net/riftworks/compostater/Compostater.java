package net.riftworks.compostater;

import net.fabricmc.api.ModInitializer;

import net.riftworks.compostater.block.ModBlocks;
import net.riftworks.compostater.block.custom.CompostaterBlock;
import net.riftworks.compostater.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Compostater implements ModInitializer {
	public static final String MOD_ID = "compostater";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        CompostaterBlock.registerDefaultCompostableItems();

        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
	}
}