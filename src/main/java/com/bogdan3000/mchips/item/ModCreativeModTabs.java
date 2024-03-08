package com.bogdan3000.mchips.item;

import com.bogdan3000.mchips.MysteriousChips;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MysteriousChips.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MYSTERIOUS_CHIPS_TAB = CREATIVE_MODE_TABS.register("mchips_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MINI_SYHARIC.get()))
                    .title(Component.translatable("creativetab.mchips_tab"))
                    .displayItems((pParameters, pOutput) ->  {
                        pOutput.accept(ModItems.MINI_SYHARIC.get());
                        pOutput.accept(ModItems.CLASSIC_SYHARIC.get());
                        pOutput.accept(ModItems.POTATO_SYHARIC.get());
                        pOutput.accept(ModItems.FISH_SYHARIC.get());
                        pOutput.accept(ModItems.ROTTEN_SYHARIC.get());
                        pOutput.accept(ModItems.PORKCHOP_SYHARIC.get());
                        pOutput.accept(ModItems.SUPER_SYHARIC.get());
                        pOutput.accept(ModItems.GOLDEN_SYHARIC.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}