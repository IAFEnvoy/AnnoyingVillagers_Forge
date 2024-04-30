package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class LuCunQiDangShiTiGengXinKeShiProcedure {
    public static void execute(Entity entity) {
        float f;
        float f2;
        ItemStack itemStack;
        float f3;
        ItemStack itemStack2;
        ItemStack itemStack3;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            f = _livEnt.getHealth();
        } else {
            f = -1.0f;
        }
        if (f > 40.0f) {
            if (entity instanceof LivingEntity _livEnt2) {
                f3 = _livEnt2.getHealth();
            } else {
                f3 = -1.0f;
            }
            if (f3 < 100.0f) {
                if (entity instanceof Player _player) {
                    _player.getInventory().armor.set(2, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_CHESTPLATE.get()));
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living) {
                    _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_CHESTPLATE.get()));
                }
                if (entity instanceof Player _player2) {
                    _player2.getInventory().armor.set(0, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_BOOTS.get()));
                    _player2.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living2) {
                    _living2.setItemSlot(EquipmentSlot.FEET, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_BOOTS.get()));
                }
                if (entity instanceof LivingEntity _entGetArmor) {
                    itemStack2 = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
                } else {
                    itemStack2 = ItemStack.EMPTY;
                }
                itemStack2.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
                if (entity instanceof LivingEntity _entGetArmor2) {
                    itemStack3 = _entGetArmor2.getItemBySlot(EquipmentSlot.FEET);
                } else {
                    itemStack3 = ItemStack.EMPTY;
                }
                itemStack3.enchant(Enchantments.FIRE_PROTECTION, 3);
                return;
            }
        }
        if (entity instanceof LivingEntity _livEnt3) {
            f2 = _livEnt3.getHealth();
        } else {
            f2 = -1.0f;
        }
        if (f2 <= 40.0f) {
            if (entity instanceof Player _player3) {
                _player3.getInventory().armor.set(1, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_LEGGINGS.get()));
                _player3.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living3) {
                _living3.setItemSlot(EquipmentSlot.LEGS, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_LEGGINGS.get()));
            }
            if (entity instanceof LivingEntity _entGetArmor3) {
                itemStack = _entGetArmor3.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack = ItemStack.EMPTY;
            }
            itemStack.enchant(Enchantments.FIRE_PROTECTION, 3);
        }
    }
}
