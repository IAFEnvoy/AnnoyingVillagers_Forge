package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class ArmorThePlagueKingXiongJiaShiJianMeiYouXiKeProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
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
        } else if (entity instanceof LivingEntity _living2) {
            _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
        }
        if (entity instanceof Player _player3) {
            _player3.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.LUEDUOZHEWANGTOUKUI.get()));
            _player3.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living3) {
            _living3.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.LUEDUOZHEWANGTOUKUI.get()));
        }
    }
}
