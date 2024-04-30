package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;


public class AnnoyingVillagersbychentuModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, AnnoyingVillagersbychentuMod.MODID);
    public static final RegistryObject<ParticleType<?>> DIANHU = REGISTRY.register("dianhu", () -> {
        return new SimpleParticleType(false);
    });
    public static final RegistryObject<ParticleType<?>> DIANHU_2 = REGISTRY.register("dianhu_2", () -> {
        return new SimpleParticleType(false);
    });
    public static final RegistryObject<ParticleType<?>> SPARK = REGISTRY.register("spark", () -> {
        return new SimpleParticleType(true);
    });


    public static final RegistryObject<ParticleType<?>> f0PE = REGISTRY.register("pe", () -> {
        return new SimpleParticleType(false);
    });
    public static final RegistryObject<ParticleType<?>> GLOWINGEYES = REGISTRY.register("glowingeyes", () -> {
        return new SimpleParticleType(true);
    });
    public static final RegistryObject<ParticleType<?>> LIGHT = REGISTRY.register("light", () -> {
        return new SimpleParticleType(true);
    });
    public static final RegistryObject<ParticleType<?>> BLUESPARK = REGISTRY.register("bluespark", () -> {
        return new SimpleParticleType(true);
    });
}
