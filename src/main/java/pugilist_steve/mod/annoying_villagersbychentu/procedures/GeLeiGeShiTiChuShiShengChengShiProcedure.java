package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;


public class GeLeiGeShiTiChuShiShengChengShiProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        ItemStack itemStack9;
        ItemStack itemStack10;
        ItemStack itemStack11;
        ItemStack itemStack12;
        ItemStack itemStack13;
        ItemStack itemStack14;
        ItemStack itemStack15;
        ItemStack itemStack16;
        ItemStack itemStack17;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.MENDING, 5);
        if (entity instanceof LivingEntity _entGetArmor4) {
            itemStack4 = _entGetArmor4.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        if (entity instanceof LivingEntity _entGetArmor5) {
            itemStack5 = _entGetArmor5.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        itemStack5.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _entGetArmor6) {
            itemStack6 = _entGetArmor6.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack6 = ItemStack.EMPTY;
        }
        itemStack6.enchant(Enchantments.MENDING, 5);
        if (entity instanceof LivingEntity _entGetArmor7) {
            itemStack7 = _entGetArmor7.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack7 = ItemStack.EMPTY;
        }
        itemStack7.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        if (entity instanceof LivingEntity _entGetArmor8) {
            itemStack8 = _entGetArmor8.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack8 = ItemStack.EMPTY;
        }
        itemStack8.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _entGetArmor9) {
            itemStack9 = _entGetArmor9.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack9 = ItemStack.EMPTY;
        }
        itemStack9.enchant(Enchantments.MENDING, 5);
        if (entity instanceof LivingEntity _entGetArmor10) {
            itemStack10 = _entGetArmor10.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack10 = ItemStack.EMPTY;
        }
        itemStack10.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        if (entity instanceof LivingEntity _entGetArmor11) {
            itemStack11 = _entGetArmor11.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack11 = ItemStack.EMPTY;
        }
        itemStack11.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _entGetArmor12) {
            itemStack12 = _entGetArmor12.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack12 = ItemStack.EMPTY;
        }
        itemStack12.enchant(Enchantments.MENDING, 5);
        if (entity instanceof LivingEntity _entGetArmor13) {
            itemStack13 = _entGetArmor13.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack13 = ItemStack.EMPTY;
        }
        itemStack13.enchant(Enchantments.FALL_PROTECTION, 5);
        if (entity instanceof LivingEntity _livEnt) {
            itemStack14 = _livEnt.getMainHandItem();
        } else {
            itemStack14 = ItemStack.EMPTY;
        }
        itemStack14.enchant(Enchantments.FIRE_ASPECT, 2);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack15 = _livEnt2.getMainHandItem();
        } else {
            itemStack15 = ItemStack.EMPTY;
        }
        itemStack15.enchant(Enchantments.KNOCKBACK, 2);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack16 = _livEnt3.getMainHandItem();
        } else {
            itemStack16 = ItemStack.EMPTY;
        }
        itemStack16.enchant(Enchantments.SHARPNESS, 5);
        if (entity instanceof LivingEntity _livEnt4) {
            itemStack17 = _livEnt4.getMainHandItem();
        } else {
            itemStack17 = ItemStack.EMPTY;
        }
        itemStack17.enchant(Enchantments.UNBREAKING, 3);
        if (world.players().size() >= 4) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a {\"text\":\"Greg joined the game\",\"color\":\"yellow\"}");
            }
        } else if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a {\"text\":\"Greg加入了游戏\",\"color\":\"yellow\"}");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/data merge entity @s {Tags:[\"OP\"]}");
        }
    }
}
