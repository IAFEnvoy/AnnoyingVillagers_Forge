package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Comparator;


public class HongCunQiDangYouJiShiTiShiProcedure {
    /* JADX WARN: Type inference failed for: r1v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiDangYouJiShiTiShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v14, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiDangYouJiShiTiShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r1v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiDangYouJiShiTiShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        float f;
        LivingEntity livingEntity;
        ItemStack itemStack;
        ItemStack itemStack2;
        LivingEntity livingEntity2;
        LivingEntity livingEntity3;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            f = _livEnt.getHealth();
        } else {
            f = -1.0f;
        }
        if (f <= 7.0f) {
            if (entity instanceof Mob _mobEnt) {
                livingEntity = _mobEnt.getTarget();
            } else {
                livingEntity = null;
            }
            LivingEntity livingEntity4 = livingEntity;
            if (livingEntity4 instanceof LivingEntity) {
                LivingEntity _livEnt2 = livingEntity4;
                itemStack = _livEnt2.getMainHandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            if (itemStack.getItem() == Blocks.OBSIDIAN.asItem()) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
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
                        _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:hong_cun_qi_fu_lu ^ ^ ^ {VillagerData:{level:4,profession:\"minecraft:weaponsmith\"}}");
                }
                if (entity instanceof Mob _mobEnt2) {
                    livingEntity2 = _mobEnt2.getTarget();
                } else {
                    livingEntity2 = null;
                }
                LivingEntity livingEntity5 = livingEntity2;
                if (livingEntity5 instanceof Player _player) {
                    ItemStack _stktoremove = new ItemStack(Blocks.OBSIDIAN);
                    _player.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove.getItem() == p.getItem();
                    }, 1, _player.inventoryMenu.getCraftSlots());
                }
                if (entity instanceof Mob _mobEnt3) {
                    livingEntity3 = _mobEnt3.getTarget();
                } else {
                    livingEntity3 = null;
                }
                LivingEntity livingEntity6 = livingEntity3;
                if (livingEntity6 instanceof Player _player2) {
                    if (!_player2.level.isClientSide()) {
                        _player2.displayClientMessage(new TextComponent("已俘"), true);
                        return;
                    }
                    return;
                }
                return;
            }
            LivingEntity livingEntity7 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiDangYouJiShiTiShiProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity7 instanceof LivingEntity) {
                LivingEntity _livEnt3 = livingEntity7;
                itemStack2 = _livEnt3.getMainHandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            if (itemStack2.getItem() == Blocks.OBSIDIAN.asItem()) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                if (world instanceof Level _level3) {
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level _level4) {
                    if (!_level4.isClientSide()) {
                        _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:hong_cun_qi_fu_lu ^ ^ ^ {VillagerData:{level:4,profession:\"minecraft:weaponsmith\"}}");
                }
                Player player = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e2 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiDangYouJiShiTiShiProcedure.2
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (player instanceof Player) {
                    Player _player3 = player;
                    ItemStack _stktoremove2 = new ItemStack(Blocks.OBSIDIAN);
                    _player3.getInventory().clearOrCountMatchingItems(p2 -> {
                        return _stktoremove2.getItem() == p2.getItem();
                    }, 1, _player3.inventoryMenu.getCraftSlots());
                }
                Player player2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e3 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiDangYouJiShiTiShiProcedure.3
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (player2 instanceof Player) {
                    Player _player4 = player2;
                    if (!_player4.level.isClientSide()) {
                        _player4.displayClientMessage(new TextComponent("已俘"), true);
                    }
                }
            }
        }
    }
}
