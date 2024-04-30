package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.YinshenEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;


public class DarkHerobrineDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v103, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v126, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v41, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$3] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.42d) {
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            Level projectileLevel = entity.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.1
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                        AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        entityToSpawn.setPierceLevel(piercing);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel, entity, 19.0f, 5, (byte) 3);
                _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
            if (entity instanceof LivingEntity) {
                Player player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                Player player2 = (LivingEntity) entity;
                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                _setstack2.setCount(1);
                player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().setChanged();
                }
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.2
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

                /* JADX WARN: Type inference failed for: r0v22, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$2$3] */
                /* JADX WARN: Type inference failed for: r0v42, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$2$2] */
                /* JADX WARN: Type inference failed for: r0v60, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$2$1] */
                private void run() {
                    Entity _shootFrom = entity;
                    Level projectileLevel2 = _shootFrom.level;
                    if (!projectileLevel2.isClientSide()) {
                        Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.2.1
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                entityToSpawn.setOwner(shooter);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setPierceLevel(piercing);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel2, entity, 18.0f, 4, (byte) 3);
                        _entityToSpawn2.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn2.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                        projectileLevel2.addFreshEntity(_entityToSpawn2);
                    }
                    if (entity instanceof LivingEntity) {
                        Player player3 = (LivingEntity) entity;
                        ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                        _setstack3.setCount(1);
                        player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                        if (player3 instanceof Player) {
                            Player _player3 = player3;
                            _player3.getInventory().setChanged();
                        }
                    }
                    Entity _shootFrom2 = entity;
                    Level projectileLevel3 = _shootFrom2.level;
                    if (!projectileLevel3.isClientSide()) {
                        Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.2.2
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                entityToSpawn.setOwner(shooter);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setPierceLevel(piercing);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel3, entity, 24.0f, 4, (byte) 3);
                        _entityToSpawn3.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                        _entityToSpawn3.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 1.0f, 0.0f);
                        projectileLevel3.addFreshEntity(_entityToSpawn3);
                    }
                    if (entity instanceof LivingEntity) {
                        Player player4 = (LivingEntity) entity;
                        ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                        _setstack4.setCount(1);
                        player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                        if (player4 instanceof Player) {
                            Player _player4 = player4;
                            _player4.getInventory().setChanged();
                        }
                    }
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level3 = level;
                        if (!_level3.isClientSide()) {
                            _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.2.3
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
                                ItemStack _setstack5 = new ItemStack(AnnoyingVillagersbychentuModItems.HEI_YAO_SHI_ZHU.get());
                                _setstack5.setCount(1);
                                player5.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
                                if (player5 instanceof Player) {
                                    Player _player5 = player5;
                                    _player5.getInventory().setChanged();
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                Player player6 = (LivingEntity) entity;
                                ItemStack _setstack6 = new ItemStack(Blocks.AIR);
                                _setstack6.setCount(1);
                                player6.setItemInHand(InteractionHand.OFF_HAND, _setstack6);
                                if (player6 instanceof Player) {
                                    Player _player6 = player6;
                                    _player6.getInventory().setChanged();
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 4);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 5);
        } else if (Math.random() <= 0.4d) {
            if (world instanceof Level _level3) {
                if (!_level3.isClientSide()) {
                    _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level4) {
                if (!_level4.isClientSide()) {
                    _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            Level projectileLevel2 = entity.level;
            if (!projectileLevel2.isClientSide()) {
                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.3
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel2, entity, 20.0f, 5);
                _entityToSpawn2.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                _entityToSpawn2.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel2.addFreshEntity(_entityToSpawn2);
            }
            if (entity instanceof LivingEntity) {
                Player player3 = (LivingEntity) entity;
                ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                _setstack3.setCount(1);
                player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                if (player3 instanceof Player) {
                    Player _player3 = player3;
                    _player3.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity) {
                Player player4 = (LivingEntity) entity;
                ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                _setstack4.setCount(1);
                player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                if (player4 instanceof Player) {
                    Player _player4 = player4;
                    _player4.getInventory().setChanged();
                }
            }
            new C04054(entity, x, y, z).start(world, 1);
        }
        if (Math.random() == 0.04d && (world instanceof Level _level5)) {
            if (!_level5.isClientSide()) {
                _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:humchuanqi")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:humchuanqi")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (Math.random() == 0.04d && (world instanceof Level _level6)) {
            if (!_level6.isClientSide()) {
                _level6.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himattack")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himattack")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (Math.random() >= 0.8d || !(entity instanceof LivingEntity _entity)) {
            return;
        }
        if (!_entity.level.isClientSide()) {
            _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C04054 {
        final Entity val$entity;
        final double val$x;
        final double val$y;
        final double val$z;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C04054(Entity entity, double d, double d2, double d3) {
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

        /* JADX WARN: Type inference failed for: r0v24, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$4$1] */
        private void run() {
            if (this.val$entity instanceof LivingEntity) {
                Player player = (LivingEntity) this.val$entity;
                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
            if (this.val$entity instanceof LivingEntity) {
                Player player2 = (LivingEntity) this.val$entity;
                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                _setstack2.setCount(1);
                player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().setChanged();
                }
            }
            Entity _shootFrom = this.val$entity;
            Level projectileLevel = _shootFrom.level;
            if (!projectileLevel.isClientSide()) {
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.4.1
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                        AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel, this.val$entity, 18.0f, 4);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            new C04072().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C04072 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C04072() {
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

            /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$4$2$1] */
            private void run() {
                if (C04054.this.val$entity instanceof LivingEntity) {
                    Player player = (LivingEntity) C04054.this.val$entity;
                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                    _setstack.setCount(1);
                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().setChanged();
                    }
                }
                if (C04054.this.val$entity instanceof LivingEntity) {
                    Player player2 = (LivingEntity) C04054.this.val$entity;
                    ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                    _setstack2.setCount(1);
                    player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                    if (player2 instanceof Player) {
                        Player _player2 = player2;
                        _player2.getInventory().setChanged();
                    }
                }
                Entity _shootFrom = C04054.this.val$entity;
                Level projectileLevel = _shootFrom.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.4.2.1
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel, C04054.this.val$entity, 19.0f, 4);
                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
                new C04092().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C04092 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C04092() {
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

                /* JADX WARN: Type inference failed for: r0v48, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$4$2$2$1] */
                private void run() {
                    Entity _shootFrom = C04054.this.val$entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.4.2.2.1
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                entityToSpawn.setOwner(shooter);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setPierceLevel(piercing);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel, C04054.this.val$entity, 27.0f, 8, (byte) 5);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    if (C04054.this.val$entity instanceof LivingEntity) {
                        Player player = (LivingEntity) C04054.this.val$entity;
                        ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                        _setstack.setCount(1);
                        player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (player instanceof Player) {
                            Player _player = player;
                            _player.getInventory().setChanged();
                        }
                    }
                    if (C04054.this.val$entity instanceof LivingEntity) {
                        Player player2 = (LivingEntity) C04054.this.val$entity;
                        ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                        _setstack2.setCount(1);
                        player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                        if (player2 instanceof Player) {
                            Player _player2 = player2;
                            _player2.getInventory().setChanged();
                        }
                    }
                    new C04112().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C04112 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C04112() {
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

                    /* JADX WARN: Type inference failed for: r0v25, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$4$2$2$2$2] */
                    /* JADX WARN: Type inference failed for: r0v63, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$4$2$2$2$1] */
                    private void run() {
                        Entity _shootFrom = C04054.this.val$entity;
                        Level projectileLevel = _shootFrom.level;
                        if (!projectileLevel.isClientSide()) {
                            Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.4.2.2.2.1
                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                    entityToSpawn.setOwner(shooter);
                                    entityToSpawn.setBaseDamage(damage);
                                    entityToSpawn.setKnockback(knockback);
                                    entityToSpawn.setSilent(true);
                                    return entityToSpawn;
                                }
                            }.getArrow(projectileLevel, C04054.this.val$entity, 17.0f, 4);
                            _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel.addFreshEntity(_entityToSpawn);
                        }
                        if (C04054.this.val$entity instanceof LivingEntity) {
                            Player player = (LivingEntity) C04054.this.val$entity;
                            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                            _setstack.setCount(1);
                            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (player instanceof Player) {
                                Player _player = player;
                                _player.getInventory().setChanged();
                            }
                        }
                        if (C04054.this.val$entity instanceof LivingEntity) {
                            Player player2 = (LivingEntity) C04054.this.val$entity;
                            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                            _setstack2.setCount(1);
                            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                            if (player2 instanceof Player) {
                                Player _player2 = player2;
                                _player2.getInventory().setChanged();
                            }
                        }
                        Level level = this.world;
                        if (level instanceof Level) {
                            Level _level = level;
                            if (!_level.isClientSide()) {
                                _level.playSound(null, new BlockPos(C04054.this.val$x, C04054.this.val$y, C04054.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            } else {
                                _level.playLocalSound(C04054.this.val$x, C04054.this.val$y, C04054.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                            }
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.4.2.2.2.2
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

                            /* JADX WARN: Type inference failed for: r0v24, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$4$2$2$2$2$2] */
                            /* JADX WARN: Type inference failed for: r0v68, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$4$2$2$2$2$1] */
                            private void run() {
                                Entity _shootFrom2 = C04054.this.val$entity;
                                Level projectileLevel2 = _shootFrom2.level;
                                if (!projectileLevel2.isClientSide()) {
                                    Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.4.2.2.2.2.1
                                        public Projectile getArrow(Level level2, Entity shooter, float damage, int knockback) {
                                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level2);
                                            entityToSpawn.setOwner(shooter);
                                            entityToSpawn.setBaseDamage(damage);
                                            entityToSpawn.setKnockback(knockback);
                                            entityToSpawn.setSilent(true);
                                            return entityToSpawn;
                                        }
                                    }.getArrow(projectileLevel2, C04054.this.val$entity, 17.0f, 4);
                                    _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                    _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 1.0f, 0.0f);
                                    projectileLevel2.addFreshEntity(_entityToSpawn2);
                                }
                                if (C04054.this.val$entity instanceof LivingEntity) {
                                    Player player3 = (LivingEntity) C04054.this.val$entity;
                                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                                    _setstack3.setCount(1);
                                    player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                                    if (player3 instanceof Player) {
                                        Player _player3 = player3;
                                        _player3.getInventory().setChanged();
                                    }
                                }
                                if (C04054.this.val$entity instanceof LivingEntity) {
                                    Player player4 = (LivingEntity) C04054.this.val$entity;
                                    ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                                    _setstack4.setCount(1);
                                    player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                                    if (player4 instanceof Player) {
                                        Player _player4 = player4;
                                        _player4.getInventory().setChanged();
                                    }
                                }
                                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.4.2.2.2.2.2
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

                                    /* JADX WARN: Type inference failed for: r0v72, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure$4$2$2$2$2$2$1] */
                                    private void run() {
                                        Entity _shootFrom3 = C04054.this.val$entity;
                                        Level projectileLevel3 = _shootFrom3.level;
                                        if (!projectileLevel3.isClientSide()) {
                                            Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangShiTiShouShangShiProcedure.4.2.2.2.2.2.1
                                                public Projectile getArrow(Level level2, Entity shooter, float damage, int knockback) {
                                                    AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level2);
                                                    entityToSpawn.setOwner(shooter);
                                                    entityToSpawn.setBaseDamage(damage);
                                                    entityToSpawn.setKnockback(knockback);
                                                    entityToSpawn.setSilent(true);
                                                    return entityToSpawn;
                                                }
                                            }.getArrow(projectileLevel3, C04054.this.val$entity, 17.0f, 4);
                                            _entityToSpawn3.setPos(_shootFrom3.getX(), _shootFrom3.getEyeY() - 0.1d, _shootFrom3.getZ());
                                            _entityToSpawn3.shoot(_shootFrom3.getLookAngle().x, _shootFrom3.getLookAngle().y, _shootFrom3.getLookAngle().z, 1.0f, 0.0f);
                                            projectileLevel3.addFreshEntity(_entityToSpawn3);
                                        }
                                        Level level2 = this.world;
                                        if (level2 instanceof Level) {
                                            Level _level2 = level2;
                                            if (!_level2.isClientSide()) {
                                                _level2.playSound(null, new BlockPos(C04054.this.val$x, C04054.this.val$y, C04054.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                            } else {
                                                _level2.playLocalSound(C04054.this.val$x, C04054.this.val$y, C04054.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                            }
                                        }
                                        if (C04054.this.val$entity instanceof LivingEntity) {
                                            Player player5 = (LivingEntity) C04054.this.val$entity;
                                            ItemStack _setstack5 = new ItemStack(AnnoyingVillagersbychentuModItems.HEI_YAO_SHI_ZHU.get());
                                            _setstack5.setCount(1);
                                            player5.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
                                            if (player5 instanceof Player) {
                                                Player _player5 = player5;
                                                _player5.getInventory().setChanged();
                                            }
                                        }
                                        if (C04054.this.val$entity instanceof LivingEntity) {
                                            Player player6 = (LivingEntity) C04054.this.val$entity;
                                            ItemStack _setstack6 = new ItemStack(Blocks.AIR);
                                            _setstack6.setCount(1);
                                            player6.setItemInHand(InteractionHand.OFF_HAND, _setstack6);
                                            if (player6 instanceof Player) {
                                                Player _player6 = player6;
                                                _player6.getInventory().setChanged();
                                            }
                                        }
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }
                                }.start(this.world, 4);
                                Level level2 = this.world;
                                if (level2 instanceof Level) {
                                    Level _level2 = level2;
                                    if (!_level2.isClientSide()) {
                                        _level2.playSound(null, new BlockPos(C04054.this.val$x, C04054.this.val$y, C04054.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                    } else {
                                        _level2.playLocalSound(C04054.this.val$x, C04054.this.val$y, C04054.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }
            }
        }
    }
}
