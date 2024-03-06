package com.festivmacadamia.wunkmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CORN = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.2f).build();
    public static final FoodProperties WHITE_CHEDDAR_CHEESE = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.4f).build();
    public static final FoodProperties POPCORN = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.2f).build();
    public static final FoodProperties WHITE_CHEDDAR_POPCORN = new FoodProperties.Builder()
            .nutrition(8).saturationMod(1.2f).build();

    public static final FoodProperties HERSHEY_KISS = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.15f).build();
    public static final FoodProperties COOKIES_AND_CREME_HERSHEY_KISS = new FoodProperties.Builder()
            .nutrition(2).saturationMod(0.15f).build();

    public static final FoodProperties ICED_TEA = new FoodProperties.Builder()
            .nutrition(4).saturationMod(0.25f).build();
    public static final FoodProperties SWEET_ICED_TEA = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.40f).build();


}
