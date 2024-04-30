package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;


public class YuganDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * 0.1d, entity.getLookAngle().y * 0.1d, entity.getLookAngle().z * 0.1d));
    }
}
