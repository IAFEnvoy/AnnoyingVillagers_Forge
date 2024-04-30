package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class GravecuirassXiongJiaShiJianMeiYouXiKeProcedure {
    public static void execute(Entity entity) {
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.VILLAGERHEAD.get()) {
            if (entity instanceof Player) {
                ((Player) entity).giveExperienceLevels(-2);
            }
            if (entity instanceof Player _player) {
                _player.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
                _player.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living) {
                _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
            }
            if (entity instanceof Player _player2) {
                _player2.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
                _player2.getInventory().setChanged();
                return;
            } else if (entity instanceof LivingEntity _living2) {
                _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
                return;
            } else {
                return;
            }
        }
        if (entity instanceof Player _player3) {
            _player3.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
            _player3.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living3) {
            _living3.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
        }
        if (entity instanceof Player _player4) {
            _player4.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
            _player4.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living4) {
            _living4.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
        }
        if (entity instanceof Player _player5) {
            _player5.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
            _player5.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living5) {
            _living5.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
        }
    }
}
