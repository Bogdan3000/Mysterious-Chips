package com.bogdan3000.mchips;

import com.bogdan3000.mchips.item.ModCreativeModTabs;
import com.bogdan3000.mchips.item.ModItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod( MysteriousChips.MOD_ID)
public class MysteriousChips
{
    public static final String MOD_ID = "mchips";

    public  MysteriousChips()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == ModCreativeModTabs.CREATIVE_MODE_TABS) {
            event.accept(ModItems.MINI_SYHARIC);
            event.accept(ModItems.CLASSIC_SYHARIC);
            event.accept(ModItems.POTATO_SYHARIC);
            event.accept(ModItems.FISH_SYHARIC);
            event.accept(ModItems.ROTTEN_SYHARIC);
            event.accept(ModItems.PORKCHOP_SYHARIC);
            event.accept(ModItems.SUPER_SYHARIC);
            event.accept(ModItems.GOLDEN_SYHARIC);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}