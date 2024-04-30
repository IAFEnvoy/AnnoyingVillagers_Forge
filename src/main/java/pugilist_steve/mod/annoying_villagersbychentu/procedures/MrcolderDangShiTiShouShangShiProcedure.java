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
import net.minecraft.world.item.enchantment.Enchantments;
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


public class MrcolderDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v31, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r0v48, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r0v50, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v76, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v77, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$7] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.09d) {
            entity.setYRot(0.0f);
            entity.setXRot((float) Mth.nextDouble(new Random(), 90.0d, 180.0d));
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
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.1
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
            if (Math.random() <= 0.9d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.2
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

                    /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$2$1] */
                    private void run() {
                        Entity _shootFrom = entity;
                        Level projectileLevel2 = _shootFrom.level;
                        if (!projectileLevel2.isClientSide()) {
                            Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.2.1
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
            Level projectileLevel2 = entity.level;
            if (!projectileLevel2.isClientSide()) {
                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.3
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
            if (Math.random() <= 0.095d) {
                new C11024(entity, x, y, z).start(world, 20);
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.5
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

                /* JADX WARN: Type inference failed for: r0v62, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$5$1] */
                private void run() {
                    ItemStack itemStack;
                    ItemStack itemStack2;
                    ItemStack itemStack3;
                    LivingEntity livingEntity = entity;
                    livingEntity.setYRot(0.0f);
                    livingEntity.setXRot(180.0f);
                    livingEntity.setYBodyRot(livingEntity.getYRot());
                    livingEntity.setYHeadRot(livingEntity.getYRot());
                    livingEntity.yRotO = livingEntity.getYRot();
                    livingEntity.xRotO = livingEntity.getXRot();
                    if (livingEntity instanceof LivingEntity) {
                        LivingEntity _entity3 = livingEntity;
                        _entity3.yBodyRotO = _entity3.getYRot();
                        _entity3.yHeadRotO = _entity3.getYRot();
                    }
                    Entity _shootFrom = entity;
                    Level projectileLevel3 = _shootFrom.level;
                    if (!projectileLevel3.isClientSide()) {
                        Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.5.1
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
                    if (entity instanceof LivingEntity) {
                        Player player = (LivingEntity) entity;
                        ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.WEI_DA_DE_JIAN.get());
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
                    itemStack.enchant(Enchantments.SHARPNESS, 5);
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt2 = entity;
                        itemStack2 = _livEnt2.getMainHandItem();
                    } else {
                        itemStack2 = ItemStack.EMPTY;
                    }
                    itemStack2.enchant(Enchantments.MENDING, 5);
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt3 = entity;
                        itemStack3 = _livEnt3.getMainHandItem();
                    } else {
                        itemStack3 = ItemStack.EMPTY;
                    }
                    itemStack3.enchant(Enchantments.UNBREAKING, 4);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 80);
        }
        if (Math.random() <= 0.03d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.6
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

                /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$6$1] */
                private void run() {
                    LivingEntity livingEntity = entity;
                    livingEntity.setYRot(0.0f);
                    livingEntity.setXRot((float) Mth.nextDouble(new Random(), 90.0d, 180.0d));
                    livingEntity.setYBodyRot(livingEntity.getYRot());
                    livingEntity.setYHeadRot(livingEntity.getYRot());
                    livingEntity.yRotO = livingEntity.getYRot();
                    livingEntity.xRotO = livingEntity.getXRot();
                    if (livingEntity instanceof LivingEntity) {
                        LivingEntity _entity3 = livingEntity;
                        _entity3.yBodyRotO = _entity3.getYRot();
                        _entity3.yHeadRotO = _entity3.getYRot();
                    }
                    Entity _shootFrom = entity;
                    Level projectileLevel3 = _shootFrom.level;
                    if (!projectileLevel3.isClientSide()) {
                        Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.6.1
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
            }.start(world, Mth.nextInt(new Random(), 0, 20));
        }
        entity.setSprinting(true);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.7
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
        if (Math.random() <= 0.4d && (entity instanceof LivingEntity _entity3)) {
            if (!_entity3.level.isClientSide()) {
                _entity3.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
            }
        }
        if (Math.random() > 0.35d || !(entity instanceof LivingEntity _entity4)) {
            return;
        }
        if (!_entity4.level.isClientSide()) {
            _entity4.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.TAOTUOBUFF.get(), 1, 1, false, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C11024 {
        final Entity val$entity;
        final double val$x;
        final double val$y;
        final double val$z;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C11024(Entity entity, double d, double d2, double d3) {
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

        /* JADX WARN: Type inference failed for: r0v53, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$4$1] */
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
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.4.1
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
            new C11042().start(this.world, 20);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C11042 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C11042() {
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
                if (C11024.this.val$entity instanceof LivingEntity) {
                    LivingEntity _entity = C11024.this.val$entity;
                    if (!_entity.level.isClientSide()) {
                        _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
                    }
                }
                new C11051().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C11051 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C11051() {
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

                /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$4$2$1$2] */
                /* JADX WARN: Type inference failed for: r0v20, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$4$2$1$1] */
                private void run() {
                    Entity _shootFrom = C11024.this.val$entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.4.2.1.1
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                Arrow arrow = new Arrow(EntityType.ARROW, level);
                                arrow.setOwner(shooter);
                                arrow.setBaseDamage(damage);
                                arrow.setKnockback(knockback);
                                arrow.setPierceLevel(piercing);
                                arrow.setCritArrow(true);
                                return arrow;
                            }
                        }.getArrow(projectileLevel, C11024.this.val$entity, 5.0f, 1, (byte) 1);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.5f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(C11024.this.val$x, C11024.this.val$y, C11024.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(C11024.this.val$x, C11024.this.val$y, C11024.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f, false);
                        }
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.4.2.1.2
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

                        /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$4$2$1$2$2] */
                        /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$4$2$1$2$1] */
                        private void run() {
                            Entity _shootFrom2 = C11024.this.val$entity;
                            Level projectileLevel2 = _shootFrom2.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.4.2.1.2.1
                                    public Projectile getArrow(Level level2, Entity shooter, float damage, int knockback, byte piercing) {
                                        Arrow arrow = new Arrow(EntityType.ARROW, level2);
                                        arrow.setOwner(shooter);
                                        arrow.setBaseDamage(damage);
                                        arrow.setKnockback(knockback);
                                        arrow.setPierceLevel(piercing);
                                        arrow.setCritArrow(true);
                                        return arrow;
                                    }
                                }.getArrow(projectileLevel2, C11024.this.val$entity, 5.0f, 1, (byte) 1);
                                _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.5f, 0.0f);
                                projectileLevel2.addFreshEntity(_entityToSpawn2);
                            }
                            Level level2 = this.world;
                            if (level2 instanceof Level) {
                                Level _level2 = level2;
                                if (!_level2.isClientSide()) {
                                    _level2.playSound(null, new BlockPos(C11024.this.val$x, C11024.this.val$y, C11024.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f);
                                } else {
                                    _level2.playLocalSound(C11024.this.val$x, C11024.this.val$y, C11024.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f, false);
                                }
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.4.2.1.2.2
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

                                /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure$4$2$1$2$2$1] */
                                private void run() {
                                    Entity _shootFrom3 = C11024.this.val$entity;
                                    Level projectileLevel3 = _shootFrom3.level;
                                    if (!projectileLevel3.isClientSide()) {
                                        Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.MrcolderDangShiTiShouShangShiProcedure.4.2.1.2.2.1
                                            public Projectile getArrow(Level level3, Entity shooter, float damage, int knockback, byte piercing) {
                                                Arrow arrow = new Arrow(EntityType.ARROW, level3);
                                                arrow.setOwner(shooter);
                                                arrow.setBaseDamage(damage);
                                                arrow.setKnockback(knockback);
                                                arrow.setPierceLevel(piercing);
                                                arrow.setCritArrow(true);
                                                return arrow;
                                            }
                                        }.getArrow(projectileLevel3, C11024.this.val$entity, 5.0f, 1, (byte) 1);
                                        _entityToSpawn3.setPos(_shootFrom3.getX(), _shootFrom3.getEyeY() - 0.1d, _shootFrom3.getZ());
                                        _entityToSpawn3.shoot(_shootFrom3.getLookAngle().x, _shootFrom3.getLookAngle().y, _shootFrom3.getLookAngle().z, 2.5f, 0.0f);
                                        projectileLevel3.addFreshEntity(_entityToSpawn3);
                                    }
                                    Level level3 = this.world;
                                    if (level3 instanceof Level) {
                                        Level _level3 = level3;
                                        if (!_level3.isClientSide()) {
                                            _level3.playSound(null, new BlockPos(C11024.this.val$x, C11024.this.val$y, C11024.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f);
                                        } else {
                                            _level3.playLocalSound(C11024.this.val$x, C11024.this.val$y, C11024.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.MASTER, 1.0f, 1.0f, false);
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
}
