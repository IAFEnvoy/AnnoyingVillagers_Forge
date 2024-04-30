package pugilist_steve.mod.annoying_villagersbychentu.enchantment;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;


public class ExperienceEnchantment extends Enchantment {
    public ExperienceEnchantment(EquipmentSlot... slots) {
        super(Rarity.RARE, EnchantmentCategory.BREAKABLE, slots);
    }

    @Override
    public int getMaxLevel() {
        return 71;
    }

    @Override
    public int getDamageProtection(int level, DamageSource source) {
        return level * 50;
    }

    @Override
    public boolean isTreasureOnly() {
        return true;
    }
}
