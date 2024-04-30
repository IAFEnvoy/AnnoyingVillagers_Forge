package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;


public class LlvbaoshishuangkanfuItem extends SwordItem {
    public LlvbaoshishuangkanfuItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.LlvbaoshishuangkanfuItem.1
            @Override
            public int getUses() {
                return 1980;
            }

            @Override
            public float getSpeed() {
                return 7.5f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 10.5f;
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
        }, 3, -2.6f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
