package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEgg;
import net.minecraft.world.level.Level;


public class BbqDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v6, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BbqDangShiTiShouShangShiProcedure$1] */
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        Level projectileLevel = entity.level;
        if (!projectileLevel.isClientSide()) {
            Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BbqDangShiTiShouShangShiProcedure.1
                public Projectile getProjectile(Level level, Entity shooter) {
                    ThrownEgg thrownEgg = new ThrownEgg(EntityType.EGG, level);
                    thrownEgg.setOwner(shooter);
                    return thrownEgg;
                }
            }.getProjectile(projectileLevel, entity);
            _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
            _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 2.0f, 0.0f);
            projectileLevel.addFreshEntity(_entityToSpawn);
        }
    }
}
