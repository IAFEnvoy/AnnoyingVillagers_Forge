package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class HongZhuangJiaGuiLeiShiTiChuShiShengChengShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof Player _player) {
            _player.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.HONG_CUN_QIHELMET_HELMET.get()));
            _player.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living) {
            _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.HONG_CUN_QIHELMET_HELMET.get()));
        }
    }
}
