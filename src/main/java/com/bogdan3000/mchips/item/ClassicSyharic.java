package com.bogdan3000.mchips.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ClassicSyharic extends Item {
    public static final FoodProperties CLASSIC_SYHARIC = new FoodProperties.Builder()
            .nutrition(14)
            .saturationMod(8)
            .build();

    public ClassicSyharic() {
        super(new Item.Properties().food(CLASSIC_SYHARIC).rarity(Rarity.UNCOMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("mchips.description.syharic").withStyle(ChatFormatting.BLUE));
        components.add(Component.translatable("mchips.description.classic_syharic").withStyle(ChatFormatting.GREEN));
    }
}
