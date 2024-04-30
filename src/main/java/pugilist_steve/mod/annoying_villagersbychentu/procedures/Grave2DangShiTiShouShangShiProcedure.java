package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BaozhabishouEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BishouEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Grave2DangShiTiShouShangShiProcedure {


    /* JADX WARN: Removed duplicated region for block: B:119:0x05c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x005b A[SYNTHETIC] */


    /* JADX WARN: Type inference failed for: r0v108, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$16] */
    /* JADX WARN: Type inference failed for: r0v140, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$15] */
    /* JADX WARN: Type inference failed for: r0v141, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$14] */
    /* JADX WARN: Type inference failed for: r0v151, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$10] */
    /* JADX WARN: Type inference failed for: r0v154, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$11] */
    /* JADX WARN: Type inference failed for: r0v155, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$12] */
    /* JADX WARN: Type inference failed for: r0v183, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$9] */
    /* JADX WARN: Type inference failed for: r0v185, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$7] */
    /* JADX WARN: Type inference failed for: r0v195, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r0v196, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r0v197, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v198, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v199, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v200, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v34, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$13] */
    /* JADX WARN: Type inference failed for: r0v49, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$17] */
    /* JADX WARN: Type inference failed for: r0v95, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$18] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        LivingEntity livingEntity;
        ItemStack itemStack;
        LivingEntity _entity;
        LivingEntity _entity2;
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
            if (entity2 == livingEntity && entity.isAlive()) {
                if (Math.random() <= 0.03d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.1
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

                        /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$1$1] */
                        private void run() {
                            LivingEntity livingEntity2 = entity;
                            livingEntity2.setYRot(0.0f);
                            livingEntity2.setXRot((float) Mth.nextDouble(new Random(), 90.0d, 180.0d));
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
                            Level projectileLevel = _shootFrom.level;
                            if (!projectileLevel.isClientSide()) {
                                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.1.1
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
                    }.start(world, Mth.nextInt(new Random(), 0, 20));
                }
                if (Math.random() <= 0.0098d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.2
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
                            if (!this.world.isClientSide() && this.world.getServer() != null) {
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 我们为生存而战，为保护自己而战！！"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, Mth.nextInt(new Random(), 10, 100));
                }
                if (Math.random() <= 0.0098d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.3
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
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak4")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak4")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, Mth.nextInt(new Random(), 10, 100));
                }
                if (Math.random() <= 0.0098d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.4
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
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak6")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak6")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, Mth.nextInt(new Random(), 10, 100));
                }
                if (Math.random() <= 0.0098d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.5
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
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak5")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak5")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, Mth.nextInt(new Random(), 10, 100));
                }
                if (Math.random() <= 0.0098d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.6
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
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak2")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak2")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, Mth.nextInt(new Random(), 10, 100));
                }
                if (Math.random() <= 0.05d) {
                    entity.setYRot(0.0f);
                    entity.setXRot(180.0f);
                    entity.setYBodyRot(entity.getYRot());
                    entity.setYHeadRot(entity.getYRot());
                    entity.yRotO = entity.getYRot();
                    entity.xRotO = entity.getXRot();
                    if (entity instanceof LivingEntity _entity3) {
                        _entity3.yBodyRotO = _entity3.getYRot();
                        _entity3.yHeadRotO = _entity3.getYRot();
                    }
                    Level projectileLevel = entity.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.7
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
                    if (Math.random() <= 0.05d) {
                        new C05598(entity, x, y, z).start(world, 20);
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.9
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

                        /* JADX WARN: Type inference failed for: r0v22, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$9$1] */
                        private void run() {
                            Entity _shootFrom = entity;
                            Level projectileLevel2 = _shootFrom.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.9.1
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
                                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.SHENG_QI_SHI_ZHI_JIAN.get());
                                _setstack.setCount(1);
                                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                if (player instanceof Player) {
                                    Player _player = player;
                                    _player.getInventory().setChanged();
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 80);
                }
                if (Math.random() <= 0.02d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.10
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

                        /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$10$1] */
                        private void run() {
                            Entity _shootFrom = entity;
                            Level projectileLevel2 = _shootFrom.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.10.1
                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        AbstractArrow entityToSpawn = new BishouEntity(AnnoyingVillagersbychentuModEntities.BISHOU.get(), level);
                                        entityToSpawn.setOwner(shooter);
                                        entityToSpawn.setBaseDamage(damage);
                                        entityToSpawn.setKnockback(knockback);
                                        entityToSpawn.setSilent(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow(projectileLevel2, entity, 11.0f, 5);
                                _entityToSpawn2.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                _entityToSpawn2.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                                projectileLevel2.addFreshEntity(_entityToSpawn2);
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:throw")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:throw")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 1);
                    if (entity instanceof LivingEntity) {
                        Player player = (LivingEntity) entity;
                        ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.BAOZHAXIAODAO.get());
                        _setstack.setCount(1);
                        player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (player instanceof Player) {
                            Player _player = player;
                            _player.getInventory().setChanged();
                        }
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.11
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
                                LivingEntity _entity4 = entity;
                                if (!_entity4.level.isClientSide()) {
                                    _entity4.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 30, 4, false, false));
                                }
                            }
                            Entity _ent = entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:tnt ^ ^4.5 ^1");
                            }
                            if (!this.world.isClientSide() && this.world.getServer() != null) {
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> Die！"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                Player player2 = (LivingEntity) entity;
                                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.XIAODAO.get());
                                _setstack2.setCount(1);
                                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                                if (player2 instanceof Player) {
                                    Player _player2 = player2;
                                    _player2.getInventory().setChanged();
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 10);
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.12
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

                        /* JADX WARN: Type inference failed for: r0v32, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$12$1] */
                        private void run() {
                            Entity _shootFrom = entity;
                            Level projectileLevel2 = _shootFrom.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.12.1
                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        AbstractArrow entityToSpawn = new BishouEntity(AnnoyingVillagersbychentuModEntities.BISHOU.get(), level);
                                        entityToSpawn.setOwner(shooter);
                                        entityToSpawn.setBaseDamage(damage);
                                        entityToSpawn.setKnockback(knockback);
                                        entityToSpawn.setSilent(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow(projectileLevel2, entity, 11.0f, 5);
                                _entityToSpawn2.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                _entityToSpawn2.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                                projectileLevel2.addFreshEntity(_entityToSpawn2);
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:throw")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:throw")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                Player player2 = (LivingEntity) entity;
                                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.SHENG_QI_SHI_ZHI_JIAN.get());
                                _setstack2.setCount(1);
                                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                                if (player2 instanceof Player) {
                                    Player _player2 = player2;
                                    _player2.getInventory().setChanged();
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 20);
                }
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.13
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
                            Player player2 = (LivingEntity) entity;
                            ItemStack _setstack2 = new ItemStack(Items.ENDER_PEARL);
                            _setstack2.setCount(1);
                            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                            if (player2 instanceof Player) {
                                Player _player2 = player2;
                                _player2.getInventory().setChanged();
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 60);
                if (Math.random() <= 0.09d) {
                    entity.setYRot(0.0f);
                    entity.setXRot((float) Mth.nextDouble(new Random(), -90.0d, -180.0d));
                    entity.setYBodyRot(entity.getYRot());
                    entity.setYHeadRot(entity.getYRot());
                    entity.yRotO = entity.getYRot();
                    entity.xRotO = entity.getXRot();
                    if (entity instanceof LivingEntity _entity4) {
                        _entity4.yBodyRotO = _entity4.getYRot();
                        _entity4.yHeadRotO = _entity4.getYRot();
                    }
                    Level projectileLevel2 = entity.level;
                    if (!projectileLevel2.isClientSide()) {
                        Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.14
                            public Projectile getProjectile(Level level, Entity shooter) {
                                ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                thrownEnderpearl.setOwner(shooter);
                                return thrownEnderpearl;
                            }
                        }.getProjectile(projectileLevel2, entity);
                        _entityToSpawn2.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                        _entityToSpawn2.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 2.0f, 0.0f);
                        projectileLevel2.addFreshEntity(_entityToSpawn2);
                    }
                    if (Math.random() <= 0.02d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.15
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

                            /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$15$1] */
                            private void run() {
                                Entity _shootFrom = entity;
                                Level projectileLevel3 = _shootFrom.level;
                                if (!projectileLevel3.isClientSide()) {
                                    Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.15.1
                                        public Projectile getProjectile(Level level, Entity shooter) {
                                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                            thrownEnderpearl.setOwner(shooter);
                                            return thrownEnderpearl;
                                        }
                                    }.getProjectile(projectileLevel3, entity);
                                    _entityToSpawn3.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                    _entityToSpawn3.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                                    projectileLevel3.addFreshEntity(_entityToSpawn3);
                                }
                                Level level = this.world;
                                if (level instanceof Level) {
                                    Level _level = level;
                                    if (!_level.isClientSide()) {
                                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:graveattack")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                    } else {
                                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:graveattack")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, 40);
                    }
                }
                if (entity instanceof LivingEntity _livEnt) {
                    if (_livEnt.hasEffect(MobEffects.POISON)) {
                        if (entity instanceof LivingEntity) {
                            Player player2 = (LivingEntity) entity;
                            ItemStack _setstack2 = new ItemStack(Items.MILK_BUCKET);
                            _setstack2.setCount(1);
                            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                            if (player2 instanceof Player) {
                                Player _player2 = player2;
                                _player2.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            ((LivingEntity) entity).removeAllEffects();
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.16
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
                                    Player player3 = (LivingEntity) entity;
                                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.SHENG_QI_SHI_ZHI_JIAN.get());
                                    _setstack3.setCount(1);
                                    player3.setItemInHand(InteractionHand.OFF_HAND, _setstack3);
                                    if (player3 instanceof Player) {
                                        Player _player3 = player3;
                                        _player3.getInventory().setChanged();
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, 20);
                        if (entity instanceof LivingEntity) {
                            itemStack = ItemStack.EMPTY;
                        } else {
                            LivingEntity _entGetArmor = (LivingEntity) entity;
                            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                        }
                        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.BISHOU.get()) {
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.18
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
                                    Player player3 = entity;
                                    if (player3 instanceof Player) {
                                        Player _player3 = player3;
                                        _player3.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                                        _player3.getInventory().setChanged();
                                    } else if (player3 instanceof LivingEntity) {
                                        LivingEntity _living = player3;
                                        _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                                    }
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(world, 20);
                        }
                        if (Math.random() <= 0.3d && (entity instanceof LivingEntity)) {
                            _entity2 = (LivingEntity) entity;
                            if (!_entity2.level.isClientSide()) {
                                _entity2.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 25, 1, false, false));
                            }
                        }
                        if (Math.random() <= 0.35d && (entity instanceof LivingEntity)) {
                            _entity = (LivingEntity) entity;
                            if (!_entity.level.isClientSide()) {
                                _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.TAOTUOBUFF.get(), 1, 1, false, false));
                            }
                        }
                        if (Math.random() > 0.01d) {
                            new C053719(entity, x, y, z).start(world, Mth.nextInt(new Random(), 25, 60));
                        }
                    }
                }
                if (entity instanceof LivingEntity _livEnt2) {
                    if (_livEnt2.hasEffect(AnnoyingVillagersbychentuModMobEffects.HEROBRINE.get())) {
                        if (entity instanceof LivingEntity) {
                            ((LivingEntity) entity).removeAllEffects();
                        }
                        if (entity instanceof LivingEntity) {
                            Player player3 = (LivingEntity) entity;
                            ItemStack _setstack3 = new ItemStack(Items.MILK_BUCKET);
                            _setstack3.setCount(1);
                            player3.setItemInHand(InteractionHand.OFF_HAND, _setstack3);
                            if (player3 instanceof Player) {
                                Player _player3 = player3;
                                _player3.getInventory().setChanged();
                            }
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.17
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
                                    Player player4 = (LivingEntity) entity;
                                    ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.SHENG_QI_SHI_ZHI_JIAN.get());
                                    _setstack4.setCount(1);
                                    player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                                    if (player4 instanceof Player) {
                                        Player _player4 = player4;
                                        _player4.getInventory().setChanged();
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, 20);
                    }
                }
                if (entity instanceof LivingEntity) {
                }
                if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.BISHOU.get()) {
                }
                if (Math.random() <= 0.3d) {
                    _entity2 = (LivingEntity) entity;
                    if (!_entity2.level.isClientSide()) {
                    }
                }
                if (Math.random() <= 0.35d) {
                    _entity = (LivingEntity) entity;
                    if (!_entity.level.isClientSide()) {
                    }
                }
                if (Math.random() > 0.01d) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C05598 {
        final Entity val$entity;
        final double val$x;
        final double val$y;
        final double val$z;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C05598(Entity entity, double d, double d2, double d3) {
            this.val$entity = entity;
            this.val$x = d;
            this.val$y = d2;
            this.val$z = d3;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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

        /* JADX WARN: Type inference failed for: r0v53, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$8$1] */
        private void run() {
            ItemStack itemStack;
            ItemStack itemStack2;
            LivingEntity livingEntity = this.val$entity;
            livingEntity.setYRot(0.0f);
            livingEntity.setXRot(180.0f);
            livingEntity.setYBodyRot(livingEntity.getYRot());
            livingEntity.setYHeadRot(livingEntity.getYRot());
            livingEntity.yRotO = livingEntity.getYRot();
            livingEntity.xRotO = livingEntity.getXRot();
            if (livingEntity instanceof LivingEntity) {
                LivingEntity _entity = livingEntity;
                _entity.yBodyRotO = _entity.getYRot();
                _entity.yHeadRotO = _entity.getYRot();
            }
            Entity _shootFrom = this.val$entity;
            Level projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.8.1
                    public Projectile getProjectile(Level level, Entity shooter) {
                        ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                        thrownEnderpearl.setOwner(shooter);
                        return thrownEnderpearl;
                    }
                }.getProjectile(projectileLevel, this.val$entity);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
            if (this.val$entity instanceof LivingEntity) {
                Player player = (LivingEntity) this.val$entity;
                ItemStack _setstack = new ItemStack(Items.BOW);
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
            if (this.val$entity instanceof LivingEntity) {
                LivingEntity _livEnt = this.val$entity;
                itemStack = _livEnt.getMainHandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            itemStack.enchant(Enchantments.POWER_ARROWS, 9);
            if (this.val$entity instanceof LivingEntity) {
                LivingEntity _livEnt2 = this.val$entity;
                itemStack2 = _livEnt2.getMainHandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            itemStack2.enchant(Enchantments.PUNCH_ARROWS, 5);
            new C05612().start(this.world, 20);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C05612 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C05612() {
            }

            public void start(LevelAccessor world, int waitTicks) {
                this.waitTicks = waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world;
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

            /* JADX INFO: Access modifiers changed from: package-private */

            private void run() {
                new C05621().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            public class C05621 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C05621() {
                }

                public void start(LevelAccessor world, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world;
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

                /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$8$2$1$2] */
                /* JADX WARN: Type inference failed for: r0v20, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$8$2$1$1] */
                private void run() {
                    Entity _shootFrom = C05598.this.val$entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.8.2.1.1
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                Arrow arrow = new Arrow(EntityType.ARROW, level);
                                arrow.setOwner(shooter);
                                arrow.setBaseDamage(damage);
                                arrow.setKnockback(knockback);
                                arrow.setPierceLevel(piercing);
                                arrow.setCritArrow(true);
                                return arrow;
                            }
                        }.getArrow(projectileLevel, C05598.this.val$entity, 5.0f, 1, (byte) 1);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.5f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(C05598.this.val$x, C05598.this.val$y, C05598.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(C05598.this.val$x, C05598.this.val$y, C05598.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f, false);
                        }
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.8.2.1.2
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        public void start(LevelAccessor world, int waitTicks) {
                            this.waitTicks = waitTicks;
                            MinecraftForge.EVENT_BUS.register(this);
                            this.world = world;
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

                        /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$8$2$1$2$2] */
                        /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$8$2$1$2$1] */
                        private void run() {
                            Entity _shootFrom2 = C05598.this.val$entity;
                            Level projectileLevel2 = _shootFrom2.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.8.2.1.2.1
                                    public Projectile getArrow(Level level2, Entity shooter, float damage, int knockback, byte piercing) {
                                        Arrow arrow = new Arrow(EntityType.ARROW, level2);
                                        arrow.setOwner(shooter);
                                        arrow.setBaseDamage(damage);
                                        arrow.setKnockback(knockback);
                                        arrow.setPierceLevel(piercing);
                                        arrow.setCritArrow(true);
                                        return arrow;
                                    }
                                }.getArrow(projectileLevel2, C05598.this.val$entity, 5.0f, 1, (byte) 1);
                                _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.5f, 0.0f);
                                projectileLevel2.addFreshEntity(_entityToSpawn2);
                            }
                            Level level2 = this.world;
                            if (level2 instanceof Level) {
                                Level _level2 = level2;
                                if (!_level2.isClientSide()) {
                                    _level2.playSound(null, new BlockPos(C05598.this.val$x, C05598.this.val$y, C05598.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f);
                                } else {
                                    _level2.playLocalSound(C05598.this.val$x, C05598.this.val$y, C05598.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f, false);
                                }
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.8.2.1.2.2
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                public void start(LevelAccessor world, int waitTicks) {
                                    this.waitTicks = waitTicks;
                                    MinecraftForge.EVENT_BUS.register(this);
                                    this.world = world;
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

                                /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$8$2$1$2$2$1] */
                                private void run() {
                                    Entity _shootFrom3 = C05598.this.val$entity;
                                    Level projectileLevel3 = _shootFrom3.level;
                                    if (!projectileLevel3.isClientSide()) {
                                        Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.8.2.1.2.2.1
                                            public Projectile getArrow(Level level3, Entity shooter, float damage, int knockback, byte piercing) {
                                                Arrow arrow = new Arrow(EntityType.ARROW, level3);
                                                arrow.setOwner(shooter);
                                                arrow.setBaseDamage(damage);
                                                arrow.setKnockback(knockback);
                                                arrow.setPierceLevel(piercing);
                                                arrow.setCritArrow(true);
                                                return arrow;
                                            }
                                        }.getArrow(projectileLevel3, C05598.this.val$entity, 5.0f, 1, (byte) 1);
                                        _entityToSpawn3.setPos(_shootFrom3.getX(), _shootFrom3.getEyeY() - 0.1d, _shootFrom3.getZ());
                                        _entityToSpawn3.shoot(_shootFrom3.getLookAngle().x, _shootFrom3.getLookAngle().y, _shootFrom3.getLookAngle().z, 2.5f, 0.0f);
                                        projectileLevel3.addFreshEntity(_entityToSpawn3);
                                    }
                                    Level level3 = this.world;
                                    if (level3 instanceof Level) {
                                        Level _level3 = level3;
                                        if (!_level3.isClientSide()) {
                                            _level3.playSound(null, new BlockPos(C05598.this.val$x, C05598.this.val$y, C05598.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f);
                                        } else {
                                            _level3.playLocalSound(C05598.this.val$x, C05598.this.val$y, C05598.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f, false);
                                        }
                                    }
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(this.world, 20);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 20);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C053719 {
        final Entity val$entity;
        final double val$x;
        final double val$y;
        final double val$z;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C053719(Entity entity, double d, double d2, double d3) {
            this.val$entity = entity;
            this.val$x = d;
            this.val$y = d2;
            this.val$z = d3;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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

        /* JADX WARN: Type inference failed for: r0v28, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$1] */
        private void run() {
            Entity _shootFrom = this.val$entity;
            Level projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.1
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        entityToSpawn.setCritArrow(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel, this.val$entity, 0.0f, 1);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
            if (!this.world.isClientSide() && this.world.getServer() != null) {
                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> Die！"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            new C05392().start(this.world, Mth.nextInt(new Random(), 25, 60));
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C05392 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C05392() {
            }

            public void start(LevelAccessor world, int waitTicks) {
                this.waitTicks = waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world;
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

            /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$2$1] */
            private void run() {
                Entity _shootFrom = C053719.this.val$entity;
                Level projectileLevel = _shootFrom.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.2.1
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            entityToSpawn.setCritArrow(true);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel, C053719.this.val$entity, 0.0f, 1);
                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
                new C05412().start(this.world, Mth.nextInt(new Random(), 25, 60));
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C05412 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C05412() {
                }

                public void start(LevelAccessor world, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world;
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

                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$2$2$1] */
                private void run() {
                    Entity _shootFrom = C053719.this.val$entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.2.2.1
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                entityToSpawn.setOwner(shooter);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setCritArrow(true);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel, C053719.this.val$entity, 0.0f, 1);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    new C05432().start(this.world, Mth.nextInt(new Random(), 25, 60));
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C05432 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C05432() {
                    }

                    public void start(LevelAccessor world, int waitTicks) {
                        this.waitTicks = waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world;
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

                    /* JADX WARN: Type inference failed for: r0v11, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$2$2$2$1] */
                    private void run() {
                        Entity _shootFrom = C053719.this.val$entity;
                        Level projectileLevel = _shootFrom.level;
                        if (!projectileLevel.isClientSide()) {
                            Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.2.2.2.1
                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                    entityToSpawn.setOwner(shooter);
                                    entityToSpawn.setBaseDamage(damage);
                                    entityToSpawn.setKnockback(knockback);
                                    entityToSpawn.setSilent(true);
                                    entityToSpawn.setCritArrow(true);
                                    return entityToSpawn;
                                }
                            }.getArrow(projectileLevel, C053719.this.val$entity, 0.0f, 1);
                            _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                            projectileLevel.addFreshEntity(_entityToSpawn);
                        }
                        new C05452().start(this.world, Mth.nextInt(new Random(), 25, 60));
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C05452 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C05452() {
                        }

                        public void start(LevelAccessor world, int waitTicks) {
                            this.waitTicks = waitTicks;
                            MinecraftForge.EVENT_BUS.register(this);
                            this.world = world;
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

                        /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$2$2$2$2$1] */
                        private void run() {
                            Entity _shootFrom = C053719.this.val$entity;
                            Level projectileLevel = _shootFrom.level;
                            if (!projectileLevel.isClientSide()) {
                                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.2.2.2.2.1
                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                        entityToSpawn.setOwner(shooter);
                                        entityToSpawn.setBaseDamage(damage);
                                        entityToSpawn.setKnockback(knockback);
                                        entityToSpawn.setSilent(true);
                                        entityToSpawn.setCritArrow(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow(projectileLevel, C053719.this.val$entity, 0.0f, 1);
                                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                                projectileLevel.addFreshEntity(_entityToSpawn);
                            }
                            new C05472().start(this.world, Mth.nextInt(new Random(), 25, 60));
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C05472 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C05472() {
                            }

                            public void start(LevelAccessor world, int waitTicks) {
                                this.waitTicks = waitTicks;
                                MinecraftForge.EVENT_BUS.register(this);
                                this.world = world;
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

                            /* JADX WARN: Type inference failed for: r0v11, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$2$2$2$2$2$2] */
                            /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$2$2$2$2$2$1] */
                            private void run() {
                                Entity _shootFrom = C053719.this.val$entity;
                                Level projectileLevel = _shootFrom.level;
                                if (!projectileLevel.isClientSide()) {
                                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.2.2.2.2.2.1
                                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                            AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                            entityToSpawn.setOwner(shooter);
                                            entityToSpawn.setBaseDamage(damage);
                                            entityToSpawn.setKnockback(knockback);
                                            entityToSpawn.setSilent(true);
                                            entityToSpawn.setCritArrow(true);
                                            return entityToSpawn;
                                        }
                                    }.getArrow(projectileLevel, C053719.this.val$entity, 0.0f, 1);
                                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                                    projectileLevel.addFreshEntity(_entityToSpawn);
                                }
                                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.2.2.2.2.2.2
                                    private int ticks = 0;
                                    private float waitTicks;
                                    private LevelAccessor world;

                                    public void start(LevelAccessor world, int waitTicks) {
                                        this.waitTicks = waitTicks;
                                        MinecraftForge.EVENT_BUS.register(this);
                                        this.world = world;
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

                                    /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$2$2$2$2$2$2$2] */
                                    /* JADX WARN: Type inference failed for: r0v14, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$2$2$2$2$2$2$1] */
                                    private void run() {
                                        Entity _shootFrom2 = C053719.this.val$entity;
                                        Level projectileLevel2 = _shootFrom2.level;
                                        if (!projectileLevel2.isClientSide()) {
                                            Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.2.2.2.2.2.2.1
                                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                                    AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                                    entityToSpawn.setOwner(shooter);
                                                    entityToSpawn.setBaseDamage(damage);
                                                    entityToSpawn.setKnockback(knockback);
                                                    entityToSpawn.setSilent(true);
                                                    entityToSpawn.setCritArrow(true);
                                                    return entityToSpawn;
                                                }
                                            }.getArrow(projectileLevel2, C053719.this.val$entity, 0.0f, 1);
                                            _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                            _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 1.5f, 0.0f);
                                            projectileLevel2.addFreshEntity(_entityToSpawn2);
                                        }
                                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.2.2.2.2.2.2.2
                                            private int ticks = 0;
                                            private float waitTicks;
                                            private LevelAccessor world;

                                            public void start(LevelAccessor world, int waitTicks) {
                                                this.waitTicks = waitTicks;
                                                MinecraftForge.EVENT_BUS.register(this);
                                                this.world = world;
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

                                            /* JADX WARN: Type inference failed for: r0v34, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure$19$2$2$2$2$2$2$2$1] */
                                            private void run() {
                                                Entity _shootFrom3 = C053719.this.val$entity;
                                                Level projectileLevel3 = _shootFrom3.level;
                                                if (!projectileLevel3.isClientSide()) {
                                                    Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiShouShangShiProcedure.19.2.2.2.2.2.2.2.1
                                                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                                            AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                                            entityToSpawn.setOwner(shooter);
                                                            entityToSpawn.setBaseDamage(damage);
                                                            entityToSpawn.setKnockback(knockback);
                                                            entityToSpawn.setSilent(true);
                                                            entityToSpawn.setCritArrow(true);
                                                            return entityToSpawn;
                                                        }
                                                    }.getArrow(projectileLevel3, C053719.this.val$entity, 0.0f, 1);
                                                    _entityToSpawn3.setPos(_shootFrom3.getX(), _shootFrom3.getEyeY() - 0.1d, _shootFrom3.getZ());
                                                    _entityToSpawn3.shoot(_shootFrom3.getLookAngle().x, _shootFrom3.getLookAngle().y, _shootFrom3.getLookAngle().z, 1.5f, 0.0f);
                                                    projectileLevel3.addFreshEntity(_entityToSpawn3);
                                                }
                                                if (!this.world.isClientSide() && this.world.getServer() != null) {
                                                    this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> Die！"), ChatType.SYSTEM, Util.NIL_UUID);
                                                }
                                                Level level = this.world;
                                                if (level instanceof Level) {
                                                    Level _level = level;
                                                    if (!_level.isClientSide()) {
                                                        _level.playSound(null, new BlockPos(C053719.this.val$x, C053719.this.val$y, C053719.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                    } else {
                                                        _level.playLocalSound(C053719.this.val$x, C053719.this.val$y, C053719.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                                    }
                                                }
                                                MinecraftForge.EVENT_BUS.unregister(this);
                                            }
                                        }.start(this.world, Mth.nextInt(new Random(), 25, 60));
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }
                                }.start(this.world, Mth.nextInt(new Random(), 25, 60));
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }
                    }
                }
            }
        }
    }
}
