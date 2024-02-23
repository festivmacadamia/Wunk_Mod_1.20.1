package com.festivmacadamia.wunkmod.item;

import com.festivmacadamia.wunkmod.WunkMod;

import com.festivmacadamia.wunkmod.entity.ModEntities;
import com.festivmacadamia.wunkmod.util.ColorSwapper;
import com.festivmacadamia.wunkmod.WunkMod;
import net.minecraft.world.item.*;
import com.festivmacadamia.wunkmod.item.ModFoods;
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


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
 