package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class HhongbaoshijianItem extends SwordItem {
    public HhongbaoshijianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HhongbaoshijianItem.1
            @Override
            public int getUses() {
                return 1561;
            }

            @Override
            public float getSpeed() {
                return 8.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 8.0f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 20;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -1.4f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        return new ItemStack(this);
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }
}
