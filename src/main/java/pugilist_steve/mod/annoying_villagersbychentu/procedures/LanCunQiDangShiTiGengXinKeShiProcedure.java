package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class LanCunQiDangShiTiGengXinKeShiProcedure {
    /* JADX WARN: Type inference failed for: r0v69, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v96, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r1v63, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v70, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r2v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r2v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure$3] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        LivingEntity livingEntity;
        LivingEntity livingEntity2;
        LivingEntity livingEntity3;
        LivingEntity livingEntity4;
        ItemStack itemStack;
        LivingEntity livingEntity5;
        LivingEntity livingEntity6;
        LivingEntity livingEntity7;
        LivingEntity livingEntity8;
        ItemStack itemStack2;
        LivingEntity livingEntity9;
        LivingEntity livingEntity10;
        LivingEntity livingEntity11;
        if (entity == null) {
            return;
        }
        if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e -> {
            return true;
        }).isEmpty()) {
            if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
                world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e3 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure.2
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
                    _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 40, 1, false, false));
                }
            }
        }
        if (entity instanceof Mob _mobEnt) {
            livingEntity = _mobEnt.getTarget();
        } else {
            livingEntity = null;
        }
        if (livingEntity == world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e4 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure.3
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null) && Math.random() <= 0.01d && (entity instanceof LivingEntity _entity2)) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 10, 1, false, false));
            }
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20.0d), e5 -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.distanceToSqr(_center);
        })).collect(Collectors.toList());
        for (Entity entity2 : _entfound) {
            if (entity instanceof Mob _mobEnt2) {
                livingEntity3 = _mobEnt2.getTarget();
            } else {
                livingEntity3 = null;
            }
            if (entity2 == livingEntity3) {
                if (entity instanceof Mob _mobEnt3) {
                    livingEntity4 = _mobEnt3.getTarget();
                } else {
                    livingEntity4 = null;
                }
                LivingEntity livingEntity12 = livingEntity4;
                if (livingEntity12 instanceof LivingEntity) {
                    LivingEntity _livEnt = livingEntity12;
                    itemStack = _livEnt.getMainHandItem();
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                if (itemStack.getItem() instanceof BowItem) {
                    EntityAnchorArgument.Anchor anchor = EntityAnchorArgument.Anchor.EYES;
                    if (entity instanceof Mob _mobEnt4) {
                        livingEntity5 = _mobEnt4.getTarget();
                    } else {
                        livingEntity5 = null;
                    }
                    double getX = livingEntity5.getX();
                    if (entity instanceof Mob _mobEnt5) {
                        livingEntity6 = _mobEnt5.getTarget();
                    } else {
                        livingEntity6 = null;
                    }
                    double getY = livingEntity6.getY();
                    if (entity instanceof Mob _mobEnt6) {
                        livingEntity7 = _mobEnt6.getTarget();
                    } else {
                        livingEntity7 = null;
                    }
                    entity.lookAt(anchor, new Vec3(getX, getY, livingEntity7.getZ()));
                    if (entity instanceof LivingEntity) {
                        Player player = (LivingEntity) entity;
                        ItemStack _setstack = new ItemStack(Items.BOW);
                        _setstack.setCount(1);
                        player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (player instanceof Player) {
                            Player _player = player;
                            _player.getInventory().setChanged();
                        }
                    }
                    if (Math.random() <= 0.05d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure.4
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

                            /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure$4$1] */
                            private void run() {
                                Entity _shootFrom = entity;
                                Level projectileLevel = _shootFrom.level;
                                if (!projectileLevel.isClientSide()) {
                                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure.4.1
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
                                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3.0f, 0.0f);
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
                } else {
                    if (entity instanceof Mob _mobEnt7) {
                        livingEntity8 = _mobEnt7.getTarget();
                    } else {
                        livingEntity8 = null;
                    }
                    LivingEntity livingEntity13 = livingEntity8;
                    if (livingEntity13 instanceof LivingEntity) {
                        LivingEntity _livEnt2 = livingEntity13;
                        itemStack2 = _livEnt2.getMainHandItem();
                    } else {
                        itemStack2 = ItemStack.EMPTY;
                    }
                    if (itemStack2.getItem() instanceof CrossbowItem) {
                        EntityAnchorArgument.Anchor anchor2 = EntityAnchorArgument.Anchor.EYES;
                        if (entity instanceof Mob _mobEnt8) {
                            livingEntity9 = _mobEnt8.getTarget();
                        } else {
                            livingEntity9 = null;
                        }
                        double getX2 = livingEntity9.getX();
                        if (entity instanceof Mob _mobEnt9) {
                            livingEntity10 = _mobEnt9.getTarget();
                        } else {
                            livingEntity10 = null;
                        }
                        double getY2 = livingEntity10.getY();
                        if (entity instanceof Mob _mobEnt10) {
                            livingEntity11 = _mobEnt10.getTarget();
                        } else {
                            livingEntity11 = null;
                        }
                        entity.lookAt(anchor2, new Vec3(getX2, getY2, livingEntity11.getZ()));
                        if (entity instanceof LivingEntity) {
                            Player player2 = (LivingEntity) entity;
                            ItemStack _setstack2 = new ItemStack(Items.BOW);
                            _setstack2.setCount(1);
                            player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                            if (player2 instanceof Player) {
                                Player _player2 = player2;
                                _player2.getInventory().setChanged();
                            }
                        }
                        if (Math.random() <= 0.05d) {
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure.5
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

                                /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure$5$1] */
                                private void run() {
                                    Entity _shootFrom = entity;
                                    Level projectileLevel = _shootFrom.level;
                                    if (!projectileLevel.isClientSide()) {
                                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure.5.1
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
                                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 3.0f, 0.0f);
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
        Vec3 _center2 = new Vec3(x, y, z);
        List<Entity> _entfound2 = world.getEntitiesOfClass(Entity.class, new AABB(_center2, _center2).inflate(2.0d), e6 -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd2 -> {
            return _entcnd2.distanceToSqr(_center2);
        })).collect(Collectors.toList());
        for (Entity entity3 : _entfound2) {
            if (entity instanceof Mob _mobEnt11) {
                livingEntity2 = _mobEnt11.getTarget();
            } else {
                livingEntity2 = null;
            }
            if (entity3 == livingEntity2) {
                if (entity instanceof LivingEntity) {
                    Player player3 = (LivingEntity) entity;
                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_JIAN.get());
                    _setstack3.setCount(1);
                    player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                    if (player3 instanceof Player) {
                        Player _player3 = player3;
                        _player3.getInventory().setChanged();
                    }
                }
                if (entity.getVehicle() == world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 3.0d, 3.0d, 3.0d), e7 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LanCunQiDangShiTiGengXinKeShiProcedure.6
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd3 -> {
                            return _entcnd3.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null)) {
                    entity.stopRiding();
                }
            }
        }
    }
}
