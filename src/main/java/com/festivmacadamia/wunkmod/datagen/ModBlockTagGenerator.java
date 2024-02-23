package com.festivmacadamia.wunkmod.datagen;

import java.util.concurrent.CompletableFuture;

import com.festivmacadamia.wunkmod.WunkMod;
import net.minecraft.world.level.block.WallBlock;
import org.jetbrains.annotations.Nullable;

import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagGenerator extends BlockTagsProvider{

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<Provider> lookupProvider,
            @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, WunkMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(Provider pProvider) {

    }
    
}
