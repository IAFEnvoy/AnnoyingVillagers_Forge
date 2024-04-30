package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;


public class DiamondSItem extends SwordItem {
    public DiamondSItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.DiamondSItem.1
            @Override
            public int getUses() {
                return 100;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 5.0f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 2;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -3.0f, new Properties().tab(null));
    }
}
