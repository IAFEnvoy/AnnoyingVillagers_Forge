package pugilist_steve.mod.annoying_villagersbychentu.procedures;

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
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Random;


public class Mrcolder2DangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v11, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$8] */
    /* JADX WARN: Type inference failed for: r0v125, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v157, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v51, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$7] */
    /* JADX WARN: Type inference failed for: r0v63, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r0v89, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v90, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$3] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        float f;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            f = _livEnt.getHealth();
        } else {
            f = -1.0f;
        }
        if (f <= 10.0f && Math.random() <= 0.01d) {
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
            Level projectileLevel = entity.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.1
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
            if (entity instanceof LivingEntity) {
                Player player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:jinshiyinxiao")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:jinshiyinxiao")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (entity instanceof LivingEntity _entity2) {
                if (!_entity2.level.isClientSide()) {
                    _entity2.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 40, 10));
                }
            }
            if (entity instanceof LivingEntity _entity3) {
                if (!_entity3.level.isClientSide()) {
                    _entity3.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1));
                }
            }
            entity.setShiftKeyDown(true);
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.2
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
                    entity.setShiftKeyDown(false);
                    if (entity instanceof LivingEntity) {
                        Player player2 = (LivingEntity) entity;
                        ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.CCGEPOLANJIANDUN.get());
                        _setstack2.setCount(1);
                        player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                        if (player2 instanceof Player) {
                            Player _player2 = player2;
                            _player2.getInventory().setChanged();
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 30);
        }
        if (Math.random() <= 0.15d) {
            entity.setYRot(0.0f);
            entity.setXRot((float) Mth.nextDouble(new Random(), 90.0d, 180.0d));
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
                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.3
                    public Projectile getProjectile(Level level, Entity shooter) {
                        ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                        thrownEnderpearl.setOwner(shooter);
                        return thrownEnderpearl;
                    }
                }.getProjectile(projectileLevel2, entity);
                _entityToSpawn2.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn2.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel2.addFreshEntity(_entityToSpawn2);
            }
            if (Math.random() <= 0.9d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.4
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

                    /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$4$1] */
                    private void run() {
                        Entity _shootFrom = entity;
                        Level projectileLevel3 = _shootFrom.level;
                        if (!projectileLevel3.isClientSide()) {
                            Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.4.1
                                public Projectile getProjectile(Level level, Entity shooter) {
                                    ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                    thrownEnderpearl.setOwner(shooter);
                                    return thrownEnderpearl;
                                }
                            }.getProjectile(projectileLevel3, entity);
                            _entityToSpawn3.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn3.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel3.addFreshEntity(_entityToSpawn3);
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 40);
            }
        }
        if (Math.random() <= 0.04d) {
            entity.setYRot(0.0f);
            entity.setXRot(180.0f);
            entity.setYBodyRot(entity.getYRot());
            entity.setYHeadRot(entity.getYRot());
            entity.yRotO = entity.getYRot();
            entity.xRotO = entity.getXRot();
            if (entity instanceof LivingEntity _entity5) {
                _entity5.yBodyRotO = _entity5.getYRot();
                _entity5.yHeadRotO = _entity5.getYRot();
            }
            Level projectileLevel3 = entity.level;
            if (!projectileLevel3.isClientSide()) {
                Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.5
                    public Projectile getProjectile(Level level, Entity shooter) {
                        ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                        thrownEnderpearl.setOwner(shooter);
                        return thrownEnderpearl;
                    }
                }.getProjectile(projectileLevel3, entity);
                _entityToSpawn3.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn3.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.5f, 0.0f);
                projectileLevel3.addFreshEntity(_entityToSpawn3);
            }
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
            new C10696(entity).start(world, 5);
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.7
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
                        ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.CCGEPOLANJIANDUN.get());
                        _setstack3.setCount(1);
                        player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                        if (player3 instanceof Player) {
                            Player _player3 = player3;
                            _player3.getInventory().setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        Player player4 = (LivingEntity) entity;
                        ItemStack _setstack4 = new ItemStack(Items.ENDER_PEARL);
                        _setstack4.setCount(1);
                        player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                        if (player4 instanceof Player) {
                            Player _player4 = player4;
                            _player4.getInventory().setChanged();
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 180);
        }
        entity.setSprinting(true);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.8
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
        if (Math.random() <= 0.32d && (entity instanceof LivingEntity _entity6)) {
            if (!_entity6.level.isClientSide()) {
                _entity6.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.TAOTUOBUFF.get(), 1, 1, false, false));
            }
        }
        if (Math.random() > 0.39d || !(entity instanceof LivingEntity _entity7)) {
            return;
        }
        if (!_entity7.level.isClientSide()) {
            _entity7.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C10696 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C10696(Entity entity) {
            this.val$entity = entity;
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

        /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$6$1] */
        private void run() {
            Entity _shootFrom = this.val$entity;
            Level projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.6.1
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        Arrow arrow = new Arrow(EntityType.ARROW, level);
                        arrow.setOwner(shooter);
                        arrow.setBaseDamage(damage);
                        arrow.setKnockback(knockback);
                        return arrow;
                    }
                }.getArrow(projectileLevel, this.val$entity, 6.0f, 4);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4.0f, 0.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
            new C10712().start(this.world, 5);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C10712 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C10712() {
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

            /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$6$2$1] */
            private void run() {
                Entity _shootFrom = C10696.this.val$entity;
                Level projectileLevel = _shootFrom.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.6.2.1
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            Arrow arrow = new Arrow(EntityType.ARROW, level);
                            arrow.setOwner(shooter);
                            arrow.setBaseDamage(damage);
                            arrow.setKnockback(knockback);
                            return arrow;
                        }
                    }.getArrow(projectileLevel, C10696.this.val$entity, 6.0f, 3);
                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4.0f, 0.0f);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
                new C10732().start(this.world, 3);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C10732 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C10732() {
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

                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$6$2$2$1] */
                private void run() {
                    Entity _shootFrom = C10696.this.val$entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.6.2.2.1
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                Arrow arrow = new Arrow(EntityType.ARROW, level);
                                arrow.setOwner(shooter);
                                arrow.setBaseDamage(damage);
                                arrow.setKnockback(knockback);
                                return arrow;
                            }
                        }.getArrow(projectileLevel, C10696.this.val$entity, 6.0f, 5);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4.0f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    new C10752().start(this.world, 3);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C10752 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C10752() {
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

                    /* JADX WARN: Type inference failed for: r0v11, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$6$2$2$2$1] */
                    private void run() {
                        Entity _shootFrom = C10696.this.val$entity;
                        Level projectileLevel = _shootFrom.level;
                        if (!projectileLevel.isClientSide()) {
                            Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.6.2.2.2.1
                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    Arrow arrow = new Arrow(EntityType.ARROW, level);
                                    arrow.setOwner(shooter);
                                    arrow.setBaseDamage(damage);
                                    arrow.setKnockback(knockback);
                                    return arrow;
                                }
                            }.getArrow(projectileLevel, C10696.this.val$entity, 6.0f, 7);
                            _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4.0f, 0.0f);
                            projectileLevel.addFreshEntity(_entityToSpawn);
                        }
                        new C10772().start(this.world, 3);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C10772 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C10772() {
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

                        /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$6$2$2$2$2$2] */
                        /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$6$2$2$2$2$1] */
                        private void run() {
                            Entity _shootFrom = C10696.this.val$entity;
                            Level projectileLevel = _shootFrom.level;
                            if (!projectileLevel.isClientSide()) {
                                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.6.2.2.2.2.1
                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                        Arrow arrow = new Arrow(EntityType.ARROW, level);
                                        arrow.setOwner(shooter);
                                        arrow.setBaseDamage(damage);
                                        arrow.setKnockback(knockback);
                                        return arrow;
                                    }
                                }.getArrow(projectileLevel, C10696.this.val$entity, 6.0f, 5);
                                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 4.0f, 0.0f);
                                projectileLevel.addFreshEntity(_entityToSpawn);
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.6.2.2.2.2.2
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

                                /* JADX WARN: Type inference failed for: r0v11, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$6$2$2$2$2$2$2] */
                                /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$6$2$2$2$2$2$1] */
                                private void run() {
                                    Entity _shootFrom2 = C10696.this.val$entity;
                                    Level projectileLevel2 = _shootFrom2.level;
                                    if (!projectileLevel2.isClientSide()) {
                                        Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.6.2.2.2.2.2.1
                                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                                Arrow arrow = new Arrow(EntityType.ARROW, level);
                                                arrow.setOwner(shooter);
                                                arrow.setBaseDamage(damage);
                                                arrow.setKnockback(knockback);
                                                arrow.setPierceLevel(piercing);
                                                return arrow;
                                            }
                                        }.getArrow(projectileLevel2, C10696.this.val$entity, 9.0f, 9, (byte) 4);
                                        _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                        _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 4.0f, 0.0f);
                                        projectileLevel2.addFreshEntity(_entityToSpawn2);
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.6.2.2.2.2.2.2
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

                                        /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure$6$2$2$2$2$2$2$1] */
                                        private void run() {
                                            Entity _shootFrom3 = C10696.this.val$entity;
                                            Level projectileLevel3 = _shootFrom3.level;
                                            if (!projectileLevel3.isClientSide()) {
                                                Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2DangShiTiShouShangShiProcedure.6.2.2.2.2.2.2.1
                                                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                                        Arrow arrow = new Arrow(EntityType.ARROW, level);
                                                        arrow.setOwner(shooter);
                                                        arrow.setBaseDamage(damage);
                                                        arrow.setKnockback(knockback);
                                                        arrow.setPierceLevel(piercing);
                                                        return arrow;
                                                    }
                                                }.getArrow(projectileLevel3, C10696.this.val$entity, 9.0f, 9, (byte) 4);
                                                _entityToSpawn3.setPos(_shootFrom3.getX(), _shootFrom3.getEyeY() - 0.1d, _shootFrom3.getZ());
                                                _entityToSpawn3.shoot(_shootFrom3.getLookAngle().x, _shootFrom3.getLookAngle().y, _shootFrom3.getLookAngle().z, 4.0f, 0.0f);
                                                projectileLevel3.addFreshEntity(_entityToSpawn3);
                                            }
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }
                                    }.start(this.world, 3);
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(this.world, 3);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }
                }
            }
        }
    }
}
