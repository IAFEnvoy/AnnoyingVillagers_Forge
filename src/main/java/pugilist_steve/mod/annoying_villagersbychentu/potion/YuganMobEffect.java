package pugilist_steve.mod.annoying_villagersbychentu.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.YuganDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;


public class YuganMobEffect extends MobEffect {
    public YuganMobEffect() {
        super(MobEffectCategory.NEUTRAL, -1);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.yugan";
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
        YuganDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
