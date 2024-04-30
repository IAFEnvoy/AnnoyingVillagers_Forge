package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;


public class C0260xc60dc492 {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        entity.hurt(DamageSource.MAGIC, 4.0f);
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2, 3, false, false));
            }
        }
    }
}
