package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class CunMinZhenChaBing1DangShiTiGengXinKeShiProcedure {
    public static void execute(Entity entity) {
        float f;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            f = _livEnt.getHealth();
        } else {
            f = -1.0f;
        }
        if (f <= 15.0f) {
            if (entity instanceof LivingEntity) {
                Player _player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(Items.GOLDEN_APPLE);
                _setstack.setCount(1);
                _player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                if (_player instanceof Player) {
                    _player.getInventory().setChanged();
                }
            }
            if (Math.random() <= 0.5d) {
                if (entity instanceof Player _player2) {
                    _player2.getInventory().armor.set(2, new ItemStack(AnnoyingVillagersbychentuModItems.SUNARMOUR_CHESTPLATE.get()));
                    _player2.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living) {
                    _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.SUNARMOUR_CHESTPLATE.get()));
                }
            }
            if (Math.random() <= 0.4d) {
                if (entity instanceof Player _player3) {
                    _player3.getInventory().armor.set(1, new ItemStack(AnnoyingVillagersbychentuModItems.SUNARMOUR_LEGGINGS.get()));
                    _player3.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living2) {
                    _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(AnnoyingVillagersbychentuModItems.SUNARMOUR_LEGGINGS.get()));
                }
            }
            if (Math.random() <= 0.5d) {
                if (entity instanceof Player _player4) {
                    _player4.getInventory().armor.set(0, new ItemStack(Items.DIAMOND_BOOTS));
                    _player4.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living3) {
                    _living3.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.DIAMOND_BOOTS));
                }
            }
        }
    }
}
