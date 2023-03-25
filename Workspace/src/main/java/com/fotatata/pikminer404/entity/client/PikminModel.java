package com.fotatata.pikminer404.entity.client;

import com.fotatata.pikminer404.Pikminer404;
import com.fotatata.pikminer404.entity.custom.RedPikmin;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

import static com.fotatata.pikminer404.Pikminer404.prefix;

public class PikminModel extends AnimatedGeoModel<RedPikmin> {
    @Override
    public ResourceLocation getModelResource(RedPikmin object) {
        return prefix("geo/pikmin.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RedPikmin pikmin) {
        switch (pikmin.TYPE){
            case "bud" -> {
                return prefix("textures/entity/red_pikmin_bud.png");
            }
            case "flower" -> {
                return prefix("textures/entity/red_pikmin_flower.png");
            }
            default -> {
                return prefix("textures/entity/red_pikmin_leaf.png");
            }
        }
    }

    @Override
    public ResourceLocation getAnimationResource(RedPikmin animatable) {
        return prefix("animations/pikmin.animation.json");
    }
}
