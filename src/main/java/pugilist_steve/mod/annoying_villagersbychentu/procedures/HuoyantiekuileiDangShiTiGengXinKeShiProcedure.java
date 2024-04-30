package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;


public class HuoyantiekuileiDangShiTiGengXinKeShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.LAVA.defaultBlockState()));
        world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.FIRE.defaultBlockState()));
    }
}
