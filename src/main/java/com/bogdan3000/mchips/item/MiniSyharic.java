package com.bogdan3000.mchips.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class MiniSyharic extends Item {
    public static final Food MINI_SYHARIC = new Food.Builder()
            .nutrition(1)
            .saturationMod(0.5f)
            .alwaysEat()
            .build();

    public MiniSyharic() {
        super(new Item.Properties().food(MINI_SYHARIC).rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.MYSTERIOUS_CHIPS_TAB));
    }
}
