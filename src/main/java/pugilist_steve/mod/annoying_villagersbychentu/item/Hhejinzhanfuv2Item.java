package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.Hhjzfv2Procedure;


public class Hhejinzhanfuv2Item extends AxeItem {
    public Hhejinzhanfuv2Item() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.Hhejinzhanfuv2Item.1
            @Override
            public int getUses() {
                return 2858;
            }

            @Override
            public float getSpeed() {
                return 8.5f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 11.0f;
            }

            @Override
            public int getLevel() {
                return 8;
            }

            @Override
            public int getEnchantmentValue() {
                return 30;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.NETHERITE_INGOT));
            }
        }, 1.0f, -3.2f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            Hhjzfv2Procedure.execute(entity);
        }
    }
}
