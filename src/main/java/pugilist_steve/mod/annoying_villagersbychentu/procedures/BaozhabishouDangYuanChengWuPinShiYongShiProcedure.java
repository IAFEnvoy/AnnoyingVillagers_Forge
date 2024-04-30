package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemCooldowns;
import net.minecraft.world.item.ItemStack;


public class BaozhabishouDangYuanChengWuPinShiYongShiProcedure {
    public static void execute(Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.setHoverName(new TextComponent("§l匕首"));
        if (entity instanceof Player _player) {
            ItemCooldowns getCooldowns = _player.getCooldowns();
            if (entity instanceof LivingEntity _livEnt2) {
                itemStack2 = _livEnt2.getMainHandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            getCooldowns.addCooldown(itemStack2.getItem(), 25);
        }
    }
}
