package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class OnePunchManDangShiTiHuiDongWuPinShiProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        new C11751(entity).start(world, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C11751 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C11751(Entity entity) {
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
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.explode(null, this.val$entity.getLookAngle().x + 1.0d, this.val$entity.getLookAngle().y + 1.0d, this.val$entity.getLookAngle().z + 1.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                }
            }
            new C11761().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C11761 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C11761() {
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
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.explode(null, C11751.this.val$entity.getLookAngle().x + 4.0d, C11751.this.val$entity.getLookAngle().y + 4.0d, C11751.this.val$entity.getLookAngle().z + 4.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                    }
                }
                new C11771().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C11771 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C11771() {
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
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.isClientSide()) {
                            _level.explode(null, C11751.this.val$entity.getLookAngle().x + 4.0d, C11751.this.val$entity.getLookAngle().y + 4.0d, C11751.this.val$entity.getLookAngle().z + 4.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                        }
                    }
                    new C11781().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C11781 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C11781() {
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
                        Level level = this.world;
                        if (level instanceof Level) {
                            Level _level = level;
                            if (!_level.isClientSide()) {
                                _level.explode(null, C11751.this.val$entity.getLookAngle().x + 6.0d, C11751.this.val$entity.getLookAngle().y + 6.0d, C11751.this.val$entity.getLookAngle().z + 6.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                            }
                        }
                        new C11791().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C11791 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C11791() {
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
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.explode(null, C11751.this.val$entity.getLookAngle().x + 8.0d, C11751.this.val$entity.getLookAngle().y + 8.0d, C11751.this.val$entity.getLookAngle().z + 8.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                                }
                            }
                            new C11801().start(this.world, 1);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C11801 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C11801() {
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
                                Level level = this.world;
                                if (level instanceof Level) {
                                    Level _level = level;
                                    if (!_level.isClientSide()) {
                                        _level.explode(null, C11751.this.val$entity.getLookAngle().x + 10.0d, C11751.this.val$entity.getLookAngle().y + 10.0d, C11751.this.val$entity.getLookAngle().z + 10.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                                    }
                                }
                                new C11811().start(this.world, 1);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */


                            public class C11811 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C11811() {
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
                                    Level level = this.world;
                                    if (level instanceof Level) {
                                        Level _level = level;
                                        if (!_level.isClientSide()) {
                                            _level.explode(null, C11751.this.val$entity.getLookAngle().x + 12.0d, C11751.this.val$entity.getLookAngle().y + 12.0d, C11751.this.val$entity.getLookAngle().z + 12.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                                        }
                                    }
                                    new C11821().start(this.world, 1);
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */


                                public class C11821 {
                                    private int ticks = 0;
                                    private float waitTicks;
                                    private LevelAccessor world;

                                    C11821() {
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
                                        Level level = this.world;
                                        if (level instanceof Level) {
                                            Level _level = level;
                                            if (!_level.isClientSide()) {
                                                _level.explode(null, C11751.this.val$entity.getLookAngle().x + 14.0d, C11751.this.val$entity.getLookAngle().y + 14.0d, C11751.this.val$entity.getLookAngle().z + 14.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                                            }
                                        }
                                        new C11831().start(this.world, 1);
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }

                                    /* JADX INFO: Access modifiers changed from: package-private */


                                    public class C11831 {
                                        private int ticks = 0;
                                        private float waitTicks;
                                        private LevelAccessor world;

                                        C11831() {
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

                                        /* JADX WARN: Type inference failed for: r0v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.OnePunchManDangShiTiHuiDongWuPinShiProcedure$1$1$1$1$1$1$1$1$1$1] */
                                        private void run() {
                                            Level level = this.world;
                                            if (level instanceof Level) {
                                                Level _level = level;
                                                if (!_level.isClientSide()) {
                                                    _level.explode(null, C11751.this.val$entity.getLookAngle().x + 16.0d, C11751.this.val$entity.getLookAngle().y + 16.0d, C11751.this.val$entity.getLookAngle().z + 16.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                                                }
                                            }
                                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.OnePunchManDangShiTiHuiDongWuPinShiProcedure.1.1.1.1.1.1.1.1.1.1
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

                                                /* JADX WARN: Type inference failed for: r0v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.OnePunchManDangShiTiHuiDongWuPinShiProcedure$1$1$1$1$1$1$1$1$1$1$1] */
                                                private void run() {
                                                    Level level2 = this.world;
                                                    if (level2 instanceof Level) {
                                                        Level _level2 = level2;
                                                        if (!_level2.isClientSide()) {
                                                            _level2.explode(null, C11751.this.val$entity.getLookAngle().x + 18.0d, C11751.this.val$entity.getLookAngle().y + 18.0d, C11751.this.val$entity.getLookAngle().z + 18.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                                                        }
                                                    }
                                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.OnePunchManDangShiTiHuiDongWuPinShiProcedure.1.1.1.1.1.1.1.1.1.1.1
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
                                                            Level level3 = this.world;
                                                            if (level3 instanceof Level) {
                                                                Level _level3 = level3;
                                                                if (!_level3.isClientSide()) {
                                                                    _level3.explode(null, C11751.this.val$entity.getLookAngle().x + 20.0d, C11751.this.val$entity.getLookAngle().y + 20.0d, C11751.this.val$entity.getLookAngle().z + 20.0d, 2.0f, Explosion.BlockInteraction.DESTROY);
                                                                }
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
            }
        }
    }
}
