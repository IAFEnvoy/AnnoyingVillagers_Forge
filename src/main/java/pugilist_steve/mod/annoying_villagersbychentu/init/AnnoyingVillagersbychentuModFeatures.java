package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;
import pugilist_steve.mod.annoying_villagersbychentu.world.features.BaoxiangFeature;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

@Mod.EventBusSubscriber

public class AnnoyingVillagersbychentuModFeatures {
    public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, AnnoyingVillagersbychentuMod.MODID);
    private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList();
    public static final RegistryObject<Feature<?>> BAOXIANG = register("baoxiang", BaoxiangFeature::feature, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, BaoxiangFeature.GENERATE_BIOMES, BaoxiangFeature::placedFeature));

    private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
        FEATURE_REGISTRATIONS.add(featureRegistration);
        return REGISTRY.register(registryname, feature);
    }

    @SubscribeEvent
    public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
        for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
            if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
                event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
            }
        }
    }

    public static final class FeatureRegistration {
        private final GenerationStep.Decoration stage;
        private final Set<ResourceLocation> biomes;
        private final Supplier<Holder<PlacedFeature>> placedFeature;

        private FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes, Supplier<Holder<PlacedFeature>> placedFeature) {
            this.stage = stage;
            this.biomes = biomes;
            this.placedFeature = placedFeature;
        }

        public GenerationStep.Decoration stage() {
            return this.stage;
        }

        public Set<ResourceLocation> biomes() {
            return this.biomes;
        }

        public Supplier<Holder<PlacedFeature>> placedFeature() {
            return this.placedFeature;
        }
    }
}
