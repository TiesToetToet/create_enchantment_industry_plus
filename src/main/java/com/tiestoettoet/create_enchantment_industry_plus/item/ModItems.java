package com.tiestoettoet.create_enchantment_industry_plus.item;
import com.tiestoettoet.create_enchantment_industry_plus.create_enchantment_industry_plus;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(create_enchantment_industry_plus.MOD_ID);
    public static final DeferredHolder<Item, Item> sac = ITEMS.register("sac", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
