package com.lokdora.playground.registry;

import com.lokdora.playground.Playground;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItems {
    public static final Item HONEY_BUCKET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public  static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Playground.MOD_ID, "honey_bucket"), HONEY_BUCKET);
    }
}
