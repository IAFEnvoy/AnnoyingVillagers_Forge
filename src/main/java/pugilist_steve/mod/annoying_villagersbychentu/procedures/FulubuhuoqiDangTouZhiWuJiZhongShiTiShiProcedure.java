package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;


public class FulubuhuoqiDangTouZhiWuJiZhongShiTiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        float f;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            f = _livEnt.getHealth();
        } else {
            f = -1.0f;
        }
        if (f <= 7.0f) {
            if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("annoying_villagersbychentu:cun_min_zhen_cha_bing")) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:cun_zhen_fu_lu ^ ^ ^ {VillagerData:{level:2,profession:\"minecraft:weaponsmith\"}}");
                }
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level _level2) {
                    if (!_level2.isClientSide()) {
                        _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
            } else if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("annoying_villagersbychentu:cczdz")) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level3) {
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level _level4) {
                    if (!_level4.isClientSide()) {
                        _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:cun_zhen_fu_lu ^ ^ ^ {VillagerData:{level:3,profession:\"minecraft:weaponsmith\"}}");
                }
            } else if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("annoying_villagersbychentu:lan_cun_qi")) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level5) {
                    if (!_level5.isClientSide()) {
                        _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level _level6) {
                    if (!_level6.isClientSide()) {
                        _level6.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:lan_cun_qi_fu_lu ^ ^ ^ {VillagerData:{level:4,profession:\"minecraft:weaponsmith\"}}");
                }
            } else if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("annoying_villagersbychentu:hong_cun_qi")) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level7) {
                    if (!_level7.isClientSide()) {
                        _level7.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level7.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level _level8) {
                    if (!_level8.isClientSide()) {
                        _level8.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level8.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:hong_cun_qi_fu_lu ^ ^ ^ {VillagerData:{level:4,profession:\"minecraft:weaponsmith\"}}");
                }
            } else if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("annoying_villagersbychentu:lu_cun_qi")) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level9) {
                    if (!_level9.isClientSide()) {
                        _level9.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level9.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level _level10) {
                    if (!_level10.isClientSide()) {
                        _level10.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level10.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:lvcunqifulu ^ ^ ^ {VillagerData:{level:4,profession:\"minecraft:weaponsmith\"}}");
                }
            } else if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("annoying_villagersbychentu:zi_cun_qi")) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level11) {
                    if (!_level11.isClientSide()) {
                        _level11.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level11.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level _level12) {
                    if (!_level12.isClientSide()) {
                        _level12.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level12.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.fall")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:zi_cun_qi_fu_lu ^ ^ ^ {VillagerData:{level:5,profession:\"minecraft:weaponsmith\"}}");
                }
            } else if (world instanceof Level _level13) {
                if (!_level13.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level13, x, y + 1.0d, z, new ItemStack(Blocks.OBSIDIAN));
                    entityToSpawn.setPickUpDelay(10);
                    _level13.addFreshEntity(entityToSpawn);
                }
            }
        }
    }
}
