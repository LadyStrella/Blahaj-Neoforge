package hibi.blahaj;



import com.mojang.logging.LogUtils;
import hibi.blahaj.block.*;
import net.minecraft.item.*;
import net.minecraft.loot.*;
import net.minecraft.loot.entry.*;
import net.minecraft.village.*;
import org.slf4j.Logger;

//@Mod(Blahaj.MOD_ID)
public class Blahaj{

	public static final String MOD_ID = "blahaj";
	private static final Logger LOGGER = LogUtils.getLogger();

	public void onInitialize() {
		BlahajDataComponentTypes.register();
		BlahajBlocks.register();
//		registerLootTables();
//		registerTrades();
	}

//	private static void registerLootTables() {
//		LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
//			if (key.equals(LootTables.STRONGHOLD_CROSSING_CHEST) || key.equals(LootTables.STRONGHOLD_CORRIDOR_CHEST)) {
//				LootPool.Builder pb = LootPool.builder()
//					.with(ItemEntry.builder(BlahajBlocks.GRAY_SHARK_ITEM).weight(5))
//					.with(ItemEntry.builder(Items.AIR).weight(100));
//				tableBuilder.pool(pb);
//			} else if (key.equals(LootTables.VILLAGE_PLAINS_CHEST)) {
//				LootPool.Builder pb = LootPool.builder()
//					.with(ItemEntry.builder(BlahajBlocks.GRAY_SHARK_ITEM))
//					.with(ItemEntry.builder(Items.AIR).weight(43));
//				tableBuilder.pool(pb);
//			} else if (key.equals(LootTables.VILLAGE_TAIGA_HOUSE_CHEST) || key.equals(LootTables.VILLAGE_SNOWY_HOUSE_CHEST)) {
//				LootPool.Builder pb = LootPool.builder()
//					.with(ItemEntry.builder(BlahajBlocks.GRAY_SHARK_ITEM).weight(5))
//					.with(ItemEntry.builder(Items.AIR).weight(54));
//				tableBuilder.pool(pb);
//			} else if (key.equals(LootTables.HERO_OF_THE_VILLAGE_FLETCHER_GIFT_GAMEPLAY)
//				|| key.equals(LootTables.HERO_OF_THE_VILLAGE_BUTCHER_GIFT_GAMEPLAY)
//				|| key.equals(LootTables.HERO_OF_THE_VILLAGE_LEATHERWORKER_GIFT_GAMEPLAY)) {
//
//				LootPool.Builder pb = LootPool.builder()
//					.with(ItemEntry.builder(BlahajBlocks.BROWN_BEAR_ITEM).weight(5))
//					.with(ItemEntry.builder(Items.AIR).weight(25));
//				tableBuilder.pool(pb);
//			}
//		});
//	}
//
//	private static void registerTrades() {
//		TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 5, factories -> {
//			factories.add((entity, random) -> new TradeOffer(new TradedItem(Items.EMERALD, 15), new ItemStack(BlahajBlocks.GRAY_SHARK_ITEM), 2, 30, 0.1f));
//		});
//	}

}
