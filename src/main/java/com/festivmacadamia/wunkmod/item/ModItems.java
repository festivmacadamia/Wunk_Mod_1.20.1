package com.festivmacadamia.wunkmod.item;

import com.festivmacadamia.wunkmod.WunkMod;

import com.festivmacadamia.wunkmod.entity.ModEntities;
import com.festivmacadamia.wunkmod.util.ColorSwapper;
import net.minecraft.world.item.*;
import com.festivmacadamia.wunkmod.block.ModBlocks;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, WunkMod.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> CAPYBARA_SPAWN_EGG = ITEMS.register("capybara_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CAPYBARA, new ColorSwapper("#805332").getMcColor(), new ColorSwapper("#bf8f6b").getMcColor(), new Item.Properties()));

    public static final RegistryObject<Item> BLACK_TEA = ITEMS.register("black_tea",
            ()  -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLACK_TEA_SEEDS = ITEMS.register("black_tea_seeds",
            ()  -> new ItemNameBlockItem(ModBlocks.BLACK_TEA_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            ()  -> new Item(new Item.Properties().food(ModFoods.CORN)));
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            ()  -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> WHITE_CHEDDAR_CHEESE = ITEMS.register("white_cheddar_cheese",
            ()  -> new Item(new Item.Properties().food(ModFoods.WHITE_CHEDDAR_CHEESE)));
    public static final RegistryObject<Item> POPCORN = ITEMS.register("popcorn",
            ()  -> new Item(new Item.Properties().food(ModFoods.POPCORN)));
    public static final RegistryObject<Item> WHITE_CHEDDAR_POPCORN = ITEMS.register("white_cheddar_popcorn",
            ()  -> new Item(new Item.Properties().food(ModFoods.WHITE_CHEDDAR_POPCORN)));

    public static final RegistryObject<Item> HERSHEY_KISS = ITEMS.register("hershey_kiss",
            ()  -> new Item(new Item.Properties().food(ModFoods.HERSHEY_KISS)));
    public static final RegistryObject<Item> COOKIES_AND_CREME_HERSHEY_KISS = ITEMS.register("cookies_and_creme_hershey_kiss",
            ()  -> new Item(new Item.Properties().food(ModFoods.COOKIES_AND_CREME_HERSHEY_KISS)));

    public static final RegistryObject<Item> ICED_TEA = ITEMS.register("iced_tea",
            ()  -> new Item(new Item.Properties().food(ModFoods.ICED_TEA)));
    public static final RegistryObject<Item> SWEET_ICED_TEA = ITEMS.register("sweet_iced_tea",
            ()  -> new Item(new Item.Properties().food(ModFoods.SWEET_ICED_TEA)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
 