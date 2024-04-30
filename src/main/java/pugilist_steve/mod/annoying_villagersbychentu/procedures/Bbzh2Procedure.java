package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModParticleTypes;


public class Bbzh2Procedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel _level) {
            _level.sendParticles((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.DIANHU.get(), x, y, z, 6, 3.0d, 3.0d, 3.0d, 50.0d);
        }
    }
}
