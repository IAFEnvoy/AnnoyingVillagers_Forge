package pugilist_steve.mod.annoying_villagersbychentu.block;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;

import java.util.Collections;
import java.util.List;


public class PugilistSteveModelBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public PugilistSteveModelBlock() {
        super(Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1.0f, 10.0f).noOcclusion().isRedstoneConductor((bs, br, bp) -> {
            return false;
        }));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(AnnoyingVillagersbychentuModBlocks.PUGILIST_STEVE_MODEL.get(), renderType -> {
            return renderType == RenderType.cutout();
        });
    }

    @Override
    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("整合包作者玩偶"));
    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        switch (C00011.$SwitchMap$net$minecraft$core$Direction[state.getValue(FACING).ordinal()]) {
            case 1:
                return Shapes.or(box(6.5d, 11.5d, 5.5d, 10.5d, 15.5d, 9.5d), box(6.25d, 11.0d, 5.25d, 10.75d, 15.5d, 9.75d), box(6.5d, 5.5d, 6.5d, 10.5d, 11.5d, 8.5d), box(6.375d, 5.375d, 6.375d, 10.625d, 11.625d, 8.625d), box(10.5d, 5.5d, 6.5d, 12.5d, 11.5d, 8.5d), box(10.375d, 5.375d, 6.375d, 12.625d, 11.625d, 8.625d), box(4.5d, 5.5d, 6.5d, 6.5d, 11.5d, 8.5d), box(4.375d, 5.375d, 6.375d, 6.625d, 11.625d, 8.625d), box(8.45d, -0.5d, 6.5d, 10.45d, 5.5d, 8.5d), box(8.325d, -0.625d, 6.375d, 10.575d, 5.625d, 8.625d), box(6.55d, -0.5d, 6.5d, 8.55d, 5.5d, 8.5d), box(6.425d, -0.625d, 6.375d, 8.675d, 5.625d, 8.625d));
            case 2:
                return Shapes.or(box(6.5d, 11.5d, 6.5d, 10.5d, 15.5d, 10.5d), box(6.25d, 11.0d, 6.25d, 10.75d, 15.5d, 10.75d), box(7.5d, 5.5d, 6.5d, 9.5d, 11.5d, 10.5d), box(7.375d, 5.375d, 6.375d, 9.625d, 11.625d, 10.625d), box(7.5d, 5.5d, 10.5d, 9.5d, 11.5d, 12.5d), box(7.375d, 5.375d, 10.375d, 9.625d, 11.625d, 12.625d), box(7.5d, 5.5d, 4.5d, 9.5d, 11.5d, 6.5d), box(7.375d, 5.375d, 4.375d, 9.625d, 11.625d, 6.625d), box(7.5d, -0.5d, 8.45d, 9.5d, 5.5d, 10.45d), box(7.375d, -0.625d, 8.325d, 9.625d, 5.625d, 10.575d), box(7.5d, -0.5d, 6.55d, 9.5d, 5.5d, 8.55d), box(7.375d, -0.625d, 6.425d, 9.625d, 5.625d, 8.675d));
            case 3:
                return Shapes.or(box(5.5d, 11.5d, 5.5d, 9.5d, 15.5d, 9.5d), box(5.25d, 11.0d, 5.25d, 9.75d, 15.5d, 9.75d), box(6.5d, 5.5d, 5.5d, 8.5d, 11.5d, 9.5d), box(6.375d, 5.375d, 5.375d, 8.625d, 11.625d, 9.625d), box(6.5d, 5.5d, 3.5d, 8.5d, 11.5d, 5.5d), box(6.375d, 5.375d, 3.375d, 8.625d, 11.625d, 5.625d), box(6.5d, 5.5d, 9.5d, 8.5d, 11.5d, 11.5d), box(6.375d, 5.375d, 9.375d, 8.625d, 11.625d, 11.625d), box(6.5d, -0.5d, 5.55d, 8.5d, 5.5d, 7.55d), box(6.375d, -0.625d, 5.425d, 8.625d, 5.625d, 7.675d), box(6.5d, -0.5d, 7.45d, 8.5d, 5.5d, 9.45d), box(6.375d, -0.625d, 7.325d, 8.625d, 5.625d, 9.575d));
            default:
                return Shapes.or(box(5.5d, 11.5d, 6.5d, 9.5d, 15.5d, 10.5d), box(5.25d, 11.0d, 6.25d, 9.75d, 15.5d, 10.75d), box(5.5d, 5.5d, 7.5d, 9.5d, 11.5d, 9.5d), box(5.375d, 5.375d, 7.375d, 9.625d, 11.625d, 9.625d), box(3.5d, 5.5d, 7.5d, 5.5d, 11.5d, 9.5d), box(3.375d, 5.375d, 7.375d, 5.625d, 11.625d, 9.625d), box(9.5d, 5.5d, 7.5d, 11.5d, 11.5d, 9.5d), box(9.375d, 5.375d, 7.375d, 11.625d, 11.625d, 9.625d), box(5.55d, -0.5d, 7.5d, 7.55d, 5.5d, 9.5d), box(5.425d, -0.625d, 7.375d, 7.675d, 5.625d, 9.625d), box(7.45d, -0.5d, 7.5d, 9.45d, 5.5d, 9.5d), box(7.325d, -0.625d, 7.375d, 9.575d, 5.625d, 9.625d));
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty()) {
            return dropsOriginal;
        }
        return Collections.singletonList(new ItemStack(this, 1));
    }

    static class C00011 {
        static final int[] $SwitchMap$net$minecraft$core$Direction = new int[Direction.values().length];

        static {
            try {
                $SwitchMap$net$minecraft$core$Direction[Direction.NORTH.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$net$minecraft$core$Direction[Direction.EAST.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$net$minecraft$core$Direction[Direction.WEST.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }
}
