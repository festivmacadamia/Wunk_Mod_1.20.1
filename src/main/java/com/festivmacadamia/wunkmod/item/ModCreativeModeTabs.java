package com.festivmacadamia.wunkmod.item;


import com.festivmacadamia.wunkmod.WunkMod;

import com.festivmacadamia.wunkmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WunkMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("wunk_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RICKY.get()))
                    .title(Component.translatable("creativetab.wunk_tab"))
                    .displayItems((pParameters, pOutput) -> {

                    //blocks
                        pOutput.accept(ModBlocks.RICKY.get());

                    //spawn eggs
                        pOutput.accept(ModItems.CAPYBARA_SPAWN_EGG.get());

                    //items

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}