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
            new Identifier(PortDim.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);

                        entries.add(ModBlocks.BLUESPACE_BLOCK);


                    }).build());

    public static void registerItemGroups() {
        PortDim.LOGGER.info("Registering Item Groups for " + PortDim.MOD_ID);
    }
}
