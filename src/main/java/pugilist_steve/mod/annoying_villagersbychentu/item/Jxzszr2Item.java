package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.JxZhanshenzhirenDangShiTiBeiGongJuJiZhongShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.Jxzszr2DangGongJuChuXianZaiShouZhongShiProcedure;


public class Jxzszr2Item extends SwordItem {
    public Jxzszr2Item() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.Jxzszr2Item.1
            @Override
            public int getUses() {
                return 99999;
            }

            @Override
            public float getSpeed() {
                return 50.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 68.0f;
            }

            @Override
            public int getLevel() {
                return 50;
            }

            @Override
            public int getEnchantmentValue() {
                return 100;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()), new ItemStack(Items.DIAMOND));
            }
        }, 3, -2.2f, new Properties().tab(null).fireResistant());
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        JxZhanshenzhirenDangShiTiBeiGongJuJiZhongShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
        return retval;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        return new ItemStack(this);
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            Jxzszr2DangGongJuChuXianZaiShouZhongShiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
        }
    }
}
