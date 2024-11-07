package hibi.blahaj.block;

import com.mojang.serialization.*;
import net.minecraft.core.BlockPos;
import net.minecraft.world.*;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class CuddlyBlock extends BlockEntity {
	public CuddlyBlock(BlockEntityType<?> type, BlockPos pos, BlockState blockState) {
		super(type, pos, blockState);
	}

//	protected static final VoxelShape SHAPE = Block.createCuboidShape(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
//	public static final MapCodec<CuddlyBlock> CODEC = createCodec(CuddlyBlock::new);
//
//	public CuddlyBlock(Settings settings) {
//		super(settings);
//		this.setDefaultState(this.stateManager.getDefaultState().with(FACING, Direction.NORTH));
//	}
//
//	@Override
//	protected MapCodec<? extends HorizontalFacingBlock> getCodec() {
//		return CODEC;
//	}
//
//	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
//		return SHAPE;
//	}
//
//	@Override
//	public BlockState getPlacementState(ItemPlacementContext ctx) {
//		return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing().getOpposite());
//	}
//
//
//	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
//		builder.add(FACING);
//	}

}
