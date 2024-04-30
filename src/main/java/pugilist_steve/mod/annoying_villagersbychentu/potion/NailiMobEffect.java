package pugilist_steve.mod.annoying_villagersbychentu.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.NailiZaiXiaoGuoChiXuShiMeiKeFaShengProcedure;


public class NailiMobEffect extends MobEffect {
    public NailiMobEffect() {
        super(MobEffectCategory.BENEFICIAL, -65485);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.naili";
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier) {
        NailiZaiXiaoGuoChiXuShiMeiKeFaShengProcedure.execute(entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
