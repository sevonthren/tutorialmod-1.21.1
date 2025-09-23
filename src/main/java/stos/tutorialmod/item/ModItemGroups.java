package stos.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import stos.tutorialmod.Tutorialmod;
import stos.tutorialmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Tutorialmod.MOD_ID, "pink_garnet"),
            FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.tutorialmod.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE);
                    }).build());

    public static void registerModItemGroups() {
        Tutorialmod.LOGGER.info("Registering item groups for" + Tutorialmod.MOD_ID);
    }
}
