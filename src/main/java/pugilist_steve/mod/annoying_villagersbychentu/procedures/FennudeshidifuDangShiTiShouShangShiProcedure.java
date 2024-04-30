package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Random;


public class FennudeshidifuDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v22, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v23, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure$3] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.08d) {
            entity.setYRot(0.0f);
            entity.setXRot((float) Mth.nextDouble(new Random(), -90.0d, -180.0d));
            entity.setYBodyRot(entity.getYRot());
            entity.setYHeadRot(entity.getYRot());
            entity.yRotO = entity.getYRot();
            entity.xRotO = entity.getXRot();
            if (entity instanceof LivingEntity _entity) {
                _entity.yBodyRotO = _entity.getYRot();
                _entity.yHeadRotO = _entity.getYRot();
            }
            Level projectileLevel = entity.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure.1
                    public Projectile getProjectile(Level level, Entity shooter) {
                        ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                        thrownEnderpearl.setOwner(shooter);
                        return thrownEnderpearl;
                    }
                }.getProjectile(projectileLevel, entity);
                _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 2.0f, 0.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
            if (Math.random() <= 0.4d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure.2
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

                    /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure$2$1] */
                    private void run() {
                        Entity _shootFrom = entity;
                        Level projectileLevel2 = _shootFrom.level;
                        if (!projectileLevel2.isClientSide()) {
                            Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure.2.1
                                public Projectile getProjectile(Level level, Entity shooter) {
                                    ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                    thrownEnderpearl.setOwner(shooter);
                                    return thrownEnderpearl;
                                }
                            }.getProjectile(projectileLevel2, entity);
                            _entityToSpawn2.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn2.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel2.addFreshEntity(_entityToSpawn2);
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 40);
            }
        }
        if (Math.random() <= 0.08d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure.3
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

                /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure$3$1] */
                private void run() {
                    Entity _shootFrom = entity;
                    Level projectileLevel2 = _shootFrom.level;
                    if (!projectileLevel2.isClientSide()) {
                        Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiShouShangShiProcedure.3.1
                            public Projectile getProjectile(Level level, Entity shooter) {
                                ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                thrownEnderpearl.setOwner(shooter);
                                return thrownEnderpearl;
                            }
                        }.getProjectile(projectileLevel2, entity);
                        _entityToSpawn2.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn2.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                        projectileLevel2.addFreshEntity(_entityToSpawn2);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 100);
        }
    }
}
