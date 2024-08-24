package com.bogdan3000.mchips.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Rarity;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class GoldenSyharic extends Item {

    public static final Food GOLDEN_SYHARIC_FOOD = new Food.Builder()
            .nutrition(12)
            .saturationMod(6)
            .effect(() -> {
                EffectInstance currentEffect = Minecraft.getInstance().player.getEffect(Effects.HEALTH_BOOST);
                if (currentEffect != null) {
                    int amplifier = currentEffect.getAmplifier() + 1;
                    return new EffectInstance(Effects.HEALTH_BOOST, Integer.MAX_VALUE, amplifier, false, false);
                } else {
                    return new EffectInstance(Effects.HEALTH_BOOST, Integer.MAX_VALUE, 0, false, false);
                }
            }, 1.0F)
            .alwaysEat()
            .build();

    public GoldenSyharic() {
        super(new Item.Properties().food(GOLDEN_SYHARIC_FOOD).rarity(Rarity.RARE).tab(ModCreativeModeTab.MYSTERIOUS_CHIPS_TAB));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable World world, List<ITextComponent> components, ITooltipFlag flag) {
        components.add(new TranslationTextComponent("mchips.description.syharic").withStyle(TextFormatting.BLUE));
        components.add(new TranslationTextComponent("mchips.description.golden_syharic.1").withStyle(TextFormatting.RED));
        components.add(new TranslationTextComponent("mchips.description.golden_syharic.2").withStyle(TextFormatting.GREEN));
    }
}
