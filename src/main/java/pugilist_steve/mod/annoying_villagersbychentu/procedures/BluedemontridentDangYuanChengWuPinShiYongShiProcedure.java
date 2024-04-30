package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class BluedemontridentDangYuanChengWuPinShiYongShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        boolean z2;
        boolean z3;
        boolean z4;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get()) {
            if (entity instanceof LivingEntity _livEnt2) {
                itemStack2 = _livEnt2.getOffhandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            if (itemStack2.getItem() == AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get() && entity.isShiftKeyDown()) {
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(4.0d), e -> {
                    return true;
                }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_center);
                })).collect(Collectors.toList());
                for (Entity entity2 : _entfound) {
                    if (entity2 instanceof LivingEntity _livEnt3) {
                        z2 = _livEnt3.getMobType() == MobType.UNDEFINED;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (entity2 instanceof LivingEntity _livEnt4) {
                            z3 = _livEnt4.getMobType() == MobType.UNDEAD;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (entity2 instanceof LivingEntity _livEnt5) {
                                z4 = _livEnt5.getMobType() == MobType.ILLAGER;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                entity2.hurt(DamageSource.GENERIC, 3.0f);
                                entity2.hurt(DamageSource.ON_FIRE, 1.0f);
                                entity2.hurt(DamageSource.LIGHTNING_BOLT, 1.0f);
                            }
                        }
                    }
                }
                if (world instanceof ServerLevel _level) {
                    LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
                    entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 30, 50), y, z)));
                    entityToSpawn.setVisualOnly(false);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level2) {
                    LightningBolt entityToSpawn2 = EntityType.LIGHTNING_BOLT.create(_level2);
                    entityToSpawn2.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 30, 50), y, z)));
                    entityToSpawn2.setVisualOnly(false);
                    _level2.addFreshEntity(entityToSpawn2);
                }
                if (world instanceof ServerLevel _level3) {
                    LightningBolt entityToSpawn3 = EntityType.LIGHTNING_BOLT.create(_level3);
                    entityToSpawn3.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 15, 20), y, z)));
                    entityToSpawn3.setVisualOnly(false);
                    _level3.addFreshEntity(entityToSpawn3);
                }
                if (world instanceof ServerLevel _level4) {
                    LightningBolt entityToSpawn4 = EntityType.LIGHTNING_BOLT.create(_level4);
                    entityToSpawn4.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 15, 20), y, z)));
                    entityToSpawn4.setVisualOnly(false);
                    _level4.addFreshEntity(entityToSpawn4);
                }
                if (world instanceof ServerLevel _level5) {
                    LightningBolt entityToSpawn5 = EntityType.LIGHTNING_BOLT.create(_level5);
                    entityToSpawn5.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z + Mth.nextInt(new Random(), 30, 50))));
                    entityToSpawn5.setVisualOnly(false);
                    _level5.addFreshEntity(entityToSpawn5);
                }
                if (world instanceof ServerLevel _level6) {
                    LightningBolt entityToSpawn6 = EntityType.LIGHTNING_BOLT.create(_level6);
                    entityToSpawn6.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z + Mth.nextInt(new Random(), 15, 20))));
                    entityToSpawn6.setVisualOnly(false);
                    _level6.addFreshEntity(entityToSpawn6);
                }
                if (world instanceof ServerLevel _level7) {
                    LightningBolt entityToSpawn7 = EntityType.LIGHTNING_BOLT.create(_level7);
                    entityToSpawn7.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z - Mth.nextInt(new Random(), 30, 50))));
                    entityToSpawn7.setVisualOnly(false);
                    _level7.addFreshEntity(entityToSpawn7);
                }
                if (world instanceof ServerLevel _level8) {
                    LightningBolt entityToSpawn8 = EntityType.LIGHTNING_BOLT.create(_level8);
                    entityToSpawn8.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z - Mth.nextInt(new Random(), 15, 20))));
                    entityToSpawn8.setVisualOnly(false);
                    _level8.addFreshEntity(entityToSpawn8);
                }
                if (world instanceof ServerLevel _level9) {
                    LightningBolt entityToSpawn9 = EntityType.LIGHTNING_BOLT.create(_level9);
                    entityToSpawn9.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 30, 50), y, z + Mth.nextInt(new Random(), 30, 50))));
                    entityToSpawn9.setVisualOnly(false);
                    _level9.addFreshEntity(entityToSpawn9);
                }
                if (world instanceof ServerLevel _level10) {
                    LightningBolt entityToSpawn10 = EntityType.LIGHTNING_BOLT.create(_level10);
                    entityToSpawn10.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 20, 30), y, z + Mth.nextInt(new Random(), 20, 30))));
                    entityToSpawn10.setVisualOnly(false);
                    _level10.addFreshEntity(entityToSpawn10);
                }
                if (world instanceof ServerLevel _level11) {
                    LightningBolt entityToSpawn11 = EntityType.LIGHTNING_BOLT.create(_level11);
                    entityToSpawn11.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 30, 50), y, z - Mth.nextInt(new Random(), 30, 50))));
                    entityToSpawn11.setVisualOnly(false);
                    _level11.addFreshEntity(entityToSpawn11);
                }
                if (world instanceof ServerLevel _level12) {
                    LightningBolt entityToSpawn12 = EntityType.LIGHTNING_BOLT.create(_level12);
                    entityToSpawn12.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 20, 30), y, z - Mth.nextInt(new Random(), 20, 30))));
                    entityToSpawn12.setVisualOnly(false);
                    _level12.addFreshEntity(entityToSpawn12);
                }
                if (world instanceof ServerLevel _level13) {
                    LightningBolt entityToSpawn13 = EntityType.LIGHTNING_BOLT.create(_level13);
                    entityToSpawn13.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 30, 50), y, z - Mth.nextInt(new Random(), 30, 50))));
                    entityToSpawn13.setVisualOnly(false);
                    _level13.addFreshEntity(entityToSpawn13);
                }
                if (world instanceof ServerLevel _level14) {
                    LightningBolt entityToSpawn14 = EntityType.LIGHTNING_BOLT.create(_level14);
                    entityToSpawn14.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 20, 30), y, z - Mth.nextInt(new Random(), 20, 30))));
                    entityToSpawn14.setVisualOnly(false);
                    _level14.addFreshEntity(entityToSpawn14);
                }
                if (world instanceof ServerLevel _level15) {
                    LightningBolt entityToSpawn15 = EntityType.LIGHTNING_BOLT.create(_level15);
                    entityToSpawn15.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 30, 50), y, z + Mth.nextInt(new Random(), 30, 50))));
                    entityToSpawn15.setVisualOnly(false);
                    _level15.addFreshEntity(entityToSpawn15);
                }
                if (world instanceof ServerLevel _level16) {
                    LightningBolt entityToSpawn16 = EntityType.LIGHTNING_BOLT.create(_level16);
                    entityToSpawn16.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 20, 30), y, z + Mth.nextInt(new Random(), 20, 30))));
                    entityToSpawn16.setVisualOnly(false);
                    _level16.addFreshEntity(entityToSpawn16);
                }
                if (entity instanceof Player _player) {
                    _player.getCooldowns().addCooldown(AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get(), 200);
                }
            }
        }
    }
}
