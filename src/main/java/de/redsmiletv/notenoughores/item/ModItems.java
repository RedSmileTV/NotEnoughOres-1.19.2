package de.redsmiletv.notenoughores.item;

import de.redsmiletv.notenoughores.NotEnoughOres;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NotEnoughOres.MOD_ID);


    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NOE_TAB)));

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NOE_TAB)));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NOE_TAB)));

    public static final RegistryObject<Item> RAW_DIAMOND = ITEMS.register("raw_diamond",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NOE_TAB)));

    public static final RegistryObject<Item> RAW_EMERALD = ITEMS.register("raw_emerald",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NOE_TAB)));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby",
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NOE_TAB)));

    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NOE_TAB)));

    public static final RegistryObject<Item> RAW_TOPAZ = ITEMS.register("raw_topaz",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NOE_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
