package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class HhejinjufuItem extends AxeItem {
    public HhejinjufuItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HhejinjufuItem.1
            @Override
            public int getUses() {
                return 2654;
            }

            @Override
            public float getSpeed() {
                return 4.5f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 16.0f;
            }

            @Override
            public int getLevel() {
                return 6;
            }

            @Override
            public int getEnchantmentValue() {
                return 39;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
            }
        }, 1.0f, -2.8f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
