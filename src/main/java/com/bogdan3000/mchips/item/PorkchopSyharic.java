package com.bogdan3000.mchips.item;

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

public class PorkchopSyharic extends Item {
    public static final Food PORKCHOP_SYHARIC = new Food.Builder()
            .nutrition(12)
            .saturationMod(6)
            .effect(() -> new EffectInstance(Effects.JUMP,800, 2, false, false), 1.0F)
            .build();

    public PorkchopSyharic() {
        super(new Item.Properties().food(PORKCHOP_SYHARIC).rarity(Rarity.UNCOMMON).tab(ModCreativeModeTab.MYSTERIOUS_CHIPS_TAB));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable World world, List<ITextComponent> components, ITooltipFlag flag) {
        components.add(new TranslationTextComponent("mchips.description.syharic").withStyle(TextFormatting.BLUE));
        components.add(new TranslationTextComponent("mchips.description.porkchop_syharic").withStyle(TextFormatting.GREEN));
    }
}


