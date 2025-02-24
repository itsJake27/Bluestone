package net.jake27.bluestone.item;

import net.jake27.bluestone.BluestoneMOD;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BluestoneMOD.MOD_ID);

    public static final RegistryObject<Item> Bluestone = ITEMS.register("bluestone",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_BLUESTONE = ITEMS.register("raw_bluestone",
            () -> new Item(new Item.Properties()));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

