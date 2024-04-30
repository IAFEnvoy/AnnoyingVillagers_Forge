package pugilist_steve.mod.annoying_villagersbychentu.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefushenbuffDangXiaoGuoJieShuShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefushenbuffDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefushenbuffZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;


public class HerobrinefushenbuffMobEffect extends MobEffect {
    public HerobrinefushenbuffMobEffect() {
        super(MobEffectCategory.HARMFUL, -6710887);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.herobrinefushenbuff";
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
        HerobrinefushenbuffDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        HerobrinefushenbuffZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute();
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
        HerobrinefushenbuffDangXiaoGuoJieShuShiProcedure.execute(entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
