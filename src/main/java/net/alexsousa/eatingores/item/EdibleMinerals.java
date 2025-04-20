package net.alexsousa.eatingores.item;

import net.alexsousa.eatingores.EatingOres;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class EdibleMinerals {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(EatingOres.MODID);

    public static final DeferredItem<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_BISMUTH = ITEMS.register("raw_bismuth",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ITEM_OF_WATER = ITEMS.register("item_of_water",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> ITEM_OF_LAVA = ITEMS.register("item_of_lava",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
