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


public class DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.009d) {
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:anyingheiyaoshi");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^1 annoying_villagersbychentu:anyingheiyaoshi");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:anyingheiyaoshi");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:anyingheiyaoshi");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:anyingheiyaoshi");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:anyingheiyaoshi");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:anyingheiyaoshi");
            }
        }
        new C04171(x, y, z, entity).start(world, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C04171 {
        final double val$x;
        final double val$y;
        final double val$z;
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C04171(double d, double d2, double d3, Entity entity) {
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

        /* JADX WARN: Type inference failed for: r0v33, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1$1] */
        private void run() {
            if (Math.random() <= 0.09d) {
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                Level level2 = this.world;
                if (level2 instanceof Level) {
                    Level _level2 = level2;
                    if (!_level2.isClientSide()) {
                        _level2.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level2.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                Entity _shootFrom = this.val$entity;
                Level projectileLevel = _shootFrom.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1.1
                        public Projectile getArrow(Level level3, Entity shooter, float damage, int knockback, byte piercing) {
                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level3);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            entityToSpawn.setPierceLevel(piercing);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel, this.val$entity, 24.0f, 5, (byte) 2);
                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
                if (this.val$entity instanceof LivingEntity) {
                    Player player = (LivingEntity) this.val$entity;
                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                    _setstack.setCount(1);
                    player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().setChanged();
                    }
                }
                new C04192().start(this.world, 5);
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C04192 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C04192() {
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

            /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1$2$2] */
            /* JADX WARN: Type inference failed for: r0v36, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1$2$1] */
            private void run() {
                Entity _shootFrom = C04171.this.val$entity;
                Level projectileLevel = _shootFrom.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1.2.1
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            entityToSpawn.setPierceLevel(piercing);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel, C04171.this.val$entity, 20.0f, 4, (byte) 4);
                    _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                    _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
                if (C04171.this.val$entity instanceof LivingEntity) {
                    Player player = (LivingEntity) C04171.this.val$entity;
                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHICHANGZHU.get());
                    _setstack.setCount(1);
                    player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().setChanged();
                    }
                }
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(C04171.this.val$x, C04171.this.val$y, C04171.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(C04171.this.val$x, C04171.this.val$y, C04171.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1.2.2
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

                    /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1$2$2$3] */
                    /* JADX WARN: Type inference failed for: r0v23, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1$2$2$2] */
                    /* JADX WARN: Type inference failed for: r0v43, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1$2$2$1] */
                    private void run() {
                        Entity _shootFrom2 = C04171.this.val$entity;
                        Level projectileLevel2 = _shootFrom2.level;
                        if (!projectileLevel2.isClientSide()) {
                            Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1.2.2.1
                                public Projectile getArrow(Level level2, Entity shooter, float damage, int knockback, byte piercing) {
                                    AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level2);
                                    entityToSpawn.setOwner(shooter);
                                    entityToSpawn.setBaseDamage(damage);
                                    entityToSpawn.setKnockback(knockback);
                                    entityToSpawn.setSilent(true);
                                    entityToSpawn.setPierceLevel(piercing);
                                    return entityToSpawn;
                                }
                            }.getArrow(projectileLevel2, C04171.this.val$entity, 26.0f, 7, (byte) 4);
                            _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                            _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel2.addFreshEntity(_entityToSpawn2);
                        }
                        if (C04171.this.val$entity instanceof LivingEntity) {
                            Player player2 = (LivingEntity) C04171.this.val$entity;
                            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIZHUSHIFANG.get());
                            _setstack2.setCount(1);
                            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                            if (player2 instanceof Player) {
                                Player _player2 = player2;
                                _player2.getInventory().setChanged();
                            }
                        }
                        Entity _shootFrom3 = C04171.this.val$entity;
                        Level projectileLevel3 = _shootFrom3.level;
                        if (!projectileLevel3.isClientSide()) {
                            Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1.2.2.2
                                public Projectile getArrow(Level level2, Entity shooter, float damage, int knockback, byte piercing) {
                                    AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level2);
                                    entityToSpawn.setOwner(shooter);
                                    entityToSpawn.setBaseDamage(damage);
                                    entityToSpawn.setKnockback(knockback);
                                    entityToSpawn.setSilent(true);
                                    entityToSpawn.setPierceLevel(piercing);
                                    return entityToSpawn;
                                }
                            }.getArrow(projectileLevel3, C04171.this.val$entity, 20.0f, 4, (byte) 3);
                            _entityToSpawn3.setPos(_shootFrom3.getX(), _shootFrom3.getEyeY() - 0.1d, _shootFrom3.getZ());
                            _entityToSpawn3.shoot(_shootFrom3.getLookAngle().x, _shootFrom3.getLookAngle().y, _shootFrom3.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel3.addFreshEntity(_entityToSpawn3);
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DarkHerobrineDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1.2.2.3
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
                                Level level2 = this.world;
                                if (level2 instanceof Level) {
                                    Level _level2 = level2;
                                    if (!_level2.isClientSide()) {
                                        _level2.playSound(null, new BlockPos(C04171.this.val$x, C04171.this.val$y, C04171.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                    } else {
                                        _level2.playLocalSound(C04171.this.val$x, C04171.this.val$y, C04171.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                    }
                                }
                                if (C04171.this.val$entity instanceof LivingEntity) {
                                    Player player3 = (LivingEntity) C04171.this.val$entity;
                                    ItemStack _setstack3 = new ItemStack(Blocks.AIR);
                                    _setstack3.setCount(1);
                                    player3.setItemInHand(InteractionHand.OFF_HAND, _setstack3);
                                    if (player3 instanceof Player) {
                                        Player _player3 = player3;
                                        _player3.getInventory().setChanged();
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 5);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(this.world, 4);
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }
    }
}
