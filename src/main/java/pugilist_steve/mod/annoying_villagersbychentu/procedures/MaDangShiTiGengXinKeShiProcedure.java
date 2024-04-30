package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class MaDangShiTiGengXinKeShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setSprinting(true);
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 300, 6, false, false));
            }
        }
    }
}
