package com.festivmacadamia.wunkmod.block;

import java.util.function.Supplier;

import com.festivmacadamia.wunkmod.WunkMod;
import com.festivmacadamia.wunkmod.block.custom.BlackTeaCropBlock;
import com.festivmacadamia.wunkmod.block.custom.CornCropBlock;
import com.festivmacadamia.wunkmod.block.custom.RickyBlock;
import com.festivmacadamia.wunkmod.item.ModItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = 
        DeferredRegister.create(ForgeRegistries.BLOCKS, WunkMod.MOD_ID);

    public static final RegistryObject<RickyBlock> RICKY = registerBlock("ricky",
            () -> new RickyBlock(BlockBehaviour.Properties.copy(Blocks.WHITE_WOOL)));

    public static final RegistryObject<Block> BLACK_TEA_CROP = BLOCKS.register("black_tea_crop",
            () -> new BlackTeaCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> CORN_CROP = BLOCKS.register("corn_crop",
            () -> new CornCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}