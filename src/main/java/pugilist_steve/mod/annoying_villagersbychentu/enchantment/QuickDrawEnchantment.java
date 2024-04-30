package pugilist_steve.mod.annoying_villagersbychentu.enchantment;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;


public class QuickDrawEnchantment extends Enchantment {
    public QuickDrawEnchantment(EquipmentSlot... slots) {
        super(Rarity.RARE, EnchantmentCategory.WEAPON, slots);
    }

    @Override
    public int getMaxLevel() {
        return 70;
    }

    @Override
    public int getDamageProtection(int level, DamageSource source) {
        return level * 30;
    }

    @Override
    public boolean isTreasureOnly() {
        return true;
    }
}
