package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HerobrinejiyanEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Herobrine3DangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v109, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r0v137, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v61, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$8] */
    /* JADX WARN: Type inference failed for: r0v81, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$12] */
    /* JADX WARN: Type inference failed for: r0v82, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$11] */
    /* JADX WARN: Type inference failed for: r0v83, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$10] */
    /* JADX WARN: Type inference failed for: r0v84, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$9] */
    /* JADX WARN: Type inference failed for: r0v96, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r0v97, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$7] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        LivingEntity livingEntity;
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
            if (entity2 == livingEntity) {
                if (Math.random() <= 0.25d) {
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 0.2f, 1.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 0.2f, 1.0f, false);
                        }
                    }
                    if (!entity.level.isClientSide() && entity.getServer() != null) {
                        entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.1
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
                if (Math.random() <= 0.25d) {
                    if (world instanceof Level _level2) {
                        if (!_level2.isClientSide()) {
                            _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 0.2f, 1.0f);
                        } else {
                            _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 0.2f, 1.0f, false);
                        }
                    }
                    new C07112(entity).start(world, 1);
                    new C07183(x, y, z, entity).start(world, 20);
                } else if (Math.random() <= 0.1d) {
                    if (Math.random() <= 0.01d) {
                        if (!world.isClientSide() && world.getServer() != null) {
                            world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> You are weak , you are nothing! ! !"), ChatType.SYSTEM, Util.NIL_UUID);
                        }
                        if (world instanceof Level _level3) {
                            if (!_level3.isClientSide()) {
                                _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:youareweak")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            } else {
                                _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:youareweak")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                            }
                        }
                    }
                    if (world instanceof Level _level4) {
                        if (!_level4.isClientSide()) {
                            _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 0.2f, 1.0f);
                        } else {
                            _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 0.2f, 1.0f, false);
                        }
                    }
                    if (!entity.level.isClientSide() && entity.getServer() != null) {
                        entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C07274(entity).start(world, 1);
                }
                if (Math.random() <= 0.009d) {
                    if (!entity.level.isClientSide() && entity.getServer() != null) {
                        entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/effect give @p[gamemode=survival,gamemode=adventure] annoying_villagersbychentu:herobrine 1200 0");
                    }
                    Level projectileLevel = entity.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.5
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                AbstractArrow entityToSpawn = new HerobrinejiyanEntity(AnnoyingVillagersbychentuModEntities.HEROBRINEJIYAN.get(), level);
                                entityToSpawn.setOwner(shooter);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel, entity, 0.0f, 0);
                        _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                        _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    if (entity instanceof LivingEntity) {
                        Player player = (LivingEntity) entity;
                        ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.JIYAN.get());
                        _setstack.setCount(1);
                        player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (player instanceof Player) {
                            Player _player = player;
                            _player.getInventory().setChanged();
                        }
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.6
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
                            if (Math.random() <= 0.05d) {
                                if (!this.world.isClientSide() && this.world.getServer() != null) {
                                    this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> You are weak , you are nothing! ! !"), ChatType.SYSTEM, Util.NIL_UUID);
                                }
                                Level level = this.world;
                                if (level instanceof Level) {
                                    Level _level5 = level;
                                    if (!_level5.isClientSide()) {
                                        _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:youareweak")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                    } else {
                                        _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:youareweak")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                    }
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 4);
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.7
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
                                Player player2 = (LivingEntity) entity;
                                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.OBSIDIANWEAPONS.get());
                                _setstack2.setCount(1);
                                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                                if (player2 instanceof Player) {
                                    Player _player2 = player2;
                                    _player2.getInventory().setChanged();
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 100);
                }
                entity.setSprinting(true);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.8
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
                if (Math.random() <= 0.05d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.9
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
                                Level _level5 = level;
                                if (!_level5.isClientSide()) {
                                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:humchuanqi")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:humchuanqi")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 20);
                }
                if (Math.random() <= 0.01d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.10
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
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> 够了！"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level5 = level;
                                if (!_level5.isClientSide()) {
                                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsayenough")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsayenough")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 5);
                }
                if (Math.random() <= 0.009d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.11
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
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> 多么愚蠢！"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level5 = level;
                                if (!_level5.isClientSide()) {
                                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsaytaiyuchunle")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsaytaiyuchunle")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 5);
                }
                if (Math.random() <= 0.01d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.12
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
                                Level _level5 = level;
                                if (!_level5.isClientSide()) {
                                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himattack2")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himattack2")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 5);
                }
                if (Math.random() <= 0.7d && (entity instanceof LivingEntity _entity)) {
                    if (!_entity.level.isClientSide()) {
                        _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C07112 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C07112(Entity entity) {
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
            new C07121().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C07121 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C07121() {
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
                Entity _ent = C07112.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C07131().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C07131 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C07131() {
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
                    Entity _ent = C07112.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C07141().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C07141 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C07141() {
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
                        Entity _ent = C07112.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C07151().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C07151 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C07151() {
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

                        /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$2$1$1$1$1$1] */
                        private void run() {
                            Entity _ent = C07112.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.2.1.1.1.1.1
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

                                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$2$1$1$1$1$1$1] */
                                private void run() {
                                    Entity _ent2 = C07112.this.val$entity;
                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.2.1.1.1.1.1.1
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
                                            Entity _ent3 = C07112.this.val$entity;
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


    public class C07183 {
        final double val$x;
        final double val$y;
        final double val$z;
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C07183(double d, double d2, double d3, Entity entity) {
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

        /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$3$2] */
        private void run() {
            if (Math.random() <= 0.5d) {
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 0.2f, 1.0f);
                    } else {
                        _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.BLOCKS, 0.2f, 1.0f, false);
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
                new C07191().start(this.world, 1);
                if (Math.random() <= 0.5d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.3.2
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

                        /* JADX WARN: Type inference failed for: r0v6, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$3$2$1] */
                        private void run() {
                            Entity _ent5 = C07183.this.val$entity;
                            if (!_ent5.level.isClientSide() && _ent5.getServer() != null) {
                                _ent5.getServer().getCommands().performCommand(_ent5.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.3.2.1
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
                                    Entity _ent6 = C07183.this.val$entity;
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


        public class C07191 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C07191() {
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
                Entity _ent = C07183.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C07201().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C07201 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C07201() {
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
                    Entity _ent = C07183.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C07211().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C07211 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C07211() {
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
                        Entity _ent = C07183.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C07221().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C07221 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C07221() {
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

                        /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$3$1$1$1$1$1] */
                        private void run() {
                            Entity _ent = C07183.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.3.1.1.1.1.1
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

                                /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$3$1$1$1$1$1$1] */
                                private void run() {
                                    Entity _ent2 = C07183.this.val$entity;
                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^3 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.3.1.1.1.1.1.1
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
                                            Entity _ent3 = C07183.this.val$entity;
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

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C07274 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C07274(Entity entity) {
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
                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
            }
            new C07281().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C07281 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C07281() {
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
                Entity _ent = C07274.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C07291().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C07291 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C07291() {
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
                    Entity _ent = C07274.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C07301().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C07301 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C07301() {
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
                        Entity _ent = C07274.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C07311().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C07311 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C07311() {
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
                            Entity _ent = C07274.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new C07321().start(this.world, 1);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C07321 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C07321() {
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
                                Entity _ent = C07274.this.val$entity;
                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                new C07331().start(this.world, 1);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */


                            public class C07331 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C07331() {
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
                                    Entity _ent = C07274.this.val$entity;
                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^7 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new C07341().start(this.world, 1);
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */


                                public class C07341 {
                                    private int ticks = 0;
                                    private float waitTicks;
                                    private LevelAccessor world;

                                    C07341() {
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
                                        Entity _ent = C07274.this.val$entity;
                                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^8 annoying_villagersbychentu:putongheiyaoshi");
                                        }
                                        new C07351().start(this.world, 1);
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }

                                    /* JADX INFO: Access modifiers changed from: package-private */


                                    public class C07351 {
                                        private int ticks = 0;
                                        private float waitTicks;
                                        private LevelAccessor world;

                                        C07351() {
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
                                            Entity _ent = C07274.this.val$entity;
                                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^9 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            new C07361().start(this.world, 1);
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }

                                        /* JADX INFO: Access modifiers changed from: package-private */


                                        public class C07361 {
                                            private int ticks = 0;
                                            private float waitTicks;
                                            private LevelAccessor world;

                                            C07361() {
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
                                                Entity _ent = C07274.this.val$entity;
                                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^10 annoying_villagersbychentu:putongheiyaoshi");
                                                }
                                                new C07371().start(this.world, 1);
                                                MinecraftForge.EVENT_BUS.unregister(this);
                                            }

                                            /* JADX INFO: Access modifiers changed from: package-private */


                                            public class C07371 {
                                                private int ticks = 0;
                                                private float waitTicks;
                                                private LevelAccessor world;

                                                C07371() {
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
                                                    Entity _ent = C07274.this.val$entity;
                                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^11 annoying_villagersbychentu:putongheiyaoshi");
                                                    }
                                                    new C07381().start(this.world, 1);
                                                    MinecraftForge.EVENT_BUS.unregister(this);
                                                }

                                                /* JADX INFO: Access modifiers changed from: package-private */


                                                public class C07381 {
                                                    private int ticks = 0;
                                                    private float waitTicks;
                                                    private LevelAccessor world;

                                                    C07381() {
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

                                                    /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$4$1$1$1$1$1$1$1$1$1$1$1$1] */
                                                    private void run() {
                                                        Entity _ent = C07274.this.val$entity;
                                                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^12 annoying_villagersbychentu:putongheiyaoshi");
                                                        }
                                                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.4.1.1.1.1.1.1.1.1.1.1.1.1
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

                                                            /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure$4$1$1$1$1$1$1$1$1$1$1$1$1$1] */
                                                            private void run() {
                                                                Entity _ent2 = C07274.this.val$entity;
                                                                if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                                                    _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^13 annoying_villagersbychentu:putongheiyaoshi");
                                                                }
                                                                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiShouShangShiProcedure.4.1.1.1.1.1.1.1.1.1.1.1.1.1
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
                                                                        Entity _ent3 = C07274.this.val$entity;
                                                                        if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                                            _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^14 annoying_villagersbychentu:putongheiyaoshi");
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
}
