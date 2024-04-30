package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pugilist_steve.mod.annoying_villagersbychentu.client.particle.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})

public class AnnoyingVillagersbychentuModParticles {
    @SubscribeEvent
    public static void registerParticles(ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.DIANHU.get(), DianhuParticle::provider);
        Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.DIANHU_2.get(), Dianhu2Particle::provider);
        Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.SPARK.get(), SparkParticle::provider);
        Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.f0PE.get(), PeParticle::provider);
        Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.GLOWINGEYES.get(), GlowingeyesParticle::provider);
        Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.LIGHT.get(), LightParticle::provider);
        Minecraft.getInstance().particleEngine.register((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.BLUESPARK.get(), BluesparkParticle::provider);
    }
}
