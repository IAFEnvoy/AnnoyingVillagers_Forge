package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class FumodengjixianzhiProcedure {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            execute(event, event.player);
        }
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        if (entity == null) {
            return;
        }
        Enchantment enchantment = Enchantments.SHARPNESS;
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getOffhandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment, itemStack) >= 11 && (entity instanceof LivingEntity)) {
            Player _player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(Blocks.AIR);
            _setstack.setCount(1);
            _player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
            if (_player instanceof Player) {
                _player.getInventory().setChanged();
            }
        }
        Enchantment enchantment2 = Enchantments.SHARPNESS;
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getMainHandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment2, itemStack2) >= 11 && (entity instanceof LivingEntity)) {
            Player _player2 = (LivingEntity) entity;
            ItemStack _setstack2 = new ItemStack(Blocks.AIR);
            _setstack2.setCount(1);
            _player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
            if (_player2 instanceof Player) {
                _player2.getInventory().setChanged();
            }
        }
        Enchantment enchantment3 = Enchantments.ALL_DAMAGE_PROTECTION;
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack3 = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment3, itemStack3) >= 11) {
            if (entity instanceof Player _player3) {
                _player3.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
                _player3.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living) {
                _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
            }
        }
        Enchantment enchantment4 = Enchantments.ALL_DAMAGE_PROTECTION;
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack4 = _entGetArmor2.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment4, itemStack4) >= 11) {
            if (entity instanceof Player _player4) {
                _player4.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
                _player4.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living2) {
                _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
            }
        }
        Enchantment enchantment5 = Enchantments.ALL_DAMAGE_PROTECTION;
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack5 = _entGetArmor3.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment5, itemStack5) >= 11) {
            if (entity instanceof Player _player5) {
                _player5.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
                _player5.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living3) {
                _living3.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
            }
        }
        Enchantment enchantment6 = Enchantments.ALL_DAMAGE_PROTECTION;
        if (entity instanceof LivingEntity _entGetArmor4) {
            itemStack6 = _entGetArmor4.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack6 = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment6, itemStack6) >= 11) {
            if (entity instanceof Player _player6) {
                _player6.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                _player6.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living4) {
                _living4.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
            }
        }
    }
}
