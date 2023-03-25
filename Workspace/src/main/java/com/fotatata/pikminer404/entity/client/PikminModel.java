package com.fotatata.pikminer404.entity.client;

import com.fotatata.pikminer404.Pikminer404;
import com.fotatata.pikminer404.entity.custom.RedPikmin;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PikminModel extends AnimatedGeoModel<RedPikmin> {
    @Override
    public ResourceLocation getModelResource(RedPikmin object) {
        return new ResourceLocation(Pikminer404.MODID, "pikmin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RedPikmin object) {

        ResourceLocation returner = null;

        switch (object.TYPE){
            case "leaf" -> returner = new ResourceLocation(Pikminer404.MODID, "red_pikmin_leaf.png");
            case "flower" -> returner = new ResourceLocation(Pikminer404.MODID, "red_pikmin_flower.png");
            case "bud" -> returner = new ResourceLocation(Pikminer404.MODID, "red_pikmin_bud.png");
        }
        return returner;
    }

    @Override
    public ResourceLocation getAnimationResource(RedPikmin animatable) {
        return new ResourceLocation(Pikminer404.MODID, "pikmin.animation.json");
    }
}
