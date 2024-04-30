package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class KuijiaxiaoguoDangXiaoGuoJieShuShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
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
        Enchantment enchantment = Enchantments.VANISHING_CURSE;
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment, itemStack) != 0) {
            if (entity instanceof LivingEntity _entGetArmor2) {
                itemStack8 = _entGetArmor2.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack8 = ItemStack.EMPTY;
            }
            if (itemStack8.getItem() == AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_HELMET.get()) {
                if (entity instanceof Player _player) {
                    _player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living) {
                    _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                }
            }
        }
        Enchantment enchantment2 = Enchantments.VANISHING_CURSE;
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack2 = _entGetArmor3.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment2, itemStack2) != 0) {
            if (entity instanceof LivingEntity _entGetArmor4) {
                itemStack7 = _entGetArmor4.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack7 = ItemStack.EMPTY;
            }
            if (itemStack7.getItem() == AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_CHESTPLATE.get()) {
                if (entity instanceof Player _player2) {
                    _player2.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
                    _player2.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living2) {
                    _living2.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
                }
            }
        }
        Enchantment enchantment3 = Enchantments.VANISHING_CURSE;
        if (entity instanceof LivingEntity _entGetArmor5) {
            itemStack3 = _entGetArmor5.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment3, itemStack3) != 0) {
            if (entity instanceof LivingEntity _entGetArmor6) {
                itemStack6 = _entGetArmor6.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack6 = ItemStack.EMPTY;
            }
            if (itemStack6.getItem() == AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_LEGGINGS.get()) {
                if (entity instanceof Player _player3) {
                    _player3.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
                    _player3.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living3) {
                    _living3.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
                }
            }
        }
        Enchantment enchantment4 = Enchantments.VANISHING_CURSE;
        if (entity instanceof LivingEntity _entGetArmor7) {
            itemStack4 = _entGetArmor7.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment4, itemStack4) != 0) {
            if (entity instanceof LivingEntity _entGetArmor8) {
                itemStack5 = _entGetArmor8.getItemBySlot(EquipmentSlot.FEET);
            } else {
                itemStack5 = ItemStack.EMPTY;
            }
            if (itemStack5.getItem() == AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_BOOTS.get()) {
                if (entity instanceof Player _player4) {
                    _player4.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
                    _player4.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living4) {
                    _living4.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
                }
            }
        }
        world.levelEvent(2001, new BlockPos(x, y + 1.0d, z), Block.getId(Blocks.DIAMOND_BLOCK.defaultBlockState()));
        world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.DIAMOND_BLOCK.defaultBlockState()));
    }
}
