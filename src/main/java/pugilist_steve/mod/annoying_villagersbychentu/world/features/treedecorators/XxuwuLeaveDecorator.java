package pugilist_steve.mod.annoying_villagersbychentu.world.features.treedecorators;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.treedecorators.LeaveVineDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;


public class XxuwuLeaveDecorator extends LeaveVineDecorator {
    public static final XxuwuLeaveDecorator INSTANCE = new XxuwuLeaveDecorator();
    public static Codec<LeaveVineDecorator> codec = Codec.unit(() -> {
        return INSTANCE;
    });
    public static TreeDecoratorType<?> tdt = new TreeDecoratorType<>(codec);

    static {
        tdt.setRegistryName("xxuwu_tree_leave_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    private static void addVine(LevelSimulatedReader levelReader, BlockPos blockPos, BiConsumer<BlockPos, BlockState> biConsumer) {
        biConsumer.accept(blockPos, Blocks.CAVE_VINES_PLANT.defaultBlockState());
        BlockPos blockpos = blockPos.below();
        for (int i = 4; Feature.isAir(levelReader, blockpos) && i > 0; i--) {
            biConsumer.accept(blockpos, Blocks.CAVE_VINES_PLANT.defaultBlockState());
            blockpos = blockpos.below();
        }
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override
    public void place(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> listBlockPos, List<BlockPos> listBlockPos2) {
        listBlockPos2.forEach(blockpos -> {
            if (random.nextInt(4) == 0) {
                BlockPos bp = blockpos.below();
                if (Feature.isAir(level, bp)) {
                    addVine(level, bp, biConsumer);
                }
            }
        });
    }
}
