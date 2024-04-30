package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class ShenMiDeJianItem extends SwordItem {
    public ShenMiDeJianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.ShenMiDeJianItem.1
            @Override
            public int getUses() {
                return 1980;
            }

            @Override
            public float getSpeed() {
                return 8.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 10.0f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 25;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -2.5f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemstack) {
        return true;
    }
}
