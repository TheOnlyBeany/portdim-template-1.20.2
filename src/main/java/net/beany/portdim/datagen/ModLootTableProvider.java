package net.beany.portdim.datagen;

import net.beany.portdim.block.ModBlocks;
import net.beany.portdim.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.BLUESPACE_BLOCK);

        addDrop(ModBlocks.BLUESPACE_ORE, oreDrops(ModBlocks.BLUESPACE_ORE, ModItems.BCRYSTAL));
    }
}
