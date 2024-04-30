package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class FulubuhuoqiDangYuanChengWuPinShiYongShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && (entity instanceof Player _player)) {
            ItemStack _stktoremove = new ItemStack(AnnoyingVillagersbychentuModItems.FULUBUHUOQI.get());
            _player.getInventory().clearOrCountMatchingItems(p -> {
                return _stktoremove.getItem() == p.getItem();
            }, 1, _player.inventoryMenu.getCraftSlots());
        }
    }
}
