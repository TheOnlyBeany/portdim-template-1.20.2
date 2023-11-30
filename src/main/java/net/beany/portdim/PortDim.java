package net.beany.portdim;

import net.beany.portdim.block.ModBlocks;
import net.beany.portdim.item.ModItemGroups;
import net.beany.portdim.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PortDim implements ModInitializer {
public static final String MOD_ID = "portdim";
    public static final Logger LOGGER = LoggerFactory.getLogger("portdim");

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}