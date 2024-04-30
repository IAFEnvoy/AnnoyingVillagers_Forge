package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;

import java.util.Random;


public class DanShouZhanShenZhiRenDangGongJuChuXianZaiShouZhongShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && (entity instanceof Player _player)) {
            _player.causeFoodExhaustion((float) Mth.nextDouble(new Random(), 0.5d, 1.0d));
        }
    }
}
