package pugilist_steve.mod.annoying_villagersbychentu.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.TongjiDangXiaoGuoJieShuShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.TongjiDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.TongjiZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;


public class TongjiMobEffect extends MobEffect {
    public TongjiMobEffect() {
        super(MobEffectCategory.HARMFUL, -3407872);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.tongji";
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        TongjiDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        TongjiZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity);
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
        TongjiDangXiaoGuoJieShuShiProcedure.execute(entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
