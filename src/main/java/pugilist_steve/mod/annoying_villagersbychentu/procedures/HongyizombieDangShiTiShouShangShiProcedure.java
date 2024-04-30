package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class HongyizombieDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v26, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v27, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v42, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure$2] */
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
                entity.setSprinting(true);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure.1
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
                if (Math.random() <= 0.38d && (entity instanceof LivingEntity _entity)) {
                    if (!_entity.level.isClientSide()) {
                        _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                    }
                }
                if (Math.random() <= 0.09d) {
                    entity.setYRot(0.0f);
                    entity.setXRot(180.0f);
                    entity.setYBodyRot(entity.getYRot());
                    entity.setYHeadRot(entity.getYRot());
                    entity.yRotO = entity.getYRot();
                    entity.xRotO = entity.getXRot();
                    if (entity instanceof LivingEntity _entity2) {
                        _entity2.yBodyRotO = _entity2.getYRot();
                        _entity2.yHeadRotO = _entity2.getYRot();
                    }
                    Level projectileLevel = entity.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure.2
                            public Projectile getProjectile(Level level, Entity shooter) {
                                ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                thrownEnderpearl.setOwner(shooter);
                                return thrownEnderpearl;
                            }
                        }.getProjectile(projectileLevel, entity);
                        _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                        _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                }
                if (Math.random() <= 0.05d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure.3
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

                        /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure$3$1] */
                        private void run() {
                            LivingEntity livingEntity2 = entity;
                            livingEntity2.setYRot(0.0f);
                            livingEntity2.setXRot(90.0f);
                            livingEntity2.setYBodyRot(livingEntity2.getYRot());
                            livingEntity2.setYHeadRot(livingEntity2.getYRot());
                            livingEntity2.yRotO = livingEntity2.getYRot();
                            livingEntity2.xRotO = livingEntity2.getXRot();
                            if (livingEntity2 instanceof LivingEntity) {
                                LivingEntity _entity3 = livingEntity2;
                                _entity3.yBodyRotO = _entity3.getYRot();
                                _entity3.yHeadRotO = _entity3.getYRot();
                            }
                            Entity _shootFrom = entity;
                            Level projectileLevel2 = _shootFrom.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure.3.1
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
                    }.start(world, 20);
                }
                if (Math.random() <= 0.09d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure.4
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

                        /* JADX WARN: Type inference failed for: r0v29, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure$4$2] */
                        /* JADX WARN: Type inference failed for: r0v53, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure$4$1] */
                        private void run() {
                            ItemStack itemStack;
                            ItemStack itemStack2;
                            LivingEntity livingEntity2 = entity;
                            livingEntity2.setYRot(0.0f);
                            livingEntity2.setXRot(180.0f);
                            livingEntity2.setYBodyRot(livingEntity2.getYRot());
                            livingEntity2.setYHeadRot(livingEntity2.getYRot());
                            livingEntity2.yRotO = livingEntity2.getYRot();
                            livingEntity2.xRotO = livingEntity2.getXRot();
                            if (livingEntity2 instanceof LivingEntity) {
                                LivingEntity _entity3 = livingEntity2;
                                _entity3.yBodyRotO = _entity3.getYRot();
                                _entity3.yHeadRotO = _entity3.getYRot();
                            }
                            Entity _shootFrom = entity;
                            Level projectileLevel2 = _shootFrom.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure.4.1
                                    public Projectile getProjectile(Level level, Entity shooter) {
                                        ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                        thrownEnderpearl.setOwner(shooter);
                                        return thrownEnderpearl;
                                    }
                                }.getProjectile(projectileLevel2, entity);
                                _entityToSpawn2.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                _entityToSpawn2.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                                projectileLevel2.addFreshEntity(_entityToSpawn2);
                            }
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
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = entity;
                                itemStack = _livEnt.getMainHandItem();
                            } else {
                                itemStack = ItemStack.EMPTY;
                            }
                            itemStack.enchant(Enchantments.POWER_ARROWS, 5);
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt2 = entity;
                                itemStack2 = _livEnt2.getMainHandItem();
                            } else {
                                itemStack2 = ItemStack.EMPTY;
                            }
                            itemStack2.enchant(Enchantments.PUNCH_ARROWS, 5);
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure.4.2
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

                                /* JADX WARN: Type inference failed for: r0v94, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure$4$2$1] */
                                private void run() {
                                    ItemStack itemStack3;
                                    ItemStack itemStack4;
                                    ItemStack itemStack5;
                                    ItemStack itemStack6;
                                    Entity _shootFrom2 = entity;
                                    Level projectileLevel3 = _shootFrom2.level;
                                    if (!projectileLevel3.isClientSide()) {
                                        Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongyizombieDangShiTiShouShangShiProcedure.4.2.1
                                            public Projectile getProjectile(Level level, Entity shooter) {
                                                ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                                thrownEnderpearl.setOwner(shooter);
                                                return thrownEnderpearl;
                                            }
                                        }.getProjectile(projectileLevel3, entity);
                                        _entityToSpawn3.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                        _entityToSpawn3.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.0f, 0.0f);
                                        projectileLevel3.addFreshEntity(_entityToSpawn3);
                                    }
                                    if (Math.random() <= 0.2d) {
                                        if (entity instanceof LivingEntity) {
                                            Player player2 = (LivingEntity) entity;
                                            ItemStack _setstack2 = new ItemStack(Items.DIAMOND_SWORD);
                                            _setstack2.setCount(1);
                                            player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                                            if (player2 instanceof Player) {
                                                Player _player2 = player2;
                                                _player2.getInventory().setChanged();
                                            }
                                        }
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt3 = entity;
                                            itemStack5 = _livEnt3.getMainHandItem();
                                        } else {
                                            itemStack5 = ItemStack.EMPTY;
                                        }
                                        itemStack5.enchant(Enchantments.SHARPNESS, 5);
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt4 = entity;
                                            itemStack6 = _livEnt4.getMainHandItem();
                                        } else {
                                            itemStack6 = ItemStack.EMPTY;
                                        }
                                        itemStack6.enchant(Enchantments.MENDING, 5);
                                    }
                                    if (Math.random() <= 0.1d) {
                                        if (entity instanceof LivingEntity) {
                                            Player player3 = (LivingEntity) entity;
                                            ItemStack _setstack3 = new ItemStack(Items.IRON_SWORD);
                                            _setstack3.setCount(1);
                                            player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                                            if (player3 instanceof Player) {
                                                Player _player3 = player3;
                                                _player3.getInventory().setChanged();
                                            }
                                        }
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt5 = entity;
                                            itemStack3 = _livEnt5.getMainHandItem();
                                        } else {
                                            itemStack3 = ItemStack.EMPTY;
                                        }
                                        itemStack3.enchant(Enchantments.SHARPNESS, 5);
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt6 = entity;
                                            itemStack4 = _livEnt6.getMainHandItem();
                                        } else {
                                            itemStack4 = ItemStack.EMPTY;
                                        }
                                        itemStack4.enchant(Enchantments.MENDING, 5);
                                    }
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(this.world, 80);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 20);
                }
            }
        }
    }
}
