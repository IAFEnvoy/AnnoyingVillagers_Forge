package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;


public class BeiGanRanJianBingGuoZiShiTiChuShiShengChengShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && (entity instanceof LivingEntity _entity)) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.HEROBRINE.get(), 8000, 3));
            }
        }
    }
}
