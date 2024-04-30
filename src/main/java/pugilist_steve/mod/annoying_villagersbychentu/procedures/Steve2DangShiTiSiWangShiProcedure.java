package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class Steve2DangShiTiSiWangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v19, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiSiWangShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() >= 0.35d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiSiWangShiProcedure.1
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

                /* JADX WARN: Type inference failed for: r0v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiSiWangShiProcedure$1$1] */
                private void run() {
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.isClientSide()) {
                            _level.explode(null, x, y + 1.0d, z, 3.0f, Explosion.BlockInteraction.NONE);
                        }
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiSiWangShiProcedure.1.1
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
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle minecraft:totem_of_undying ^ ^1.5 ^ 0 0 0 1 1000");
                            }
                            Entity _ent2 = entity;
                            if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:fennudeshidifu");
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 20);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 20);
            return;
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesayno")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesayno")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Steve> 不！"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        new C12832(x, y, z, entity).start(world, 20);
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C12832 {
        final double val$x;
        final double val$y;
        final double val$z;
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C12832(double d, double d2, double d3, Entity entity) {
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

        private void run() {
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_HELMET.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    ItemEntity entityToSpawn2 = new ItemEntity(_level2, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_CHESTPLATE.get()));
                    entityToSpawn2.setPickUpDelay(10);
                    _level2.addFreshEntity(entityToSpawn2);
                }
            }
            Level level3 = this.world;
            if (level3 instanceof Level) {
                Level _level3 = level3;
                if (!_level3.isClientSide()) {
                    ItemEntity entityToSpawn3 = new ItemEntity(_level3, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.DIAMOND_CHESTPLATE));
                    entityToSpawn3.setPickUpDelay(10);
                    _level3.addFreshEntity(entityToSpawn3);
                }
            }
            Level level4 = this.world;
            if (level4 instanceof Level) {
                Level _level4 = level4;
                if (!_level4.isClientSide()) {
                    ItemEntity entityToSpawn4 = new ItemEntity(_level4, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.GOLDEN_APPLE));
                    entityToSpawn4.setPickUpDelay(10);
                    _level4.addFreshEntity(entityToSpawn4);
                }
            }
            Level level5 = this.world;
            if (level5 instanceof Level) {
                Level _level5 = level5;
                if (!_level5.isClientSide()) {
                    ItemEntity entityToSpawn5 = new ItemEntity(_level5, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.GOLDEN_APPLE));
                    entityToSpawn5.setPickUpDelay(10);
                    _level5.addFreshEntity(entityToSpawn5);
                }
            }
            Level level6 = this.world;
            if (level6 instanceof Level) {
                Level _level6 = level6;
                if (!_level6.isClientSide()) {
                    ItemEntity entityToSpawn6 = new ItemEntity(_level6, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.GOLDEN_APPLE));
                    entityToSpawn6.setPickUpDelay(10);
                    _level6.addFreshEntity(entityToSpawn6);
                }
            }
            Level level7 = this.world;
            if (level7 instanceof Level) {
                Level _level7 = level7;
                if (!_level7.isClientSide()) {
                    ItemEntity entityToSpawn7 = new ItemEntity(_level7, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.GOLDEN_APPLE));
                    entityToSpawn7.setPickUpDelay(10);
                    _level7.addFreshEntity(entityToSpawn7);
                }
            }
            Level level8 = this.world;
            if (level8 instanceof Level) {
                Level _level8 = level8;
                if (!_level8.isClientSide()) {
                    ItemEntity entityToSpawn8 = new ItemEntity(_level8, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.GOLDEN_APPLE));
                    entityToSpawn8.setPickUpDelay(10);
                    _level8.addFreshEntity(entityToSpawn8);
                }
            }
            Level level9 = this.world;
            if (level9 instanceof Level) {
                Level _level9 = level9;
                if (!_level9.isClientSide()) {
                    ItemEntity entityToSpawn9 = new ItemEntity(_level9, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.GOLDEN_APPLE));
                    entityToSpawn9.setPickUpDelay(10);
                    _level9.addFreshEntity(entityToSpawn9);
                }
            }
            Level level10 = this.world;
            if (level10 instanceof Level) {
                Level _level10 = level10;
                if (!_level10.isClientSide()) {
                    ItemEntity entityToSpawn10 = new ItemEntity(_level10, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.GOLDEN_APPLE));
                    entityToSpawn10.setPickUpDelay(10);
                    _level10.addFreshEntity(entityToSpawn10);
                }
            }
            Level level11 = this.world;
            if (level11 instanceof Level) {
                Level _level11 = level11;
                if (!_level11.isClientSide()) {
                    ItemEntity entityToSpawn11 = new ItemEntity(_level11, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_JU_JIAN.get()));
                    entityToSpawn11.setPickUpDelay(10);
                    _level11.addFreshEntity(entityToSpawn11);
                }
            }
            Level level12 = this.world;
            if (level12 instanceof Level) {
                Level _level12 = level12;
                if (!_level12.isClientSide()) {
                    ItemEntity entityToSpawn12 = new ItemEntity(_level12, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(AnnoyingVillagersbychentuModItems.FUMOMUMEN.get()));
                    entityToSpawn12.setPickUpDelay(10);
                    _level12.addFreshEntity(entityToSpawn12);
                }
            }
            Level level13 = this.world;
            if (level13 instanceof Level) {
                Level _level13 = level13;
                if (!_level13.isClientSide()) {
                    ItemEntity entityToSpawn13 = new ItemEntity(_level13, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                    entityToSpawn13.setPickUpDelay(10);
                    _level13.addFreshEntity(entityToSpawn13);
                }
            }
            Level level14 = this.world;
            if (level14 instanceof Level) {
                Level _level14 = level14;
                if (!_level14.isClientSide()) {
                    ItemEntity entityToSpawn14 = new ItemEntity(_level14, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.DIAMOND_SWORD));
                    entityToSpawn14.setPickUpDelay(10);
                    _level14.addFreshEntity(entityToSpawn14);
                }
            }
            Level level15 = this.world;
            if (level15 instanceof Level) {
                Level _level15 = level15;
                if (!_level15.isClientSide()) {
                    ItemEntity entityToSpawn15 = new ItemEntity(_level15, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.ENDER_PEARL));
                    entityToSpawn15.setPickUpDelay(10);
                    _level15.addFreshEntity(entityToSpawn15);
                }
            }
            Level level16 = this.world;
            if (level16 instanceof Level) {
                Level _level16 = level16;
                if (!_level16.isClientSide()) {
                    ItemEntity entityToSpawn16 = new ItemEntity(_level16, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.ENDER_PEARL));
                    entityToSpawn16.setPickUpDelay(10);
                    _level16.addFreshEntity(entityToSpawn16);
                }
            }
            Level level17 = this.world;
            if (level17 instanceof Level) {
                Level _level17 = level17;
                if (!_level17.isClientSide()) {
                    ItemEntity entityToSpawn17 = new ItemEntity(_level17, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.ENDER_PEARL));
                    entityToSpawn17.setPickUpDelay(10);
                    _level17.addFreshEntity(entityToSpawn17);
                }
            }
            Level level18 = this.world;
            if (level18 instanceof Level) {
                Level _level18 = level18;
                if (!_level18.isClientSide()) {
                    ItemEntity entityToSpawn18 = new ItemEntity(_level18, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Blocks.DIRT));
                    entityToSpawn18.setPickUpDelay(10);
                    _level18.addFreshEntity(entityToSpawn18);
                }
            }
            Level level19 = this.world;
            if (level19 instanceof Level) {
                Level _level19 = level19;
                if (!_level19.isClientSide()) {
                    ItemEntity entityToSpawn19 = new ItemEntity(_level19, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Blocks.DIRT));
                    entityToSpawn19.setPickUpDelay(10);
                    _level19.addFreshEntity(entityToSpawn19);
                }
            }
            Level level20 = this.world;
            if (level20 instanceof Level) {
                Level _level20 = level20;
                if (!_level20.isClientSide()) {
                    ItemEntity entityToSpawn20 = new ItemEntity(_level20, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Blocks.DIRT));
                    entityToSpawn20.setPickUpDelay(10);
                    _level20.addFreshEntity(entityToSpawn20);
                }
            }
            Level level21 = this.world;
            if (level21 instanceof Level) {
                Level _level21 = level21;
                if (!_level21.isClientSide()) {
                    ItemEntity entityToSpawn21 = new ItemEntity(_level21, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Blocks.DIRT));
                    entityToSpawn21.setPickUpDelay(10);
                    _level21.addFreshEntity(entityToSpawn21);
                }
            }
            Level level22 = this.world;
            if (level22 instanceof Level) {
                Level _level22 = level22;
                if (!_level22.isClientSide()) {
                    ItemEntity entityToSpawn22 = new ItemEntity(_level22, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Blocks.DIRT));
                    entityToSpawn22.setPickUpDelay(10);
                    _level22.addFreshEntity(entityToSpawn22);
                }
            }
            Level level23 = this.world;
            if (level23 instanceof Level) {
                Level _level23 = level23;
                if (!_level23.isClientSide()) {
                    ItemEntity entityToSpawn23 = new ItemEntity(_level23, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Blocks.DIRT));
                    entityToSpawn23.setPickUpDelay(10);
                    _level23.addFreshEntity(entityToSpawn23);
                }
            }
            Level level24 = this.world;
            if (level24 instanceof Level) {
                Level _level24 = level24;
                if (!_level24.isClientSide()) {
                    ItemEntity entityToSpawn24 = new ItemEntity(_level24, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Blocks.DIRT));
                    entityToSpawn24.setPickUpDelay(10);
                    _level24.addFreshEntity(entityToSpawn24);
                }
            }
            Level level25 = this.world;
            if (level25 instanceof Level) {
                Level _level25 = level25;
                if (!_level25.isClientSide()) {
                    ItemEntity entityToSpawn25 = new ItemEntity(_level25, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_JIAN.get()));
                    entityToSpawn25.setPickUpDelay(10);
                    _level25.addFreshEntity(entityToSpawn25);
                }
            }
            Level level26 = this.world;
            if (level26 instanceof Level) {
                Level _level26 = level26;
                if (!_level26.isClientSide()) {
                    ItemEntity entityToSpawn26 = new ItemEntity(_level26, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                    entityToSpawn26.setPickUpDelay(10);
                    _level26.addFreshEntity(entityToSpawn26);
                }
            }
            Level level27 = this.world;
            if (level27 instanceof Level) {
                Level _level27 = level27;
                if (!_level27.isClientSide()) {
                    ItemEntity entityToSpawn27 = new ItemEntity(_level27, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.DIAMOND_SWORD));
                    entityToSpawn27.setPickUpDelay(10);
                    _level27.addFreshEntity(entityToSpawn27);
                }
            }
            Level level28 = this.world;
            if (level28 instanceof Level) {
                Level _level28 = level28;
                if (!_level28.isClientSide()) {
                    ItemEntity entityToSpawn28 = new ItemEntity(_level28, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.WHITE_BED));
                    entityToSpawn28.setPickUpDelay(10);
                    _level28.addFreshEntity(entityToSpawn28);
                }
            }
            Level level29 = this.world;
            if (level29 instanceof Level) {
                Level _level29 = level29;
                if (!_level29.isClientSide()) {
                    ItemEntity entityToSpawn29 = new ItemEntity(_level29, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.CAKE));
                    entityToSpawn29.setPickUpDelay(10);
                    _level29.addFreshEntity(entityToSpawn29);
                }
            }
            Level level30 = this.world;
            if (level30 instanceof Level) {
                Level _level30 = level30;
                if (!_level30.isClientSide()) {
                    ItemEntity entityToSpawn30 = new ItemEntity(_level30, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                    entityToSpawn30.setPickUpDelay(10);
                    _level30.addFreshEntity(entityToSpawn30);
                }
            }
            Level level31 = this.world;
            if (level31 instanceof Level) {
                Level _level31 = level31;
                if (!_level31.isClientSide()) {
                    ItemEntity entityToSpawn31 = new ItemEntity(_level31, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                    entityToSpawn31.setPickUpDelay(10);
                    _level31.addFreshEntity(entityToSpawn31);
                }
            }
            Level level32 = this.world;
            if (level32 instanceof Level) {
                Level _level32 = level32;
                if (!_level32.isClientSide()) {
                    ItemEntity entityToSpawn32 = new ItemEntity(_level32, this.val$x, this.val$y + 1.0d, this.val$z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                    entityToSpawn32.setPickUpDelay(10);
                    _level32.addFreshEntity(entityToSpawn32);
                }
            }
            if (!this.world.isClientSide() && this.world.getServer() != null) {
                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("Steve死了"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            if (Math.random() <= 0.2d) {
                new C12841().start(this.world, 40);
            }
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C12841 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C12841() {
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
                Entity _ent = C12832.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> What happened?\"}");
                }
                new C12851().start(this.world, 35);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C12851 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C12851() {
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
                    Entity _ent = C12832.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> 啊？\"}");
                    }
                    new C12861().start(this.world, 60);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C12861 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C12861() {
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
                        Entity _ent = C12832.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> Who are you?\"}");
                        }
                        new C12871().start(this.world, 67);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C12871 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C12871() {
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
                            Entity _ent = C12832.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> You are so strong!\"}");
                            }
                            new C12881().start(this.world, 100);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C12881 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C12881() {
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
                                if (this.world.players().size() >= 5) {
                                    Entity _ent = C12832.this.val$entity;
                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> 建议你跟Pugilist_Steve打一下，他也很强\"}");
                                    }
                                }
                                new C12891().start(this.world, 70);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */


                            public class C12891 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C12891() {
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
                                    Entity _ent = C12832.this.val$entity;
                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> 那些装备就送你了吧，因为这是你的战利品\"}");
                                    }
                                    new C12901().start(this.world, 100);
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */


                                public class C12901 {
                                    private int ticks = 0;
                                    private float waitTicks;
                                    private LevelAccessor world;

                                    C12901() {
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
                                        Entity _ent = C12832.this.val$entity;
                                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> 正想找个玩家来代替我的，我看就你了吧，因为你是唯一能打败我的玩家\"}");
                                        }
                                        new C12911().start(this.world, 60);
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }

                                    /* JADX INFO: Access modifiers changed from: package-private */


                                    public class C12911 {
                                        private int ticks = 0;
                                        private float waitTicks;
                                        private LevelAccessor world;

                                        C12911() {
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
                                            Entity _ent = C12832.this.val$entity;
                                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> 那就这样吧，祝你好运\"}");
                                            }
                                            new C12921().start(this.world, 50);
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }

                                        /* JADX INFO: Access modifiers changed from: package-private */


                                        public class C12921 {
                                            private int ticks = 0;
                                            private float waitTicks;
                                            private LevelAccessor world;

                                            C12921() {
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

                                            /* JADX WARN: Type inference failed for: r0v14, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiSiWangShiProcedure$2$1$1$1$1$1$1$1$1$1$1] */
                                            private void run() {
                                                Entity _ent = C12832.this.val$entity;
                                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> 我可能还会来的\"}");
                                                }
                                                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiSiWangShiProcedure.2.1.1.1.1.1.1.1.1.1.1
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

                                                    /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiSiWangShiProcedure$2$1$1$1$1$1$1$1$1$1$1$1] */
                                                    private void run() {
                                                        Entity _ent2 = C12832.this.val$entity;
                                                        if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                                            _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"<Steve> Goodbye\"}");
                                                        }
                                                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiSiWangShiProcedure.2.1.1.1.1.1.1.1.1.1.1.1
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
                                                                if (this.world.players().size() >= 4) {
                                                                    Entity _ent3 = C12832.this.val$entity;
                                                                    if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                                        _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"Steve left the game\",\"color\":\"yellow\"}");
                                                                    }
                                                                } else {
                                                                    Entity _ent4 = C12832.this.val$entity;
                                                                    if (!_ent4.level.isClientSide() && _ent4.getServer() != null) {
                                                                        _ent4.getServer().getCommands().performCommand(_ent4.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"Steve退出了游戏\",\"color\":\"yellow\"}");
                                                                    }
                                                                }
                                                                MinecraftForge.EVENT_BUS.unregister(this);
                                                            }
                                                        }.start(this.world, 50);
                                                        MinecraftForge.EVENT_BUS.unregister(this);
                                                    }
                                                }.start(this.world, 65);
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
