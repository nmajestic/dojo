package com.nmajestic.dojo.block;

import com.nmajestic.dojo.Dojo;
import net.minecraft.item.BlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static void initialize() {

    }

    public static Block register(String name, Block block, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(Dojo.MOD_ID, name);

        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
}