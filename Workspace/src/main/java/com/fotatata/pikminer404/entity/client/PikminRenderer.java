package com.fotatata.pikminer404.entity.client;

import com.fotatata.pikminer404.Pikminer404;
import com.fotatata.pikminer404.entity.custom.RedPikmin;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PikminRenderer extends GeoEntityRenderer<RedPikmin> {
    public PikminRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PikminModel());
        this.shadowRadius = 0.2f;

    }

    @Override
    public ResourceLocation getTextureLocation(RedPikmin animatable) {
        ResourceLocation returner = null;

        switch (animatable.TYPE){
            case "leaf" -> returner = new ResourceLocation(Pikminer404.MODID, "red_pikmin_leaf.png");
            case "flower" -> returner = new ResourceLocation(Pikminer404.MODID, "red_pikmin_flower.png");
            case "bud" -> returner = new ResourceLocation(Pikminer404.MODID, "red_pikmin_bud.png");
        }
        return returner;

    }

    @Override
    public RenderType getRenderType(RedPikmin animatable, float partialTick, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
