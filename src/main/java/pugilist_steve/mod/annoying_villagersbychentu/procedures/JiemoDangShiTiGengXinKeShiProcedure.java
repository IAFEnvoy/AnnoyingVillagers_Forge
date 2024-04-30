package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HeiyaoshitiekuileiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HongkuileiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HuoyantiekuileiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LanmeikuileiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class JiemoDangShiTiGengXinKeShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        LivingEntity livingEntity;
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15.0d), e -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.distanceToSqr(_center);
        })).collect(Collectors.toList());
        for (Entity entity2 : _entfound) {
            if (entity instanceof Mob _mobEnt) {
                livingEntity = _mobEnt.getTarget();
            } else {
                livingEntity = null;
            }
            if (entity2 == livingEntity) {
                if (Math.random() == 0.1d && (world instanceof ServerLevel _level)) {
                    Mob lanmeikuileiEntity = new LanmeikuileiEntity(AnnoyingVillagersbychentuModEntities.LANMEIKUILEI.get(), _level);
                    lanmeikuileiEntity.moveTo(x + Mth.nextDouble(new Random(), 5.0d, 12.0d), y + Mth.nextDouble(new Random(), 3.0d, 5.0d), z + Mth.nextDouble(new Random(), 5.0d, 12.0d), 0.0f, 0.0f);
                    lanmeikuileiEntity.setYBodyRot(0.0f);
                    lanmeikuileiEntity.setYHeadRot(0.0f);
                    if (lanmeikuileiEntity instanceof Mob) {
                        Mob _mobToSpawn = lanmeikuileiEntity;
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(lanmeikuileiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    }
                    world.addFreshEntity(lanmeikuileiEntity);
                }
                if (Math.random() == 0.1d && (world instanceof ServerLevel _level2)) {
                    Mob lanmeikuileiEntity2 = new LanmeikuileiEntity(AnnoyingVillagersbychentuModEntities.LANMEIKUILEI.get(), _level2);
                    lanmeikuileiEntity2.moveTo(x + Mth.nextDouble(new Random(), 5.0d, 12.0d), y + Mth.nextDouble(new Random(), 3.0d, 5.0d), z + Mth.nextDouble(new Random(), 5.0d, 12.0d), 0.0f, 0.0f);
                    lanmeikuileiEntity2.setYBodyRot(0.0f);
                    lanmeikuileiEntity2.setYHeadRot(0.0f);
                    if (lanmeikuileiEntity2 instanceof Mob) {
                        Mob _mobToSpawn2 = lanmeikuileiEntity2;
                        _mobToSpawn2.finalizeSpawn(_level2, world.getCurrentDifficultyAt(lanmeikuileiEntity2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    }
                    world.addFreshEntity(lanmeikuileiEntity2);
                }
                if (Math.random() == 0.1d && (world instanceof ServerLevel _level3)) {
                    Mob hongkuileiEntity = new HongkuileiEntity(AnnoyingVillagersbychentuModEntities.HONGKUILEI.get(), _level3);
                    hongkuileiEntity.moveTo(x + Mth.nextDouble(new Random(), 5.0d, 12.0d), y + Mth.nextDouble(new Random(), 3.0d, 5.0d), z + Mth.nextDouble(new Random(), 5.0d, 12.0d), 0.0f, 0.0f);
                    hongkuileiEntity.setYBodyRot(0.0f);
                    hongkuileiEntity.setYHeadRot(0.0f);
                    if (hongkuileiEntity instanceof Mob) {
                        Mob _mobToSpawn3 = hongkuileiEntity;
                        _mobToSpawn3.finalizeSpawn(_level3, world.getCurrentDifficultyAt(hongkuileiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    }
                    world.addFreshEntity(hongkuileiEntity);
                }
                if (Math.random() == 0.1d && (world instanceof ServerLevel _level4)) {
                    Mob heiyaoshitiekuileiEntity = new HeiyaoshitiekuileiEntity(AnnoyingVillagersbychentuModEntities.HEIYAOSHITIEKUILEI.get(), _level4);
                    heiyaoshitiekuileiEntity.moveTo(x + Mth.nextDouble(new Random(), 5.0d, 12.0d), y + Mth.nextDouble(new Random(), 3.0d, 5.0d), z + Mth.nextDouble(new Random(), 5.0d, 12.0d), 0.0f, 0.0f);
                    heiyaoshitiekuileiEntity.setYBodyRot(0.0f);
                    heiyaoshitiekuileiEntity.setYHeadRot(0.0f);
                    if (heiyaoshitiekuileiEntity instanceof Mob) {
                        Mob _mobToSpawn4 = heiyaoshitiekuileiEntity;
                        _mobToSpawn4.finalizeSpawn(_level4, world.getCurrentDifficultyAt(heiyaoshitiekuileiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    }
                    world.addFreshEntity(heiyaoshitiekuileiEntity);
                }
                if (Math.random() == 0.1d && (world instanceof ServerLevel _level5)) {
                    Mob huoyantiekuileiEntity = new HuoyantiekuileiEntity(AnnoyingVillagersbychentuModEntities.HUOYANTIEKUILEI.get(), _level5);
                    huoyantiekuileiEntity.moveTo(x + Mth.nextDouble(new Random(), 5.0d, 12.0d), y + Mth.nextDouble(new Random(), 3.0d, 5.0d), z + Mth.nextDouble(new Random(), 5.0d, 12.0d), 0.0f, 0.0f);
                    huoyantiekuileiEntity.setYBodyRot(0.0f);
                    huoyantiekuileiEntity.setYHeadRot(0.0f);
                    if (huoyantiekuileiEntity instanceof Mob) {
                        Mob _mobToSpawn5 = huoyantiekuileiEntity;
                        _mobToSpawn5.finalizeSpawn(_level5, world.getCurrentDifficultyAt(huoyantiekuileiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    }
                    world.addFreshEntity(huoyantiekuileiEntity);
                }
            }
        }
    }
}
