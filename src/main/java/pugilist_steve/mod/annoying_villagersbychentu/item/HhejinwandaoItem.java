package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class HhejinwandaoItem extends SwordItem {
    public HhejinwandaoItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HhejinwandaoItem.1
            @Override
            public int getUses() {
                return 1700;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 6.5f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 30;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
            }
        }, 3, -1.6f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }
}
