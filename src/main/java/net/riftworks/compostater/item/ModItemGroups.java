package net.riftworks.compostater.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.riftworks.compostater.Compostater;
import net.riftworks.compostater.block.ModBlocks;


public class ModItemGroups {
    public static final ItemGroup COMPOSTATER_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Compostater.MOD_ID, "compostater"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.compostater"))
                    .icon(() -> new ItemStack(ModBlocks.COMPOSTATER)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COMPOSTATER);

                    }).build());


    public static void registerItemGroups() {

        Compostater.LOGGER.info("Registering Item Groups for " + Compostater.MOD_ID);
    }
}
