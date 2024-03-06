package com.festivmacadamia.wunkmod.datagen.loot;

import com.festivmacadamia.wunkmod.block.ModBlocks;

import com.festivmacadamia.wunkmod.block.custom.BlackTeaCropBlock;
import com.festivmacadamia.wunkmod.block.custom.CornCropBlock;
import com.festivmacadamia.wunkmod.item.ModItems;
import com.festivmacadamia.wunkmod.block.ModBlocks;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.BonusLevelTableCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.RICKY.get());

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.BLACK_TEA_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BlackTeaCropBlock.AGE, 5));

        this.add(ModBlocks.BLACK_TEA_CROP.get(), createCropDrops(ModBlocks.BLACK_TEA_CROP.get(), ModItems.BLACK_TEA.get(),
                ModItems.BLACK_TEA_SEEDS.get(), lootitemcondition$builder));

        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 7));

        this.add(ModBlocks.CORN_CROP.get(), createCropDrops(ModBlocks.CORN_CROP.get(), ModItems.CORN.get(),
                ModItems.CORN_SEEDS.get(), lootitemcondition$builder2));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}