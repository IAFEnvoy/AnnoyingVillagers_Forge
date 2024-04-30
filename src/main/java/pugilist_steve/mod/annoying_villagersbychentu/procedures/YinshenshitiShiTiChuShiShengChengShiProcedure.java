package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class YinshenshitiShiTiChuShiShengChengShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            entity.hurt(new DamageSource("custom").bypassArmor(), 2.0f);
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1, false, false));
            }
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 60, 1, false, false));
            }
        }
    }
}
