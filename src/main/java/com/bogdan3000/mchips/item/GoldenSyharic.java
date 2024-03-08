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

public class GoldenSyharic extends Item {

    public static final FoodProperties GOLDEN_SYHARIC_FOOD = new FoodProperties.Builder()
            .nutrition(12)
            .saturationMod(6)
            .effect(() -> {
                MobEffectInstance currentEffect = Minecraft.getInstance().player.getEffect(MobEffects.HEALTH_BOOST);
                if (currentEffect != null) {
                    int amplifier = currentEffect.getAmplifier() + 1;
                    return new MobEffectInstance(MobEffects.HEALTH_BOOST, MobEffectInstance.INFINITE_DURATION, amplifier, false, false);
                } else {
                    return new MobEffectInstance(MobEffects.HEALTH_BOOST, MobEffectInstance.INFINITE_DURATION, 0, false, false);
                }
            }, 1.0F)
            .alwaysEat()
            .build();

    public GoldenSyharic() {
        super(new Item.Properties().food(GOLDEN_SYHARIC_FOOD).rarity(Rarity.RARE));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("mchips.description.syharic").withStyle(ChatFormatting.BLUE));
        components.add(Component.translatable("mchips.description.golden_syharic.1").withStyle(ChatFormatting.RED));
        components.add(Component.translatable("mchips.description.golden_syharic.2").withStyle(ChatFormatting.GREEN));
    }
}
