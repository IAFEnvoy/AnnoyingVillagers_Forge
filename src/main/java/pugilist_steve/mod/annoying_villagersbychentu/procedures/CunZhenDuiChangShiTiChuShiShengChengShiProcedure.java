package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Comparator;


public class CunZhenDuiChangShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v108, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r1v20, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r1v24, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r2v6, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure$2] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
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
        itemStack.enchant(Enchantments.SMITE, 3);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getMainHandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.SHARPNESS, 3);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack3 = _livEnt3.getOffhandItem();
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.UNBREAKING, 3);
        if (entity instanceof LivingEntity _livEnt4) {
            itemStack4 = _livEnt4.getOffhandItem();
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.SHARPNESS, 3);
        if (Math.random() <= 0.7d) {
            if (entity instanceof LivingEntity _entGetArmor) {
                itemStack6 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack6 = ItemStack.EMPTY;
            }
            itemStack6.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            if (entity instanceof LivingEntity _entGetArmor2) {
                itemStack7 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack7 = ItemStack.EMPTY;
            }
            itemStack7.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            if (entity instanceof LivingEntity _entGetArmor3) {
                itemStack8 = _entGetArmor3.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack8 = ItemStack.EMPTY;
            }
            itemStack8.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
            if (entity instanceof LivingEntity _entGetArmor4) {
                itemStack9 = _entGetArmor4.getItemBySlot(EquipmentSlot.FEET);
            } else {
                itemStack9 = ItemStack.EMPTY;
            }
            itemStack9.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
        }
        if (Math.random() <= 0.2d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure.1
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
                    ItemStack itemStack10;
                    ItemStack itemStack11;
                    Player player = entity;
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
                        _player.getInventory().setChanged();
                    } else if (player instanceof LivingEntity) {
                        LivingEntity _living = player;
                        _living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
                    }
                    Player player2 = entity;
                    if (player2 instanceof Player) {
                        Player _player2 = player2;
                        _player2.getInventory().armor.set(2, new ItemStack(Items.DIAMOND_CHESTPLATE));
                        _player2.getInventory().setChanged();
                    } else if (player2 instanceof LivingEntity) {
                        LivingEntity _living2 = player2;
                        _living2.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.DIAMOND_CHESTPLATE));
                    }
                    Player player3 = entity;
                    if (player3 instanceof Player) {
                        Player _player3 = player3;
                        _player3.getInventory().armor.set(0, new ItemStack(Items.DIAMOND_BOOTS));
                        _player3.getInventory().setChanged();
                    } else if (player3 instanceof LivingEntity) {
                        LivingEntity _living3 = player3;
                        _living3.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.DIAMOND_BOOTS));
                    }
                    if (entity instanceof LivingEntity) {
                        LivingEntity _entGetArmor5 = entity;
                        itemStack10 = _entGetArmor5.getItemBySlot(EquipmentSlot.CHEST);
                    } else {
                        itemStack10 = ItemStack.EMPTY;
                    }
                    itemStack10.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
                    if (entity instanceof LivingEntity) {
                        LivingEntity _entGetArmor6 = entity;
                        itemStack11 = _entGetArmor6.getItemBySlot(EquipmentSlot.FEET);
                    } else {
                        itemStack11 = ItemStack.EMPTY;
                    }
                    itemStack11.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 1);
        }
        if (Math.random() <= 0.32d) {
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
            if (entity instanceof LivingEntity _livEnt5) {
                itemStack5 = _livEnt5.getMainHandItem();
            } else {
                itemStack5 = ItemStack.EMPTY;
            }
            itemStack5.enchant(Enchantments.POWER_ARROWS, 3);
            if (world instanceof ServerLevel _level) {
                Mob sheep = new Sheep(EntityType.SHEEP, _level);
                sheep.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (sheep instanceof Mob) {
                    Mob _mobToSpawn = sheep;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(sheep.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(sheep);
            }
            entity.startRiding(world.getEntitiesOfClass(Sheep.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure.2
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null));
            LivingEntity livingEntity = world.getEntitiesOfClass(Sheep.class, AABB.ofSize(new Vec3(x, y, z), 3.0d, 3.0d, 3.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure.3
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
            LivingEntity livingEntity2 = world.getEntitiesOfClass(Sheep.class, AABB.ofSize(new Vec3(x, y, z), 3.0d, 3.0d, 3.0d), e3 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure.4
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
            LivingEntity livingEntity3 = world.getEntitiesOfClass(Sheep.class, AABB.ofSize(new Vec3(x, y, z), 3.0d, 3.0d, 3.0d), e4 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunZhenDuiChangShiTiChuShiShengChengShiProcedure.5
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
