package net.javieh.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.javieh.tutorialmod.TutorialMod;
import net.javieh.tutorialmod.TutorialModClient;
import net.javieh.tutorialmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "items"), FabricItemGroup.builder().icon(() ->
                    new ItemStack(ModItems.PINK_GARNET)).displayName(Text.translatable("itemgroup.tutorialmod.items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                    }).build());

    public static final ItemGroup BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "blocks"), FabricItemGroup.builder().icon(() ->
                    new ItemStack(ModBlocks.SKRILLEX_BLOCK)).displayName(Text.translatable("itemgroup.tutorialmod.blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SKRILLEX_BLOCK);
                        entries.add(ModBlocks.NUKE_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.FAKE_BEDROCK_BLOCK);
                    }).build());


    public static void registerItemGroups(){
        TutorialMod.LOGGER.info("Registering Item Groups for " + TutorialMod.MOD_ID);
    }
}
