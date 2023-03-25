package com.fotatata.pikminer404.events;

import com.fotatata.pikminer404.Pikminer404;
import com.fotatata.pikminer404.entity.ModEntityTypes;
import com.fotatata.pikminer404.entity.custom.RedPikmin;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {

    @Mod.EventBusSubscriber(modid = Pikminer404.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents{
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event){
            event.put(ModEntityTypes.RED_PIKMIN.get(), RedPikmin.setAttributes());
        }
    }

}
