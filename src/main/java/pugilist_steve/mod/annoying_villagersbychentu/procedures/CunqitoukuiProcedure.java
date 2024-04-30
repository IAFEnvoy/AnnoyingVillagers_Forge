package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class CunqitoukuiProcedure {
    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent event) {
        execute(event, event.getEntity());
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.LAN_CUN_QIARMOR_HELMET.get()) {
            if (entity instanceof Player _player) {
                _player.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.LANCUNQITOUKUI.get()));
                _player.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living) {
                _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.LANCUNQITOUKUI.get()));
            }
        }
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (itemStack2.getItem() == AnnoyingVillagersbychentuModItems.ZI_CUN_QI_KUI_JIA_HELMET.get()) {
            if (entity instanceof Player _player2) {
                _player2.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.ZICUNQITOUKUI.get()));
                _player2.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living2) {
                _living2.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.ZICUNQITOUKUI.get()));
            }
        }
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        if (itemStack3.getItem() == AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_HELMET.get()) {
            if (entity instanceof Player _player3) {
                _player3.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.LVCUNQITOUKUI.get()));
                _player3.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living3) {
                _living3.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.LVCUNQITOUKUI.get()));
            }
        }
        if (entity instanceof LivingEntity _entGetArmor4) {
            itemStack4 = _entGetArmor4.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        if (itemStack4.getItem() == AnnoyingVillagersbychentuModItems.HONG_CUN_QIHELMET_HELMET.get()) {
            if (entity instanceof Player _player4) {
                _player4.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.HONGCUNQITOUKUI.get()));
                _player4.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living4) {
                _living4.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.HONGCUNQITOUKUI.get()));
            }
        }
    }
}
