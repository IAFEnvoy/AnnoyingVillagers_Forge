package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;


public class BbqDangYouJiShiTiShiProcedure {
    public static void execute(Entity entity, Entity sourceentity) {
        if (entity == null || sourceentity == null) {
            return;
        }
        sourceentity.startRiding(entity);
        if (sourceentity.isShiftKeyDown()) {
            entity.stopRiding();
        }
    }
}
