package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.items.ItemHandlerHelper;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class SherenjianbingDangYouJianDianJiKongQiShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof Player _player) {
            ItemStack _stktoremove = new ItemStack(AnnoyingVillagersbychentuModItems.SHERENJIANBING.get());
            _player.getInventory().clearOrCountMatchingItems(p -> {
                return _stktoremove.getItem() == p.getItem();
            }, 1, _player.inventoryMenu.getCraftSlots());
        }
        if (entity instanceof Player _player2) {
            ItemStack _setstack = new ItemStack(Blocks.OBSIDIAN);
            _setstack.setCount(3);
            ItemHandlerHelper.giveItemToPlayer(_player2, _setstack);
        }
        if (entity instanceof Player _player3) {
            ItemStack _setstack2 = new ItemStack(Blocks.CRYING_OBSIDIAN);
            _setstack2.setCount(1);
            ItemHandlerHelper.giveItemToPlayer(_player3, _setstack2);
        }
    }
}
