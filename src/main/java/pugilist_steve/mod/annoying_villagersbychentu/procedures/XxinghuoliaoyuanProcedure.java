package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class XxinghuoliaoyuanProcedure {
    public static void execute(LevelAccessor world, double y, Entity entity) {
        if (entity == null) {
            return;
        }
        Blocks.AIR.defaultBlockState();
        if (entity.isShiftKeyDown()) {
            if (entity instanceof Player _player) {
                _player.getCooldowns().addCooldown(AnnoyingVillagersbychentuModItems.HONG_BAO_SHI_CHANG_BING_JIAN.get(), 200);
            }
            new C13371(entity, y).start(world, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C13371 {
        final Entity val$entity;
        final double val$y;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C13371(Entity entity, double d) {
            this.val$entity = entity;
            this.val$y = d;
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

        /* JADX INFO: Access modifiers changed from: package-private */

        private void run() {
            this.world.setBlock(new BlockPos(this.val$entity.getLookAngle().x + 1.0d, this.val$y, this.val$entity.getLookAngle().z + 1.0d), Blocks.FIRE.defaultBlockState(), 3);
            new C13381().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        public class C13381 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C13381() {
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

            /* JADX INFO: Access modifiers changed from: package-private */

            private void run() {
                this.world.setBlock(new BlockPos(C13371.this.val$entity.getLookAngle().x + 2.0d, C13371.this.val$y, C13371.this.val$entity.getLookAngle().z + 2.0d), Blocks.FIRE.defaultBlockState(), 3);
                new C13391().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            public class C13391 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C13391() {
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

                /* JADX INFO: Access modifiers changed from: package-private */

                private void run() {
                    this.world.setBlock(new BlockPos(C13371.this.val$entity.getLookAngle().x + 3.0d, C13371.this.val$y, C13371.this.val$entity.getLookAngle().z + 3.0d), Blocks.FIRE.defaultBlockState(), 3);
                    new C13401().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                public class C13401 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C13401() {
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

                    /* JADX INFO: Access modifiers changed from: package-private */

                    private void run() {
                        this.world.setBlock(new BlockPos(C13371.this.val$entity.getLookAngle().x + 4.0d, C13371.this.val$y, C13371.this.val$entity.getLookAngle().z + 4.0d), Blocks.FIRE.defaultBlockState(), 3);
                        new C13411().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    public class C13411 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C13411() {
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

                        /* JADX INFO: Access modifiers changed from: package-private */

                        private void run() {
                            this.world.setBlock(new BlockPos(C13371.this.val$entity.getLookAngle().x + 5.0d, C13371.this.val$y, C13371.this.val$entity.getLookAngle().z + 5.0d), Blocks.FIRE.defaultBlockState(), 3);
                            new C13421().start(this.world, 1);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        public class C13421 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C13421() {
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

                            /* JADX INFO: Access modifiers changed from: package-private */

                            private void run() {
                                this.world.setBlock(new BlockPos(C13371.this.val$entity.getLookAngle().x + 6.0d, C13371.this.val$y, C13371.this.val$entity.getLookAngle().z + 6.0d), Blocks.FIRE.defaultBlockState(), 3);
                                new C13431().start(this.world, 1);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            public class C13431 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C13431() {
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

                                /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.XxinghuoliaoyuanProcedure$1$1$1$1$1$1$1$1] */
                                private void run() {
                                    this.world.setBlock(new BlockPos(C13371.this.val$entity.getLookAngle().x + 7.0d, C13371.this.val$y, C13371.this.val$entity.getLookAngle().z + 7.0d), Blocks.FIRE.defaultBlockState(), 3);
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.XxinghuoliaoyuanProcedure.1.1.1.1.1.1.1.1
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

                                        /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.XxinghuoliaoyuanProcedure$1$1$1$1$1$1$1$1$1] */
                                        private void run() {
                                            this.world.setBlock(new BlockPos(C13371.this.val$entity.getLookAngle().x + 8.0d, C13371.this.val$y, C13371.this.val$entity.getLookAngle().z + 8.0d), Blocks.FIRE.defaultBlockState(), 3);
                                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.XxinghuoliaoyuanProcedure.1.1.1.1.1.1.1.1.1
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
                                                    this.world.setBlock(new BlockPos(C13371.this.val$entity.getLookAngle().x + 9.0d, C13371.this.val$y, C13371.this.val$entity.getLookAngle().z + 9.0d), Blocks.FIRE.defaultBlockState(), 3);
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
