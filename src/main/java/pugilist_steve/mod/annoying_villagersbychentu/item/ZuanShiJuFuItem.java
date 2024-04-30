package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class ZuanShiJuFuItem extends AxeItem {
    public ZuanShiJuFuItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.ZuanShiJuFuItem.1
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
                return 10.5f;
            }

            @Override
            public int getLevel() {
                return 6;
            }

            @Override
            public int getEnchantmentValue() {
                return 10;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 1.0f, -2.8f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
