package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;


public class Shiti303fenshenShiTiChuShiShengChengShiProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        entity.hurt(DamageSource.MAGIC, 1.0f);
    }
}
