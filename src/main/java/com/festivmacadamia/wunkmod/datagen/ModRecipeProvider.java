package com.festivmacadamia.wunkmod.datagen;



import com.festivmacadamia.wunkmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RICKY.get())
            .pattern("OOO")
            .pattern("ONO")
            .pattern("WWW")
            .define('O', Items.ORANGE_WOOL)
            .define('N', Items.NETHER_STAR)
            .define('W', Items.WHITE_WOOL)
            .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
            .save(pWriter);



    }



}