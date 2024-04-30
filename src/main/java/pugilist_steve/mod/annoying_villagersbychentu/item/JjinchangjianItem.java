package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class JjinchangjianItem extends SwordItem {
    public JjinchangjianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.JjinchangjianItem.1
            @Override
            public int getUses() {
                return 150;
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
                return 20;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.GOLD_INGOT));
            }
        }, 3, -1.5f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
