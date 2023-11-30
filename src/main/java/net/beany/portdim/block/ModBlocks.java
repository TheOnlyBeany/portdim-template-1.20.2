package net.beany.portdim.block;

import net.beany.portdim.PortDim;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BLUESPACE_BLOCK = registerBlock("bluespace_block",
            new Block(FabricBlockSettings.copyOf(Blocks.ANDESITE)));
    public static final Block BLUESPACE_ORE = registerBlock("bluespace_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));

    private static Block registerBlock(String name,Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PortDim.MOD_ID, name),block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PortDim.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        PortDim.LOGGER.info("Registering ModBlocks for " + PortDim.MOD_ID);
    }
}
