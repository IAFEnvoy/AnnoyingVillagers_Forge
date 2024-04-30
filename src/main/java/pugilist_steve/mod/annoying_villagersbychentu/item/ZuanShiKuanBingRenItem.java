package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ZuanShiKuanBingRenDangGongJuChuXianZaiShouZhongShiProcedure;


public class ZuanShiKuanBingRenItem extends SwordItem {
    public ZuanShiKuanBingRenItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.ZuanShiKuanBingRenItem.1
            @Override
            public int getUses() {
                return 1850;
            }

            @Override
            public float getSpeed() {
                return 8.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 7.5f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 25;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -2.3f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            ZuanShiKuanBingRenDangGongJuChuXianZaiShouZhongShiProcedure.execute(entity);
        }
    }
}
