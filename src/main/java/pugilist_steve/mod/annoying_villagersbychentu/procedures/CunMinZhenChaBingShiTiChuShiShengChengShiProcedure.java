package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

import java.util.Comparator;


public class CunMinZhenChaBingShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r1v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r1v20, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r1v41, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v45, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r2v25, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r2v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure$4] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        ItemStack itemStack9;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.UNBREAKING, 1);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getMainHandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.SHARPNESS, 2);
        if (Math.random() <= 0.4d) {
            if (entity instanceof LivingEntity _entGetArmor) {
                itemStack6 = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
            } else {
                itemStack6 = ItemStack.EMPTY;
            }
            itemStack6.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            if (entity instanceof LivingEntity _entGetArmor2) {
                itemStack7 = _entGetArmor2.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack7 = ItemStack.EMPTY;
            }
            itemStack7.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            if (entity instanceof LivingEntity _entGetArmor3) {
                itemStack8 = _entGetArmor3.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack8 = ItemStack.EMPTY;
            }
            itemStack8.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            if (entity instanceof LivingEntity _entGetArmor4) {
                itemStack9 = _entGetArmor4.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack9 = ItemStack.EMPTY;
            }
            itemStack9.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
        }
        if (Math.random() <= 0.2d) {
            if (entity instanceof LivingEntity) {
                Player player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(Items.BOW);
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt3) {
                itemStack5 = _livEnt3.getMainHandItem();
            } else {
                itemStack5 = ItemStack.EMPTY;
            }
            itemStack5.enchant(Enchantments.POWER_ARROWS, 4);
        }
        if (Math.random() <= 0.15d) {
            if (entity instanceof LivingEntity) {
                Player player2 = (LivingEntity) entity;
                ItemStack _setstack2 = new ItemStack(Items.BOW);
                _setstack2.setCount(1);
                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt4) {
                itemStack4 = _livEnt4.getMainHandItem();
            } else {
                itemStack4 = ItemStack.EMPTY;
            }
            itemStack4.enchant(Enchantments.POWER_ARROWS, 4);
            if (world instanceof ServerLevel _level) {
                Mob sheep = new Sheep(EntityType.SHEEP, _level);
                sheep.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (sheep instanceof Mob) {
                    Mob _mobToSpawn = sheep;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(sheep.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(sheep);
            }
            entity.startRiding(world.getEntitiesOfClass(Sheep.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null));
            LivingEntity livingEntity = world.getEntitiesOfClass(Sheep.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure.2
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity instanceof LivingEntity) {
                LivingEntity _entity = livingEntity;
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 99999, 1, false, false));
                }
            }
            LivingEntity livingEntity2 = world.getEntitiesOfClass(Sheep.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e3 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure.3
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity2 instanceof LivingEntity) {
                LivingEntity _entity2 = livingEntity2;
                if (!_entity2.level.isClientSide()) {
                    _entity2.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 99999, 9, false, false));
                }
            }
        }
        if (Math.random() <= 0.1d) {
            if (entity instanceof LivingEntity) {
                Player player3 = (LivingEntity) entity;
                ItemStack _setstack3 = new ItemStack(Items.BOW);
                _setstack3.setCount(1);
                player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                if (player3 instanceof Player) {
                    Player _player3 = player3;
                    _player3.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt5) {
                itemStack3 = _livEnt5.getMainHandItem();
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            itemStack3.enchant(Enchantments.POWER_ARROWS, 4);
            if (world instanceof ServerLevel _level2) {
                Mob chicken = new Chicken(EntityType.CHICKEN, _level2);
                chicken.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (chicken instanceof Mob) {
                    Mob _mobToSpawn2 = chicken;
                    _mobToSpawn2.finalizeSpawn(_level2, world.getCurrentDifficultyAt(chicken.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(chicken);
            }
            entity.startRiding(world.getEntitiesOfClass(Chicken.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e4 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure.4
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null));
            LivingEntity livingEntity3 = world.getEntitiesOfClass(Chicken.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e5 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure.5
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity3 instanceof LivingEntity) {
                LivingEntity _entity3 = livingEntity3;
                if (!_entity3.level.isClientSide()) {
                    _entity3.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 99999, 1, false, false));
                }
            }
            LivingEntity livingEntity4 = world.getEntitiesOfClass(Chicken.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e6 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBingShiTiChuShiShengChengShiProcedure.6
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity4 instanceof LivingEntity) {
                LivingEntity _entity4 = livingEntity4;
                if (!_entity4.level.isClientSide()) {
                    _entity4.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 99999, 9, false, false));
                }
            }
        }
        if (entity instanceof LivingEntity) {
            ((LivingEntity) entity).removeEffect(MobEffects.REGENERATION);
        }
    }
}
