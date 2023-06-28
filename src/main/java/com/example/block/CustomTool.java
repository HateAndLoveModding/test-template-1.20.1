package com.example.block;

import com.example.test;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CustomTool extends MiningToolItem {
    public static final TagKey<Block> CUSTOM_MINEABLE = of("mineable/custom");
    private static TagKey<Block> of(String id) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(test.MOD_ID, id));
    }
    public CustomTool(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super((float)attackDamage, attackSpeed, material, CUSTOM_MINEABLE, settings);
    }
}
