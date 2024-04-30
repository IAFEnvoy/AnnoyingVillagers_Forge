package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;


public class HEITIEJIANItem extends SwordItem {
    public HEITIEJIANItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HEITIEJIANItem.1
            @Override
            public int getUses() {
                return 1573;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 6.8f;
            }

            @Override
            public int getLevel() {
                return 4;
            }

            @Override
            public int getEnchantmentValue() {
                return 12;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(Blocks.IRON_BLOCK), new ItemStack(Blocks.SKELETON_SKULL));
            }
        }, 3, -1.2f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
