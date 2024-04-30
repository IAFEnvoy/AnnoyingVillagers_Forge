package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;


public class OnePunchManDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.explode(null, x, y + 2.0d, z, 4.0f, Explosion.BlockInteraction.DESTROY);
            }
        }
    }
}
