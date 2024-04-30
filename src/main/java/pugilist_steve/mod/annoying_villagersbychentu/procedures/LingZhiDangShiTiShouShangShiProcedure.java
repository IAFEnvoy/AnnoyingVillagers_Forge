package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.*;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class LingZhiDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v19, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v25, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r1v33, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r1v41, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r1v49, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r1v56, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$7] */
    /* JADX WARN: Type inference failed for: r1v62, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$8] */
    /* JADX WARN: Type inference failed for: r1v68, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$9] */
    /* JADX WARN: Type inference failed for: r1v74, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$10] */
    /* JADX WARN: Type inference failed for: r1v80, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure$11] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        LivingEntity livingEntity;
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(45.0d), e -> {
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
                if (Math.random() <= 0.07d && (world instanceof ServerLevel _level)) {
                    Mob witherSkeleton = new WitherSkeleton(EntityType.WITHER_SKELETON, _level);
                    witherSkeleton.moveTo(x + Mth.nextInt(new Random(), 1, 10), y + Mth.nextInt(new Random(), 5, 10), z + Mth.nextInt(new Random(), 1, 10), world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (witherSkeleton instanceof Mob) {
                        Mob _mobToSpawn = witherSkeleton;
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(witherSkeleton.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    }
                    world.addFreshEntity(witherSkeleton);
                }
                entity.setSprinting(true);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.1
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    public void start(LevelAccessor world2, int waitTicks) {
                        this.waitTicks = waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world2;
                    }

                    @SubscribeEvent
                    public void tick(TickEvent.ServerTickEvent event) {
                        if (event.phase == TickEvent.Phase.END) {
                            this.ticks++;
                            if (this.ticks >= this.waitTicks) {
                                this.run();
                            }
                        }
                    }

                    private void run() {
                        entity.setSprinting(false);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 10);
                if (!world.getEntitiesOfClass(Null1Entity.class, AABB.ofSize(new Vec3(x, y, z), 20.0d, 20.0d, 20.0d), e2 -> {
                    return true;
                }).isEmpty()) {
                    if (Math.random() <= 0.2d) {
                        ServerPlayer serverPlayer = (Entity) world.getEntitiesOfClass(Null1Entity.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e3 -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.2
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd2 -> {
                                    return _entcnd2.distanceToSqr(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        serverPlayer.teleportTo(x, y, z);
                        if (serverPlayer instanceof ServerPlayer) {
                            ServerPlayer _serverPlayer = serverPlayer;
                            _serverPlayer.connection.teleport(x, y, z, serverPlayer.getYRot(), serverPlayer.getXRot());
                        }
                        if (entity instanceof LivingEntity _entity) {
                            if (!_entity.level.isClientSide()) {
                                _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                            }
                        }
                    } else if (Math.random() <= 0.2d) {
                        ServerPlayer serverPlayer2 = (Entity) world.getEntitiesOfClass(Null2Entity.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e4 -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.3
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd2 -> {
                                    return _entcnd2.distanceToSqr(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        serverPlayer2.teleportTo(x, y, z);
                        if (serverPlayer2 instanceof ServerPlayer) {
                            ServerPlayer _serverPlayer2 = serverPlayer2;
                            _serverPlayer2.connection.teleport(x, y, z, serverPlayer2.getYRot(), serverPlayer2.getXRot());
                        }
                        if (entity instanceof LivingEntity _entity2) {
                            if (!_entity2.level.isClientSide()) {
                                _entity2.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                            }
                        }
                    } else if (Math.random() <= 0.2d) {
                        ServerPlayer serverPlayer3 = (Entity) world.getEntitiesOfClass(Null4Entity.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e5 -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.4
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd2 -> {
                                    return _entcnd2.distanceToSqr(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        serverPlayer3.teleportTo(x, y, z);
                        if (serverPlayer3 instanceof ServerPlayer) {
                            ServerPlayer _serverPlayer3 = serverPlayer3;
                            _serverPlayer3.connection.teleport(x, y, z, serverPlayer3.getYRot(), serverPlayer3.getXRot());
                        }
                        if (entity instanceof LivingEntity _entity3) {
                            if (!_entity3.level.isClientSide()) {
                                _entity3.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                            }
                        }
                    } else if (Math.random() < 0.2d) {
                        ServerPlayer serverPlayer4 = (Entity) world.getEntitiesOfClass(Null3Entity.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e6 -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.5
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd2 -> {
                                    return _entcnd2.distanceToSqr(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        serverPlayer4.teleportTo(x, y, z);
                        if (serverPlayer4 instanceof ServerPlayer) {
                            ServerPlayer _serverPlayer4 = serverPlayer4;
                            _serverPlayer4.connection.teleport(x, y, z, serverPlayer4.getYRot(), serverPlayer4.getXRot());
                        }
                        if (entity instanceof LivingEntity _entity4) {
                            if (!_entity4.level.isClientSide()) {
                                _entity4.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                            }
                        }
                    } else if (Math.random() < 0.2d) {
                        ServerPlayer serverPlayer5 = (Entity) world.getEntitiesOfClass(Null6Entity.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e7 -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.6
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd2 -> {
                                    return _entcnd2.distanceToSqr(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null);
                        serverPlayer5.teleportTo(x, y, z);
                        if (serverPlayer5 instanceof ServerPlayer) {
                            ServerPlayer _serverPlayer5 = serverPlayer5;
                            _serverPlayer5.connection.teleport(x, y, z, serverPlayer5.getYRot(), serverPlayer5.getXRot());
                        }
                        if (entity instanceof LivingEntity _entity5) {
                            if (!_entity5.level.isClientSide()) {
                                _entity5.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                            }
                        }
                    }
                } else {
                    ServerPlayer serverPlayer6 = (Entity) world.getEntitiesOfClass(Null1Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e8 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.7
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd2 -> {
                                return _entcnd2.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null);
                    serverPlayer6.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
                    if (serverPlayer6 instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer6 = serverPlayer6;
                        _serverPlayer6.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer6.getYRot(), serverPlayer6.getXRot());
                    }
                    ServerPlayer serverPlayer7 = (Entity) world.getEntitiesOfClass(Null2Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e9 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.8
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd2 -> {
                                return _entcnd2.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null);
                    serverPlayer7.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
                    if (serverPlayer7 instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer7 = serverPlayer7;
                        _serverPlayer7.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer7.getYRot(), serverPlayer7.getXRot());
                    }
                    ServerPlayer serverPlayer8 = (Entity) world.getEntitiesOfClass(Null3Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e10 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.9
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd2 -> {
                                return _entcnd2.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null);
                    serverPlayer8.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
                    if (serverPlayer8 instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer8 = serverPlayer8;
                        _serverPlayer8.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer8.getYRot(), serverPlayer8.getXRot());
                    }
                    ServerPlayer serverPlayer9 = (Entity) world.getEntitiesOfClass(Null4Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e11 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.10
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd2 -> {
                                return _entcnd2.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null);
                    serverPlayer9.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
                    if (serverPlayer9 instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer9 = serverPlayer9;
                        _serverPlayer9.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer9.getYRot(), serverPlayer9.getXRot());
                    }
                    ServerPlayer serverPlayer10 = (Entity) world.getEntitiesOfClass(Null6Entity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0d, 2000.0d, 2000.0d), e12 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiShouShangShiProcedure.11
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd2 -> {
                                return _entcnd2.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null);
                    serverPlayer10.teleportTo(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4));
                    if (serverPlayer10 instanceof ServerPlayer) {
                        ServerPlayer _serverPlayer10 = serverPlayer10;
                        _serverPlayer10.connection.teleport(x + Mth.nextInt(new Random(), -4, 4), y + Mth.nextInt(new Random(), 1, 4), z + Mth.nextInt(new Random(), -4, 4), serverPlayer10.getYRot(), serverPlayer10.getXRot());
                    }
                }
            }
        }
    }
}
