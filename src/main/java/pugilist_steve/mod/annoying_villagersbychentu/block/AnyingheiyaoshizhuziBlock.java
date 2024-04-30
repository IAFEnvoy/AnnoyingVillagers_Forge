package pugilist_steve.mod.annoying_villagersbychentu.block;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
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
import net.minecraftforge.common.util.ForgeSoundType;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.AnyingheiyaoshizhuziFangZhiFangKuaiShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.C0260xc60dc492;

import java.util.Collections;
import java.util.List;


public class AnyingheiyaoshizhuziBlock extends Block {
    public static final DirectionProperty FACING = DirectionalBlock.FACING;

    public AnyingheiyaoshizhuziBlock() {
        super(Properties.of(Material.STONE).sound(new ForgeSoundType(1.0f, 1.0f, () -> {
            return new SoundEvent(new ResourceLocation("annoying_villagersbychentu:shiqu"));
        }, () -> {
            return new SoundEvent(new ResourceLocation("block.stone.step"));
        }, () -> {
            return new SoundEvent(new ResourceLocation("block.stone.place"));
        }, () -> {
            return new SoundEvent(new ResourceLocation("block.stone.hit"));
        }, () -> {
            return new SoundEvent(new ResourceLocation("annoying_villagersbychentu:wusheng"));
        })).strength(30.0f, 40.0f).lightLevel(s -> {
            return 4;
        }).noOcclusion().hasPostProcess((bs, br, bp) -> {
            return true;
        }).emissiveRendering((bs2, br2, bp2) -> {
            return true;
        }).isRedstoneConductor((bs3, br3, bp3) -> {
            return false;
        }));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHIZHUZI.get(), renderType -> {
            return renderType == RenderType.cutout();
        });
    }

    @Override
    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("暗影him分身发射的暗影黑曜石"));
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
        switch (C00001.$SwitchMap$net$minecraft$core$Direction[state.getValue(FACING).ordinal()]) {
            case 1:
                return box(6.0d, 6.0d, 0.0d, 10.0d, 10.0d, 16.0d);
            case 2:
                return box(0.0d, 6.0d, 6.0d, 16.0d, 10.0d, 10.0d);
            case 3:
                return box(0.0d, 6.0d, 6.0d, 16.0d, 10.0d, 10.0d);
            case 4:
                return box(6.0d, 0.0d, 6.0d, 10.0d, 16.0d, 10.0d);
            case 5:
                return box(6.0d, 0.0d, 6.0d, 10.0d, 16.0d, 10.0d);
            default:
                return box(6.0d, 6.0d, 0.0d, 10.0d, 10.0d, 16.0d);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getClickedFace());
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

    @Override
    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        super.onPlace(blockstate, world, pos, oldState, moving);
        AnyingheiyaoshizhuziFangZhiFangKuaiShiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
        super.entityInside(blockstate, world, pos, entity);
        C0260xc60dc492.execute(world, entity);
    }

    static class C00001 {
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
            try {
                $SwitchMap$net$minecraft$core$Direction[Direction.UP.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                $SwitchMap$net$minecraft$core$Direction[Direction.DOWN.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
        }
    }
}
