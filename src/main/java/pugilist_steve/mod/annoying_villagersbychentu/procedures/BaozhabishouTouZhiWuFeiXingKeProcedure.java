package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.LevelAccessor;


public class BaozhabishouTouZhiWuFeiXingKeProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.addParticle(ParticleTypes.SMOKE, x, y + 0.2d, z, 0.0d, 0.0d, 0.0d);
    }
}
