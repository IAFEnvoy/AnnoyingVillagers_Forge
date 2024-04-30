package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Random;


public class BaozhabishouDangShiTiHuiDongWuPinShiProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity == null) {
            return;
        }
        if (entity instanceof Player _playerHasItem) {
            if (_playerHasItem.getInventory().contains(new ItemStack(Blocks.TNT))) {
                itemstack.setHoverName(new TextComponent("爆炸匕首"));
                return;
            }
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.BAOZHABISHOU.get()) {
            if (entity instanceof LivingEntity) {
                Player player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.BISHOU.get());
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
            if (itemstack.getDamageValue() >= 1) {
                if (entity instanceof LivingEntity _livEnt2) {
                    itemStack2 = _livEnt2.getMainHandItem();
                } else {
                    itemStack2 = ItemStack.EMPTY;
                }
                ItemStack _ist = itemStack2;
                if (_ist.hurt(10, new Random(), null)) {
                    _ist.shrink(1);
                    _ist.setDamageValue(0);
                }
            }
        }
    }
}
