package pugilist_steve.mod.annoying_villagersbychentu.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrineDangXiaoGuoJieShuShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrineZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;


public class HerobrineMobEffect extends MobEffect {
    public HerobrineMobEffect() {
        super(MobEffectCategory.HARMFUL, -6710887);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.herobrine";
    }

    @Override
    public boolean isInstantenous() {
        return true;
    }

    @Override
    public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
        HerobrineZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity.level, entity);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        HerobrineZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity.level, entity);
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
        HerobrineDangXiaoGuoJieShuShiProcedure.execute(entity.level, entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
