package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
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
import pugilist_steve.mod.annoying_villagersbychentu.entity.BTridentEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModParticleTypes;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class BlueDemonDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v154, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v155, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v171, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        LivingEntity livingEntity;
        float f;
        LivingEntity livingEntity2;
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(45.0d), e -> {
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
            if (entity2 == livingEntity && entity.isAlive()) {
                if (Math.random() <= 0.05d && !entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:lightning_bolt ^2 ^ ^2");
                }
                entity.setSprinting(true);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure.1
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
                        entity.setSprinting(false);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 10);
                if (Math.random() <= 0.007d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure.2
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
                            if (!this.world.isClientSide() && this.world.getServer() != null) {
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> 光凭外表认为我们是一样是多么愚蠢的想法，你的傲慢会让你失败的"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level = level;
                                if (!_level.isClientSide()) {
                                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 40);
                }
                if (Math.random() <= 0.006d) {
                    if (!world.isClientSide() && world.getServer() != null) {
                        world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> 多么有趣，告诉我你还要做什么？"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay2")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay2")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                }
                if (Math.random() <= 0.007d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure.3
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
                            if (!this.world.isClientSide() && this.world.getServer() != null) {
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> 多么有趣，玩家是如此迷人的生物"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level2 = level;
                                if (!_level2.isClientSide()) {
                                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay3")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay3")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 13);
                }
                if (Math.random() <= 0.007d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure.4
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
                            if (!this.world.isClientSide() && this.world.getServer() != null) {
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> 你确实是一个值得我动手的猎物"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level2 = level;
                                if (!_level2.isClientSide()) {
                                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay4")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay4")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 30);
                }
                if (Math.random() <= 0.007d) {
                    if (!world.isClientSide() && world.getServer() != null) {
                        world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> 不要自大"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    if (world instanceof Level _level2) {
                        if (!_level2.isClientSide()) {
                            _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonwin")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonwin")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                }
                if (Math.random() <= 0.005d) {
                    if (!world.isClientSide() && world.getServer() != null) {
                        world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> 你也太好预测了……"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    if (world instanceof Level _level3) {
                        if (!_level3.isClientSide()) {
                            _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay5")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsay5")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                }
                if (entity instanceof Player _player) {
                    _player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living) {
                    _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                }
                if (Math.random() <= 0.62d && (entity instanceof LivingEntity _entity)) {
                    if (!_entity.level.isClientSide()) {
                        _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                    }
                }
                if (Math.random() <= 0.36d && (entity instanceof LivingEntity _entity2)) {
                    if (!_entity2.level.isClientSide()) {
                        _entity2.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.TAOTUOBUFF.get(), 1, 1, false, false));
                    }
                }
                if (entity instanceof LivingEntity _livEnt) {
                    f = _livEnt.getHealth();
                } else {
                    f = -1.0f;
                }
                if (f <= 10.0f) {
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).setHealth(30.0f);
                    }
                    if (!entity.level.isClientSide() && entity.getServer() != null) {
                        entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/data merge entity @s {Invulnerable:1b}");
                    }
                    if (entity instanceof Mob _mobEnt2) {
                        livingEntity2 = _mobEnt2.getTarget();
                    } else {
                        livingEntity2 = null;
                    }
                    if (entity2 == livingEntity2) {
                        if (entity instanceof LivingEntity) {
                            Player player = (LivingEntity) entity;
                            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get());
                            _setstack.setCount(1);
                            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (player instanceof Player) {
                                Player _player2 = player;
                                _player2.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            Player player2 = (LivingEntity) entity;
                            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get());
                            _setstack2.setCount(1);
                            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                            if (player2 instanceof Player) {
                                Player _player3 = player2;
                                _player3.getInventory().setChanged();
                            }
                        }
                        new C03105(x, y, z, entity).start(world, 25);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C03105 {
        final double val$x;
        final double val$y;
        final double val$z;
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C03105(double d, double d2, double d3, Entity entity) {
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
                    _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsanchajikuanghuanjie")), SoundSource.WEATHER, 3.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonsanchajikuanghuanjie")), SoundSource.WEATHER, 3.0f, 1.0f, false);
                }
            }
            if (!this.world.isClientSide() && this.world.getServer() != null) {
                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> 三叉戟狂欢节！！！"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            ServerLevel serverLevel = this.world;
            if (serverLevel instanceof ServerLevel) {
                ServerLevel _level2 = serverLevel;
                Mob bTridentEntity = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level2);
                bTridentEntity.moveTo(this.val$x + Mth.nextInt(new Random(), -3, 3), this.val$y - 1.0d, this.val$z + Mth.nextInt(new Random(), -3, 3), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (bTridentEntity instanceof Mob) {
                    Mob _mobToSpawn = bTridentEntity;
                    _mobToSpawn.finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(bTridentEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                this.world.addFreshEntity(bTridentEntity);
            }
            ServerLevel serverLevel2 = this.world;
            if (serverLevel2 instanceof ServerLevel) {
                ServerLevel _level3 = serverLevel2;
                Mob bTridentEntity2 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level3);
                bTridentEntity2.moveTo(this.val$x + Mth.nextInt(new Random(), -3, 3), this.val$y - 1.0d, this.val$z + Mth.nextInt(new Random(), -3, 3), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (bTridentEntity2 instanceof Mob) {
                    Mob _mobToSpawn2 = bTridentEntity2;
                    _mobToSpawn2.finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(bTridentEntity2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                this.world.addFreshEntity(bTridentEntity2);
            }
            new C03111().start(this.world, 10);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C03111 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C03111() {
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
                ServerLevel serverLevel = this.world;
                if (serverLevel instanceof ServerLevel) {
                    ServerLevel _level = serverLevel;
                    Mob bTridentEntity = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level);
                    bTridentEntity.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (bTridentEntity instanceof Mob) {
                        Mob _mobToSpawn = bTridentEntity;
                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(bTridentEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    }
                    this.world.addFreshEntity(bTridentEntity);
                }
                new C03121().start(this.world, 10);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C03121 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C03121() {
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
                    ServerLevel serverLevel = this.world;
                    if (serverLevel instanceof ServerLevel) {
                        ServerLevel _level = serverLevel;
                        Mob bTridentEntity = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level);
                        bTridentEntity.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (bTridentEntity instanceof Mob) {
                            Mob _mobToSpawn = bTridentEntity;
                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(bTridentEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                        }
                        this.world.addFreshEntity(bTridentEntity);
                    }
                    ServerLevel serverLevel2 = this.world;
                    if (serverLevel2 instanceof ServerLevel) {
                        ServerLevel _level2 = serverLevel2;
                        Mob bTridentEntity2 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level2);
                        bTridentEntity2.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (bTridentEntity2 instanceof Mob) {
                            Mob _mobToSpawn2 = bTridentEntity2;
                            _mobToSpawn2.finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(bTridentEntity2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                        }
                        this.world.addFreshEntity(bTridentEntity2);
                    }
                    new C03131().start(this.world, 10);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C03131 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C03131() {
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
                        ServerLevel serverLevel = this.world;
                        if (serverLevel instanceof ServerLevel) {
                            ServerLevel _level = serverLevel;
                            Mob bTridentEntity = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level);
                            bTridentEntity.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (bTridentEntity instanceof Mob) {
                                Mob _mobToSpawn = bTridentEntity;
                                _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(bTridentEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            this.world.addFreshEntity(bTridentEntity);
                        }
                        ServerLevel serverLevel2 = this.world;
                        if (serverLevel2 instanceof ServerLevel) {
                            ServerLevel _level2 = serverLevel2;
                            Mob bTridentEntity2 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level2);
                            bTridentEntity2.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (bTridentEntity2 instanceof Mob) {
                                Mob _mobToSpawn2 = bTridentEntity2;
                                _mobToSpawn2.finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(bTridentEntity2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            this.world.addFreshEntity(bTridentEntity2);
                        }
                        new C03141().start(this.world, 5);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C03141 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C03141() {
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
                            ServerLevel serverLevel = this.world;
                            if (serverLevel instanceof ServerLevel) {
                                ServerLevel _level = serverLevel;
                                Mob bTridentEntity = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level);
                                bTridentEntity.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (bTridentEntity instanceof Mob) {
                                    Mob _mobToSpawn = bTridentEntity;
                                    _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(bTridentEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                this.world.addFreshEntity(bTridentEntity);
                            }
                            ServerLevel serverLevel2 = this.world;
                            if (serverLevel2 instanceof ServerLevel) {
                                ServerLevel _level2 = serverLevel2;
                                Mob bTridentEntity2 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level2);
                                bTridentEntity2.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), 3, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (bTridentEntity2 instanceof Mob) {
                                    Mob _mobToSpawn2 = bTridentEntity2;
                                    _mobToSpawn2.finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(bTridentEntity2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                this.world.addFreshEntity(bTridentEntity2);
                            }
                            ServerLevel serverLevel3 = this.world;
                            if (serverLevel3 instanceof ServerLevel) {
                                ServerLevel _level3 = serverLevel3;
                                Mob bTridentEntity3 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level3);
                                bTridentEntity3.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), 3, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (bTridentEntity3 instanceof Mob) {
                                    Mob _mobToSpawn3 = bTridentEntity3;
                                    _mobToSpawn3.finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(bTridentEntity3.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                this.world.addFreshEntity(bTridentEntity3);
                            }
                            new C03151().start(this.world, 5);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C03151 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C03151() {
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
                                ServerLevel serverLevel = this.world;
                                if (serverLevel instanceof ServerLevel) {
                                    ServerLevel _level = serverLevel;
                                    Mob bTridentEntity = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level);
                                    bTridentEntity.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (bTridentEntity instanceof Mob) {
                                        Mob _mobToSpawn = bTridentEntity;
                                        _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(bTridentEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                    }
                                    this.world.addFreshEntity(bTridentEntity);
                                }
                                ServerLevel serverLevel2 = this.world;
                                if (serverLevel2 instanceof ServerLevel) {
                                    ServerLevel _level2 = serverLevel2;
                                    Mob bTridentEntity2 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level2);
                                    bTridentEntity2.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), 3, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                    if (bTridentEntity2 instanceof Mob) {
                                        Mob _mobToSpawn2 = bTridentEntity2;
                                        _mobToSpawn2.finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(bTridentEntity2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                    }
                                    this.world.addFreshEntity(bTridentEntity2);
                                }
                                new C03161().start(this.world, 5);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */


                            public class C03161 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C03161() {
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

                                /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure$5$1$1$1$1$1$1$1] */
                                private void run() {
                                    ServerLevel serverLevel = this.world;
                                    if (serverLevel instanceof ServerLevel) {
                                        ServerLevel _level = serverLevel;
                                        Mob bTridentEntity = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level);
                                        bTridentEntity.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (bTridentEntity instanceof Mob) {
                                            Mob _mobToSpawn = bTridentEntity;
                                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(bTridentEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                        }
                                        this.world.addFreshEntity(bTridentEntity);
                                    }
                                    ServerLevel serverLevel2 = this.world;
                                    if (serverLevel2 instanceof ServerLevel) {
                                        ServerLevel _level2 = serverLevel2;
                                        Mob bTridentEntity2 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level2);
                                        bTridentEntity2.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (bTridentEntity2 instanceof Mob) {
                                            Mob _mobToSpawn2 = bTridentEntity2;
                                            _mobToSpawn2.finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(bTridentEntity2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                        }
                                        this.world.addFreshEntity(bTridentEntity2);
                                    }
                                    ServerLevel serverLevel3 = this.world;
                                    if (serverLevel3 instanceof ServerLevel) {
                                        ServerLevel _level3 = serverLevel3;
                                        Mob bTridentEntity3 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level3);
                                        bTridentEntity3.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (bTridentEntity3 instanceof Mob) {
                                            Mob _mobToSpawn3 = bTridentEntity3;
                                            _mobToSpawn3.finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(bTridentEntity3.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                        }
                                        this.world.addFreshEntity(bTridentEntity3);
                                    }
                                    ServerLevel serverLevel4 = this.world;
                                    if (serverLevel4 instanceof ServerLevel) {
                                        ServerLevel _level4 = serverLevel4;
                                        Mob bTridentEntity4 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level4);
                                        bTridentEntity4.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                        if (bTridentEntity4 instanceof Mob) {
                                            Mob _mobToSpawn4 = bTridentEntity4;
                                            _mobToSpawn4.finalizeSpawn(_level4, this.world.getCurrentDifficultyAt(bTridentEntity4.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                        }
                                        this.world.addFreshEntity(bTridentEntity4);
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure.5.1.1.1.1.1.1.1
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

                                        /* JADX WARN: Type inference failed for: r0v20, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure$5$1$1$1$1$1$1$1$1] */
                                        private void run() {
                                            ServerLevel serverLevel5 = this.world;
                                            if (serverLevel5 instanceof ServerLevel) {
                                                ServerLevel _level5 = serverLevel5;
                                                Mob bTridentEntity5 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level5);
                                                bTridentEntity5.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -10, 10), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                if (bTridentEntity5 instanceof Mob) {
                                                    Mob _mobToSpawn5 = bTridentEntity5;
                                                    _mobToSpawn5.finalizeSpawn(_level5, this.world.getCurrentDifficultyAt(bTridentEntity5.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                }
                                                this.world.addFreshEntity(bTridentEntity5);
                                            }
                                            ServerLevel serverLevel6 = this.world;
                                            if (serverLevel6 instanceof ServerLevel) {
                                                ServerLevel _level6 = serverLevel6;
                                                Mob bTridentEntity6 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level6);
                                                bTridentEntity6.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -20, -20), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -20, -20), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                if (bTridentEntity6 instanceof Mob) {
                                                    Mob _mobToSpawn6 = bTridentEntity6;
                                                    _mobToSpawn6.finalizeSpawn(_level6, this.world.getCurrentDifficultyAt(bTridentEntity6.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                }
                                                this.world.addFreshEntity(bTridentEntity6);
                                            }
                                            ServerLevel serverLevel7 = this.world;
                                            if (serverLevel7 instanceof ServerLevel) {
                                                ServerLevel _level7 = serverLevel7;
                                                Mob bTridentEntity7 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level7);
                                                bTridentEntity7.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -20, -20), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -20, -20), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                if (bTridentEntity7 instanceof Mob) {
                                                    Mob _mobToSpawn7 = bTridentEntity7;
                                                    _mobToSpawn7.finalizeSpawn(_level7, this.world.getCurrentDifficultyAt(bTridentEntity7.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                }
                                                this.world.addFreshEntity(bTridentEntity7);
                                            }
                                            ServerLevel serverLevel8 = this.world;
                                            if (serverLevel8 instanceof ServerLevel) {
                                                ServerLevel _level8 = serverLevel8;
                                                Mob bTridentEntity8 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level8);
                                                bTridentEntity8.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -20, -20), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -20, -20), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                if (bTridentEntity8 instanceof Mob) {
                                                    Mob _mobToSpawn8 = bTridentEntity8;
                                                    _mobToSpawn8.finalizeSpawn(_level8, this.world.getCurrentDifficultyAt(bTridentEntity8.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                }
                                                this.world.addFreshEntity(bTridentEntity8);
                                            }
                                            ServerLevel serverLevel9 = this.world;
                                            if (serverLevel9 instanceof ServerLevel) {
                                                ServerLevel _level9 = serverLevel9;
                                                Mob bTridentEntity9 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level9);
                                                bTridentEntity9.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -20, -20), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -20, -20), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                if (bTridentEntity9 instanceof Mob) {
                                                    Mob _mobToSpawn9 = bTridentEntity9;
                                                    _mobToSpawn9.finalizeSpawn(_level9, this.world.getCurrentDifficultyAt(bTridentEntity9.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                }
                                                this.world.addFreshEntity(bTridentEntity9);
                                            }
                                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiShouShangShiProcedure.5.1.1.1.1.1.1.1.1
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
                                                    LivingEntity livingEntity;
                                                    ServerLevel serverLevel10 = this.world;
                                                    if (serverLevel10 instanceof ServerLevel) {
                                                        ServerLevel _level10 = serverLevel10;
                                                        Mob bTridentEntity10 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level10);
                                                        bTridentEntity10.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -25, 25), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -25, 25), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                        if (bTridentEntity10 instanceof Mob) {
                                                            Mob _mobToSpawn10 = bTridentEntity10;
                                                            _mobToSpawn10.finalizeSpawn(_level10, this.world.getCurrentDifficultyAt(bTridentEntity10.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                        }
                                                        this.world.addFreshEntity(bTridentEntity10);
                                                    }
                                                    ServerLevel serverLevel11 = this.world;
                                                    if (serverLevel11 instanceof ServerLevel) {
                                                        ServerLevel _level11 = serverLevel11;
                                                        Mob bTridentEntity11 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level11);
                                                        bTridentEntity11.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -25, -25), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -25, -25), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                        if (bTridentEntity11 instanceof Mob) {
                                                            Mob _mobToSpawn11 = bTridentEntity11;
                                                            _mobToSpawn11.finalizeSpawn(_level11, this.world.getCurrentDifficultyAt(bTridentEntity11.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                        }
                                                        this.world.addFreshEntity(bTridentEntity11);
                                                    }
                                                    ServerLevel serverLevel12 = this.world;
                                                    if (serverLevel12 instanceof ServerLevel) {
                                                        ServerLevel _level12 = serverLevel12;
                                                        Mob bTridentEntity12 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level12);
                                                        bTridentEntity12.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -25, -25), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -25, -25), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                        if (bTridentEntity12 instanceof Mob) {
                                                            Mob _mobToSpawn12 = bTridentEntity12;
                                                            _mobToSpawn12.finalizeSpawn(_level12, this.world.getCurrentDifficultyAt(bTridentEntity12.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                        }
                                                        this.world.addFreshEntity(bTridentEntity12);
                                                    }
                                                    ServerLevel serverLevel13 = this.world;
                                                    if (serverLevel13 instanceof ServerLevel) {
                                                        ServerLevel _level13 = serverLevel13;
                                                        Mob bTridentEntity13 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level13);
                                                        bTridentEntity13.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -25, -25), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -25, -25), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                        if (bTridentEntity13 instanceof Mob) {
                                                            Mob _mobToSpawn13 = bTridentEntity13;
                                                            _mobToSpawn13.finalizeSpawn(_level13, this.world.getCurrentDifficultyAt(bTridentEntity13.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                        }
                                                        this.world.addFreshEntity(bTridentEntity13);
                                                    }
                                                    ServerLevel serverLevel14 = this.world;
                                                    if (serverLevel14 instanceof ServerLevel) {
                                                        ServerLevel _level14 = serverLevel14;
                                                        Mob bTridentEntity14 = new BTridentEntity(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), _level14);
                                                        bTridentEntity14.moveTo(C03105.this.val$x + Mth.nextInt(new Random(), -25, -25), C03105.this.val$y - 1.0d, C03105.this.val$z + Mth.nextInt(new Random(), -25, -25), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                                        if (bTridentEntity14 instanceof Mob) {
                                                            Mob _mobToSpawn14 = bTridentEntity14;
                                                            _mobToSpawn14.finalizeSpawn(_level14, this.world.getCurrentDifficultyAt(bTridentEntity14.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                                        }
                                                        this.world.addFreshEntity(bTridentEntity14);
                                                    }
                                                    if (C03105.this.val$entity instanceof Mob) {
                                                        Mob _mobEnt = C03105.this.val$entity;
                                                        livingEntity = _mobEnt.getTarget();
                                                    } else {
                                                        livingEntity = null;
                                                    }
                                                    LivingEntity livingEntity2 = livingEntity;
                                                    if (livingEntity2 instanceof LivingEntity) {
                                                        LivingEntity _entity = livingEntity2;
                                                        _entity.removeEffect(AnnoyingVillagersbychentuModMobEffects.GEDANG.get());
                                                    }
                                                    Level level = this.world;
                                                    if (level instanceof Level) {
                                                        Level _level15 = level;
                                                        if (!_level15.isClientSide()) {
                                                            _level15.explode(null, C03105.this.val$x, C03105.this.val$y + 1.0d, C03105.this.val$z, 60.0f, Explosion.BlockInteraction.DESTROY);
                                                        }
                                                    }
                                                    Level level2 = this.world;
                                                    if (level2 instanceof Level) {
                                                        Level _level16 = level2;
                                                        if (!_level16.isClientSide()) {
                                                            _level16.playSound(null, new BlockPos(C03105.this.val$x, C03105.this.val$y, C03105.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:big_boom")), SoundSource.NEUTRAL, 5.0f, 1.0f);
                                                        } else {
                                                            _level16.playLocalSound(C03105.this.val$x, C03105.this.val$y, C03105.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:big_boom")), SoundSource.NEUTRAL, 5.0f, 1.0f, false);
                                                        }
                                                    }
                                                    this.world.addParticle((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.LIGHT.get(), C03105.this.val$x, C03105.this.val$y, C03105.this.val$z, 0.0d, 0.0d, 0.0d);
                                                    if (C03105.this.val$entity.isAlive()) {
                                                        Entity _ent = C03105.this.val$entity;
                                                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:bbd ^ ^ ^");
                                                        }
                                                    }
                                                    if (!C03105.this.val$entity.level.isClientSide()) {
                                                        C03105.this.val$entity.discard();
                                                    }
                                                    MinecraftForge.EVENT_BUS.unregister(this);
                                                }
                                            }.start(this.world, 10);
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }
                                    }.start(this.world, 10);
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
