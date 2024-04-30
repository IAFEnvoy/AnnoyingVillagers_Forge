package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class HongBaoShiFuJuDaDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    public static void execute(Entity entity) {
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.HONG_BAO_SHI_FU_JU_DA.get() && (entity instanceof LivingEntity)) {
            Player player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.HONG_BAO_SHI_FU_CHANG_BING.get());
            _setstack.setCount(1);
            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (player instanceof Player) {
                Player _player = player;
                _player.getInventory().setChanged();
            }
        }
    }
}
