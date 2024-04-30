package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;


public class C1262x18eabd98 {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * 3.0d, entity.getLookAngle().y * 3.0d, entity.getLookAngle().z * 3.0d));
    }
}
