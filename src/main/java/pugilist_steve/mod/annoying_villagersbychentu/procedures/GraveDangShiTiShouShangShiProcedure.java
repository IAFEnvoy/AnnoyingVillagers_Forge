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


public class GraveDangShiTiShouShangShiProcedure {


    /* JADX WARN: Removed duplicated region for block: B:134:0x0690 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x005b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v105, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$18] */
    /* JADX WARN: Type inference failed for: r0v118, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$16] */
    /* JADX WARN: Type inference failed for: r0v150, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$15] */
    /* JADX WARN: Type inference failed for: r0v151, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$14] */
    /* JADX WARN: Type inference failed for: r0v191, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$10] */
    /* JADX WARN: Type inference failed for: r0v194, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$11] */
    /* JADX WARN: Type inference failed for: r0v195, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$12] */
    /* JADX WARN: Type inference failed for: r0v223, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$9] */
    /* JADX WARN: Type inference failed for: r0v225, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$7] */
    /* JADX WARN: Type inference failed for: r0v235, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r0v236, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r0v237, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v238, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v239, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v240, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v32, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$13] */
    /* JADX WARN: Type inference failed for: r0v59, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$17] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        LivingEntity livingEntity;
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
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
            if (entity2 == livingEntity) {
                if (Math.random() <= 0.03d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.1
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

                        /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$1$1] */
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
                                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.1.1
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
                if (Math.random() <= 0.004d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.2
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
                if (Math.random() <= 0.002d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.3
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
                if (Math.random() <= 0.006d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.4
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
                if (Math.random() <= 0.005d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.5
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
                if (Math.random() <= 0.0065d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.6
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
                if (Math.random() <= 0.08d) {
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
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.7
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
                    if (Math.random() <= 0.095d) {
                        new C06328(entity, x, y, z).start(world, 20);
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.9
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

                        /* JADX WARN: Type inference failed for: r0v52, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$9$1] */
                        private void run() {
                            ItemStack itemStack4;
                            ItemStack itemStack5;
                            ItemStack itemStack6;
                            Entity _shootFrom = entity;
                            Level projectileLevel2 = _shootFrom.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.9.1
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
                                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_JIAN.get());
                                _setstack.setCount(1);
                                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                if (player instanceof Player) {
                                    Player _player = player;
                                    _player.getInventory().setChanged();
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = entity;
                                itemStack4 = _livEnt.getMainHandItem();
                            } else {
                                itemStack4 = ItemStack.EMPTY;
                            }
                            itemStack4.enchant(Enchantments.SHARPNESS, 5);
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt2 = entity;
                                itemStack5 = _livEnt2.getMainHandItem();
                            } else {
                                itemStack5 = ItemStack.EMPTY;
                            }
                            itemStack5.enchant(Enchantments.MENDING, 5);
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt3 = entity;
                                itemStack6 = _livEnt3.getMainHandItem();
                            } else {
                                itemStack6 = ItemStack.EMPTY;
                            }
                            itemStack6.enchant(Enchantments.UNBREAKING, 4);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 80);
                }
                if (Math.random() <= 0.02d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.10
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

                        /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$10$1] */
                        private void run() {
                            Entity _shootFrom = entity;
                            Level projectileLevel2 = _shootFrom.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.10.1
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
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.11
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
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
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
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.12
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

                        /* JADX WARN: Type inference failed for: r0v42, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$12$1] */
                        private void run() {
                            ItemStack itemStack4;
                            Entity _shootFrom = entity;
                            Level projectileLevel2 = _shootFrom.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.12.1
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
                                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_JIAN.get());
                                _setstack2.setCount(1);
                                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                                if (player2 instanceof Player) {
                                    Player _player2 = player2;
                                    _player2.getInventory().setChanged();
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt = entity;
                                itemStack4 = _livEnt.getMainHandItem();
                            } else {
                                itemStack4 = ItemStack.EMPTY;
                            }
                            itemStack4.enchant(Enchantments.SHARPNESS, 4);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 20);
                }
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.13
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
                if (entity instanceof LivingEntity) {
                    Player player2 = (LivingEntity) entity;
                    ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.GRAVEZSCJ.get());
                    _setstack2.setCount(1);
                    player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                    if (player2 instanceof Player) {
                        Player _player2 = player2;
                        _player2.getInventory().setChanged();
                    }
                }
                if (entity instanceof LivingEntity) {
                    Player player3 = (LivingEntity) entity;
                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_JIAN.get());
                    _setstack3.setCount(1);
                    player3.setItemInHand(InteractionHand.OFF_HAND, _setstack3);
                    if (player3 instanceof Player) {
                        Player _player3 = player3;
                        _player3.getInventory().setChanged();
                    }
                }
                if (entity instanceof LivingEntity _livEnt) {
                    itemStack = _livEnt.getOffhandItem();
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                itemStack.enchant(Enchantments.SHARPNESS, 5);
                if (entity instanceof LivingEntity _livEnt2) {
                    itemStack2 = _livEnt2.getOffhandItem();
                } else {
                    itemStack2 = ItemStack.EMPTY;
                }
                itemStack2.enchant(Enchantments.UNBREAKING, 4);
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
                        Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.14
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
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.15
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

                            /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$15$1] */
                            private void run() {
                                Entity _shootFrom = entity;
                                Level projectileLevel3 = _shootFrom.level;
                                if (!projectileLevel3.isClientSide()) {
                                    Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.15.1
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
                if (entity instanceof LivingEntity _livEnt3) {
                    if (_livEnt3.hasEffect(MobEffects.POISON)) {
                        if (entity instanceof LivingEntity) {
                            Player player4 = (LivingEntity) entity;
                            ItemStack _setstack4 = new ItemStack(Items.MILK_BUCKET);
                            _setstack4.setCount(1);
                            player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                            if (player4 instanceof Player) {
                                Player _player4 = player4;
                                _player4.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            ((LivingEntity) entity).removeAllEffects();
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.16
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
                                    Player player5 = (LivingEntity) entity;
                                    ItemStack _setstack5 = new ItemStack(AnnoyingVillagersbychentuModItems.GRAVEZSCJ.get());
                                    _setstack5.setCount(1);
                                    player5.setItemInHand(InteractionHand.OFF_HAND, _setstack5);
                                    if (player5 instanceof Player) {
                                        Player _player5 = player5;
                                        _player5.getInventory().setChanged();
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, 20);
                        if (entity instanceof LivingEntity) {
                            itemStack3 = ItemStack.EMPTY;
                        } else {
                            LivingEntity _entGetArmor = (LivingEntity) entity;
                            itemStack3 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                        }
                        if (itemStack3.getItem() == AnnoyingVillagersbychentuModItems.BISHOU.get()) {
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.18
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
                                    Player player5 = entity;
                                    if (player5 instanceof Player) {
                                        Player _player5 = player5;
                                        _player5.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                                        _player5.getInventory().setChanged();
                                    } else if (player5 instanceof LivingEntity) {
                                        LivingEntity _living = player5;
                                        _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                                    }
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(world, 20);
                        }
                        if (Math.random() <= 0.42d && (entity instanceof LivingEntity)) {
                            _entity2 = (LivingEntity) entity;
                            if (!_entity2.level.isClientSide()) {
                                _entity2.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                            }
                        }
                        if (Math.random() <= 0.36d && (entity instanceof LivingEntity)) {
                            _entity = (LivingEntity) entity;
                            if (!_entity.level.isClientSide()) {
                                _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.TAOTUOBUFF.get(), 1, 1, false, false));
                            }
                        }
                        if (Math.random() > 0.015d) {
                            new C060819(entity, x, y, z).start(world, Mth.nextInt(new Random(), 25, 60));
                        }
                    }
                }
                if (entity instanceof LivingEntity _livEnt4) {
                    if (_livEnt4.hasEffect(AnnoyingVillagersbychentuModMobEffects.HEROBRINE.get())) {
                        if (entity instanceof LivingEntity) {
                            ((LivingEntity) entity).removeAllEffects();
                        }
                        if (entity instanceof LivingEntity) {
                            Player player5 = (LivingEntity) entity;
                            ItemStack _setstack5 = new ItemStack(Items.MILK_BUCKET);
                            _setstack5.setCount(1);
                            player5.setItemInHand(InteractionHand.OFF_HAND, _setstack5);
                            if (player5 instanceof Player) {
                                Player _player5 = player5;
                                _player5.getInventory().setChanged();
                            }
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.17
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
                                    Player player6 = (LivingEntity) entity;
                                    ItemStack _setstack6 = new ItemStack(AnnoyingVillagersbychentuModItems.GRAVEZSCJ.get());
                                    _setstack6.setCount(1);
                                    player6.setItemInHand(InteractionHand.OFF_HAND, _setstack6);
                                    if (player6 instanceof Player) {
                                        Player _player6 = player6;
                                        _player6.getInventory().setChanged();
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, 20);
                    }
                }
                if (entity instanceof LivingEntity) {
                }
                if (itemStack3.getItem() == AnnoyingVillagersbychentuModItems.BISHOU.get()) {
                }
                if (Math.random() <= 0.42d) {
                    _entity2 = (LivingEntity) entity;
                    if (!_entity2.level.isClientSide()) {
                    }
                }
                if (Math.random() <= 0.36d) {
                    _entity = (LivingEntity) entity;
                    if (!_entity.level.isClientSide()) {
                    }
                }
                if (Math.random() > 0.015d) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C06328 {
        final Entity val$entity;
        final double val$x;
        final double val$y;
        final double val$z;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C06328(Entity entity, double d, double d2, double d3) {
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

        /* JADX WARN: Type inference failed for: r0v53, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$8$1] */
        private void run() {
            ItemStack itemStack;
            ItemStack itemStack2;
            LivingEntity livingEntity = this.val$entity;
            livingEntity.setYRot(0.0f);
            livingEntity.setXRot(170.0f);
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
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.8.1
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
            new C06342().start(this.world, 20);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C06342 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C06342() {
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

            private void run() {
                if (C06328.this.val$entity instanceof LivingEntity) {
                    LivingEntity _entity = C06328.this.val$entity;
                    if (!_entity.level.isClientSide()) {
                        _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
                    }
                }
                new C06351().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C06351 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C06351() {
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

                /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$8$2$1$2] */
                /* JADX WARN: Type inference failed for: r0v20, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$8$2$1$1] */
                private void run() {
                    Entity _shootFrom = C06328.this.val$entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.8.2.1.1
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                Arrow arrow = new Arrow(EntityType.ARROW, level);
                                arrow.setOwner(shooter);
                                arrow.setBaseDamage(damage);
                                arrow.setKnockback(knockback);
                                arrow.setPierceLevel(piercing);
                                arrow.setCritArrow(true);
                                return arrow;
                            }
                        }.getArrow(projectileLevel, C06328.this.val$entity, 5.0f, 1, (byte) 1);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.5f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(C06328.this.val$x, C06328.this.val$y, C06328.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(C06328.this.val$x, C06328.this.val$y, C06328.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f, false);
                        }
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.8.2.1.2
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

                        /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$8$2$1$2$2] */
                        /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$8$2$1$2$1] */
                        private void run() {
                            Entity _shootFrom2 = C06328.this.val$entity;
                            Level projectileLevel2 = _shootFrom2.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.8.2.1.2.1
                                    public Projectile getArrow(Level level2, Entity shooter, float damage, int knockback, byte piercing) {
                                        Arrow arrow = new Arrow(EntityType.ARROW, level2);
                                        arrow.setOwner(shooter);
                                        arrow.setBaseDamage(damage);
                                        arrow.setKnockback(knockback);
                                        arrow.setPierceLevel(piercing);
                                        arrow.setCritArrow(true);
                                        return arrow;
                                    }
                                }.getArrow(projectileLevel2, C06328.this.val$entity, 5.0f, 1, (byte) 1);
                                _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.5f, 0.0f);
                                projectileLevel2.addFreshEntity(_entityToSpawn2);
                            }
                            Level level2 = this.world;
                            if (level2 instanceof Level) {
                                Level _level2 = level2;
                                if (!_level2.isClientSide()) {
                                    _level2.playSound(null, new BlockPos(C06328.this.val$x, C06328.this.val$y, C06328.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f);
                                } else {
                                    _level2.playLocalSound(C06328.this.val$x, C06328.this.val$y, C06328.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f, false);
                                }
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.8.2.1.2.2
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

                                /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$8$2$1$2$2$1] */
                                private void run() {
                                    Entity _shootFrom3 = C06328.this.val$entity;
                                    Level projectileLevel3 = _shootFrom3.level;
                                    if (!projectileLevel3.isClientSide()) {
                                        Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.8.2.1.2.2.1
                                            public Projectile getArrow(Level level3, Entity shooter, float damage, int knockback, byte piercing) {
                                                Arrow arrow = new Arrow(EntityType.ARROW, level3);
                                                arrow.setOwner(shooter);
                                                arrow.setBaseDamage(damage);
                                                arrow.setKnockback(knockback);
                                                arrow.setPierceLevel(piercing);
                                                arrow.setCritArrow(true);
                                                return arrow;
                                            }
                                        }.getArrow(projectileLevel3, C06328.this.val$entity, 5.0f, 1, (byte) 1);
                                        _entityToSpawn3.setPos(_shootFrom3.getX(), _shootFrom3.getEyeY() - 0.1d, _shootFrom3.getZ());
                                        _entityToSpawn3.shoot(_shootFrom3.getLookAngle().x, _shootFrom3.getLookAngle().y, _shootFrom3.getLookAngle().z, 2.5f, 0.0f);
                                        projectileLevel3.addFreshEntity(_entityToSpawn3);
                                    }
                                    Level level3 = this.world;
                                    if (level3 instanceof Level) {
                                        Level _level3 = level3;
                                        if (!_level3.isClientSide()) {
                                            _level3.playSound(null, new BlockPos(C06328.this.val$x, C06328.this.val$y, C06328.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f);
                                        } else {
                                            _level3.playLocalSound(C06328.this.val$x, C06328.this.val$y, C06328.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f, false);
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


    public class C060819 {
        final Entity val$entity;
        final double val$x;
        final double val$y;
        final double val$z;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C060819(Entity entity, double d, double d2, double d3) {
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

        /* JADX WARN: Type inference failed for: r0v28, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$1] */
        private void run() {
            Entity _shootFrom = this.val$entity;
            Level projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.1
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
            new C06102().start(this.world, Mth.nextInt(new Random(), 25, 60));
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C06102 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C06102() {
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

            /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$1] */
            private void run() {
                Entity _shootFrom = C060819.this.val$entity;
                Level projectileLevel = _shootFrom.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.1
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            entityToSpawn.setCritArrow(true);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel, C060819.this.val$entity, 0.0f, 1);
                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
                new C06122().start(this.world, Mth.nextInt(new Random(), 25, 60));
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C06122 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C06122() {
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

                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$2$1] */
                private void run() {
                    Entity _shootFrom = C060819.this.val$entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.2.1
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                entityToSpawn.setOwner(shooter);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setCritArrow(true);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel, C060819.this.val$entity, 0.0f, 1);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    new C06142().start(this.world, Mth.nextInt(new Random(), 25, 60));
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C06142 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C06142() {
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

                    /* JADX WARN: Type inference failed for: r0v11, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$2$2$1] */
                    private void run() {
                        Entity _shootFrom = C060819.this.val$entity;
                        Level projectileLevel = _shootFrom.level;
                        if (!projectileLevel.isClientSide()) {
                            Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.2.2.1
                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                    entityToSpawn.setOwner(shooter);
                                    entityToSpawn.setBaseDamage(damage);
                                    entityToSpawn.setKnockback(knockback);
                                    entityToSpawn.setSilent(true);
                                    entityToSpawn.setCritArrow(true);
                                    return entityToSpawn;
                                }
                            }.getArrow(projectileLevel, C060819.this.val$entity, 0.0f, 1);
                            _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                            projectileLevel.addFreshEntity(_entityToSpawn);
                        }
                        new C06162().start(this.world, Mth.nextInt(new Random(), 25, 60));
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C06162 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C06162() {
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

                        /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$2$2$2$1] */
                        private void run() {
                            Entity _shootFrom = C060819.this.val$entity;
                            Level projectileLevel = _shootFrom.level;
                            if (!projectileLevel.isClientSide()) {
                                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.2.2.2.1
                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                        entityToSpawn.setOwner(shooter);
                                        entityToSpawn.setBaseDamage(damage);
                                        entityToSpawn.setKnockback(knockback);
                                        entityToSpawn.setSilent(true);
                                        entityToSpawn.setCritArrow(true);
                                        return entityToSpawn;
                                    }
                                }.getArrow(projectileLevel, C060819.this.val$entity, 0.0f, 1);
                                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                                projectileLevel.addFreshEntity(_entityToSpawn);
                            }
                            new C06182().start(this.world, Mth.nextInt(new Random(), 25, 60));
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C06182 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C06182() {
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

                            /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$2$2$2$2$1] */
                            private void run() {
                                Entity _shootFrom = C060819.this.val$entity;
                                Level projectileLevel = _shootFrom.level;
                                if (!projectileLevel.isClientSide()) {
                                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.2.2.2.2.1
                                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                            AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                            entityToSpawn.setOwner(shooter);
                                            entityToSpawn.setBaseDamage(damage);
                                            entityToSpawn.setKnockback(knockback);
                                            entityToSpawn.setSilent(true);
                                            entityToSpawn.setCritArrow(true);
                                            return entityToSpawn;
                                        }
                                    }.getArrow(projectileLevel, C060819.this.val$entity, 0.0f, 1);
                                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                                    projectileLevel.addFreshEntity(_entityToSpawn);
                                }
                                new C06202().start(this.world, Mth.nextInt(new Random(), 25, 60));
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */


                            public class C06202 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C06202() {
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

                                /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$2$2$2$2$2$2] */
                                /* JADX WARN: Type inference failed for: r0v14, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$2$2$2$2$2$1] */
                                private void run() {
                                    Entity _shootFrom = C060819.this.val$entity;
                                    Level projectileLevel = _shootFrom.level;
                                    if (!projectileLevel.isClientSide()) {
                                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.2.2.2.2.2.1
                                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                                AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                                entityToSpawn.setOwner(shooter);
                                                entityToSpawn.setBaseDamage(damage);
                                                entityToSpawn.setKnockback(knockback);
                                                entityToSpawn.setSilent(true);
                                                entityToSpawn.setCritArrow(true);
                                                return entityToSpawn;
                                            }
                                        }.getArrow(projectileLevel, C060819.this.val$entity, 0.0f, 1);
                                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.5f, 0.0f);
                                        projectileLevel.addFreshEntity(_entityToSpawn);
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.2.2.2.2.2.2
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

                                        /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$2$2$2$2$2$2$2] */
                                        /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$2$2$2$2$2$2$1] */
                                        private void run() {
                                            Entity _shootFrom2 = C060819.this.val$entity;
                                            Level projectileLevel2 = _shootFrom2.level;
                                            if (!projectileLevel2.isClientSide()) {
                                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.2.2.2.2.2.2.1
                                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                                        AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                                        entityToSpawn.setOwner(shooter);
                                                        entityToSpawn.setBaseDamage(damage);
                                                        entityToSpawn.setKnockback(knockback);
                                                        entityToSpawn.setSilent(true);
                                                        entityToSpawn.setCritArrow(true);
                                                        return entityToSpawn;
                                                    }
                                                }.getArrow(projectileLevel2, C060819.this.val$entity, 0.0f, 1);
                                                _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                                _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 1.5f, 0.0f);
                                                projectileLevel2.addFreshEntity(_entityToSpawn2);
                                            }
                                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.2.2.2.2.2.2.2
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

                                                /* JADX WARN: Type inference failed for: r0v35, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure$19$2$2$2$2$2$2$2$2$1] */
                                                private void run() {
                                                    Entity _shootFrom3 = C060819.this.val$entity;
                                                    Level projectileLevel3 = _shootFrom3.level;
                                                    if (!projectileLevel3.isClientSide()) {
                                                        Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangShiTiShouShangShiProcedure.19.2.2.2.2.2.2.2.2.1
                                                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                                                AbstractArrow entityToSpawn = new BaozhabishouEntity(AnnoyingVillagersbychentuModEntities.BAOZHABISHOU.get(), level);
                                                                entityToSpawn.setOwner(shooter);
                                                                entityToSpawn.setBaseDamage(damage);
                                                                entityToSpawn.setKnockback(knockback);
                                                                entityToSpawn.setSilent(true);
                                                                entityToSpawn.setCritArrow(true);
                                                                return entityToSpawn;
                                                            }
                                                        }.getArrow(projectileLevel3, C060819.this.val$entity, 0.0f, 1);
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
                                                            _level.playSound(null, new BlockPos(C060819.this.val$x, C060819.this.val$y, C060819.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                                        } else {
                                                            _level.playLocalSound(C060819.this.val$x, C060819.this.val$y, C060819.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravesaydie")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
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
}
