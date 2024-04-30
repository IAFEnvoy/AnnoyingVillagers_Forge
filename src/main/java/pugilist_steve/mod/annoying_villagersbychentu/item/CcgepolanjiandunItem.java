package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.CcgejiandunbuffProcedure;


public class CcgepolanjiandunItem extends SwordItem {
    public CcgepolanjiandunItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.CcgepolanjiandunItem.1
            @Override
            public int getUses() {
                return 1600;
            }

            @Override
            public float getSpeed() {
                return 8.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 7.9f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 18;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.DIAMOND));
            }
        }, 3, -1.8f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            CcgejiandunbuffProcedure.execute();
        }
    }
}
