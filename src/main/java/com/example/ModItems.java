package com.example;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STRONG_PICK = registerItem("strong_pick",
            new CustomTool(ModToolMaterial.TANZANITE, 70000, 14000f,
                    new FabricItemSettings().maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(test.MOD_ID, name), item);
    }
    public static void registerModItems() {
        test.LOGGER.debug("Registering Mod Items for " + test.MOD_ID);
    }
}