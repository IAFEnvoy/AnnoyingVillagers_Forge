package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;
import pugilist_steve.mod.annoying_villagersbychentu.enchantment.*;


public class AnnoyingVillagersbychentuModEnchantments {
    public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, AnnoyingVillagersbychentuMod.MODID);
    public static final RegistryObject<Enchantment> ENERGY = REGISTRY.register("energy", () -> {
        return new EnergyEnchantment();
    });
    public static final RegistryObject<Enchantment> HEAVY_ATTACK = REGISTRY.register("heavy_attack", () -> {
        return new HeavyAttackEnchantment();
    });
    public static final RegistryObject<Enchantment> ARROW_DEFLECTION = REGISTRY.register("arrow_deflection", () -> {
        return new ArrowDeflectionEnchantment();
    });
    public static final RegistryObject<Enchantment> QUICK_DRAW = REGISTRY.register("quick_draw", () -> {
        return new QuickDrawEnchantment();
    });
    public static final RegistryObject<Enchantment> POSSESSION = REGISTRY.register("possession", () -> {
        return new PossessionEnchantment();
    });
    public static final RegistryObject<Enchantment> HOLY_BLESSING = REGISTRY.register("holy_blessing", () -> {
        return new HolyBlessingEnchantment();
    });
    public static final RegistryObject<Enchantment> EXPERIENCE = REGISTRY.register("experience", () -> {
        return new ExperienceEnchantment();
    });
    public static final RegistryObject<Enchantment> LEARNING = REGISTRY.register("learning", () -> {
        return new LearningEnchantment();
    });
    public static final RegistryObject<Enchantment> UNKNOWN = REGISTRY.register("unknown", () -> {
        return new UNKNOWNEnchantment();
    });
    public static final RegistryObject<Enchantment> ERROR_785_A = REGISTRY.register("error_785_a", () -> {
        return new Error785AEnchantment();
    });
}
