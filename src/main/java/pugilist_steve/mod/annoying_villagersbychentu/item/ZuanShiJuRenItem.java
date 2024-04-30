package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class ZuanShiJuRenItem extends SwordItem {
    public ZuanShiJuRenItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.ZuanShiJuRenItem.1
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
                return 10.5f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 10;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -3.0f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
