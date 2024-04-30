package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
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
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class KeLiSiDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v63, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v64, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        LivingEntity livingEntity;
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.05d) {
            if (entity instanceof LivingEntity) {
                Player player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD);
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt) {
                itemStack5 = _livEnt.getMainHandItem();
            } else {
                itemStack5 = ItemStack.EMPTY;
            }
            itemStack5.enchant(Enchantments.SMITE, 4);
            if (entity instanceof LivingEntity _livEnt2) {
                itemStack6 = _livEnt2.getMainHandItem();
            } else {
                itemStack6 = ItemStack.EMPTY;
            }
            itemStack6.enchant(Enchantments.SHARPNESS, 6);
            if (entity instanceof LivingEntity _livEnt3) {
                itemStack7 = _livEnt3.getMainHandItem();
            } else {
                itemStack7 = ItemStack.EMPTY;
            }
            itemStack7.enchant(Enchantments.SWEEPING_EDGE, 4);
            if (entity instanceof LivingEntity _livEnt4) {
                itemStack8 = _livEnt4.getMainHandItem();
            } else {
                itemStack8 = ItemStack.EMPTY;
            }
            itemStack8.enchant(Enchantments.SHARPNESS, 4);
        }
        if (Math.random() <= 0.05d) {
            if (entity instanceof LivingEntity) {
                Player player2 = (LivingEntity) entity;
                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.FUMOMUMEN.get());
                _setstack2.setCount(1);
                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt5) {
                itemStack = _livEnt5.getMainHandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            itemStack.enchant(Enchantments.SMITE, 4);
            if (entity instanceof LivingEntity _livEnt6) {
                itemStack2 = _livEnt6.getMainHandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            itemStack2.enchant(Enchantments.SHARPNESS, 4);
            if (entity instanceof LivingEntity _livEnt7) {
                itemStack3 = _livEnt7.getMainHandItem();
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            itemStack3.enchant(Enchantments.SWEEPING_EDGE, 4);
            if (entity instanceof LivingEntity _livEnt8) {
                itemStack4 = _livEnt8.getMainHandItem();
            } else {
                itemStack4 = ItemStack.EMPTY;
            }
            itemStack4.enchant(Enchantments.SHARPNESS, 4);
        }
        if (Math.random() <= 0.095d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure.1
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

                /* JADX WARN: Type inference failed for: r0v29, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure$1$2] */
                /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure$1$3] */
                /* JADX WARN: Type inference failed for: r0v54, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure$1$1] */
                private void run() {
                    ItemStack itemStack9;
                    ItemStack itemStack10;
                    LivingEntity livingEntity2 = entity;
                    livingEntity2.setYRot(0.0f);
                    livingEntity2.setXRot(180.0f);
                    livingEntity2.setYBodyRot(livingEntity2.getYRot());
                    livingEntity2.setYHeadRot(livingEntity2.getYRot());
                    livingEntity2.yRotO = livingEntity2.getYRot();
                    livingEntity2.xRotO = livingEntity2.getXRot();
                    if (livingEntity2 instanceof LivingEntity) {
                        LivingEntity _entity = livingEntity2;
                        _entity.yBodyRotO = _entity.getYRot();
                        _entity.yHeadRotO = _entity.getYRot();
                    }
                    Entity _shootFrom = entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure.1.1
                            public Projectile getProjectile(Level level, Entity shooter) {
                                ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                thrownEnderpearl.setOwner(shooter);
                                return thrownEnderpearl;
                            }
                        }.getProjectile(projectileLevel, entity);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    if (entity instanceof LivingEntity) {
                        Player player3 = (LivingEntity) entity;
                        ItemStack _setstack3 = new ItemStack(Items.BOW);
                        _setstack3.setCount(1);
                        player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                        if (player3 instanceof Player) {
                            Player _player3 = player3;
                            _player3.getInventory().setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt9 = entity;
                        itemStack9 = _livEnt9.getMainHandItem();
                    } else {
                        itemStack9 = ItemStack.EMPTY;
                    }
                    itemStack9.enchant(Enchantments.POWER_ARROWS, 5);
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt10 = entity;
                        itemStack10 = _livEnt10.getMainHandItem();
                    } else {
                        itemStack10 = ItemStack.EMPTY;
                    }
                    itemStack10.enchant(Enchantments.PUNCH_ARROWS, 5);
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure.1.2
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
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entity2 = entity;
                                if (!_entity2.level.isClientSide()) {
                                    _entity2.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 20);
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure.1.3
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

                        /* JADX WARN: Type inference failed for: r0v49, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure$1$3$1] */
                        private void run() {
                            ItemStack itemStack11;
                            ItemStack itemStack12;
                            Entity _shootFrom2 = entity;
                            Level projectileLevel2 = _shootFrom2.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure.1.3.1
                                    public Projectile getProjectile(Level level, Entity shooter) {
                                        ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                        thrownEnderpearl.setOwner(shooter);
                                        return thrownEnderpearl;
                                    }
                                }.getProjectile(projectileLevel2, entity);
                                _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.0f, 0.0f);
                                projectileLevel2.addFreshEntity(_entityToSpawn2);
                            }
                            if (entity instanceof LivingEntity) {
                                Player player4 = (LivingEntity) entity;
                                ItemStack _setstack4 = new ItemStack(Items.DIAMOND_SWORD);
                                _setstack4.setCount(1);
                                player4.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
                                if (player4 instanceof Player) {
                                    Player _player4 = player4;
                                    _player4.getInventory().setChanged();
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt11 = entity;
                                itemStack11 = _livEnt11.getMainHandItem();
                            } else {
                                itemStack11 = ItemStack.EMPTY;
                            }
                            itemStack11.enchant(Enchantments.SHARPNESS, 5);
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt12 = entity;
                                itemStack12 = _livEnt12.getMainHandItem();
                            } else {
                                itemStack12 = ItemStack.EMPTY;
                            }
                            itemStack12.enchant(Enchantments.MENDING, 5);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 80);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 20);
        }
        if (Math.random() <= 0.07d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure.2
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

                /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure$2$1] */
                private void run() {
                    Entity _shootFrom = entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure.2.1
                            public Projectile getProjectile(Level level, Entity shooter) {
                                ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                thrownEnderpearl.setOwner(shooter);
                                return thrownEnderpearl;
                            }
                        }.getProjectile(projectileLevel, entity);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 20);
        }
        if (Math.random() <= 0.05d) {
            entity.setYRot(0.0f);
            entity.setXRot(180.0f);
            entity.setYBodyRot(entity.getYRot());
            entity.setYHeadRot(entity.getYRot());
            entity.yRotO = entity.getYRot();
            entity.xRotO = entity.getXRot();
            if (entity instanceof LivingEntity _entity) {
                _entity.yBodyRotO = _entity.getYRot();
                _entity.yHeadRotO = _entity.getYRot();
            }
        }
        entity.setSprinting(true);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDangShiTiShouShangShiProcedure.3
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
        if (Math.random() <= 0.38d) {
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
                if (entity2 == livingEntity && (entity instanceof LivingEntity _entity2)) {
                    if (!_entity2.level.isClientSide()) {
                        _entity2.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                    }
                }
            }
        }
        if (Math.random() > 0.32d || !(entity instanceof LivingEntity _entity3)) {
            return;
        }
        if (!_entity3.level.isClientSide()) {
            _entity3.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.TAOTUOBUFF.get(), 1, 1, false, false));
        }
    }
}
