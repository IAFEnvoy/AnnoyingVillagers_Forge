package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class JoinPlayerItemDangYouJianDianJiKongQiShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add player");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join player @s");
        }
        if (entity instanceof Player _player) {
            if (!_player.level.isClientSide()) {
                _player.displayClientMessage(new TextComponent("已加入玩家阵营"), false);
            }
        }
        if (entity instanceof Player _player2) {
            ItemStack _stktoremove = new ItemStack(AnnoyingVillagersbychentuModItems.JOIN_PLAYER_ITEM.get());
            _player2.getInventory().clearOrCountMatchingItems(p -> {
                return _stktoremove.getItem() == p.getItem();
            }, 1, _player2.inventoryMenu.getCraftSlots());
        }
    }
}
