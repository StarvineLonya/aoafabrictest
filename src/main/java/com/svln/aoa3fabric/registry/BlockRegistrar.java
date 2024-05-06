package com.svln.aoa3fabric.registry;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

public final class BlockRegistrar<T extends Block> {


    public static Block blockCreator(AbstractBlock block, MapColor color) {
        return new Block(FabricBlockSettings.copyOf(block).mapColor(color));
    }


}
