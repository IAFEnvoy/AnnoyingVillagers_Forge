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


public class LuCunQiShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r1v11, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiShiTiChuShiShengChengShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiShiTiChuShiShengChengShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r1v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r2v14, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiShiTiChuShiShengChengShiProcedure$4] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.5d) {
            if (entity instanceof LivingEntity _entGetArmor) {
                itemStack3 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            itemStack3.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            if (entity instanceof LivingEntity _entGetArmor2) {
                itemStack4 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack4 = ItemStack.EMPTY;
            }
            itemStack4.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            if (entity instanceof LivingEntity _entGetArmor3) {
                itemStack5 = _entGetArmor3.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack5 = ItemStack.EMPTY;
            }
            itemStack5.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            if (entity instanceof LivingEntity _entGetArmor4) {
                itemStack6 = _entGetArmor4.getItemBySlot(EquipmentSlot.FEET);
            } else {
                itemStack6 = ItemStack.EMPTY;
            }
            itemStack6.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
        }
        if (Math.random() <= 0.1d && (entity instanceof LivingEntity)) {
            Player player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_DAO_PIAN.get());
            _setstack.setCount(1);
            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (player instanceof Player) {
                Player _player = player;
                _player.getInventory().setChanged();
            }
        }
        if (Math.random() <= 0.1d && (entity instanceof LivingEntity)) {
            Player player2 = (LivingEntity) entity;
            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_DAO.get());
            _setstack2.setCount(1);
            player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
            if (player2 instanceof Player) {
                Player _player2 = player2;
                _player2.getInventory().setChanged();
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
            if (entity instanceof LivingEntity _livEnt) {
                itemStack2 = _livEnt.getMainHandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            itemStack2.enchant(Enchantments.POWER_ARROWS, 5);
        }
        if (Math.random() <= 0.28d) {
            if (entity instanceof LivingEntity) {
                Player player4 = (LivingEntity) entity;
                ItemStack _setstack4 = new ItemStack(Items.BOW);
                _setstack4.setCount(1);
                player4.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
                if (player4 instanceof Player) {
                    Player _player4 = player4;
                    _player4.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt2) {
                itemStack = _livEnt2.getMainHandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            itemStack.enchant(Enchantments.POWER_ARROWS, 5);
            if (world instanceof ServerLevel _level) {
                Mob cow = new Cow(EntityType.COW, _level);
                cow.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (cow instanceof Mob) {
                    Mob _mobToSpawn = cow;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(cow.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(cow);
            }
            LivingEntity livingEntity = world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiShiTiChuShiShengChengShiProcedure.1
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
            LivingEntity livingEntity2 = world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiShiTiChuShiShengChengShiProcedure.2
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
            LivingEntity livingEntity3 = world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e3 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiShiTiChuShiShengChengShiProcedure.3
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
            entity.startRiding(world.getEntitiesOfClass(Cow.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e4 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiShiTiChuShiShengChengShiProcedure.4
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null));
        }
    }
}
