package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Herobrine3DangShiTiGengXiKeShiProcedure {
    /* JADX WARN: Type inference failed for: r0v43, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r1v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v36, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure$2] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        LivingEntity livingEntity;
        if (entity == null) {
            return;
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
        if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e -> {
            return true;
        }).isEmpty()) {
            if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
                world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e3 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure.2
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2.0d), e4 -> {
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
                if (Math.random() <= 0.25d) {
                    entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                    if (!entity.level.isClientSide() && entity.getServer() != null) {
                        entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure.3
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
                if (Math.random() <= 0.06d) {
                    entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                    new C06914(entity).start(world, 1);
                    new C06985(entity).start(world, 20);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C06914 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C06914(Entity entity) {
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
            new C06921().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C06921 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C06921() {
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
                Entity _ent = C06914.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                C06914.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                new C06931().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C06931 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C06931() {
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
                    Entity _ent = C06914.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    C06914.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                    new C06941().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C06941 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C06941() {
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
                        Entity _ent = C06914.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        C06914.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                        new C06951().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C06951 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C06951() {
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

                        /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure$4$1$1$1$1$1] */
                        private void run() {
                            Entity _ent = C06914.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            C06914.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure.4.1.1.1.1.1
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

                                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure$4$1$1$1$1$1$1] */
                                private void run() {
                                    Entity _ent2 = C06914.this.val$entity;
                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure.4.1.1.1.1.1.1
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
                                            Entity _ent3 = C06914.this.val$entity;
                                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            C06914.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
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


    public class C06985 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C06985(Entity entity) {
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

        /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure$5$2] */
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
                new C06991().start(this.world, 1);
                if (Math.random() <= 0.5d) {
                    this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure.5.2
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

                        /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure$5$2$1] */
                        private void run() {
                            Entity _ent5 = C06985.this.val$entity;
                            if (!_ent5.level.isClientSide() && _ent5.getServer() != null) {
                                _ent5.getServer().getCommands().performCommand(_ent5.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            C06985.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure.5.2.1
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
                                    Entity _ent6 = C06985.this.val$entity;
                                    if (!_ent6.level.isClientSide() && _ent6.getServer() != null) {
                                        _ent6.getServer().getCommands().performCommand(_ent6.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    C06985.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
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


        public class C06991 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C06991() {
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
                Entity _ent = C06985.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                C06985.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                new C07001().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C07001 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C07001() {
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
                    Entity _ent = C06985.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    C06985.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                    new C07011().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C07011 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C07011() {
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
                        Entity _ent = C06985.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        C06985.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                        new C07021().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C07021 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C07021() {
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

                        /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure$5$1$1$1$1$1] */
                        private void run() {
                            Entity _ent = C06985.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            C06985.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure.5.1.1.1.1.1
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

                                /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure$5$1$1$1$1$1$1] */
                                private void run() {
                                    Entity _ent2 = C06985.this.val$entity;
                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    C06985.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiGengXiKeShiProcedure.5.1.1.1.1.1.1
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
                                            Entity _ent3 = C06985.this.val$entity;
                                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^4 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            C06985.this.val$entity.setDeltaMovement(new Vec3(0.0d, 0.0d, 0.0d));
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
