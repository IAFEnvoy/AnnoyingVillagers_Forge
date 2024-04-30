package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

import java.util.Random;


public class OnePunchManDangShiTiBeiGaiWuPinJiZhongProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * Mth.nextInt(new Random(), 7, 10), entity.getLookAngle().y * Mth.nextInt(new Random(), 7, 10), entity.getLookAngle().z * Mth.nextInt(new Random(), 7, 10)));
    }
}
