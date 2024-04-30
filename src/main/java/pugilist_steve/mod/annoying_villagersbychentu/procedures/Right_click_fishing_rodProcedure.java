package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.Comparator;


public class Right_click_fishing_rodProcedure {
    /* JADX WARN: Type inference failed for: r1v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure$5] */
    /* JADX WARN: Type inference failed for: r1v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure$4] */
    /* JADX WARN: Type inference failed for: r5v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure$1] */
    /* JADX WARN: Type inference failed for: r6v6, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure$2] */
    /* JADX WARN: Type inference failed for: r7v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure$3] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        if (entity != null && !world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 100.0d, 100.0d, 100.0d), e -> {
            return true;
        }).isEmpty()) {
            entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 40.0d, 40.0d, 40.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).getX(), world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 40.0d, 40.0d, 40.0d), e3 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure.2
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).getY(), world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 40.0d, 40.0d, 40.0d), e4 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure.3
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).getZ()));
            if (!world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 50.0d, 50.0d, 50.0d), e5 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure.4
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
                world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 50.0d, 50.0d, 50.0d), e6 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure.5
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
            }
            entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * 2.0d, entity.getY() * 2.0d, entity.getZ() * 2.0d));
            if (entity instanceof Player _player) {
                _player.getCooldowns().addCooldown(itemstack.getItem(), 15);
            }
        }
    }
}
