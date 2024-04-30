package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class BbdDangShiTiGengXinKeShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setYRot(0.0f);
        entity.setXRot(80.0f);
        entity.setYBodyRot(entity.getYRot());
        entity.setYHeadRot(entity.getYRot());
        entity.yRotO = entity.getYRot();
        entity.xRotO = entity.getXRot();
        if (entity instanceof LivingEntity _entity) {
            _entity.yBodyRotO = _entity.getYRot();
            _entity.yHeadRotO = _entity.getYRot();
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 1, 5, false, false));
            }
        }
    }
}
