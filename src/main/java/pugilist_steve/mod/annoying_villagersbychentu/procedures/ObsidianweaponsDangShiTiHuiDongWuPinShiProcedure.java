package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Random;


public class ObsidianweaponsDangShiTiHuiDongWuPinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        new C11341(entity, x, y, z).start(world, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C11341 {
        final Entity val$entity;
        final double val$x;
        final double val$y;
        final double val$z;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C11341(Entity entity, double d, double d2, double d3) {
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

        private void run() {
            ItemStack itemStack;
            ItemStack itemStack2;
            ItemStack itemStack3;
            ItemStack itemStack4;
            if (this.val$entity instanceof LivingEntity) {
                LivingEntity _livEnt = this.val$entity;
                itemStack = _livEnt.getMainHandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.OBSIDIANWEAPONS.get()) {
                if (this.val$entity instanceof LivingEntity) {
                    LivingEntity _livEnt2 = this.val$entity;
                    itemStack4 = _livEnt2.getMainHandItem();
                } else {
                    itemStack4 = ItemStack.EMPTY;
                }
                ItemStack _ist = itemStack4;
                if (_ist.hurt(100, new Random(), null)) {
                    _ist.shrink(1);
                    _ist.setDamageValue(0);
                }
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                Entity _ent = this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C11351().start(this.world, 1);
            } else {
                if (this.val$entity instanceof LivingEntity) {
                    LivingEntity _livEnt3 = this.val$entity;
                    itemStack2 = _livEnt3.getOffhandItem();
                } else {
                    itemStack2 = ItemStack.EMPTY;
                }
                if (itemStack2.getItem() == AnnoyingVillagersbychentuModItems.OBSIDIANWEAPONS.get()) {
                    if (this.val$entity instanceof LivingEntity) {
                        LivingEntity _livEnt4 = this.val$entity;
                        itemStack3 = _livEnt4.getOffhandItem();
                    } else {
                        itemStack3 = ItemStack.EMPTY;
                    }
                    ItemStack _ist2 = itemStack3;
                    if (_ist2.hurt(100, new Random(), null)) {
                        _ist2.shrink(1);
                        _ist2.setDamageValue(0);
                    }
                    Level level2 = this.world;
                    if (level2 instanceof Level) {
                        Level _level2 = level2;
                        if (!_level2.isClientSide()) {
                            _level2.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level2.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    Entity _ent2 = this.val$entity;
                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C11472().start(this.world, 1);
                }
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C11351 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C11351() {
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
                Entity _ent = C11341.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C11361().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C11361 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C11361() {
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
                    Entity _ent = C11341.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C11371().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C11371 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C11371() {
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
                        Entity _ent = C11341.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C11381().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C11381 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C11381() {
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
                            Entity _ent = C11341.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new C11391().start(this.world, 1);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C11391 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C11391() {
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
                                Entity _ent = C11341.this.val$entity;
                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^7 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                if (Math.random() < 0.5d) {
                                    new C11401().start(this.world, 1);
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */


                            public class C11401 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C11401() {
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
                                    Entity _ent = C11341.this.val$entity;
                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^8 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new C11411().start(this.world, 1);
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */


                                public class C11411 {
                                    private int ticks = 0;
                                    private float waitTicks;
                                    private LevelAccessor world;

                                    C11411() {
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
                                        Entity _ent = C11341.this.val$entity;
                                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^9 annoying_villagersbychentu:putongheiyaoshi");
                                        }
                                        new C11421().start(this.world, 1);
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }

                                    /* JADX INFO: Access modifiers changed from: package-private */


                                    public class C11421 {
                                        private int ticks = 0;
                                        private float waitTicks;
                                        private LevelAccessor world;

                                        C11421() {
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
                                            Entity _ent = C11341.this.val$entity;
                                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^10 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            if (Math.random() < 0.5d) {
                                                new C11431().start(this.world, 1);
                                            }
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }

                                        /* JADX INFO: Access modifiers changed from: package-private */


                                        public class C11431 {
                                            private int ticks = 0;
                                            private float waitTicks;
                                            private LevelAccessor world;

                                            C11431() {
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
                                                Entity _ent = C11341.this.val$entity;
                                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^11 annoying_villagersbychentu:putongheiyaoshi");
                                                }
                                                new C11441().start(this.world, 1);
                                                MinecraftForge.EVENT_BUS.unregister(this);
                                            }

                                            /* JADX INFO: Access modifiers changed from: package-private */


                                            public class C11441 {
                                                private int ticks = 0;
                                                private float waitTicks;
                                                private LevelAccessor world;

                                                C11441() {
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

                                                /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ObsidianweaponsDangShiTiHuiDongWuPinShiProcedure$1$1$1$1$1$1$1$1$1$1$1$1] */
                                                private void run() {
                                                    Entity _ent = C11341.this.val$entity;
                                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^12 annoying_villagersbychentu:putongheiyaoshi");
                                                    }
                                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ObsidianweaponsDangShiTiHuiDongWuPinShiProcedure.1.1.1.1.1.1.1.1.1.1.1.1
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

                                                        /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ObsidianweaponsDangShiTiHuiDongWuPinShiProcedure$1$1$1$1$1$1$1$1$1$1$1$1$1] */
                                                        private void run() {
                                                            Entity _ent2 = C11341.this.val$entity;
                                                            if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                                                _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^13 annoying_villagersbychentu:putongheiyaoshi");
                                                            }
                                                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ObsidianweaponsDangShiTiHuiDongWuPinShiProcedure.1.1.1.1.1.1.1.1.1.1.1.1.1
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
                                                                    Entity _ent3 = C11341.this.val$entity;
                                                                    if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                                        _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^15 annoying_villagersbychentu:putongheiyaoshi");
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

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C11472 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C11472() {
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
                Entity _ent = C11341.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C11481().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C11481 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C11481() {
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
                    Entity _ent = C11341.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C11491().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C11491 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C11491() {
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
                        Entity _ent = C11341.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C11501().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C11501 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C11501() {
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
                            Entity _ent = C11341.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new C11511().start(this.world, 1);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C11511 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C11511() {
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
                                Entity _ent = C11341.this.val$entity;
                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^7 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                if (Math.random() < 0.5d) {
                                    new C11521().start(this.world, 1);
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */


                            public class C11521 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C11521() {
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
                                    Entity _ent = C11341.this.val$entity;
                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^8 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new C11531().start(this.world, 1);
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */


                                public class C11531 {
                                    private int ticks = 0;
                                    private float waitTicks;
                                    private LevelAccessor world;

                                    C11531() {
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
                                        Entity _ent = C11341.this.val$entity;
                                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^9 annoying_villagersbychentu:putongheiyaoshi");
                                        }
                                        new C11541().start(this.world, 1);
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }

                                    /* JADX INFO: Access modifiers changed from: package-private */


                                    public class C11541 {
                                        private int ticks = 0;
                                        private float waitTicks;
                                        private LevelAccessor world;

                                        C11541() {
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
                                            Entity _ent = C11341.this.val$entity;
                                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^10 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            if (Math.random() < 0.5d) {
                                                new C11551().start(this.world, 1);
                                            }
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }

                                        /* JADX INFO: Access modifiers changed from: package-private */


                                        public class C11551 {
                                            private int ticks = 0;
                                            private float waitTicks;
                                            private LevelAccessor world;

                                            C11551() {
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
                                                Entity _ent = C11341.this.val$entity;
                                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^11 annoying_villagersbychentu:putongheiyaoshi");
                                                }
                                                new C11561().start(this.world, 1);
                                                MinecraftForge.EVENT_BUS.unregister(this);
                                            }

                                            /* JADX INFO: Access modifiers changed from: package-private */


                                            public class C11561 {
                                                private int ticks = 0;
                                                private float waitTicks;
                                                private LevelAccessor world;

                                                C11561() {
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

                                                /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ObsidianweaponsDangShiTiHuiDongWuPinShiProcedure$1$2$1$1$1$1$1$1$1$1$1$1] */
                                                private void run() {
                                                    Entity _ent = C11341.this.val$entity;
                                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^12 annoying_villagersbychentu:putongheiyaoshi");
                                                    }
                                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ObsidianweaponsDangShiTiHuiDongWuPinShiProcedure.1.2.1.1.1.1.1.1.1.1.1.1
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

                                                        /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ObsidianweaponsDangShiTiHuiDongWuPinShiProcedure$1$2$1$1$1$1$1$1$1$1$1$1$1] */
                                                        private void run() {
                                                            Entity _ent2 = C11341.this.val$entity;
                                                            if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                                                _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^13 annoying_villagersbychentu:putongheiyaoshi");
                                                            }
                                                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ObsidianweaponsDangShiTiHuiDongWuPinShiProcedure.1.2.1.1.1.1.1.1.1.1.1.1.1
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
                                                                    Entity _ent3 = C11341.this.val$entity;
                                                                    if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                                        _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^15 annoying_villagersbychentu:putongheiyaoshi");
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
    }
}
