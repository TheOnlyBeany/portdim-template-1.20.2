package net.beany.portdim.item;

import net.beany.portdim.PortDim;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PortDim.MOD_ID, name), item);

    }
    public static void registerModItems() {
        PortDim.LOGGER.info("Registering Mod Items for " + PortDim.MOD_ID);

    }
}
