package com.nmajestic.dojo.item;

import com.nmajestic.dojo.Dojo;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static Item register(Item item, String id) {
		Identifier itemID = Identifier.of(Dojo.MOD_ID, id);

        return Registry.register(Registries.ITEM, itemID, item);
	}
    public static void initialize() {

    }
}