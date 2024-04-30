package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;


public class AnnoyingVillagersbychentuModPotions {
    public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, AnnoyingVillagersbychentuMod.MODID);
    public static final RegistryObject<Potion> ZUANJIAYAOSHUI = REGISTRY.register("zuanjiayaoshui", () -> {
        return new Potion(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.KUIJIAXIAOGUO.get(), 10000, 1, false, true));
    });
    public static final RegistryObject<Potion> NAILIPING = REGISTRY.register("nailiping", () -> {
        return new Potion(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.NAILI.get(), 10000, 1, false, true));
    });
    public static final RegistryObject<Potion> CCDMFZSKJYS = REGISTRY.register("ccdmfzskjys", () -> {
        return new Potion(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.CCDMFZSKJ.get(), 10000, 1, false, true));
    });
    public static final RegistryObject<Potion> UNLIGHTAYS = REGISTRY.register("unlightays", () -> {
        return new Potion(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.UNLIGHTDIAMONDEFFECT.get(), 10000, 1, false, true));
    });
}
