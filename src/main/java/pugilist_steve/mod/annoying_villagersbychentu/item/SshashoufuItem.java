package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class SshashoufuItem extends PickaxeItem {
    public SshashoufuItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.SshashoufuItem.1
            @Override
            public int getUses() {
                return 1895;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 10.0f;
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
                return Ingredient.of(new ItemStack(Items.IRON_INGOT));
            }
        }, 1, -2.6f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
    }
}
