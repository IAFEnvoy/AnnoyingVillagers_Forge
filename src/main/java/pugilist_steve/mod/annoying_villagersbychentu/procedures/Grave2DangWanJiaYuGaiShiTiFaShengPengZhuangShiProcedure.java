package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class Grave2DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && (entity instanceof LivingEntity)) {
            Player player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.SHENG_QI_SHI_ZHI_JIAN.get());
            _setstack.setCount(1);
            player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
            if (player instanceof Player) {
                Player _player = player;
                _player.getInventory().setChanged();
            }
        }
    }
}
