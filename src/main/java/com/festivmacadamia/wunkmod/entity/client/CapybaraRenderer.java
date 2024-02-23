package com.festivmacadamia.wunkmod.entity.client;

import com.festivmacadamia.wunkmod.WunkMod;
import com.festivmacadamia.wunkmod.entity.custom.CapybaraEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CapybaraRenderer extends GeoEntityRenderer<CapybaraEntity> {
    public CapybaraRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CapybaraModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CapybaraEntity animatable) {
        return new ResourceLocation(WunkMod.MOD_ID, "textures/entity/capybara.png");
    }

    @Override
    public void render(CapybaraEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}