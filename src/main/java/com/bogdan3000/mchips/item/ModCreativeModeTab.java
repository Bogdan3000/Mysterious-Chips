package com.bogdan3000.mchips.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MYSTERIOUS_CHIPS_TAB = new CreativeModeTab("mchips_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MINI_SYHARIC.get());
        }
    };
}
