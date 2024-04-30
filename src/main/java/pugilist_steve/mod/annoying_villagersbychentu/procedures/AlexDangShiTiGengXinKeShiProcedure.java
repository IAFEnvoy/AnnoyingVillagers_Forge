package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.CczdzEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.CunMinZhenChaBingEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LanCunQiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LuCunQiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;


public class AlexDangShiTiGengXinKeShiProcedure {
    /* JADX WARN: Type inference failed for: r0v256, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v35, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v42, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r2v18, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r2v23, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure$4] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        LivingEntity livingEntity;
        if (entity == null) {
            return;
        }
        if (entity.isInWater() && (entity instanceof LivingEntity _entity)) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2, 5, false, false));
            }
        }
        if (entity.isPassenger()) {
            entity.stopRiding();
        }
        if (entity.isAlive()) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure.1
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
                    Entity _ent = entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tp @e[type=annoying_villagersbychentu:steve,name=!Steve] 1000 -1000 0");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 20);
        }
        if (!world.getEntitiesOfClass(PrimedTnt.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e -> {
            return true;
        }).isEmpty()) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 minecraft:oak_planks");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^1 minecraft:oak_planks");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^1 ^1 minecraft:oak_planks");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^1 ^ ^1 minecraft:oak_planks");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^1 ^-1 ^1 minecraft:oak_planks");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^1 ^1 ^1 minecraft:oak_planks");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^-1 ^ ^1 minecraft:oak_planks");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^-1 ^1 ^1 minecraft:oak_planks");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^-1 ^-1 ^1 minecraft:oak_planks");
            }
        }
        if (world.getBlockState(new BlockPos(x, y - 4.0d, z)).getBlock() == Blocks.AIR && world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR && world.getBlockState(new BlockPos(x, y - 2.0d, z)).getBlock() == Blocks.AIR && world.getBlockState(new BlockPos(x, y - 3.0d, z)).getBlock() == Blocks.AIR && world.getBlockState(new BlockPos(x, y - 4.0d, z)).getBlock() == Blocks.AIR) {
            world.setBlock(new BlockPos(x, y - 1.0d, z), Blocks.DIRT.defaultBlockState(), 3);
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.place")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.grass.place")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
        if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e2 -> {
            return true;
        }).isEmpty()) {
            if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e3 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure.2
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
                world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e4 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure.3
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
            }
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (entity instanceof LivingEntity _entity2) {
                if (!_entity2.level.isClientSide()) {
                    _entity2.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 4, false, false));
                }
            }
        }
        if (!world.getEntitiesOfClass(Monster.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e5 -> {
            return true;
        }).isEmpty() && (entity instanceof LivingEntity _entity3)) {
            if (!_entity3.level.isClientSide()) {
                _entity3.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 10, 4, false, false));
            }
        }
        if (!world.getEntitiesOfClass(CunMinZhenChaBingEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e6 -> {
            return true;
        }).isEmpty() && (entity instanceof LivingEntity _entity4)) {
            if (!_entity4.level.isClientSide()) {
                _entity4.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 10, 4, false, false));
            }
        }
        if (!world.getEntitiesOfClass(CczdzEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e7 -> {
            return true;
        }).isEmpty() && (entity instanceof LivingEntity _entity5)) {
            if (!_entity5.level.isClientSide()) {
                _entity5.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 10, 4, false, false));
            }
        }
        if (!world.getEntitiesOfClass(LanCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e8 -> {
            return true;
        }).isEmpty() && (entity instanceof LivingEntity _entity6)) {
            if (!_entity6.level.isClientSide()) {
                _entity6.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 10, 4, false, false));
            }
        }
        if (!world.getEntitiesOfClass(LuCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e9 -> {
            return true;
        }).isEmpty() && (entity instanceof LivingEntity _entity7)) {
            if (!_entity7.level.isClientSide()) {
                _entity7.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 10, 4, false, false));
            }
        }
        if (!world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e10 -> {
            return true;
        }).isEmpty() && ForgeRegistries.ENTITIES.getKey(world.getEntitiesOfClass(Mob.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e11 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure.4
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null).getType()).toString().equals("player_mobs:player_mob") && (entity instanceof LivingEntity _entity8)) {
            if (!_entity8.level.isClientSide()) {
                _entity8.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 10, 4, false, false));
            }
        }
        if (entity instanceof Mob _mobEnt) {
            livingEntity = _mobEnt.getTarget();
        } else {
            livingEntity = null;
        }
        if (livingEntity == world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e12 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangShiTiGengXinKeShiProcedure.5
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null) && Math.random() <= 0.12d && (entity instanceof LivingEntity _entity9)) {
            if (!_entity9.level.isClientSide()) {
                _entity9.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 10, 4, false, false));
            }
        }
    }
}
