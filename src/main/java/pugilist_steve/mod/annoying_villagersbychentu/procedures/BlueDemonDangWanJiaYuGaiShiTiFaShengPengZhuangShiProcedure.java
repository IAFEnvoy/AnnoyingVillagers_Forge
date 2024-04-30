package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;

import java.util.Random;


public class BlueDemonDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y) {
        if (Math.random() <= 0.01d && (world instanceof ServerLevel _level)) {
            LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
            entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, Mth.nextDouble(new Random(), 1.0d, 2.0d))));
            entityToSpawn.setVisualOnly(false);
            _level.addFreshEntity(entityToSpawn);
        }
    }
}
