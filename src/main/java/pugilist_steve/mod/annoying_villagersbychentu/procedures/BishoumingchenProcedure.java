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
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber

public class BishoumingchenProcedure {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getPlayer().getUsedItemHand()) {
            return;
        }
        execute(event, event.getPlayer());
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.BAOZHABISHOU.get()) {
            if (entity instanceof Player _playerHasItem) {
                if (_playerHasItem.getInventory().contains(new ItemStack(Blocks.TNT))) {
                    if (entity instanceof LivingEntity _livEnt2) {
                        itemStack5 = _livEnt2.getMainHandItem();
                    } else {
                        itemStack5 = ItemStack.EMPTY;
                    }
                    itemStack5.setHoverName(new TextComponent("爆炸匕首"));
                    return;
                }
            }
            if (entity instanceof LivingEntity _livEnt3) {
                itemStack2 = _livEnt3.getMainHandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            if (itemStack2.getItem() == AnnoyingVillagersbychentuModItems.BAOZHABISHOU.get()) {
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
                if (entity instanceof LivingEntity _livEnt4) {
                    itemStack3 = _livEnt4.getMainHandItem();
                } else {
                    itemStack3 = ItemStack.EMPTY;
                }
                if (itemStack3.getDamageValue() >= 1) {
                    if (entity instanceof LivingEntity _livEnt5) {
                        itemStack4 = _livEnt5.getMainHandItem();
                    } else {
                        itemStack4 = ItemStack.EMPTY;
                    }
                    ItemStack _ist = itemStack4;
                    if (_ist.hurt(10, new Random(), null)) {
                        _ist.shrink(1);
                        _ist.setDamageValue(0);
                    }
                }
            }
        }
    }
}
