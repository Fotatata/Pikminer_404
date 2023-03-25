package com.fotatata.pikminer404;

import com.fotatata.pikminer404.setup.ClientSetup;
import com.fotatata.pikminer404.setup.ModSetup;
import com.fotatata.pikminer404.setup.Registration;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

import java.util.Locale;

@Mod(Pikminer404.MODID)
public class Pikminer404
{
    public static final String MODID = "pikminer404";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Pikminer404()
    {
        Registration.init();
        ModSetup.setup();
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));

       // if (FMLEnvironment.dist == Dist.CLIENT)
       // {
       //     MinecraftForge.EVENT_BUS.register(ClientEvents.class);
       //     // static method with no client-only classes in method signature
       // }
       // MinecraftForge.EVENT_BUS.register(ForgeEvents.class);


        GeckoLib.initialize();

    }


    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

    }
    //A method to declare a prefix for our resourcelocations ours being pikminer404
    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MODID, name.toLowerCase(Locale.ROOT));
    }
}
