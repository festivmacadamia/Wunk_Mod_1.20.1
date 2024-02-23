package com.festivmacadamia.wunkmod.datagen;


import com.festivmacadamia.wunkmod.WunkMod;
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


    }
}
