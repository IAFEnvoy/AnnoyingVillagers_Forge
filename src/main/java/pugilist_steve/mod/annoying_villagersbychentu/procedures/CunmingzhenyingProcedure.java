package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class CunmingzhenyingProcedure {
    public static void execute(Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.VILLAGERHEAD.get()) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join villagers @s");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave @s");
            }
        } else {
            if (entity instanceof LivingEntity _entGetArmor2) {
                itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            if (itemStack2.getItem() == AnnoyingVillagersbychentuModItems.VILLAGERHEAD_2.get()) {
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join villagers @s");
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave @s");
                }
            }
        }
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        if (itemStack3.getItem() == Blocks.AIR.asItem()) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team leave @s[team=villagers]");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave @s");
            }
        }
    }
}
