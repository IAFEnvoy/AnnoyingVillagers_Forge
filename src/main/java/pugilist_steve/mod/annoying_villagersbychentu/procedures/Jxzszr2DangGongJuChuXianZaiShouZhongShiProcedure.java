package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;


public class Jxzszr2DangGongJuChuXianZaiShouZhongShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 10, false, false));
            }
        }
        world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 1.0d, 1.0d, 0.0d);
        world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 1.0d, 0.0d);
        world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 0.0d, 0.0d);
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1, 10, false, false));
            }
        }
        entity.setSecondsOnFire(1);
    }
}
