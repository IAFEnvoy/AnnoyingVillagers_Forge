package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;


public class ZuiPuTongCunZhenDangShiTiGengXinKeShiProcedure {
    public static void execute(Entity entity) {
        float f;
        if (entity != null && Math.random() <= 0.3d) {
            if (entity instanceof LivingEntity _livEnt) {
                f = _livEnt.getHealth();
            } else {
                f = -1.0f;
            }
            if (f <= 8.0f) {
                for (int index0 = 0; index0 < 1; index0++) {
                    if (Math.random() <= 0.3d) {
                        entity.setCustomName(new TextComponent("§e村侦队长：“所有敌人一定会被消灭”"));
                    } else if (Math.random() >= 0.7d) {
                        entity.setCustomName(new TextComponent("§e村侦队长：“我一定要报告这件事“”"));
                    }
                }
            }
        }
    }
}
