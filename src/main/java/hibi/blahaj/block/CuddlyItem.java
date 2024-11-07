package hibi.blahaj.block;

import hibi.blahaj.*;
import net.minecraft.core.BlockPos;
import net.minecraft.util.*;
import net.minecraft.world.*;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.*;

import java.util.*;

public class CuddlyItem extends BlockItem {
	public CuddlyItem(Block block, Properties properties) {
		super(block, properties);
	}
//	private final Text subtitle;
//
//	public CuddlyItem(Block block, Settings settings, String subtitle) {
//		super(block, settings);
//		this.subtitle = subtitle == null ? null : Text.translatable(subtitle).formatted(Formatting.GRAY);
//	}
//
//	@Override
//	public void onCraftByPlayer(ItemStack stack, World world, PlayerEntity player) {
//		super.onCraftByPlayer(stack, world, player);
//
//		if (player != null) { // compensate for auto-crafter mods
//			stack.set(BlahajDataComponentTypes.OWNER, player.getName());
//		}
//	}
//
//	@Override
//	public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
//		super.appendTooltip(stack, context, tooltip, type);
//
//		if (this.subtitle != null) {
//			tooltip.add(this.subtitle);
//		}
//
//		@Nullable Text ownerName = stack.get(BlahajDataComponentTypes.OWNER);
//		if (ownerName != null) {
//			@Nullable Text customName = stack.get(DataComponentTypes.CUSTOM_NAME);
//			if (customName == null) {
//				tooltip.add(Text.translatable("tooltip.blahaj.owner.craft", ownerName).formatted(Formatting.GRAY));
//			} else {
//				tooltip.add(Text.translatable("tooltip.blahaj.owner.rename", customName, ownerName).formatted(Formatting.GRAY));
//			}
//		}
//	}
//
//	public static final Identifier MINING_SPEED_MODIFIER_ID = Identifier.of(Blahaj.MOD_ID, "base_attack_damage");
//
//	public static AttributeModifiersComponent createAttributeModifiers() {
//		return AttributeModifiersComponent.builder()
//			.add(EntityAttributes.PLAYER_BLOCK_BREAK_SPEED, new EntityAttributeModifier(MINING_SPEED_MODIFIER_ID, -3.0, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), AttributeModifierSlot.MAINHAND)
//			.add(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(BASE_ATTACK_DAMAGE_MODIFIER_ID, -2.0, EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL), AttributeModifierSlot.MAINHAND)
//			.build();
//	}


}
