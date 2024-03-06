package com.festivmacadamia.wunkmod.datagen;

import com.festivmacadamia.wunkmod.block.ModBlocks;
import com.festivmacadamia.wunkmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.RICKY.get())
            .pattern("OOO")
            .pattern("ONO")
            .pattern("WWW")
            .define('O', Items.ORANGE_WOOL)
            .define('N', Items.NETHER_STAR)
            .define('W', Items.WHITE_WOOL)
            .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR))
            .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.ICED_TEA.get(),16)
                .requires(Items.ICE)
                .requires(ModItems.BLACK_TEA.get())
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_black_tea", has(ModItems.BLACK_TEA.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.SWEET_ICED_TEA.get(),16)
                .requires(Items.ICE)
                .requires(ModItems.BLACK_TEA.get())
                .requires(Items.WATER_BUCKET)
                .requires(Items.SUGAR,2)
                .unlockedBy("has_black_tea", has(ModItems.BLACK_TEA.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.SWEET_ICED_TEA.get(),8)
                .requires(Items.SUGAR)
                .requires(ModItems.ICED_TEA.get(),8)
                .unlockedBy("has_black_tea", has(ModItems.BLACK_TEA.get()))
                .save(pWriter,"wunkmod:sweetened_iced_tea");

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModItems.CORN.get()), RecipeCategory.FOOD,
                ModItems.POPCORN.get(), 0.35F, 200)
                .unlockedBy("has_corn", has(ModItems.CORN.get())).save(pWriter, "wunkmod:popcorn_furnace");
        SimpleCookingRecipeBuilder.smoking(Ingredient.of(ModItems.CORN.get()), RecipeCategory.FOOD,
                        ModItems.POPCORN.get(), 0.35F, 200)
                .unlockedBy("has_corn", has(ModItems.CORN.get())).save(pWriter, "wunkmod:popcorn_smoker");
        SimpleCookingRecipeBuilder.campfireCooking(Ingredient.of(ModItems.CORN.get()), RecipeCategory.FOOD,
                        ModItems.POPCORN.get(), 0.35F, 200)
                .unlockedBy("has_corn", has(ModItems.CORN.get())).save(pWriter, "wunkmod:popcorn_campfire");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.HERSHEY_KISS.get(),16)
                .requires(Items.COCOA_BEANS)
                .requires(Items.MILK_BUCKET)
                .requires(Items.SUGAR)
                .unlockedBy("has_cocoa_beans", has(Items.COCOA_BEANS))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.COOKIES_AND_CREME_HERSHEY_KISS.get(),16)
                .requires(Items.COCOA_BEANS)
                .requires(Items.MILK_BUCKET)
                .requires(Items.COOKIE)
                .requires(Items.SUGAR)
                .unlockedBy("has_cocoa_beans", has(Items.COCOA_BEANS))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.WHITE_CHEDDAR_POPCORN.get())
                .requires(ModItems.POPCORN.get())
                .requires(ModItems.WHITE_CHEDDAR_CHEESE.get())
                .unlockedBy("has_white_cheddar", has(ModItems.WHITE_CHEDDAR_CHEESE.get()))
                .save(pWriter);

    }



}