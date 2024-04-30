package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;


public class HeiYanJianDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HeiYanJianDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure$1] */
    public static void execute(Entity entity) {
        if (entity != null && entity.isShiftKeyDown()) {
            Level projectileLevel = entity.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HeiYanJianDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.1
                    public Projectile getFireball(Level level, Entity shooter) {
                        LargeFireball largeFireball = new LargeFireball(EntityType.FIREBALL, level);
                        largeFireball.setOwner(shooter);
                        return largeFireball;
                    }
                }.getFireball(projectileLevel, entity);
                _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
        }
    }
}
