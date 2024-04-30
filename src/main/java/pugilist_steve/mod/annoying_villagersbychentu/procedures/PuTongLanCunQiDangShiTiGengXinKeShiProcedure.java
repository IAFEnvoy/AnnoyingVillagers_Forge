package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;


public class PuTongLanCunQiDangShiTiGengXinKeShiProcedure {
    public static void execute(Entity entity) {
        float f;
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            f = _livEnt.getHealth();
        } else {
            f = -1.0f;
        }
        if (f <= 73.0f) {
            if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity _entGetArmor) {
                    itemStack4 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    itemStack4 = ItemStack.EMPTY;
                }
                itemStack4.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            }
            if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity _entGetArmor2) {
                    itemStack3 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
                } else {
                    itemStack3 = ItemStack.EMPTY;
                }
                itemStack3.enchant(Enchantments.UNBREAKING, 1);
            }
            if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity _entGetArmor3) {
                    itemStack2 = _entGetArmor3.getItemBySlot(EquipmentSlot.LEGS);
                } else {
                    itemStack2 = ItemStack.EMPTY;
                }
                itemStack2.enchant(Enchantments.UNBREAKING, 2);
            }
            if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity _entGetArmor4) {
                    itemStack = _entGetArmor4.getItemBySlot(EquipmentSlot.FEET);
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                itemStack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            }
        }
    }
}
