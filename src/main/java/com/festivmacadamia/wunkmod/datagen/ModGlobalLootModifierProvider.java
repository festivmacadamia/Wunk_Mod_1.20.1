package com.festivmacadamia.wunkmod.datagen;


import com.festivmacadamia.wunkmod.WunkMod;
import com.festivmacadamia.wunkmod.item.ModItems;
import com.festivmacadamia.wunkmod.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifierProvider(PackOutput output) {
        super(output, WunkMod.MOD_ID);
    }

    @Override
    protected void start() {

        /*
        //random drops from block
        add("CHOOSENAME", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.CHOOSEBLOCK).build(),
                LootItemRandomChanceCondition.randomChance(CHOOSECHANCEf).build()}, ModItems.CHOOSEITEM.get()));

        //guaranteed drops from block
        add("CHOOSENAME", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.CHOOSEBLOCK).build()}, ModItems.CHOOSEITEM.get()));

        //random drops from mob
        add("CHOOSENAME", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entity/CHOOSEMOB")).build(),
                LootItemRandomChanceCondition.randomChance(CHOOSECHANCEf).build() }, ModItems.CHOOSEITEM.get()));

        //guaranteed drops from mob
        add("CHOOSENAME", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entity/CHOOSEMOB")).build() }, ModItems.CHOOSEITEM.get()));

        //random drop from chest
        add("CHOOSENAME", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/CHOOSECHEST")).build(),
                 LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.CHOOSEITEM.get()));

        //guaranteed drop from chest
        add("CHOOSENAME", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/CHOOSECHEST")).build() }, ModItems.CHOOSEITEM.get()));
        */
        add("corn_seed_from_tall_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.CORN_SEEDS.get()));
        add("black_tea_seed_from_tall_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.BLACK_TEA_SEEDS.get()));

        add("white_cheddar_cheese_from_creeper", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("entity/creeper")).build() }, ModItems.WHITE_CHEDDAR_CHEESE.get()));

    }
}
