package hibi.blahaj.mixin;

import hibi.blahaj.block.*;
import net.minecraft.world.entity.animal.allay.Allay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Allay.class)
public class AllayEntityMixin {
//
//	@Inject(
//		method = "interactMob",
//		at = @At("HEAD"),
//		cancellable = true
//	)
//	public void preventTakePlush(PlayerEntity player, Hand hand, CallbackInfoReturnable<ActionResult> info) {
//		if(player.getStackInHand(hand).getItem() instanceof CuddlyItem) {
//			info.setReturnValue(ActionResult.PASS);
//			info.cancel();
//		}
//	}
}
