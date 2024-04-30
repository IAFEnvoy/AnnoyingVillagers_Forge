package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class HheianzhirenItem extends SwordItem {
    public HheianzhirenItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HheianzhirenItem.1
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
                return 15.5f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 28;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -1.7f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
