package dev.tophatcat.spookybiomes.common.blocks.signs;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.BiFunction;

public class SpookyWallSignBlock extends WallSignBlock {
    private final BiFunction<BlockPos, BlockState, ? extends BlockEntity> blockEntityCreator;

    public SpookyWallSignBlock(final BlockBehaviour.Properties properties, final WoodType woodType,
                               final BiFunction<BlockPos, BlockState, ? extends BlockEntity> blockEntityCreator) {
        super(properties, woodType);
        this.blockEntityCreator = blockEntityCreator;
    }

    @Override
    public BlockEntity newBlockEntity(final BlockPos pos, final BlockState state) {
        return blockEntityCreator.apply(pos, state);
    }
}
