package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;


public class HongCunQiFuLuShiTiChuShiShengChengShiProcedure {
    public static void execute(LevelAccessor world, double x, double z) {
        world.setBlock(new BlockPos(x, -1.0d, z), Blocks.SMITHING_TABLE.defaultBlockState(), 3);
    }
}
