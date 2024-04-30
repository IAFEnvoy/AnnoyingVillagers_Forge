package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.LevelAccessor;


public class FumomoyingzhenzhuTouZhiWuFeiXingKeProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.addParticle(ParticleTypes.PORTAL, x, y, z, 0.0d, 0.0d, 0.0d);
        world.addParticle(ParticleTypes.PORTAL, x, y, z, 0.0d, 0.0d, 0.0d);
        world.addParticle(ParticleTypes.PORTAL, x, y, z, 0.0d, 0.0d, 0.0d);
        world.addParticle(ParticleTypes.PORTAL, x, y, z, 0.0d, 0.0d, 0.0d);
        world.addParticle(ParticleTypes.PORTAL, x, y, z, 0.0d, 0.0d, 0.0d);
    }
}
