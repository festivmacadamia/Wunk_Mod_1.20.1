package com.festivmacadamia.wunkmod.datagen;


import com.festivmacadamia.wunkmod.WunkMod;
import com.festivmacadamia.wunkmod.block.ModBlocks;
import com.festivmacadamia.wunkmod.block.custom.BlackTeaCropBlock;
import com.festivmacadamia.wunkmod.block.custom.CornCropBlock;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, WunkMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        makeBlackTeaCrop((CropBlock) ModBlocks.BLACK_TEA_CROP.get(), "black_tea_stage", "black_tea_stage");
        makeCornCrop(((CropBlock) ModBlocks.CORN_CROP.get()), "corn_stage", "corn_stage");
    }
    
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    public void makeBlackTeaCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> blackTeaStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] blackTeaStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((BlackTeaCropBlock) block).getAgeProperty()),
                new ResourceLocation(WunkMod.MOD_ID, "block/" + textureName + state.getValue(((BlackTeaCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

    public void makeCornCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cornStates(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cornStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CornCropBlock) block).getAgeProperty()),
                new ResourceLocation(WunkMod.MOD_ID, "block/" + textureName + state.getValue(((CornCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }



}
