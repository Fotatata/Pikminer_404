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
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PikminRenderer extends GeoEntityRenderer<RedPikmin> {
    public PikminRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PikminModel());
        this.shadowRadius = 0.2f;

    }

    @Override
    public RenderType getRenderType(RedPikmin animatable, float partialTick, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, ResourceLocation texture) {
        return RenderType.entityCutoutNoCull(getTextureLocation(animatable));
    }
}
