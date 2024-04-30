package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class HeiYaoShiZhuItem extends SwordItem {
    public HeiYaoShiZhuItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HeiYaoShiZhuItem.1
            @Override
            public int getUses() {
                return 0;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 18.0f;
            }

            @Override
            public int getLevel() {
                return 4;
            }

            @Override
            public int getEnchantmentValue() {
                return 0;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -1.0f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
