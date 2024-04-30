package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.*;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class LingZhiDangShiTiGengXinKeShiProcedure {
    /* JADX WARN: Type inference failed for: r1v18, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r1v24, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r1v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r1v36, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r1v42, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure$7] */
    /* JADX WARN: Type inference failed for: r1v58, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v65, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure$2] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        LivingEntity livingEntity;
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s run particle minecraft:smoke ~ ~0.8 ~ 0.2 0.2 0.2 0.07 50 force");
        }
        if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e -> {
            return true;
        }).isEmpty()) {
            if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
                world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e3 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure.2
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
            }
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 4, false, false));
                }
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
        if (Math.random() <= 0.1d) {
            ServerPlayer serverPlayer = (Entity) world.getEntitiesOfClass(Null1Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e4 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure.3
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            serverPlayer.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
            if (serverPlayer instanceof ServerPlayer) {
                ServerPlayer _serverPlayer = serverPlayer;
                _serverPlayer.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer.getYRot(), serverPlayer.getXRot());
            }
            ServerPlayer serverPlayer2 = (Entity) world.getEntitiesOfClass(Null2Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e5 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure.4
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            serverPlayer2.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
            if (serverPlayer2 instanceof ServerPlayer) {
                ServerPlayer _serverPlayer2 = serverPlayer2;
                _serverPlayer2.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer2.getYRot(), serverPlayer2.getXRot());
            }
            ServerPlayer serverPlayer3 = (Entity) world.getEntitiesOfClass(Null3Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e6 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure.5
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            serverPlayer3.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
            if (serverPlayer3 instanceof ServerPlayer) {
                ServerPlayer _serverPlayer3 = serverPlayer3;
                _serverPlayer3.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer3.getYRot(), serverPlayer3.getXRot());
            }
            ServerPlayer serverPlayer4 = (Entity) world.getEntitiesOfClass(Null4Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e7 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure.6
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            serverPlayer4.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
            if (serverPlayer4 instanceof ServerPlayer) {
                ServerPlayer _serverPlayer4 = serverPlayer4;
                _serverPlayer4.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer4.getYRot(), serverPlayer4.getXRot());
            }
            ServerPlayer serverPlayer5 = (Entity) world.getEntitiesOfClass(Null6Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e8 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiGengXinKeShiProcedure.7
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            serverPlayer5.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
            if (serverPlayer5 instanceof ServerPlayer) {
                ServerPlayer _serverPlayer5 = serverPlayer5;
                _serverPlayer5.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer5.getYRot(), serverPlayer5.getXRot());
            }
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(45.0d), e9 -> {
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
                entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * 0.2d, entity.getLookAngle().y * 0.2d, entity.getLookAngle().z * 0.2d));
            }
        }
    }
}
