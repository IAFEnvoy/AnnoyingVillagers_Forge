package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class DijiyinfenshenShiTiChuShiShengChengShiProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.09d && (entity instanceof LivingEntity)) {
            Player player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_BAO_NENG_JIAN.get());
            _setstack.setCount(1);
            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (player instanceof Player) {
                Player _player = player;
                _player.getInventory().setChanged();
            }
        }
        if (Math.random() <= 0.09d && (entity instanceof LivingEntity)) {
            Player player2 = (LivingEntity) entity;
            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_JU_FU.get());
            _setstack2.setCount(1);
            player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
            if (player2 instanceof Player) {
                Player _player2 = player2;
                _player2.getInventory().setChanged();
            }
        }
        if (Math.random() <= 0.09d && (entity instanceof LivingEntity)) {
            Player player3 = (LivingEntity) entity;
            ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.ZZUANSHIJIANDAO.get());
            _setstack3.setCount(1);
            player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
            if (player3 instanceof Player) {
                Player _player3 = player3;
                _player3.getInventory().setChanged();
            }
        }
        if (Math.random() <= 0.09d && (entity instanceof LivingEntity)) {
            Player player4 = (LivingEntity) entity;
            ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CI_YIN_JIAN.get());
            _setstack4.setCount(1);
            player4.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
            if (player4 instanceof Player) {
                Player _player4 = player4;
                _player4.getInventory().setChanged();
            }
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("Herobrine已降临"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrinexintu");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrine");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join herobrinexintu @s");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join herobrine @s");
        }
    }
}
