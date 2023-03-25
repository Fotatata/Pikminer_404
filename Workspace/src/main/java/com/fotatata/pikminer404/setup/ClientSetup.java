package com.fotatata.pikminer404.setup;


import com.fotatata.pikminer404.Pikminer404;
import com.fotatata.pikminer404.entity.PMEntity;
import com.fotatata.pikminer404.entity.client.PikminRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Pikminer404.MODID, value = Dist.CLIENT,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {

    public static void init(FMLClientSetupEvent event) {
        EntityRenderers.register(PMEntity.RED_PIKMIN.get(), PikminRenderer::new);

    }
}


