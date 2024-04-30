package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.DdianranProcedure;


public class HhongzuanshijianItem extends SwordItem {
    public HhongzuanshijianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HhongzuanshijianItem.1
            @Override
            public int getUses() {
                return 1890;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 8.5f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 14;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.DIAMOND));
            }
        }, 3, -2.1f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        DdianranProcedure.execute(entity);
        return retval;
    }
}
