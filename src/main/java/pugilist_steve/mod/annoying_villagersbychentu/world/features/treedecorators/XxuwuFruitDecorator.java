package pugilist_steve.mod.annoying_villagersbychentu.world.features.treedecorators;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;


public class XxuwuFruitDecorator extends CocoaDecorator {
    public static final XxuwuFruitDecorator INSTANCE = new XxuwuFruitDecorator();
    public static Codec<XxuwuFruitDecorator> codec = Codec.unit(() -> {
        return INSTANCE;
    });
    public static TreeDecoratorType<?> tdt = new TreeDecoratorType<>(codec);

    static {
        tdt.setRegistryName("xxuwu_tree_fruit_decorator");
        ForgeRegistries.TREE_DECORATOR_TYPES.register(tdt);
    }

    public XxuwuFruitDecorator() {
        super(0.2f);
    }

    @Override
    protected TreeDecoratorType<?> type() {
        return tdt;
    }

    @Override
    public void place(LevelSimulatedReader level, BiConsumer<BlockPos, BlockState> biConsumer, Random random, List<BlockPos> blocks, List<BlockPos> blocks2) {
        if (random.nextFloat() < 0.2f) {
            int i = blocks.get(0).getY();
            blocks.stream().filter(p_69980_ -> {
                return p_69980_.getY() - i <= 2;
            }).forEach(p_161728_ -> {
                Iterator it = Direction.Plane.HORIZONTAL.iterator();
                while (it.hasNext()) {
                    Direction direction = (Direction) it.next();
                    if (random.nextFloat() <= 0.25f) {
                        Direction direction1 = direction.getOpposite();
                        BlockPos blockpos = p_161728_.offset(direction1.getStepX(), 0, direction1.getStepZ());
                        if (Feature.isAir(level, blockpos)) {
                            biConsumer.accept(blockpos, Blocks.RED_STAINED_GLASS.defaultBlockState());
                        }
                    }
                }
            });
        }
    }
}
