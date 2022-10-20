package com.gabrielgesser.toolsmod.item;

import com.gabrielgesser.toolsmod.ToolsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ToolsMod.MOD_ID);

    public static final RegistryObject<Item> GRAPHENE = ITEMS.register("graphene",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));
    public static final RegistryObject<Item> RAW_GRAPHENE = ITEMS.register("raw_graphene",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TOOLS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
