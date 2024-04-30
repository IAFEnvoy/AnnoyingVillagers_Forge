package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class PuTongLanCunQiShiTiChuShiShengChengShiProcedure {
    public static void execute(Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.2d) {
            if (entity instanceof LivingEntity _livEnt) {
                itemStack4 = _livEnt.getMainHandItem();
            } else {
                itemStack4 = ItemStack.EMPTY;
            }
            itemStack4.enchant(Enchantments.SHARPNESS, 5);
            if (entity instanceof LivingEntity) {
                Player player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_BI_SHOU.get());
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
        }
        if (Math.random() <= 0.2d) {
            if (entity instanceof LivingEntity _livEnt2) {
                itemStack3 = _livEnt2.getMainHandItem();
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            itemStack3.enchant(Enchantments.SHARPNESS, 5);
            if (entity instanceof LivingEntity) {
                Player player2 = (LivingEntity) entity;
                ItemStack _setstack2 = new ItemStack(Items.DIAMOND_SWORD);
                _setstack2.setCount(1);
                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().setChanged();
                }
            }
        }
        if (Math.random() <= 0.2d) {
            if (entity instanceof LivingEntity _livEnt3) {
                itemStack = _livEnt3.getMainHandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            itemStack.enchant(Enchantments.POWER_ARROWS, 5);
            if (entity instanceof LivingEntity _livEnt4) {
                itemStack2 = _livEnt4.getMainHandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            itemStack2.enchant(Enchantments.PUNCH_ARROWS, 5);
            if (entity instanceof LivingEntity) {
                Player player3 = (LivingEntity) entity;
                ItemStack _setstack3 = new ItemStack(Items.BOW);
                _setstack3.setCount(1);
                player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                if (player3 instanceof Player) {
                    Player _player3 = player3;
                    _player3.getInventory().setChanged();
                }
            }
        }
    }
}
