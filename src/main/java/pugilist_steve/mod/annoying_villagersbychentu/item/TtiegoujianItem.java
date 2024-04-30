package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class TtiegoujianItem extends SwordItem {
    public TtiegoujianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.TtiegoujianItem.1
            @Override
            public int getUses() {
                return 450;
            }

            @Override
            public float getSpeed() {
                return 8.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 4.0f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 8;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.IRON_INGOT));
            }
        }, 3, -1.5f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
