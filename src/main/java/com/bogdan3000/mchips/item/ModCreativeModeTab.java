package com.bogdan3000.mchips.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModCreativeModeTab {
    public static final ItemGroup MYSTERIOUS_CHIPS_TAB = new ItemGroup("mchips_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MINI_SYHARIC.get());
        }
    };
}
