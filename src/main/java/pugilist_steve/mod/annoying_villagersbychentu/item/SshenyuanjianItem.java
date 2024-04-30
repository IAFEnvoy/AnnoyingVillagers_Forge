package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.SshenyuanliliangProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.XxuhangProcedure;

import java.util.List;


public class SshenyuanjianItem extends SwordItem {
    public SshenyuanjianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.SshenyuanjianItem.1
            @Override
            public int getUses() {
                return 0;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 14.0f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 50;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -1.6f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("调试物品"));
    }

    @Override
    public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        boolean retval = super.onEntitySwing(itemstack, entity);
        XxuhangProcedure.execute(entity, itemstack);
        return retval;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            SshenyuanliliangProcedure.execute(entity);
        }
    }
}
