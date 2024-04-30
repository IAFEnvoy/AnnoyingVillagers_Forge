package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
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


public class HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v106, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v60, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v66, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$3] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity != null && Math.random() <= 0.1d) {
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
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
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1
                    public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                        AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        entityToSpawn.setPierceLevel(piercing);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel, entity, 21.0f, 3, (byte) 3);
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
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.2
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
                        Level _level3 = level;
                        if (!_level3.isClientSide()) {
                            _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        Player player3 = (LivingEntity) entity;
                        ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.HEI_YAO_SHI_ZHU.get());
                        _setstack3.setCount(1);
                        player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                        if (player3 instanceof Player) {
                            Player _player3 = player3;
                            _player3.getInventory().setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        Player player4 = (LivingEntity) entity;
                        ItemStack _setstack4 = new ItemStack(Blocks.AIR);
                        _setstack4.setCount(1);
                        player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                        if (player4 instanceof Player) {
                            Player _player4 = player4;
                            _player4.getInventory().setChanged();
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 7);
            if (Math.random() <= 0.43d) {
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
                    Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.3
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            entityToSpawn.setPierceLevel(piercing);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel2, entity, 23.0f, 5, (byte) 3);
                    _entityToSpawn2.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn2.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel2.addFreshEntity(_entityToSpawn2);
                }
                Level projectileLevel3 = entity.level;
                if (!projectileLevel3.isClientSide()) {
                    Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.4
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            entityToSpawn.setPierceLevel(piercing);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel3, entity, 20.0f, 5, (byte) 3);
                    _entityToSpawn3.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn3.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel3.addFreshEntity(_entityToSpawn3);
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
                new C06785(x, y, z, entity).start(world, 5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C06785 {
        final double val$x;
        final double val$y;
        final double val$z;
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C06785(double d, double d2, double d3, Entity entity) {
            this.val$x = d;
            this.val$y = d2;
            this.val$z = d3;
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

        /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$5$3] */
        /* JADX WARN: Type inference failed for: r0v32, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$5$2] */
        /* JADX WARN: Type inference failed for: r0v38, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$5$1] */
        private void run() {
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            Level level3 = this.world;
            if (level3 instanceof Level) {
                Level _level3 = level3;
                if (!_level3.isClientSide()) {
                    _level3.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level3.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
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
                Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.5.1
                    public Projectile getArrow(Level level4, Entity shooter, float damage, int knockback, byte piercing) {
                        AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level4);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        entityToSpawn.setPierceLevel(piercing);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel, this.val$entity, 19.0f, 5, (byte) 2);
                _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel.addFreshEntity(_entityToSpawn);
            }
            Entity _shootFrom2 = this.val$entity;
            Level projectileLevel2 = _shootFrom2.level;
            if (!projectileLevel2.isClientSide()) {
                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.5.2
                    public Projectile getArrow(Level level4, Entity shooter, float damage, int knockback, byte piercing) {
                        AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level4);
                        entityToSpawn.setOwner(shooter);
                        entityToSpawn.setBaseDamage(damage);
                        entityToSpawn.setKnockback(knockback);
                        entityToSpawn.setSilent(true);
                        entityToSpawn.setPierceLevel(piercing);
                        return entityToSpawn;
                    }
                }.getArrow(projectileLevel2, this.val$entity, 20.0f, 5, (byte) 3);
                _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 1.0f, 0.0f);
                projectileLevel2.addFreshEntity(_entityToSpawn2);
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.5.3
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

                /* JADX WARN: Type inference failed for: r0v34, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$5$3$3] */
                /* JADX WARN: Type inference failed for: r0v36, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$5$3$2] */
                /* JADX WARN: Type inference failed for: r0v42, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$5$3$1] */
                private void run() {
                    Level level4 = this.world;
                    if (level4 instanceof Level) {
                        Level _level4 = level4;
                        if (!_level4.isClientSide()) {
                            _level4.playSound(null, new BlockPos(C06785.this.val$x, C06785.this.val$y, C06785.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level4.playLocalSound(C06785.this.val$x, C06785.this.val$y, C06785.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    Level level5 = this.world;
                    if (level5 instanceof Level) {
                        Level _level5 = level5;
                        if (!_level5.isClientSide()) {
                            _level5.playSound(null, new BlockPos(C06785.this.val$x, C06785.this.val$y, C06785.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level5.playLocalSound(C06785.this.val$x, C06785.this.val$y, C06785.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    Level level6 = this.world;
                    if (level6 instanceof Level) {
                        Level _level6 = level6;
                        if (!_level6.isClientSide()) {
                            _level6.playSound(null, new BlockPos(C06785.this.val$x, C06785.this.val$y, C06785.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level6.playLocalSound(C06785.this.val$x, C06785.this.val$y, C06785.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    if (C06785.this.val$entity instanceof LivingEntity) {
                        Player player3 = (LivingEntity) C06785.this.val$entity;
                        ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                        _setstack3.setCount(1);
                        player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                        if (player3 instanceof Player) {
                            Player _player3 = player3;
                            _player3.getInventory().setChanged();
                        }
                    }
                    if (C06785.this.val$entity instanceof LivingEntity) {
                        Player player4 = (LivingEntity) C06785.this.val$entity;
                        ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                        _setstack4.setCount(1);
                        player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                        if (player4 instanceof Player) {
                            Player _player4 = player4;
                            _player4.getInventory().setChanged();
                        }
                    }
                    Entity _shootFrom3 = C06785.this.val$entity;
                    Level projectileLevel3 = _shootFrom3.level;
                    if (!projectileLevel3.isClientSide()) {
                        Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.5.3.1
                            public Projectile getArrow(Level level7, Entity shooter, float damage, int knockback, byte piercing) {
                                AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level7);
                                entityToSpawn.setOwner(shooter);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setPierceLevel(piercing);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel3, C06785.this.val$entity, 21.0f, 5, (byte) 2);
                        _entityToSpawn3.setPos(_shootFrom3.getX(), _shootFrom3.getEyeY() - 0.1d, _shootFrom3.getZ());
                        _entityToSpawn3.shoot(_shootFrom3.getLookAngle().x, _shootFrom3.getLookAngle().y, _shootFrom3.getLookAngle().z, 1.0f, 0.0f);
                        projectileLevel3.addFreshEntity(_entityToSpawn3);
                    }
                    Entity _shootFrom4 = C06785.this.val$entity;
                    Level projectileLevel4 = _shootFrom4.level;
                    if (!projectileLevel4.isClientSide()) {
                        Projectile _entityToSpawn4 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.5.3.2
                            public Projectile getArrow(Level level7, Entity shooter, float damage, int knockback, byte piercing) {
                                AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level7);
                                entityToSpawn.setOwner(shooter);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setPierceLevel(piercing);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel4, C06785.this.val$entity, 23.0f, 6, (byte) 3);
                        _entityToSpawn4.setPos(_shootFrom4.getX(), _shootFrom4.getEyeY() - 0.1d, _shootFrom4.getZ());
                        _entityToSpawn4.shoot(_shootFrom4.getLookAngle().x, _shootFrom4.getLookAngle().y, _shootFrom4.getLookAngle().z, 1.0f, 0.0f);
                        projectileLevel4.addFreshEntity(_entityToSpawn4);
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.5.3.3
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

                        private void run() {
                            Level level7 = this.world;
                            if (level7 instanceof Level) {
                                Level _level7 = level7;
                                if (!_level7.isClientSide()) {
                                    _level7.playSound(null, new BlockPos(C06785.this.val$x, C06785.this.val$y, C06785.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level7.playLocalSound(C06785.this.val$x, C06785.this.val$y, C06785.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            if (C06785.this.val$entity instanceof LivingEntity) {
                                Player player5 = (LivingEntity) C06785.this.val$entity;
                                ItemStack _setstack5 = new ItemStack(AnnoyingVillagersbychentuModItems.HEI_YAO_SHI_ZHU.get());
                                _setstack5.setCount(1);
                                player5.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
                                if (player5 instanceof Player) {
                                    Player _player5 = player5;
                                    _player5.getInventory().setChanged();
                                }
                            }
                            if (C06785.this.val$entity instanceof LivingEntity) {
                                Player player6 = (LivingEntity) C06785.this.val$entity;
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
                    }.start(this.world, 5);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(this.world, 2);
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
