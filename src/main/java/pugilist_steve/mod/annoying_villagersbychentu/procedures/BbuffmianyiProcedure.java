package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class BbuffmianyiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            _entity.removeEffect(MobEffects.WEAKNESS);
        }
        if (entity instanceof LivingEntity _entity2) {
            _entity2.removeEffect(MobEffects.WITHER);
        }
        if (entity instanceof LivingEntity _entity3) {
            _entity3.removeEffect(MobEffects.CONFUSION);
        }
        if (entity instanceof LivingEntity _entity4) {
            _entity4.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
        }
        if (entity instanceof LivingEntity _entity5) {
            _entity5.removeEffect(MobEffects.BLINDNESS);
        }
        if (entity instanceof LivingEntity _entity6) {
            _entity6.removeEffect(MobEffects.HARM);
        }
        if (entity instanceof LivingEntity _entity7) {
            _entity7.removeEffect(MobEffects.DIG_SLOWDOWN);
        }
        if (entity instanceof LivingEntity _entity8) {
            _entity8.removeEffect(MobEffects.POISON);
        }
        if (entity instanceof LivingEntity _entity9) {
            _entity9.removeEffect(MobEffects.BAD_OMEN);
        }
    }
}
