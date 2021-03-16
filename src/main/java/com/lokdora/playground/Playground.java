package com.lokdora.playground;

import com.lokdora.playground.registry.ModBlocks;
import com.lokdora.playground.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Playground implements ModInitializer {
    public static final String MOD_ID = "lokpg";
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
