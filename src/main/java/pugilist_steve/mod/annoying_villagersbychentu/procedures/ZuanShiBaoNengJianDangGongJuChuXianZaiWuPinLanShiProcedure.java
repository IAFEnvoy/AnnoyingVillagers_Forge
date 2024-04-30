package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class ZuanShiBaoNengJianDangGongJuChuXianZaiWuPinLanShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && (entity instanceof LivingEntity _entity)) {
            _entity.removeEffect(MobEffects.WEAKNESS);
        }
    }
}
