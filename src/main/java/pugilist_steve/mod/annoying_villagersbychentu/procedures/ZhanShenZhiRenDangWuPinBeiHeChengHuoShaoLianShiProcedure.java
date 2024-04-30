package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEnchantments;


public class ZhanShenZhiRenDangWuPinBeiHeChengHuoShaoLianShiProcedure {
    public static void execute(ItemStack itemstack) {
        itemstack.enchant(Enchantments.SHARPNESS, 10);
        itemstack.enchant(Enchantments.SMITE, 8);
        itemstack.enchant(Enchantments.KNOCKBACK, 9);
        itemstack.enchant(Enchantments.UNBREAKING, 7);
        itemstack.enchant(Enchantments.MENDING, 5);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.ENERGY.get(), 4);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.HEAVY_ATTACK.get(), 5);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.ARROW_DEFLECTION.get(), 7);
        itemstack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 10);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.QUICK_DRAW.get(), 10);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.POSSESSION.get(), 10);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.HOLY_BLESSING.get(), 10);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.EXPERIENCE.get(), 3230);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.LEARNING.get(), 547);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.UNKNOWN.get(), 0);
        itemstack.enchant(AnnoyingVillagersbychentuModEnchantments.ERROR_785_A.get(), 0);
    }
}
