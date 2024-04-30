package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HbGaoJiFenShenEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.Herobrine2Entity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.Herobrine3Entity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HerobrinefenshenEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;


public class PlayersbianhbProcedure {
    /* JADX WARN: Type inference failed for: r1v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayersbianhbProcedure$3] */
    /* JADX WARN: Type inference failed for: r1v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayersbianhbProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v20, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayersbianhbProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v5, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayersbianhbProcedure$4] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.HEROBRINEFUSHENBUFF.get(), 5000, 0));
            }
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 6, false, false));
            }
        }
        if (!world.getEntitiesOfClass(Herobrine3Entity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
            return true;
        }).isEmpty()) {
            LivingEntity livingEntity = world.getEntitiesOfClass(Herobrine3Entity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayersbianhbProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity instanceof LivingEntity) {
                LivingEntity _entity3 = livingEntity;
                _entity3.setHealth(40.0f);
            }
        }
        if (!world.getEntitiesOfClass(HbGaoJiFenShenEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e3 -> {
            return true;
        }).isEmpty()) {
            LivingEntity livingEntity2 = world.getEntitiesOfClass(HerobrinefenshenEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e4 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayersbianhbProcedure.2
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity2 instanceof LivingEntity) {
                LivingEntity _entity4 = livingEntity2;
                _entity4.setHealth(40.0f);
            }
        }
        if (!world.getEntitiesOfClass(HerobrinefenshenEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e5 -> {
            return true;
        }).isEmpty()) {
            LivingEntity livingEntity3 = world.getEntitiesOfClass(HerobrinefenshenEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e6 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayersbianhbProcedure.3
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity3 instanceof LivingEntity) {
                LivingEntity _entity5 = livingEntity3;
                _entity5.setHealth(40.0f);
            }
        }
        if (!world.getEntitiesOfClass(Herobrine2Entity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e7 -> {
            return true;
        }).isEmpty()) {
            LivingEntity livingEntity4 = world.getEntitiesOfClass(Herobrine2Entity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e8 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayersbianhbProcedure.4
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity4 instanceof LivingEntity) {
                LivingEntity _entity6 = livingEntity4;
                _entity6.setHealth(40.0f);
            }
        }
    }
}
