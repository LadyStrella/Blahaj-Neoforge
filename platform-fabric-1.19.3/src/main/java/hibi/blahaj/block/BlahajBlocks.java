package hibi.blahaj.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.*;
import net.fabricmc.fabric.api.itemgroup.v1.*;
import net.minecraft.block.*;
import net.minecraft.client.render.*;
import net.minecraft.item.*;
import net.minecraft.registry.*;
import net.minecraft.util.*;

import static hibi.blahaj.Blahaj.*;

public class BlahajBlocks {

	public static final Identifier BLAHAJ_ID = new Identifier(MOD_ID, "blue_shark");
	public static final Identifier GRAY_SHARK_ID = new Identifier(MOD_ID, "gray_shark");
	public static final Identifier BREAD_ID = new Identifier(MOD_ID, "bread");

	public static Block GRAY_SHARK_BLOCK;
	public static Item GRAY_SHARK_ITEM;
	public static Block BLAHAJ_BLOCK;
	public static Item BLAHAJ_ITEM;
	public static Block BREAD_BLOCK;
	public static Item BREAD_ITEM;

	public static void register() {
		GRAY_SHARK_BLOCK = Registry.register(Registries.BLOCK, GRAY_SHARK_ID, new CuddlyBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
		BLAHAJ_BLOCK = Registry.register(Registries.BLOCK, BLAHAJ_ID, new CuddlyBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
		BREAD_BLOCK = Registry.register(Registries.BLOCK, BREAD_ID, new CuddlyBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));

		GRAY_SHARK_ITEM = Registry.register(Registries.ITEM, GRAY_SHARK_ID, new CuddlyItem(GRAY_SHARK_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.gray_shark.tooltip"));
		BLAHAJ_ITEM = Registry.register(Registries.ITEM, BLAHAJ_ID, new CuddlyItem(BLAHAJ_BLOCK, new Item.Settings().maxCount(1), "block.blahaj.blue_shark.tooltip"));
		BREAD_ITEM = Registry.register(Registries.ITEM, BREAD_ID, new CuddlyItem(BREAD_BLOCK, new Item.Settings().maxCount(1), null));

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
			entries.add(new ItemStack(GRAY_SHARK_ITEM));
			entries.add(new ItemStack(BLAHAJ_ITEM));
			entries.add(new ItemStack(BREAD_ITEM));
		});
	}

	public static void registerClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(GRAY_SHARK_BLOCK, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BLAHAJ_BLOCK, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BREAD_BLOCK, RenderLayer.getCutout());
	}

}
