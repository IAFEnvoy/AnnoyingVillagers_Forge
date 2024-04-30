package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.items.ItemHandlerHelper;


public class TongjiDangXiaoGuoJieShuShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && entity.isAlive()) {
            if (entity instanceof ServerPlayer _player) {
                Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("annoying_villagersbychentu:fankangjunxianfeng"));
                AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
                if (!_ap.isDone()) {
                    for (String str : _ap.getRemainingCriteria()) {
                        _player.getAdvancements().award(_adv, str);
                    }
                }
            }
            if (entity instanceof Player _player2) {
                ItemStack _setstack = new ItemStack(Items.DIAMOND);
                _setstack.setCount(1);
                ItemHandlerHelper.giveItemToPlayer(_player2, _setstack);
            }
            if (entity instanceof Player _player3) {
                ItemStack _setstack2 = new ItemStack(Items.ENDER_PEARL);
                _setstack2.setCount(1);
                ItemHandlerHelper.giveItemToPlayer(_player3, _setstack2);
            }
            if (entity instanceof Player _player4) {
                ItemStack _setstack3 = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
                _setstack3.setCount(1);
                ItemHandlerHelper.giveItemToPlayer(_player4, _setstack3);
            }
        }
    }
}
