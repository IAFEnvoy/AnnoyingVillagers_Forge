package pugilist_steve.mod.annoying_villagersbychentu.world.features.treedecorators;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.treedecorators.TrunkVineDecorator;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;


public class XxuwuTrunkDecorator extends TrunkVineDecorator {
    public static final XxuwuTrunkDecorator INSTANCE = new XxuwuTrunkDecorator();
    public static Codec<XxuwuTrunkDecorator> codec = Codec.unit(() -> {
        return INSTANCE;
    });
    public static TreeDecoratorType<?> tdt = new TreeDecoratorType<>(codec);

    static {
        tdt.setRegistryName("xxuwu_tree_trunk_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override
    public void place(LevelSimulatedReader levelReader, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> listBlockPos, List<BlockPos> listBlockPos2) {
        listBlockPos.forEach(blockpos -> {
            if (random.nextInt(3) > 0) {
                BlockPos bp = blockpos.below();
                if (Feature.isAir(levelReader, bp)) {
                    biConsumer.accept(blockpos, Blocks.CAVE_VINES_PLANT.defaultBlockState());
                }
            }
        });
    }
}
