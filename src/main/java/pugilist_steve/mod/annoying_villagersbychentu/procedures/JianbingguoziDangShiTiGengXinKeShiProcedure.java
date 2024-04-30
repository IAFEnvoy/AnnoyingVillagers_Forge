package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class JianbingguoziDangShiTiGengXinKeShiProcedure {
    /* JADX WARN: Type inference failed for: r0v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v28, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r1v23, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure$3] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        ItemStack itemStack;
        LivingEntity livingEntity;
        LivingEntity livingEntity2;
        LivingEntity livingEntity3;
        LivingEntity livingEntity4;
        if (entity == null) {
            return;
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure.1
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
                Entity _ent = entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tp @e[type=annoying_villagersbychentu:jianbingguozi,name=!Themostmoistburrit0] 1000 -200 1000");
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 21);
        if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e -> {
            return true;
        }).isEmpty()) {
            if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure.2
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
                world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e3 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure.3
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 4, false, false));
                }
            }
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15.0d), e4 -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.distanceToSqr(_center);
        })).collect(Collectors.toList());
        for (Entity entity2 : _entfound) {
            if (entity instanceof LivingEntity _livEnt) {
                itemStack = _livEnt.getMainHandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            if (itemStack.getItem() == Items.BOW) {
                if (entity instanceof Mob _mobEnt) {
                    livingEntity = _mobEnt.getTarget();
                } else {
                    livingEntity = null;
                }
                if (entity2 == livingEntity) {
                    EntityAnchorArgument.Anchor anchor = EntityAnchorArgument.Anchor.EYES;
                    if (entity instanceof Mob _mobEnt2) {
                        livingEntity2 = _mobEnt2.getTarget();
                    } else {
                        livingEntity2 = null;
                    }
                    double getX = livingEntity2.getX();
                    if (entity instanceof Mob _mobEnt3) {
                        livingEntity3 = _mobEnt3.getTarget();
                    } else {
                        livingEntity3 = null;
                    }
                    double getY = livingEntity3.getY();
                    if (entity instanceof Mob _mobEnt4) {
                        livingEntity4 = _mobEnt4.getTarget();
                    } else {
                        livingEntity4 = null;
                    }
                    entity.lookAt(anchor, new Vec3(getX, getY, livingEntity4.getZ()));
                    if (Math.random() <= 0.3d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure.4
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

                            /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure$4$1] */
                            private void run() {
                                Entity _shootFrom = entity;
                                Level projectileLevel = _shootFrom.level;
                                if (!projectileLevel.isClientSide()) {
                                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiGengXinKeShiProcedure.4.1
                                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                            Arrow arrow = new Arrow(EntityType.ARROW, level);
                                            arrow.setOwner(shooter);
                                            arrow.setBaseDamage(damage);
                                            arrow.setKnockback(knockback);
                                            arrow.setPierceLevel(piercing);
                                            return arrow;
                                        }
                                    }.getArrow(projectileLevel, entity, 4.0f, 0, (byte) 1);
                                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.5f, 0.0f);
                                    projectileLevel.addFreshEntity(_entityToSpawn);
                                }
                                Level level = this.world;
                                if (level instanceof Level) {
                                    Level _level2 = level;
                                    if (!_level2.isClientSide()) {
                                        _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                    } else {
                                        _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, Mth.nextInt(new Random(), 1, 10));
                    }
                }
            }
        }
    }
}
