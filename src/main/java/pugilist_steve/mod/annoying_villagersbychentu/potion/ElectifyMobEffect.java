package pugilist_steve.mod.annoying_villagersbychentu.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ElectifyZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;


public class ElectifyMobEffect extends MobEffect {
    public ElectifyMobEffect() {
        super(MobEffectCategory.HARMFUL, -16711681);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.electify";
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        ElectifyZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
