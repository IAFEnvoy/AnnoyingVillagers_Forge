package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class JjingoujianItem extends SwordItem {
    public JjingoujianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.JjingoujianItem.1
            @Override
            public int getUses() {
                return 120;
            }

            @Override
            public float getSpeed() {
                return 8.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 3.5f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 16;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
            }
        }, 3, -2.5f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
