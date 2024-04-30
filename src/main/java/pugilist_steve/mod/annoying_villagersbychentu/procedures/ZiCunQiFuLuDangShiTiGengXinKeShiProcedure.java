package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.*;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;


public class ZiCunQiFuLuDangShiTiGengXinKeShiProcedure {
    /* JADX WARN: Type inference failed for: r0v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1
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

            /* JADX WARN: Type inference failed for: r0v27, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$12] */
            /* JADX WARN: Type inference failed for: r0v31, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$10] */
            /* JADX WARN: Type inference failed for: r0v35, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$8] */
            /* JADX WARN: Type inference failed for: r0v39, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$6] */
            /* JADX WARN: Type inference failed for: r0v43, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$4] */
            /* JADX WARN: Type inference failed for: r0v48, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$2] */
            /* JADX WARN: Type inference failed for: r2v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$11] */
            /* JADX WARN: Type inference failed for: r2v19, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$9] */
            /* JADX WARN: Type inference failed for: r2v25, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$7] */
            /* JADX WARN: Type inference failed for: r2v31, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$5] */
            /* JADX WARN: Type inference failed for: r2v37, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$3] */
            /* JADX WARN: Type inference failed for: r2v43, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure$1$1] */
            private void run() {
                if (!this.world.getEntitiesOfClass(CunMinZhenChaBingEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
                    return true;
                }).isEmpty()) {
                    entity.startRiding(this.world.getEntitiesOfClass(CunMinZhenChaBingEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e2 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.1
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd -> {
                                return _entcnd.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null));
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.2
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
                            if (entity.isAlive()) {
                                ServerLevel serverLevel = this.world;
                                if (serverLevel instanceof ServerLevel) {
                                    ServerLevel _level = serverLevel;
                                    Mob ziCunQiEntity = new ZiCunQiEntity(AnnoyingVillagersbychentuModEntities.ZI_CUN_QI.get(), _level);
                                    ziCunQiEntity.moveTo(x, y, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (ziCunQiEntity instanceof Mob) {
                                        Mob _mobToSpawn = ziCunQiEntity;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(ziCunQiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                    }
                                    this.world.addFreshEntity(ziCunQiEntity);
                                }
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 40);
                } else if (!this.world.getEntitiesOfClass(HongCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e3 -> {
                    return true;
                }).isEmpty()) {
                    entity.startRiding(this.world.getEntitiesOfClass(HongCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e4 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.3
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd -> {
                                return _entcnd.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null));
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.4
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
                            if (entity.isAlive()) {
                                ServerLevel serverLevel = this.world;
                                if (serverLevel instanceof ServerLevel) {
                                    ServerLevel _level = serverLevel;
                                    Mob ziCunQiEntity = new ZiCunQiEntity(AnnoyingVillagersbychentuModEntities.ZI_CUN_QI.get(), _level);
                                    ziCunQiEntity.moveTo(x, y, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (ziCunQiEntity instanceof Mob) {
                                        Mob _mobToSpawn = ziCunQiEntity;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(ziCunQiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                    }
                                    this.world.addFreshEntity(ziCunQiEntity);
                                }
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 40);
                } else if (!this.world.getEntitiesOfClass(CczdzEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e5 -> {
                    return true;
                }).isEmpty()) {
                    entity.startRiding(this.world.getEntitiesOfClass(CczdzEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e6 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.5
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd -> {
                                return _entcnd.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null));
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.6
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
                            if (entity.isAlive()) {
                                ServerLevel serverLevel = this.world;
                                if (serverLevel instanceof ServerLevel) {
                                    ServerLevel _level = serverLevel;
                                    Mob ziCunQiEntity = new ZiCunQiEntity(AnnoyingVillagersbychentuModEntities.ZI_CUN_QI.get(), _level);
                                    ziCunQiEntity.moveTo(x, y, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (ziCunQiEntity instanceof Mob) {
                                        Mob _mobToSpawn = ziCunQiEntity;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(ziCunQiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                    }
                                    this.world.addFreshEntity(ziCunQiEntity);
                                }
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 40);
                } else if (!this.world.getEntitiesOfClass(LanCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e7 -> {
                    return true;
                }).isEmpty()) {
                    entity.startRiding(this.world.getEntitiesOfClass(LanCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e8 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.7
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd -> {
                                return _entcnd.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null));
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.8
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
                            if (entity.isAlive()) {
                                ServerLevel serverLevel = this.world;
                                if (serverLevel instanceof ServerLevel) {
                                    ServerLevel _level = serverLevel;
                                    Mob ziCunQiEntity = new ZiCunQiEntity(AnnoyingVillagersbychentuModEntities.ZI_CUN_QI.get(), _level);
                                    ziCunQiEntity.moveTo(x, y, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (ziCunQiEntity instanceof Mob) {
                                        Mob _mobToSpawn = ziCunQiEntity;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(ziCunQiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                    }
                                    this.world.addFreshEntity(ziCunQiEntity);
                                }
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 40);
                } else if (!this.world.getEntitiesOfClass(LuCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e9 -> {
                    return true;
                }).isEmpty()) {
                    entity.startRiding(this.world.getEntitiesOfClass(LuCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e10 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.9
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd -> {
                                return _entcnd.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null));
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.10
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
                            if (entity.isAlive()) {
                                ServerLevel serverLevel = this.world;
                                if (serverLevel instanceof ServerLevel) {
                                    ServerLevel _level = serverLevel;
                                    Mob ziCunQiEntity = new ZiCunQiEntity(AnnoyingVillagersbychentuModEntities.ZI_CUN_QI.get(), _level);
                                    ziCunQiEntity.moveTo(x, y, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (ziCunQiEntity instanceof Mob) {
                                        Mob _mobToSpawn = ziCunQiEntity;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(ziCunQiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                    }
                                    this.world.addFreshEntity(ziCunQiEntity);
                                }
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 40);
                } else if (!this.world.getEntitiesOfClass(ZiCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e11 -> {
                    return true;
                }).isEmpty()) {
                    entity.startRiding(this.world.getEntitiesOfClass(ZiCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e12 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.11
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd -> {
                                return _entcnd.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null));
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZiCunQiFuLuDangShiTiGengXinKeShiProcedure.1.12
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
                            if (entity.isAlive()) {
                                ServerLevel serverLevel = this.world;
                                if (serverLevel instanceof ServerLevel) {
                                    ServerLevel _level = serverLevel;
                                    Mob ziCunQiEntity = new ZiCunQiEntity(AnnoyingVillagersbychentuModEntities.ZI_CUN_QI.get(), _level);
                                    ziCunQiEntity.moveTo(x, y, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (ziCunQiEntity instanceof Mob) {
                                        Mob _mobToSpawn = ziCunQiEntity;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(ziCunQiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                    }
                                    this.world.addFreshEntity(ziCunQiEntity);
                                }
                            }
                            if (!entity.level.isClientSide()) {
                                entity.discard();
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 40);
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        if (entity.isPassenger() && (entity instanceof LivingEntity _entity)) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.FULU.get(), 10, 1, false, false));
            }
        }
    }
}
