package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class TtiejiItem extends AxeItem {
    public TtiejiItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.TtiejiItem.1
            @Override
            public int getUses() {
                return 350;
            }

            @Override
            public float getSpeed() {
                return 5.5f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 6.0f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 10;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.IRON_INGOT));
            }
        }, 1.0f, -2.6f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
