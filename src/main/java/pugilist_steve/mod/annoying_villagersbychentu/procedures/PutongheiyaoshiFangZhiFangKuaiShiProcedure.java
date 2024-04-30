package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;


public class PutongheiyaoshiFangZhiFangKuaiShiProcedure {
    /* JADX WARN: Type inference failed for: r0v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PutongheiyaoshiFangZhiFangKuaiShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, (float) Mth.nextDouble(new Random(), 0.0d, 0.7d), 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, (float) Mth.nextDouble(new Random(), 0.0d, 0.7d), 1.0f, false);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:obplace")), SoundSource.BLOCKS, (float) Mth.nextDouble(new Random(), 0.2d, 0.6d), 1.0f);
            } else {
                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:obplace")), SoundSource.BLOCKS, (float) Mth.nextDouble(new Random(), 0.2d, 0.6d), 1.0f, false);
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PutongheiyaoshiFangZhiFangKuaiShiProcedure.1
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

            /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PutongheiyaoshiFangZhiFangKuaiShiProcedure$1$1] */
            private void run() {
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level3 = level;
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 0.9d, 1.0d));
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 0.9d, 1.0d), false);
                    }
                }
                this.world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PutongheiyaoshiFangZhiFangKuaiShiProcedure.1.1
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
                        Level level2 = this.world;
                        if (level2 instanceof Level) {
                            Level _level4 = level2;
                            if (!_level4.isClientSide()) {
                                _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 1.0d, 1.0d));
                            } else {
                                _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 1.0d, 1.0d), false);
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(this.world, (int) Mth.nextDouble(new Random(), 5.0d, 15.0d));
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 25);
    }
}
