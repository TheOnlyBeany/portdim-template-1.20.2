package net.beany.portdim.item;

import net.beany.portdim.PortDim;
import net.beany.portdim.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PORTDIM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(PortDim.MOD_ID, "bcrystal"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.bcrystal"))
                    .icon(() -> new ItemStack(ModItems.BCRYSTAL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BCRYSTAL);

                        entries.add(ModBlocks.BLUESPACE_BLOCK);
                        entries.add(ModBlocks.BLUESPACE_ORE);


                    }).build());

    public static void registerItemGroups() {
        PortDim.LOGGER.info("Registering Item Groups for " + PortDim.MOD_ID);
    }
}
