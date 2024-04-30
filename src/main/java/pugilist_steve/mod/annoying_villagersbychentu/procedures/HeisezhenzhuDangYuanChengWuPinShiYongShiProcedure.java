package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;


public class HeisezhenzhuDangYuanChengWuPinShiYongShiProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity != null && (entity instanceof Player _player)) {
            _player.getCooldowns().addCooldown(itemstack.getItem(), 20);
        }
    }
}
