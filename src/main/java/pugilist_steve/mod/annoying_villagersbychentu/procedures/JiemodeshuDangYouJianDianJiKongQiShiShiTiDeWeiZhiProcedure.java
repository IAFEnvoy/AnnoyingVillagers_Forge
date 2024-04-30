package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.items.ItemHandlerHelper;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class JiemodeshuDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.5d && (entity instanceof Player _player)) {
            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.KUILEIZHIYAN.get());
            _setstack.setCount(1);
            ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
        }
        if (Math.random() <= 0.2d && (entity instanceof Player _player2)) {
            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.HUOYANKUILEIZHIYAN.get());
            _setstack2.setCount(1);
            ItemHandlerHelper.giveItemToPlayer(_player2, _setstack2);
        }
        if (Math.random() <= 0.1d && (entity instanceof Player _player3)) {
            ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.HEIYAOSHIKUILEIZHIYAN.get());
            _setstack3.setCount(1);
            ItemHandlerHelper.giveItemToPlayer(_player3, _setstack3);
        }
        if (entity instanceof Player _player4) {
            _player4.getCooldowns().addCooldown(AnnoyingVillagersbychentuModItems.JIEMODESHU.get(), 200);
        }
    }
}
