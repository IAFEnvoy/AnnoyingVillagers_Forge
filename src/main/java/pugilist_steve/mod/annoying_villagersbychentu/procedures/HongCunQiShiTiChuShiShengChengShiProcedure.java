package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Comparator;


public class HongCunQiShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r1v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiShiTiChuShiShengChengShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v19, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiShiTiChuShiShengChengShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r1v23, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiShiTiChuShiShengChengShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r2v2, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiShiTiChuShiShengChengShiProcedure$1] */
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
        if (Math.random() < 0.2d) {
            if (entity instanceof LivingEntity) {
                Player player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_JIAN.get());
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt) {
                itemStack9 = _livEnt.getMainHandItem();
            } else {
                itemStack9 = ItemStack.EMPTY;
            }
            itemStack9.enchant(Enchantments.SHARPNESS, 4);
        }
        if (Math.random() < 0.2d) {
            if (entity instanceof LivingEntity) {
                Player player2 = (LivingEntity) entity;
                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_DAO_PIAN.get());
                _setstack2.setCount(1);
                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt2) {
                itemStack8 = _livEnt2.getMainHandItem();
            } else {
                itemStack8 = ItemStack.EMPTY;
            }
            itemStack8.enchant(Enchantments.SHARPNESS, 4);
        }
        if (Math.random() < 0.2d) {
            if (entity instanceof LivingEntity) {
                Player player3 = (LivingEntity) entity;
                ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_BI_SHOU.get());
                _setstack3.setCount(1);
                player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                if (player3 instanceof Player) {
                    Player _player3 = player3;
                    _player3.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt3) {
                itemStack7 = _livEnt3.getMainHandItem();
            } else {
                itemStack7 = ItemStack.EMPTY;
            }
            itemStack7.enchant(Enchantments.SHARPNESS, 4);
        }
        if (Math.random() < 0.2d) {
            if (entity instanceof LivingEntity) {
                Player player4 = (LivingEntity) entity;
                ItemStack _setstack4 = new ItemStack(Items.DIAMOND_SWORD);
                _setstack4.setCount(1);
                player4.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
                if (player4 instanceof Player) {
                    Player _player4 = player4;
                    _player4.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt4) {
                itemStack6 = _livEnt4.getMainHandItem();
            } else {
                itemStack6 = ItemStack.EMPTY;
            }
            itemStack6.enchant(Enchantments.SHARPNESS, 4);
        }
        if (Math.random() <= 0.4d) {
            if (entity instanceof LivingEntity _entGetArmor) {
                itemStack2 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            itemStack2.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
            if (entity instanceof LivingEntity _entGetArmor2) {
                itemStack3 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            itemStack3.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
            if (entity instanceof LivingEntity _entGetArmor3) {
                itemStack4 = _entGetArmor3.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack4 = ItemStack.EMPTY;
            }
            itemStack4.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
            if (entity instanceof LivingEntity _entGetArmor4) {
                itemStack5 = _entGetArmor4.getItemBySlot(EquipmentSlot.FEET);
            } else {
                itemStack5 = ItemStack.EMPTY;
            }
            itemStack5.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
        }
        if (Math.random() <= 0.12d) {
            if (entity instanceof LivingEntity) {
                Player player5 = (LivingEntity) entity;
                ItemStack _setstack5 = new ItemStack(Items.BOW);
                _setstack5.setCount(1);
                player5.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
                if (player5 instanceof Player) {
                    Player _player5 = player5;
                    _player5.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt5) {
                itemStack = _livEnt5.getMainHandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            itemStack.enchant(Enchantments.SHARPNESS, 4);
            if (world instanceof ServerLevel _level) {
                Mob cow = new Cow(EntityType.COW, _level);
                cow.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (cow instanceof Mob) {
                    Mob _mobToSpawn = cow;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(cow.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(cow);
            }
            entity.startRiding(world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiShiTiChuShiShengChengShiProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null));
            LivingEntity livingEntity = world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiShiTiChuShiShengChengShiProcedure.2
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
            LivingEntity livingEntity2 = world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e3 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiShiTiChuShiShengChengShiProcedure.3
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity2 instanceof LivingEntity) {
                LivingEntity _entity2 = livingEntity2;
                if (!_entity2.level.isClientSide()) {
                    _entity2.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 1, false, false));
                }
            }
            LivingEntity livingEntity3 = world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e4 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HongCunQiShiTiChuShiShengChengShiProcedure.4
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (livingEntity3 instanceof LivingEntity) {
                LivingEntity _entity3 = livingEntity3;
                if (!_entity3.level.isClientSide()) {
                    _entity3.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 99999, 9, false, false));
                }
            }
        }
    }
}
