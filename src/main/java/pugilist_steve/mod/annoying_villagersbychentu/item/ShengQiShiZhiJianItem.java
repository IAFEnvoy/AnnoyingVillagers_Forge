package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class ShengQiShiZhiJianItem extends SwordItem {
    public ShengQiShiZhiJianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.ShengQiShiZhiJianItem.1
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
                return 7.5f;
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
                return Ingredient.of(new ItemStack(Items.DIAMOND));
            }
        }, 3, -2.3f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
