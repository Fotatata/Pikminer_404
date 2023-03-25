package com.fotatata.pikminer404.setup;

import com.fotatata.pikminer404.Pikminer404;
import com.fotatata.pikminer404.entity.PMEntity;
import com.fotatata.pikminer404.entity.custom.RedPikmin;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = Pikminer404.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSetup {

    public static void init(FMLCommonSetupEvent event){
        event.enqueueWork(() -> {


        });
    }

    public static void setup(){
        IEventBus bus = MinecraftForge.EVENT_BUS;


    }



    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event){
        event.put(PMEntity.RED_PIKMIN.get(), RedPikmin.setAttributes());

    }




}
