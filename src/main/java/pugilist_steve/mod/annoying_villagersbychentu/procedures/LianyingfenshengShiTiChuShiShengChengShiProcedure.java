package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;


public class LianyingfenshengShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LianyingfenshengShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LianyingfenshengShiTiChuShiShengChengShiProcedure$2] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/data merge entity @s {Tags:[\"OP\"]}");
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("Herobrine已降临"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LianyingfenshengShiTiChuShiShengChengShiProcedure.1
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

            /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LianyingfenshengShiTiChuShiShengChengShiProcedure$1$1] */
            private void run() {
                if (entity.isAlive()) {
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> Summoning!!!"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LianyingfenshengShiTiChuShiShengChengShiProcedure.1.1
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
                            ServerLevel serverLevel = this.world;
                            if (serverLevel instanceof ServerLevel) {
                                ServerLevel _level = serverLevel;
                                Mob enderDragon = new EnderDragon(EntityType.ENDER_DRAGON, _level);
                                enderDragon.moveTo(x, y + 20.0d, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (enderDragon instanceof Mob) {
                                    Mob _mobToSpawn = enderDragon;
                                    _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(enderDragon.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                this.world.addFreshEntity(enderDragon);
                            }
                            ServerLevel serverLevel2 = this.world;
                            if (serverLevel2 instanceof ServerLevel) {
                                ServerLevel _level2 = serverLevel2;
                                Mob lightningBolt = new LightningBolt(EntityType.LIGHTNING_BOLT, _level2);
                                lightningBolt.moveTo(x, y + 20.0d, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (lightningBolt instanceof Mob) {
                                    Mob _mobToSpawn2 = lightningBolt;
                                    _mobToSpawn2.finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(lightningBolt.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                this.world.addFreshEntity(lightningBolt);
                            }
                            ServerLevel serverLevel3 = this.world;
                            if (serverLevel3 instanceof ServerLevel) {
                                ServerLevel _level3 = serverLevel3;
                                Mob lightningBolt2 = new LightningBolt(EntityType.LIGHTNING_BOLT, _level3);
                                lightningBolt2.moveTo(x, y + 20.0d, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (lightningBolt2 instanceof Mob) {
                                    Mob _mobToSpawn3 = lightningBolt2;
                                    _mobToSpawn3.finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(lightningBolt2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                this.world.addFreshEntity(lightningBolt2);
                            }
                            ServerLevel serverLevel4 = this.world;
                            if (serverLevel4 instanceof ServerLevel) {
                                ServerLevel _level4 = serverLevel4;
                                Mob lightningBolt3 = new LightningBolt(EntityType.LIGHTNING_BOLT, _level4);
                                lightningBolt3.moveTo(x, y + 20.0d, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (lightningBolt3 instanceof Mob) {
                                    Mob _mobToSpawn4 = lightningBolt3;
                                    _mobToSpawn4.finalizeSpawn(_level4, this.world.getCurrentDifficultyAt(lightningBolt3.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                this.world.addFreshEntity(lightningBolt3);
                            }
                            this.world.addParticle(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 0.0d, 1.0d, 0.0d);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 20);
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 500);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LianyingfenshengShiTiChuShiShengChengShiProcedure.2
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

            /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LianyingfenshengShiTiChuShiShengChengShiProcedure$2$1] */
            private void run() {
                if (entity.isAlive()) {
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> Reclaim......"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    Entity _ent = entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tp @e[type=minecraft:ender_dragon] ^ ^15 ^");
                    }
                    Entity _ent2 = entity;
                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/kill @e[type=minecraft:ender_dragon]");
                    }
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:paoxiao")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:paoxiao")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LianyingfenshengShiTiChuShiShengChengShiProcedure.2.1
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
                            this.world.addParticle(ParticleTypes.END_ROD, x, y, z, 0.0d, 1.0d, 0.0d);
                            Entity _ent3 = entity;
                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tp @s ^1000 ^1000 ^2000");
                            }
                            Level level2 = this.world;
                            if (level2 instanceof Level) {
                                Level _level2 = level2;
                                if (!_level2.isClientSide()) {
                                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            ServerLevel serverLevel = this.world;
                            if (serverLevel instanceof ServerLevel) {
                                ServerLevel _level3 = serverLevel;
                                Mob lightningBolt = new LightningBolt(EntityType.LIGHTNING_BOLT, _level3);
                                lightningBolt.moveTo(x, y + 20.0d, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                                if (lightningBolt instanceof Mob) {
                                    Mob _mobToSpawn = lightningBolt;
                                    _mobToSpawn.finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(lightningBolt.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                                }
                                this.world.addFreshEntity(lightningBolt);
                            }
                            if (!this.world.isClientSide() && this.world.getServer() != null) {
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("Herobrine高级分身已被传送至云端"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            Level level3 = this.world;
                            if (level3 instanceof Level) {
                                Level _level4 = level3;
                                if (!_level4.isClientSide()) {
                                    _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 100);
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 2000);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrinexintu");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrine");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join herobrinexintu");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join herobrine");
        }
    }
}
