package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModParticleTypes;


public class SherenherobrineShiTiChuShiShengChengShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        new C12511(x, y, z, entity).start(world, 100);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrinexintu");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrine");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join herobrinexintu @s");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join herobrine @s");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C12511 {
        final double val$x;
        final double val$y;
        final double val$z;
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C12511(double d, double d2, double d3, Entity entity) {
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

        /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenherobrineShiTiChuShiShengChengShiProcedure$1$1] */
        /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenherobrineShiTiChuShiShengChengShiProcedure$1$2] */
        private void run() {
            Level level = this.world;
            if (level instanceof Level) {
                Level _level = level;
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:absorb")), SoundSource.MUSIC, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:absorb")), SoundSource.MUSIC, 1.0f, 1.0f, false);
                }
            }
            Level level2 = this.world;
            if (level2 instanceof Level) {
                Level _level2 = level2;
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:absorb")), SoundSource.RECORDS, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:absorb")), SoundSource.RECORDS, 1.0f, 1.0f, false);
                }
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenherobrineShiTiChuShiShengChengShiProcedure.1.1
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

                /* JADX WARN: Type inference failed for: r0v0, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenherobrineShiTiChuShiShengChengShiProcedure$1$1$1] */
                private void run() {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenherobrineShiTiChuShiShengChengShiProcedure.1.1.1
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
                            this.world.addParticle((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.LIGHT.get(), C12511.this.val$x, C12511.this.val$y, C12511.this.val$z, 0.0d, 0.0d, 0.0d);
                            Level level3 = this.world;
                            if (level3 instanceof Level) {
                                Level _level3 = level3;
                                if (!_level3.isClientSide()) {
                                    _level3.playSound(null, new BlockPos(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level3.playLocalSound(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            Level level4 = this.world;
                            if (level4 instanceof Level) {
                                Level _level4 = level4;
                                if (!_level4.isClientSide()) {
                                    _level4.playSound(null, new BlockPos(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level4.playLocalSound(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            Level level5 = this.world;
                            if (level5 instanceof Level) {
                                Level _level5 = level5;
                                if (!_level5.isClientSide()) {
                                    _level5.playSound(null, new BlockPos(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level5.playLocalSound(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            Level level6 = this.world;
                            if (level6 instanceof Level) {
                                Level _level6 = level6;
                                if (!_level6.isClientSide()) {
                                    _level6.playSound(null, new BlockPos(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:paoxiao")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                                } else {
                                    _level6.playLocalSound(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:paoxiao")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                                }
                            }
                            Level level7 = this.world;
                            if (level7 instanceof Level) {
                                Level _level7 = level7;
                                if (!_level7.isClientSide()) {
                                    _level7.playSound(null, new BlockPos(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                                } else {
                                    _level7.playLocalSound(C12511.this.val$x, C12511.this.val$y, C12511.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                                }
                            }
                            if (C12511.this.val$entity instanceof LivingEntity) {
                                Player player = (LivingEntity) C12511.this.val$entity;
                                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.SIFANGSHEREN.get());
                                _setstack.setCount(1);
                                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                if (player instanceof Player) {
                                    Player _player = player;
                                    _player.getInventory().setChanged();
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 5);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(this.world, 100);
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenherobrineShiTiChuShiShengChengShiProcedure.1.2
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
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> release!!!"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(this.world, 60);
            MinecraftForge.EVENT_BUS.unregister(this);
        }
    }
}
