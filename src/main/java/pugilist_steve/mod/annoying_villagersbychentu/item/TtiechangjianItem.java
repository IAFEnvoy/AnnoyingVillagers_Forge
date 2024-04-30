package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class TtiechangjianItem extends SwordItem {
    public TtiechangjianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.TtiechangjianItem.1
            @Override
            public int getUses() {
                return 500;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 3.4f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 6;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.IRON_INGOT));
            }
        }, 3, -1.5f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
