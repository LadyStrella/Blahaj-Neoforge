package hibi.blahaj.mixin.client;

import hibi.blahaj.block.*;
//import net.minecraft.client.network.AbstractClientPlayerEntity;
//import net.minecraft.client.render.entity.PlayerEntityRenderer;
//import net.minecraft.client.render.entity.model.BipedEntityModel;
//import net.minecraft.client.render.entity.model.BipedEntityModel.ArmPose;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.Hand;

import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerRenderer.class)
public class PlayerEntityRendererMixin {
//	@Inject(
//		method = "getArmPose(Lnet/minecraft/client/network/AbstractClientPlayerEntity;Lnet/minecraft/util/Hand;)Lnet/minecraft/client/render/entity/model/BipedEntityModel$ArmPose;",
//		at = @At("TAIL"),
//		cancellable = true
//	)
//	private static void cuddleBlahaj(AbstractClientPlayerEntity player, Hand hand, CallbackInfoReturnable<BipedEntityModel.ArmPose> ci) {
//		if(player.getStackInHand(hand).getItem() instanceof CuddlyItem) {
//			ci.setReturnValue(ArmPose.CROSSBOW_HOLD);
//			ci.cancel();
//		}
//	}
}
