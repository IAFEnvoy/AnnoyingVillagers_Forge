package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;


public class NailiZaiXiaoGuoChiXuShiMeiKeFaShengProcedure {
    public static void execute(Entity entity) {
        if (entity != null && (entity instanceof Player _player)) {
            _player.getFoodData().setFoodLevel(20);
        }
    }
}
