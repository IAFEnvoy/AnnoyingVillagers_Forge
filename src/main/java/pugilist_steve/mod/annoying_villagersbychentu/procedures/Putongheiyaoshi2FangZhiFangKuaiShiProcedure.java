package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import com.google.common.collect.UnmodifiableIterator;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;

import java.util.Map;
import java.util.Random;


public class Putongheiyaoshi2FangZhiFangKuaiShiProcedure {
    /* JADX WARN: Type inference failed for: r0v0, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Putongheiyaoshi2FangZhiFangKuaiShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Putongheiyaoshi2FangZhiFangKuaiShiProcedure.1
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

            /* JADX WARN: Type inference failed for: r0v0, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Putongheiyaoshi2FangZhiFangKuaiShiProcedure$1$1] */
            /* JADX WARN: Type inference failed for: r0v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Putongheiyaoshi2FangZhiFangKuaiShiProcedure$1$2] */
            private void run() {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Putongheiyaoshi2FangZhiFangKuaiShiProcedure.1.1
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
                                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get()));
                                entityToSpawn.setPickUpDelay(10);
                                _level.addFreshEntity(entityToSpawn);
                            }
                        }
                        Level level2 = this.world;
                        if (level2 instanceof Level) {
                            Level _level2 = level2;
                            if (!_level2.isClientSide()) {
                                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 1.0d, 1.5d));
                            } else {
                                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 1.0d, 1.5d), false);
                            }
                        }
                        this.world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                        BlockPos _bp = new BlockPos(x, y, z);
                        BlockState _bs = Blocks.AIR.defaultBlockState();
                        BlockState _bso = this.world.getBlockState(_bp);
                        UnmodifiableIterator it = _bso.getValues().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry) it.next();
                            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                            if (_property != null && _bs.getValue(_property) != null) {
                                try {
                                    _bs = (BlockState) _bs.setValue(_property, entry.getValue());
                                } catch (Exception e) {
                                }
                            }
                        }
                        this.world.setBlock(_bp, _bs, 3);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(this.world, 1);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Putongheiyaoshi2FangZhiFangKuaiShiProcedure.1.2
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
                                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:shiqu")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            } else {
                                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:shiqu")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
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
