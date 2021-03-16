package com.lokdora.playground.registry;

import com.lokdora.playground.Playground;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block GLOWSTONE_WIRE = new Block(FabricBlockSettings
            .of(Material.SUPPORTED)
            .breakInstantly()
            .noCollision());
    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Playground.MOD_ID, "glowstone_wire"), GLOWSTONE_WIRE);
    }
}
