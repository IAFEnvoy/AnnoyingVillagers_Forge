package pugilist_steve.mod.annoying_villagersbychentu.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.TaotuoAnXiaAnJianShiProcedure;


public class TaotuobuffMobEffect extends MobEffect {
    public TaotuobuffMobEffect() {
        super(MobEffectCategory.NEUTRAL, -1);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.taotuobuff";
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        TaotuoAnXiaAnJianShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
