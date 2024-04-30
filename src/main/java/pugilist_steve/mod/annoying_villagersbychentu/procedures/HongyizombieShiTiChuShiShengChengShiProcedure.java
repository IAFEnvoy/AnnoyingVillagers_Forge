package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;

import java.util.Random;


public class HongyizombieShiTiChuShiShengChengShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.5d) {
            if (entity instanceof Player _player) {
                _player.getInventory().armor.set(3, new ItemStack(Items.DIAMOND_HELMET));
                _player.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living) {
                _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.DIAMOND_HELMET));
            }
        }
        if (Math.random() <= 0.5d) {
            if (entity instanceof Player _player2) {
                _player2.getInventory().armor.set(2, new ItemStack(Items.DIAMOND_CHESTPLATE));
                _player2.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living2) {
                _living2.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.DIAMOND_CHESTPLATE));
            }
        }
        if (Math.random() <= 0.5d) {
            if (entity instanceof Player _player3) {
                _player3.getInventory().armor.set(1, new ItemStack(Items.DIAMOND_LEGGINGS));
                _player3.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living3) {
                _living3.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.DIAMOND_LEGGINGS));
            }
        }
        if (Math.random() <= 0.5d) {
            if (entity instanceof Player _player4) {
                _player4.getInventory().armor.set(0, new ItemStack(Items.DIAMOND_BOOTS));
                _player4.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living4) {
                _living4.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.DIAMOND_BOOTS));
            }
        }
        if (Math.random() <= 0.5d) {
            if (entity instanceof LivingEntity _entGetArmor) {
                itemStack4 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack4 = ItemStack.EMPTY;
            }
            itemStack4.enchant(Enchantments.UNBREAKING, 1);
        }
        if (Math.random() <= 0.5d) {
            if (entity instanceof LivingEntity _entGetArmor2) {
                itemStack3 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            itemStack3.enchant(Enchantments.FIRE_PROTECTION, 1);
        }
        if (Math.random() <= 0.5d) {
            if (entity instanceof LivingEntity _entGetArmor3) {
                itemStack2 = _entGetArmor3.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            itemStack2.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 1);
        }
        if (Math.random() <= 0.5d) {
            if (entity instanceof LivingEntity _entGetArmor4) {
                itemStack = _entGetArmor4.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack = ItemStack.EMPTY;
            }
            itemStack.enchant(Enchantments.FALL_PROTECTION, 2);
        }
        if (Math.random() <= 0.05d) {
            if (world instanceof ServerLevel _level) {
                Mob zombie = new Zombie(EntityType.ZOMBIE, _level);
                zombie.moveTo(x + Mth.nextInt(new Random(), 2, 8), y + 1.0d, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (zombie instanceof Mob) {
                    Mob _mobToSpawn = zombie;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(zombie.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(zombie);
            }
            if (world instanceof ServerLevel _level2) {
                Mob zombie2 = new Zombie(EntityType.ZOMBIE, _level2);
                zombie2.moveTo(x - Mth.nextInt(new Random(), 2, 8), y + 1.0d, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (zombie2 instanceof Mob) {
                    Mob _mobToSpawn2 = zombie2;
                    _mobToSpawn2.finalizeSpawn(_level2, world.getCurrentDifficultyAt(zombie2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(zombie2);
            }
            if (world instanceof ServerLevel _level3) {
                Mob zombie3 = new Zombie(EntityType.ZOMBIE, _level3);
                zombie3.moveTo(x, y + 1.0d, z + Mth.nextInt(new Random(), 2, 8), world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (zombie3 instanceof Mob) {
                    Mob _mobToSpawn3 = zombie3;
                    _mobToSpawn3.finalizeSpawn(_level3, world.getCurrentDifficultyAt(zombie3.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(zombie3);
            }
            if (world instanceof ServerLevel _level4) {
                Mob zombie4 = new Zombie(EntityType.ZOMBIE, _level4);
                zombie4.moveTo(x, y + 1.0d, z + Mth.nextInt(new Random(), 2, 8), world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (zombie4 instanceof Mob) {
                    Mob _mobToSpawn4 = zombie4;
                    _mobToSpawn4.finalizeSpawn(_level4, world.getCurrentDifficultyAt(zombie4.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(zombie4);
            }
        }
    }
}
