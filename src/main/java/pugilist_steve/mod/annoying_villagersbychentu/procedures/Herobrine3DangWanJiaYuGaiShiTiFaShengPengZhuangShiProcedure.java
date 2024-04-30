package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
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


public class Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v36, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        LivingEntity livingEntity;
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
                if (Math.random() <= 0.09d) {
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    if (!entity.level.isClientSide() && entity.getServer() != null) {
                        entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1
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
                            Entity _ent = entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 1);
                }
                if (Math.random() <= 0.01d) {
                    if (world instanceof Level _level2) {
                        if (!_level2.isClientSide()) {
                            _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    new C07482(entity).start(world, 1);
                    new C07553(x, y, z, entity).start(world, 20);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C07482 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C07482(Entity entity) {
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
            new C07491().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C07491 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C07491() {
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
                Entity _ent = C07482.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C07501().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C07501 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C07501() {
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
                    Entity _ent = C07482.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C07511().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C07511 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C07511() {
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
                        Entity _ent = C07482.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C07521().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C07521 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C07521() {
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

                        /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$2$1$1$1$1$1] */
                        private void run() {
                            Entity _ent = C07482.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.2.1.1.1.1.1
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

                                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$2$1$1$1$1$1$1] */
                                private void run() {
                                    Entity _ent2 = C07482.this.val$entity;
                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.2.1.1.1.1.1.1
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
                                            Entity _ent3 = C07482.this.val$entity;
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


    public class C07553 {
        final double val$x;
        final double val$y;
        final double val$z;
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C07553(double d, double d2, double d3, Entity entity) {
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

        /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$3$2] */
        private void run() {
            if (Math.random() <= 0.5d) {
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
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
                new C07561().start(this.world, 1);
                if (Math.random() <= 0.5d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.3.2
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

                        /* JADX WARN: Type inference failed for: r0v6, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$3$2$1] */
                        private void run() {
                            Entity _ent5 = C07553.this.val$entity;
                            if (!_ent5.level.isClientSide() && _ent5.getServer() != null) {
                                _ent5.getServer().getCommands().performCommand(_ent5.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.3.2.1
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
                                    Entity _ent6 = C07553.this.val$entity;
                                    if (!_ent6.level.isClientSide() && _ent6.getServer() != null) {
                                        _ent6.getServer().getCommands().performCommand(_ent6.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                    }
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


        public class C07561 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C07561() {
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
                Entity _ent = C07553.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C07571().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C07571 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C07571() {
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
                    Entity _ent = C07553.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C07581().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C07581 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C07581() {
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
                        Entity _ent = C07553.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C07591().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C07591 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C07591() {
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

                        /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$3$1$1$1$1$1] */
                        private void run() {
                            Entity _ent = C07553.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.3.1.1.1.1.1
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

                                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$3$1$1$1$1$1$1] */
                                private void run() {
                                    Entity _ent2 = C07553.this.val$entity;
                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.3.1.1.1.1.1.1
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
                                            Entity _ent3 = C07553.this.val$entity;
                                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^4 annoying_villagersbychentu:putongheiyaoshi");
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
}
