package pugilist_steve.mod.annoying_villagersbychentu.block;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.util.ForgeSoundType;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.AnyingheiyaoshiDangShiTiZaiFangKuaiZhongPengZhuangShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.PutongheiyaoshiFangZhiFangKuaiShiProcedure;

import java.util.Collections;
import java.util.List;


public class PutongheiyaoshiBlock extends Block {
    public PutongheiyaoshiBlock() {
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
        })).strength(60.0f, 40.0f).lightLevel(s -> {
            return 4;
        }).noOcclusion().hasPostProcess((bs, br, bp) -> {
            return true;
        }).emissiveRendering((bs2, br2, bp2) -> {
            return true;
        }).isRedstoneConductor((bs3, br3, bp3) -> {
            return false;
        }));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get(), renderType -> {
            return renderType == RenderType.cutoutMipped();
        });
    }

    @Override
    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("him分身发射的黑曜石"));
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(0.0d, 0.0d, 0.0d, 16.0d, 16.0d, 17.0d);
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
        PutongheiyaoshiFangZhiFangKuaiShiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
        super.entityInside(blockstate, world, pos, entity);
        AnyingheiyaoshiDangShiTiZaiFangKuaiZhongPengZhuangShiProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ(), entity);
    }
}
