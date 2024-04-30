package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.*;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModParticleTypes;

import java.util.Comparator;


public class LingZhiDangShiTiSiWangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v51, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$11] */
    /* JADX WARN: Type inference failed for: r1v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r1v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$7] */
    /* JADX WARN: Type inference failed for: r1v20, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$9] */
    /* JADX WARN: Type inference failed for: r1v26, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$10] */
    /* JADX WARN: Type inference failed for: r1v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$8] */
    /* JADX WARN: Type inference failed for: r1v34, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r1v38, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r1v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v42, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure$3] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity == null) {
            return;
        }
        world.addParticle((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.LIGHT.get(), x, y, z, 0.0d, 0.0d, 0.0d);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon player_mobs:player_mob");
        }
        if (!world.getEntitiesOfClass(Null1Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.1
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
            world.getEntitiesOfClass(Null1Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.2
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
        }
        if (!world.getEntitiesOfClass(Null2Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e3 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.3
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
            world.getEntitiesOfClass(Null2Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e4 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.4
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
        }
        if (!world.getEntitiesOfClass(Null3Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e5 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.5
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
            world.getEntitiesOfClass(Null3Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e6 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.6
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
        }
        if (!world.getEntitiesOfClass(Null4Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e7 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.7
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
            world.getEntitiesOfClass(Null4Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e8 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.8
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
        }
        if (!world.getEntitiesOfClass(Null6Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e9 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.9
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
            world.getEntitiesOfClass(Null6Entity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0d, 4000.0d, 4000.0d), e10 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.10
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiDangShiTiSiWangShiProcedure.11
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
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(Blocks.OBSIDIAN));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
                Level level2 = this.world;
                if (level2 instanceof Level) {
                    Level _level2 = level2;
                    if (!_level2.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(Blocks.OBSIDIAN));
                        entityToSpawn2.setPickUpDelay(10);
                        _level2.addFreshEntity(entityToSpawn2);
                    }
                }
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level3 = level3;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(Blocks.OBSIDIAN));
                        entityToSpawn3.setPickUpDelay(10);
                        _level3.addFreshEntity(entityToSpawn3);
                    }
                }
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level4 = level4;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(Blocks.OBSIDIAN));
                        entityToSpawn4.setPickUpDelay(10);
                        _level4.addFreshEntity(entityToSpawn4);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level5 = level5;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y + 1.0d, z, new ItemStack(Blocks.OBSIDIAN));
                        entityToSpawn5.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn5);
                    }
                }
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level6 = level6;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(Blocks.OBSIDIAN));
                        entityToSpawn6.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn6);
                    }
                }
                Level level7 = this.world;
                if (level7 instanceof Level) {
                    Level _level7 = level7;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_SWORD));
                        entityToSpawn7.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn7);
                    }
                }
                Level level8 = this.world;
                if (level8 instanceof Level) {
                    Level _level8 = level8;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_SHOVEL));
                        entityToSpawn8.setPickUpDelay(10);
                        _level8.addFreshEntity(entityToSpawn8);
                    }
                }
                Level level9 = this.world;
                if (level9 instanceof Level) {
                    Level _level9 = level9;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_PICKAXE));
                        entityToSpawn9.setPickUpDelay(10);
                        _level9.addFreshEntity(entityToSpawn9);
                    }
                }
                Level level10 = this.world;
                if (level10 instanceof Level) {
                    Level _level10 = level10;
                    if (!_level10.isClientSide()) {
                        ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_AXE));
                        entityToSpawn10.setPickUpDelay(10);
                        _level10.addFreshEntity(entityToSpawn10);
                    }
                }
                Level level11 = this.world;
                if (level11 instanceof Level) {
                    Level _level11 = level11;
                    if (!_level11.isClientSide()) {
                        ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_HOE));
                        entityToSpawn11.setPickUpDelay(10);
                        _level11.addFreshEntity(entityToSpawn11);
                    }
                }
                Level level12 = this.world;
                if (level12 instanceof Level) {
                    Level _level12 = level12;
                    if (!_level12.isClientSide()) {
                        ItemEntity entityToSpawn12 = new ItemEntity(_level12, x, y + 1.0d, z, new ItemStack(Items.COMPASS));
                        entityToSpawn12.setPickUpDelay(10);
                        _level12.addFreshEntity(entityToSpawn12);
                    }
                }
                Level level13 = this.world;
                if (level13 instanceof Level) {
                    Level _level13 = level13;
                    if (!_level13.isClientSide()) {
                        ItemEntity entityToSpawn13 = new ItemEntity(_level13, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn13.setPickUpDelay(10);
                        _level13.addFreshEntity(entityToSpawn13);
                    }
                }
                Level level14 = this.world;
                if (level14 instanceof Level) {
                    Level _level14 = level14;
                    if (!_level14.isClientSide()) {
                        ItemEntity entityToSpawn14 = new ItemEntity(_level14, x, y + 1.0d, z, new ItemStack(Items.MUSIC_DISC_11));
                        entityToSpawn14.setPickUpDelay(10);
                        _level14.addFreshEntity(entityToSpawn14);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
    }
}
