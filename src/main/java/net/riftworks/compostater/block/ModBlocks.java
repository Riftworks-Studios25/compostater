package net.riftworks.compostater.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.riftworks.compostater.Compostater;
import net.riftworks.compostater.block.custom.CompostaterBlock;

public class ModBlocks {
    public static final Block COMPOSTATER = registerBlock("compostater",
            new CompostaterBlock(FabricBlockSettings.copyOf(Blocks.COMPOSTER)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Compostater.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Compostater.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {
        Compostater.LOGGER.info("Registering ModBlocks for " + Compostater.MOD_ID);
    }
}
