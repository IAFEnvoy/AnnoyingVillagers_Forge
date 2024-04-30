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
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.Zaiezhiwang2Entity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModParticleTypes;


public class ZaiEZhiWangDangShiTiSiWangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v0, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiSiWangShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiSiWangShiProcedure.1
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

            /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiSiWangShiProcedure$1$1] */
            private void run() {
                if (!this.world.isClientSide() && this.world.getServer() != null) {
                    this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<灾厄之王> 作为王，可不会死的这么容易"), ChatType.SYSTEM, Util.NIL_UUID);
                }
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiSiWangShiProcedure.1.1
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
                            Level _level = level;
                            if (!_level.isClientSide()) {
                                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                        Level level2 = this.world;
                        if (level2 instanceof Level) {
                            Level _level2 = level2;
                            if (!_level2.isClientSide()) {
                                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                        this.world.addParticle((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.LIGHT.get(), x, y, z, 0.0d, 0.0d, 0.0d);
                        ServerLevel serverLevel = this.world;
                        if (serverLevel instanceof ServerLevel) {
                            ServerLevel _level3 = serverLevel;
                            Mob zaiezhiwang2Entity = new Zaiezhiwang2Entity(AnnoyingVillagersbychentuModEntities.ZAIEZHIWANG_2.get(), _level3);
                            zaiezhiwang2Entity.moveTo(x, y, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (zaiezhiwang2Entity instanceof Mob) {
                                Mob _mobToSpawn = zaiezhiwang2Entity;
                                _mobToSpawn.finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(zaiezhiwang2Entity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            this.world.addFreshEntity(zaiezhiwang2Entity);
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(this.world, 20);
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 50);
    }
}
