package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModParticleTypes;

import java.util.Random;


public class SherenherobrineDangShiTiSiWangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenherobrineDangShiTiSiWangShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:big_boom")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:big_boom")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof Level _level3) {
            if (!_level3.isClientSide()) {
                _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:ender_shot")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:ender_shot")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof Level _level4) {
            if (!_level4.isClientSide()) {
                _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:break_wp")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:break_wp")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "summon annoying_villagersbychentu:death_sheren_herobrine");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle minecraft:pool ^ ^1.5 ^0.8 0 0 0 0.1 100");
        }
        world.addParticle((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.LIGHT.get(), x, y, z, 0.0d, 0.0d, 0.0d);
        world.setBlock(new BlockPos(x, y, z), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y - Mth.nextDouble(new Random(), 0.0d, 1.0d), z + Mth.nextDouble(new Random(), -5.0d, 5.0d)), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y + Mth.nextDouble(new Random(), 0.0d, 1.0d), z + Mth.nextDouble(new Random(), -5.0d, 5.0d)), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y - Mth.nextDouble(new Random(), 0.0d, 1.0d), z + Mth.nextDouble(new Random(), -5.0d, 5.0d)), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y - Mth.nextDouble(new Random(), 0.0d, 1.0d), z + Mth.nextDouble(new Random(), -5.0d, 5.0d)), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y, z + Mth.nextDouble(new Random(), 3.0d, 10.0d)), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenherobrineDangShiTiSiWangShiProcedure.1
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
                        ItemEntity entityToSpawn = new ItemEntity(_level5, x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y, z + Mth.nextDouble(new Random(), -5.0d, 5.0d), new ItemStack(AnnoyingVillagersbychentuModItems.SHERENSUIPIAN.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn);
                    }
                }
                Level level2 = this.world;
                if (level2 instanceof Level) {
                    Level _level6 = level2;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level6, x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y, z + Mth.nextDouble(new Random(), -5.0d, 5.0d), new ItemStack(AnnoyingVillagersbychentuModItems.SHERENJIAN.get()));
                        entityToSpawn2.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn2);
                    }
                }
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level7 = level3;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level7, x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y, z + Mth.nextDouble(new Random(), -5.0d, 5.0d), new ItemStack(AnnoyingVillagersbychentuModItems.SHERENSUIPIAN.get()));
                        entityToSpawn3.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn3);
                    }
                }
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level8 = level4;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level8, x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y, z + Mth.nextDouble(new Random(), -5.0d, 5.0d), new ItemStack(AnnoyingVillagersbychentuModItems.SHERENSUIPIAN.get()));
                        entityToSpawn4.setPickUpDelay(10);
                        _level8.addFreshEntity(entityToSpawn4);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level9 = level5;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level9, x + Mth.nextDouble(new Random(), -5.0d, 5.0d), y, z + Mth.nextDouble(new Random(), -5.0d, 5.0d), new ItemStack(AnnoyingVillagersbychentuModItems.SHERENSUIPIAN.get()));
                        entityToSpawn5.setPickUpDelay(10);
                        _level9.addFreshEntity(entityToSpawn5);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
    }
}
