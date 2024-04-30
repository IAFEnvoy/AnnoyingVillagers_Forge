package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class HerobrineEyesDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    public static void execute(Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity == null) {
            return;
        }
        if (entity instanceof Player _player) {
            _player.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.HEROBRINE_EYES.get()));
            _player.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living) {
            _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.HEROBRINE_EYES.get()));
        }
        if (entity instanceof LivingEntity) {
            Player _player2 = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(Blocks.AIR);
            _setstack.setCount(1);
            _player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (_player2 instanceof Player) {
                _player2.getInventory().setChanged();
            }
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getOffhandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.HEROBRINE_EYES.get() && (entity instanceof LivingEntity)) {
            Player _player3 = (LivingEntity) entity;
            ItemStack _setstack2 = new ItemStack(Blocks.AIR);
            _setstack2.setCount(1);
            _player3.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
            if (_player3 instanceof Player) {
                _player3.getInventory().setChanged();
            }
        }
        if (entity.isShiftKeyDown()) {
            if (entity instanceof Player _player4) {
                _player4.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.HEROBRINE_EYES.get()));
                _player4.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living2) {
                _living2.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.HEROBRINE_EYES.get()));
            }
            if (entity instanceof LivingEntity) {
                Player _player5 = (LivingEntity) entity;
                ItemStack _setstack3 = new ItemStack(Blocks.AIR);
                _setstack3.setCount(1);
                _player5.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                if (_player5 instanceof Player) {
                    _player5.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _entGetArmor) {
                itemStack2 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            itemStack2.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 10);
        }
    }
}
