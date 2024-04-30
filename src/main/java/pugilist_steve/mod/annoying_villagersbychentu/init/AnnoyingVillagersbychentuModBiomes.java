package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;
import pugilist_steve.mod.annoying_villagersbychentu.world.biome.XxuwuBiome;


public class AnnoyingVillagersbychentuModBiomes {
    public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, AnnoyingVillagersbychentuMod.MODID);
    public static final RegistryObject<Biome> XXUWU = REGISTRY.register("xxuwu", () -> {
        return XxuwuBiome.createBiome();
    });
}
