package com.festivmacadamia.wunkmod.entity;

import com.festivmacadamia.wunkmod.WunkMod;
import com.festivmacadamia.wunkmod.entity.custom.CapybaraEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WunkMod.MOD_ID);


    public static final RegistryObject<EntityType<CapybaraEntity>> CAPYBARA = ENTITY_TYPE.register("capybara",
            () -> EntityType.Builder.of(CapybaraEntity::new, MobCategory.CREATURE)
                    .sized(1.2f,1.4f)
                    .build(new ResourceLocation(WunkMod.MOD_ID,"capybara").toString())
    );



    public static void register(IEventBus eventBus){
        ENTITY_TYPE.register(eventBus);
    }
}
