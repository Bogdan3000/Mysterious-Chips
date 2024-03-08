package com.bogdan3000.mchips.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
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

public class SuperSyharic extends Item{
    public static final FoodProperties SUPER_SYHARIC = new FoodProperties.Builder()
            .nutrition(12)
            .saturationMod(6)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION,1200, 4, false, false), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST,1200, 4, false, false), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE,1200, 4, false, false), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION,2400, 20, false, false), 1.0F)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED,1200, 4, false, false), 1.0F)
            .build();
    public SuperSyharic() {
        super(new Item.Properties().food(SUPER_SYHARIC).rarity(Rarity.EPIC).tab(ModCreativeModeTab.MYSTERIOUS_CHIPS_TAB));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("mchips.description.syharic").withStyle(ChatFormatting.BLUE));
        components.add(Component.translatable("mchips.description.super_syharic").withStyle(ChatFormatting.GREEN));
    }
}

