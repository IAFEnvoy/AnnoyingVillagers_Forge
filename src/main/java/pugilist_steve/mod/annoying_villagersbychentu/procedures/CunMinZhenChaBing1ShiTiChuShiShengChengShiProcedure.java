package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.Random;


public class CunMinZhenChaBing1ShiTiChuShiShengChengShiProcedure {
    public static void execute(Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.1d) {
            if (entity instanceof Player _player) {
                _player.getInventory().armor.set(2, new ItemStack(Items.DIAMOND_CHESTPLATE));
                _player.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living) {
                _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.DIAMOND_CHESTPLATE));
            }
            if (entity instanceof Player _player2) {
                _player2.getInventory().armor.set(1, new ItemStack(Items.DIAMOND_LEGGINGS));
                _player2.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living2) {
                _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.DIAMOND_LEGGINGS));
            }
            if (entity instanceof Player _player3) {
                _player3.getInventory().armor.set(0, new ItemStack(Items.DIAMOND_BOOTS));
                _player3.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living3) {
                _living3.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.DIAMOND_BOOTS));
            }
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, Mth.nextInt(new Random(), 1, 4));
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.ALL_DAMAGE_PROTECTION, Mth.nextInt(new Random(), 1, 4));
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.ALL_DAMAGE_PROTECTION, Mth.nextInt(new Random(), 1, 4));
        if (entity instanceof LivingEntity _entGetArmor4) {
            itemStack4 = _entGetArmor4.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.ALL_DAMAGE_PROTECTION, Mth.nextInt(new Random(), 1, 4));
        if (entity instanceof LivingEntity _livEnt) {
            itemStack5 = _livEnt.getMainHandItem();
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        itemStack5.enchant(Enchantments.SMITE, 1);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack6 = _livEnt2.getMainHandItem();
        } else {
            itemStack6 = ItemStack.EMPTY;
        }
        itemStack6.enchant(Enchantments.UNBREAKING, 1);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack7 = _livEnt3.getOffhandItem();
        } else {
            itemStack7 = ItemStack.EMPTY;
        }
        itemStack7.enchant(Enchantments.SMITE, 1);
        if (entity instanceof LivingEntity _livEnt4) {
            itemStack8 = _livEnt4.getOffhandItem();
        } else {
            itemStack8 = ItemStack.EMPTY;
        }
        itemStack8.enchant(Enchantments.UNBREAKING, 1);
    }
}
