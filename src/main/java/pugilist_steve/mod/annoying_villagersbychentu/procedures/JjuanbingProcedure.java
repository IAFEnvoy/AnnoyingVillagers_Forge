package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class JjuanbingProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 350, 5));
            }
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 350, 2));
            }
        }
        if (entity instanceof LivingEntity _entity3) {
            if (!_entity3.level.isClientSide()) {
                _entity3.addEffect(new MobEffectInstance(MobEffects.JUMP, 350, 2));
            }
        }
        if (entity instanceof LivingEntity _entity4) {
            if (!_entity4.level.isClientSide()) {
                _entity4.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 3));
            }
        }
        if (entity instanceof LivingEntity _entity5) {
            if (!_entity5.level.isClientSide()) {
                _entity5.addEffect(new MobEffectInstance(MobEffects.HEAL, 60, 20));
            }
        }
        if (entity instanceof LivingEntity _entity6) {
            if (!_entity6.level.isClientSide()) {
                _entity6.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 60, 1, false, false));
            }
        }
    }
}
