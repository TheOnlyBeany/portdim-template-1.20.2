package net.beany.portdim.datagen;

import net.beany.portdim.block.ModBlocks;
import net.beany.portdim.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> SMELTABLE_BCRYSTAL = List.of(ModBlocks.BLUESPACE_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, SMELTABLE_BCRYSTAL, RecipeCategory.MISC, ModItems.BCRYSTAL,
                0.7f, 200, "bcrystal");
        offerBlasting(exporter, SMELTABLE_BCRYSTAL, RecipeCategory.MISC, ModItems.BCRYSTAL,
                0.7f, 100, "bcrystal");

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.BLUESPACE_BLOCK, 1)
                .pattern("@s@")
                .pattern("###")
                .pattern("@s@")
                .input('#', ModItems.BCRYSTAL)
                .input('@', Items.OBSIDIAN)
                .input('s', Items.SHULKER_SHELL)
                .criterion(hasItem(ModItems.BCRYSTAL), conditionsFromItem(ModItems.BCRYSTAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.BLUESPACE_BLOCK)));

    }
}
