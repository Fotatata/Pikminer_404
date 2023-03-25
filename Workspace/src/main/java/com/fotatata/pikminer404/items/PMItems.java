package com.fotatata.pikminer404.items;

import com.fotatata.pikminer404.Pikminer404;
import com.fotatata.pikminer404.entity.PMEntity;
import com.fotatata.pikminer404.entity.client.PikminModel;
import com.fotatata.pikminer404.setup.Registration;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PMItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Pikminer404.MODID);

    public static final RegistryObject<Item> RED_PIKMIN_SPAWN_EGG = ITEMS.register("red_pikmin_spawn_egg", () -> new ForgeSpawnEggItem(PMEntity.RED_PIKMIN,
            0xf47c7c, 0xE01313, Registration.defaultBuilder()));


    public static CreativeModeTab creativeTab = new CreativeModeTab(Pikminer404.MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RED_PIKMIN_SPAWN_EGG.get());
        }
    };
}
