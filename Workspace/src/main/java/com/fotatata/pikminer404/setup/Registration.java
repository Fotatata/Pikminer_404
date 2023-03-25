package com.fotatata.pikminer404.setup;

import com.fotatata.pikminer404.entity.PMEntity;
import com.fotatata.pikminer404.items.PMItems;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static com.fotatata.pikminer404.items.PMItems.creativeTab;


public class Registration {
    private static final Logger LOGGER = LogUtils.getLogger();
    public static void init(){

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        PMEntity.ENTITY_TYPES.register(bus);
        PMItems.ITEMS.register(bus);

    }

    public static final Item.Properties defaultBuilder() {
        return new Item.Properties().tab(creativeTab);
    }

}
