package com.bogdan3000.mchips.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class MiniSyharic extends Item {
    public static final FoodProperties MINI_SYHARIC = new FoodProperties.Builder()
            .nutrition(1)
            .saturationMod(0.5f)
            .alwaysEat()
            .build();

    public MiniSyharic() {
        super(new Item.Properties().food(MINI_SYHARIC).rarity(Rarity.UNCOMMON));
    }
}
