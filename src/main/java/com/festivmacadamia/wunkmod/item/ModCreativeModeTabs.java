package com.festivmacadamia.wunkmod.item;

import com.festivmacadamia.wunkmod.WunkMod;
import com.festivmacadamia.wunkmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
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
                        pOutput.accept(ModBlocks.RICKY.get());
                        pOutput.accept(ModItems.CAPYBARA_SPAWN_EGG.get());
                        pOutput.accept(ModItems.BLACK_TEA.get());
                        pOutput.accept(ModItems.BLACK_TEA_SEEDS.get());
                        pOutput.accept(ModItems.CORN.get());
                        pOutput.accept(ModItems.CORN_SEEDS.get());
                        pOutput.accept(ModItems.ICED_TEA.get());
                        pOutput.accept(ModItems.SWEET_ICED_TEA.get());
                        pOutput.accept(ModItems.POPCORN.get());
                        pOutput.accept(ModItems.WHITE_CHEDDAR_POPCORN.get());
                        pOutput.accept(ModItems.WHITE_CHEDDAR_CHEESE.get());
                        pOutput.accept(ModItems.HERSHEY_KISS.get());
                        pOutput.accept(ModItems.COOKIES_AND_CREME_HERSHEY_KISS.get());
                    }).withTabsBefore(CreativeModeTabs.BUILDING_BLOCKS, CreativeModeTabs.COLORED_BLOCKS, CreativeModeTabs.INGREDIENTS, CreativeModeTabs.SPAWN_EGGS)
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}