package pugilist_steve.mod.annoying_villagersbychentu.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;


public class FuluMobEffect extends MobEffect {
    public FuluMobEffect() {
        super(MobEffectCategory.NEUTRAL, -1);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.fulu";
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }
}
