package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class BishouDangTouSheWuSheZhongCiFangKuaiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.BISHOU.get()));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
        }
        if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.GRASS_BLOCK) {
            world.levelEvent(2001, new BlockPos(x, y + 1.0d, z), Block.getId(Blocks.GRASS_BLOCK.defaultBlockState()));
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
        if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.DIRT) {
            world.levelEvent(2001, new BlockPos(x, y + 1.0d, z), Block.getId(Blocks.DIRT.defaultBlockState()));
            if (world instanceof Level _level3) {
                if (!_level3.isClientSide()) {
                    _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
        if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.COBBLESTONE) {
            world.levelEvent(2001, new BlockPos(x, y + 1.0d, z), Block.getId(Blocks.COBBLESTONE.defaultBlockState()));
            if (world instanceof Level _level4) {
                if (!_level4.isClientSide()) {
                    _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
        if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.OAK_PLANKS) {
            world.levelEvent(2001, new BlockPos(x, y + 1.0d, z), Block.getId(Blocks.OAK_PLANKS.defaultBlockState()));
            if (world instanceof Level _level5) {
                if (!_level5.isClientSide()) {
                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
        if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.STONE) {
            if (world instanceof Level _level6) {
                if (!_level6.isClientSide()) {
                    _level6.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            world.levelEvent(2001, new BlockPos(x, y + 1.0d, z), Block.getId(Blocks.STONE.defaultBlockState()));
        }
        if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get()) {
            if (world instanceof Level _level7) {
                if (!_level7.isClientSide()) {
                    _level7.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level7.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            world.levelEvent(2001, new BlockPos(x, y + 1.0d, z), Block.getId(AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get().defaultBlockState()));
        }
        if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()) {
            if (world instanceof Level _level8) {
                if (!_level8.isClientSide()) {
                    _level8.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level8.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            world.levelEvent(2001, new BlockPos(x, y + 1.0d, z), Block.getId(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get().defaultBlockState()));
        }
        if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.OBSIDIAN) {
            if (world instanceof Level _level9) {
                if (!_level9.isClientSide()) {
                    _level9.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level9.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            world.levelEvent(2001, new BlockPos(x, y + 1.0d, z), Block.getId(Blocks.OBSIDIAN.defaultBlockState()));
        }
    }
}
