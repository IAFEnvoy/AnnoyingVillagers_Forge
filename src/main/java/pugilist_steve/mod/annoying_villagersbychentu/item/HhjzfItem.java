package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class HhjzfItem extends AxeItem {
    public HhjzfItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HhjzfItem.1
            @Override
            public int getUses() {
                return 2658;
            }

            @Override
            public float getSpeed() {
                return 6.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 11.5f;
            }

            @Override
            public int getLevel() {
                return 8;
            }

            @Override
            public int getEnchantmentValue() {
                return 30;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
            }
        }, 1.0f, -3.0f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }
}
