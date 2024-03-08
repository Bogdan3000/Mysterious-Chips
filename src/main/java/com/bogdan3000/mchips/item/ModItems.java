package com.bogdan3000.mchips.item;

import com.bogdan3000.mchips.MysteriousChips;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MysteriousChips.MOD_ID);

    public static final RegistryObject<Item> MINI_SYHARIC = ITEMS.register("mini_syharic", MiniSyharic::new);
    public static final RegistryObject<Item> POTATO_SYHARIC = ITEMS.register("potato_syharic", PotatoSyharic::new);
    public static final RegistryObject<Item> FISH_SYHARIC = ITEMS.register("fish_syharic", FishSyharic::new);
    public static final RegistryObject<Item> CLASSIC_SYHARIC = ITEMS.register("classic_syharic", ClassicSyharic::new);
    public static final RegistryObject<Item> ROTTEN_SYHARIC = ITEMS.register("rotten_syharic", RottenSyharic::new);
    public static final RegistryObject<Item> PORKCHOP_SYHARIC = ITEMS.register("porkchop_syharic", PorkchopSyharic::new);
    public static final RegistryObject<Item> SUPER_SYHARIC = ITEMS.register("super_syharic", SuperSyharic::new);
    public static final RegistryObject<Item> GOLDEN_SYHARIC = ITEMS.register("golden_syharic", GoldenSyharic::new);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}