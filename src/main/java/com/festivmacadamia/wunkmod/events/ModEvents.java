package com.festivmacadamia.wunkmod.events;

import com.festivmacadamia.wunkmod.WunkMod;
import com.festivmacadamia.wunkmod.entity.ModEntities;
import com.festivmacadamia.wunkmod.entity.custom.CapybaraEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WunkMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(ModEntities.CAPYBARA.get(), CapybaraEntity.setAttributes());
    }
}
