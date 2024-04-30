package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BbdEntity;


public class BTridentDangShiTiGengXinKeShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && !world.getEntitiesOfClass(BbdEntity.class, AABB.ofSize(new Vec3(x, y, z), 80.0d, 80.0d, 80.0d), e -> {
            return true;
        }).isEmpty() && entity.isAlive()) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "summon minecraft:trident ^ ^ ^");
            }
            if (!entity.level.isClientSide()) {
                entity.discard();
            }
        }
    }
}
