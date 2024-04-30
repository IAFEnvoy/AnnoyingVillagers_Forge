package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;
import pugilist_steve.mod.annoying_villagersbychentu.potion.*;


public class AnnoyingVillagersbychentuModMobEffects {
    public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AnnoyingVillagersbychentuMod.MODID);
    public static final RegistryObject<MobEffect> HEROBRINE = REGISTRY.register("herobrine", () -> {
        return new HerobrineMobEffect();
    });
    public static final RegistryObject<MobEffect> KUIJIAXIAOGUO = REGISTRY.register("kuijiaxiaoguo", () -> {
        return new KuijiaxiaoguoMobEffect();
    });
    public static final RegistryObject<MobEffect> TONGJI = REGISTRY.register("tongji", () -> {
        return new TongjiMobEffect();
    });
    public static final RegistryObject<MobEffect> HEROBRINEFUSHENBUFF = REGISTRY.register("herobrinefushenbuff", () -> {
        return new HerobrinefushenbuffMobEffect();
    });
    public static final RegistryObject<MobEffect> ELECTIFY = REGISTRY.register("electify", () -> {
        return new ElectifyMobEffect();
    });
    public static final RegistryObject<MobEffect> NAILI = REGISTRY.register("naili", () -> {
        return new NailiMobEffect();
    });
    public static final RegistryObject<MobEffect> CCDMFZSKJ = REGISTRY.register("ccdmfzskj", () -> {
        return new CCDMFZSKJMobEffect();
    });
    public static final RegistryObject<MobEffect> UNLIGHTDIAMONDEFFECT = REGISTRY.register("unlightdiamondeffect", () -> {
        return new UnlightdiamondeffectMobEffect();
    });
    public static final RegistryObject<MobEffect> GEDANG = REGISTRY.register("gedang", () -> {
        return new GedangMobEffect();
    });
    public static final RegistryObject<MobEffect> BLEED = REGISTRY.register("bleed", () -> {
        return new BleedMobEffect();
    });
    public static final RegistryObject<MobEffect> FALL = REGISTRY.register("fall", () -> {
        return new FallMobEffect();
    });
    public static final RegistryObject<MobEffect> TAOTUOBUFF = REGISTRY.register("taotuobuff", () -> {
        return new TaotuobuffMobEffect();
    });
    public static final RegistryObject<MobEffect> FULU = REGISTRY.register("fulu", () -> {
        return new FuluMobEffect();
    });
    public static final RegistryObject<MobEffect> YUGAN = REGISTRY.register("yugan", () -> {
        return new YuganMobEffect();
    });
}
