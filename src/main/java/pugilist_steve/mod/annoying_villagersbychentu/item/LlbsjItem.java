package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class LlbsjItem extends SwordItem {
    public LlbsjItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.LlbsjItem.1
            @Override
            public int getUses() {
                return 1680;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 5.4f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 18;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.EMERALD));
            }
        }, 3, -1.5f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
