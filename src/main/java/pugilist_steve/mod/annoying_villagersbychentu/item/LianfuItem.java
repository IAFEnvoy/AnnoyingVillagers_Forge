package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class LianfuItem extends SwordItem {
    public LianfuItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.LianfuItem.1
            @Override
            public int getUses() {
                return 1561;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 14.0f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 2;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -2.3f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }
}
