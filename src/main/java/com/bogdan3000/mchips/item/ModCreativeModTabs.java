package com.bogdan3000.mchips.item;

import com.bogdan3000.mchips.MysteriousChips;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=MysteriousChips.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModTabs {
    public static CreativeModeTab CREATIVE_MODE_TABS;

    @SubscribeEvent
    public static void RegisterCreativeModeTabs(CreativeModeTabEvent.Register event) {
        CREATIVE_MODE_TABS = event.registerCreativeModeTab(new ResourceLocation(MysteriousChips.MOD_ID, "mchips_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.MINI_SYHARIC.get()))
                        .title(Component.translatable("creativetab.mchips_tab")));
    }
}