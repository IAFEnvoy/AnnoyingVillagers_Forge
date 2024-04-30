package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
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
import pugilist_steve.mod.annoying_villagersbychentu.entity.YinshenEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class C0853xc8f3130d {
    /* JADX WARN: Type inference failed for: r0v115, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v116, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v139, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v53, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$8] */
    /* JADX WARN: Type inference failed for: r1v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$7] */
    /* JADX WARN: Type inference failed for: r1v41, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r1v47, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$6] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        LivingEntity livingEntity;
        LivingEntity livingEntity2;
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2.0d), e -> {
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
                new C08541(entity).start(world, 30);
                if (Math.random() <= 0.04d) {
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    if (Math.random() <= 0.7d) {
                        Level projectileLevel = entity.level;
                        if (!projectileLevel.isClientSide()) {
                            Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.2
                                public Projectile getArrow(Level level, float damage, int knockback) {
                                    AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                    entityToSpawn.setBaseDamage(damage);
                                    entityToSpawn.setKnockback(knockback);
                                    entityToSpawn.setSilent(true);
                                    return entityToSpawn;
                                }
                            }.getArrow(projectileLevel, 10.0f, 2);
                            _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                            _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel.addFreshEntity(_entityToSpawn);
                        }
                        if (entity instanceof LivingEntity) {
                            Player player = (LivingEntity) entity;
                            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHIZHU.get());
                            _setstack.setCount(1);
                            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (player instanceof Player) {
                                Player _player = player;
                                _player.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            Player player2 = (LivingEntity) entity;
                            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHISHIFANGSHI.get());
                            _setstack2.setCount(1);
                            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                            if (player2 instanceof Player) {
                                Player _player2 = player2;
                                _player2.getInventory().setChanged();
                            }
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.3
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
                                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHIZHU.get());
                                    _setstack3.setCount(1);
                                    player3.setItemInHand(InteractionHand.OFF_HAND, _setstack3);
                                    if (player3 instanceof Player) {
                                        Player _player3 = player3;
                                        _player3.getInventory().setChanged();
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, 5);
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.4
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
                                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get());
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
                        }.start(world, 10);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^ minecraft:air");
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 minecraft:air");
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^ minecraft:air");
                }
                if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e2 -> {
                    return true;
                }).isEmpty()) {
                    if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e3 -> {
                        return true;
                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.5
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble(_entcnd2 -> {
                                return _entcnd2.distanceToSqr(_x, _y, _z);
                            });
                        }
                    }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
                        world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e4 -> {
                            return true;
                        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.6
                            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                return Comparator.comparingDouble(_entcnd2 -> {
                                    return _entcnd2.distanceToSqr(_x, _y, _z);
                                });
                            }
                        }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
                    }
                    if (world instanceof Level _level2) {
                        if (!_level2.isClientSide()) {
                            _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                }
                LivingEntity livingEntity3 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e5 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.7
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd2 -> {
                            return _entcnd2.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (entity instanceof Mob _mobEnt2) {
                    livingEntity2 = _mobEnt2.getTarget();
                } else {
                    livingEntity2 = null;
                }
                if (livingEntity3 == livingEntity2) {
                    if (Math.random() <= 0.25d) {
                        entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                        if (!entity.level.isClientSide() && entity.getServer() != null) {
                            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^2 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.8
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
                                entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                                Entity _ent = entity;
                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, 1);
                    }
                    if (Math.random() <= 0.01d) {
                        entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                        new C08779(entity).start(world, 1);
                        new C086110(entity).start(world, 20);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C08541 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C08541(Entity entity) {
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

        private void run() {
            if (Math.random() <= 0.01d) {
                Entity _ent = this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C08551().start(this.world, 1);
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C08551 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C08551() {
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
                Entity _ent = C08541.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C08561().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C08561 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C08561() {
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
                    Entity _ent = C08541.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C08571().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C08571 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C08571() {
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
                        Entity _ent = C08541.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C08581().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C08581 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C08581() {
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

                        /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1$1$1$1$1$1] */
                        private void run() {
                            Entity _ent = C08541.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1.1.1.1.1.1
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

                                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1$1$1$1$1$1$1] */
                                private void run() {
                                    Entity _ent2 = C08541.this.val$entity;
                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1.1.1.1.1.1.1
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
                                            Entity _ent3 = C08541.this.val$entity;
                                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }
                                    }.start(this.world, 1);
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

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C08779 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C08779(Entity entity) {
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

        private void run() {
            Entity _ent = this.val$entity;
            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
            }
            new C08781().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C08781 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C08781() {
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
                Entity _ent = C08779.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                C08779.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                new C08791().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C08791 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C08791() {
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
                    Entity _ent = C08779.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    C08779.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                    new C08801().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C08801 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C08801() {
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
                        Entity _ent = C08779.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        C08779.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                        new C08811().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C08811 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C08811() {
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

                        /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$9$1$1$1$1$1] */
                        private void run() {
                            Entity _ent = C08779.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            C08779.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.9.1.1.1.1.1
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

                                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$9$1$1$1$1$1$1] */
                                private void run() {
                                    Entity _ent2 = C08779.this.val$entity;
                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.9.1.1.1.1.1.1
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
                                            Entity _ent3 = C08779.this.val$entity;
                                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            C08779.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }
                                    }.start(this.world, 1);
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

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C086110 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C086110(Entity entity) {
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

        /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$10$2] */
        private void run() {
            if (Math.random() <= 0.5d) {
                this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                Entity _ent = this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^-1 annoying_villagersbychentu:putongheiyaoshi");
                }
                Entity _ent2 = this.val$entity;
                if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                    _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^-1 annoying_villagersbychentu:putongheiyaoshi");
                }
                Entity _ent3 = this.val$entity;
                if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                    _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^-1 annoying_villagersbychentu:putongheiyaoshi");
                }
                Entity _ent4 = this.val$entity;
                if (!_ent4.level.isClientSide() && _ent4.getServer() != null) {
                    _ent4.getServer().getCommands().performCommand(_ent4.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^ annoying_villagersbychentu:putongheiyaoshi");
                }
                new C08621().start(this.world, 1);
                if (Math.random() <= 0.5d) {
                    this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.10.2
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

                        /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$10$2$1] */
                        private void run() {
                            Entity _ent5 = C086110.this.val$entity;
                            if (!_ent5.level.isClientSide() && _ent5.getServer() != null) {
                                _ent5.getServer().getCommands().performCommand(_ent5.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            C086110.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.10.2.1
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
                                    Entity _ent6 = C086110.this.val$entity;
                                    if (!_ent6.level.isClientSide() && _ent6.getServer() != null) {
                                        _ent6.getServer().getCommands().performCommand(_ent6.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    C086110.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(this.world, 1);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 1);
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C08621 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C08621() {
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
                Entity _ent = C086110.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                C086110.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                new C08631().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C08631 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C08631() {
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
                    Entity _ent = C086110.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    C086110.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                    new C08641().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C08641 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C08641() {
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
                        Entity _ent = C086110.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        C086110.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                        new C08651().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C08651 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C08651() {
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

                        /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$10$1$1$1$1$1] */
                        private void run() {
                            Entity _ent = C086110.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            C086110.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.10.1.1.1.1.1
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

                                /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$10$1$1$1$1$1$1] */
                                private void run() {
                                    Entity _ent2 = C086110.this.val$entity;
                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    C086110.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.10.1.1.1.1.1.1
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
                                            Entity _ent3 = C086110.this.val$entity;
                                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^4 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            C086110.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }
                                    }.start(this.world, 1);
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
}
