package com.fotatata.pikminer404.entity;

import com.fotatata.pikminer404.Pikminer404;
import com.fotatata.pikminer404.entity.custom.RedPikmin;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PMEntity {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Pikminer404.MODID);

    public static final RegistryObject<EntityType<RedPikmin>> RED_PIKMIN =
            ENTITY_TYPES.register("red_pikmin",
                    () -> EntityType.Builder.of(RedPikmin::new, MobCategory.MISC)
                            .sized(0.5f, 1.0f)
                            .build(new ResourceLocation(Pikminer404.MODID, "red_pikmin").toString()));
}
