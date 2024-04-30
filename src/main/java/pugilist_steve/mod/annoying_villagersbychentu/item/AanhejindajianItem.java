package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class AanhejindajianItem extends SwordItem {
    public AanhejindajianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.AanhejindajianItem.1
            @Override
            public int getUses() {
                return 2678;
            }

            @Override
            public float getSpeed() {
                return 8.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 10.5f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 30;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
            }
        }, 3, -2.6f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }
}
