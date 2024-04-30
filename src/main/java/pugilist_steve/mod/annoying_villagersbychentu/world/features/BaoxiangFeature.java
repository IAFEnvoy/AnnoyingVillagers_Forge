package pugilist_steve.mod.annoying_villagersbychentu.world.features;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockIgnoreProcessor;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;

import java.util.List;
import java.util.Set;


public class BaoxiangFeature extends Feature<NoneFeatureConfiguration> {
    public static final Set<ResourceLocation> GENERATE_BIOMES = null;
    public static BaoxiangFeature FEATURE = null;
    public static Holder<ConfiguredFeature<NoneFeatureConfiguration, ?>> CONFIGURED_FEATURE = null;
    public static Holder<PlacedFeature> PLACED_FEATURE = null;
    private final Set<ResourceKey<Level>> generate_dimensions;
    private StructureTemplate template;

    public BaoxiangFeature() {
        super(NoneFeatureConfiguration.CODEC);
        this.generate_dimensions = Set.of(Level.OVERWORLD);
        this.template = null;
    }

    public static Feature<?> feature() {
        FEATURE = new BaoxiangFeature();
        CONFIGURED_FEATURE = FeatureUtils.register("annoying_villagersbychentu:baoxiang", FEATURE, FeatureConfiguration.NONE);
        PLACED_FEATURE = PlacementUtils.register("annoying_villagersbychentu:baoxiang", CONFIGURED_FEATURE, List.of());
        return FEATURE;
    }

    public static Holder<PlacedFeature> placedFeature() {
        return PLACED_FEATURE;
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
        if (!this.generate_dimensions.contains(context.level().getLevel().dimension())) {
            return false;
        }
        if (this.template == null) {
            this.template = context.level().getLevel().getStructureManager().getOrCreate(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "chest"));
        }
        if (this.template == null) {
            return false;
        }
        boolean anyPlaced = false;
        if (context.random().nextInt(1000000) + 1 <= 997) {
            int count = context.random().nextInt(1) + 1;
            for (int a = 0; a < count; a++) {
                int i = context.origin().getX() + context.random().nextInt(16);
                int k = context.origin().getZ() + context.random().nextInt(16);
                int j = context.level().getHeight(Heightmap.Types.OCEAN_FLOOR_WG, i, k) - 1;
                BlockPos spawnTo = new BlockPos(i, j, k);
                if (this.template.placeInWorld(context.level(), spawnTo, spawnTo, new StructurePlaceSettings().setMirror(Mirror.values()[context.random().nextInt(2)]).setRotation(Rotation.values()[context.random().nextInt(3)]).setRandom(context.random()).addProcessor(BlockIgnoreProcessor.STRUCTURE_BLOCK).setIgnoreEntities(false), context.random(), 2)) {
                    anyPlaced = true;
                }
            }
        }
        return anyPlaced;
    }
}
