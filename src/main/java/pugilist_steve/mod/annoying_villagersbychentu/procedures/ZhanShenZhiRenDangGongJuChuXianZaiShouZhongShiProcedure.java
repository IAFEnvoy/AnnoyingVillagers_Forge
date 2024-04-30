package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class ZhanShenZhiRenDangGongJuChuXianZaiShouZhongShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 180, 2, false, false));
            }
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 180, 2, false, false));
            }
        }
        if (entity instanceof LivingEntity _entity3) {
            if (!_entity3.level.isClientSide()) {
                _entity3.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 180, 2, false, false));
            }
        }
        if (entity instanceof LivingEntity _entity4) {
            if (!_entity4.level.isClientSide()) {
                _entity4.addEffect(new MobEffectInstance(MobEffects.HUNGER, 100, 2, false, false));
            }
        }
    }
}
