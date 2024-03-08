package com.bogdan3000.mchips.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RottenSyharic extends Item {
    public static final FoodProperties ROTTEN_SYHARIC = new FoodProperties.Builder()
            .nutrition(12)
            .saturationMod(6)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION,600, 1, false, false), 1.0F)
            .build();

    public RottenSyharic() {
        super(new Item.Properties().food(ROTTEN_SYHARIC).rarity(Rarity.UNCOMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("mchips.description.syharic").withStyle(ChatFormatting.BLUE));
        components.add(Component.translatable("mchips.description.rotten_syharic").withStyle(ChatFormatting.GREEN));
    }
}
