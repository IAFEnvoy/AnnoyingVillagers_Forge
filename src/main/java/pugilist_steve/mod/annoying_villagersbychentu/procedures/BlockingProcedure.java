package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber

public class BlockingProcedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getAmount());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
        execute(null, world, x, y, z, entity, amount);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
        ItemStack itemStack;
        ItemStack itemStack2;
        LivingEntity livingEntity;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        ItemStack itemStack9;
        ItemStack itemStack10;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            if (_livEnt.isBlocking()) {
                if (entity instanceof LivingEntity _livEnt2) {
                    itemStack9 = _livEnt2.getMainHandItem();
                } else {
                    itemStack9 = ItemStack.EMPTY;
                }
                if (itemStack9.getItem() == AnnoyingVillagersbychentuModItems.DIAMOND_SHIELD.get()) {
                    if (event != null && event.isCancelable()) {
                        event.setCanceled(true);
                    }
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:sword_clash")), SoundSource.NEUTRAL, (float) (amount * 0.1d), (float) Mth.nextDouble(new Random(), 0.7d, 1.3d));
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:sword_clash")), SoundSource.NEUTRAL, (float) (amount * 0.1d), (float) Mth.nextDouble(new Random(), 0.7d, 1.3d), false);
                        }
                    }
                    if (!entity.level.isClientSide() && entity.getServer() != null) {
                        entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle annoying_villagersbychentu:spark ^ ^1.5 ^0.8 0 0 0 0.1 100");
                    }
                    if (!entity.level.isClientSide() && entity.getServer() != null) {
                        entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle epicfight:hit_blunt ^ ^1.5 ^0.8 0.1 0.1 0.1 1 1");
                    }
                    entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * Math.max(amount, 1.0d) * (-0.1d), 0.1d, entity.getLookAngle().z * Math.max(amount, 1.0d) * (-0.1d)));
                } else {
                    if (entity instanceof LivingEntity _livEnt3) {
                        itemStack10 = _livEnt3.getOffhandItem();
                    } else {
                        itemStack10 = ItemStack.EMPTY;
                    }
                    if (itemStack10.getItem() == AnnoyingVillagersbychentuModItems.DIAMOND_SHIELD.get()) {
                        if (event != null && event.isCancelable()) {
                            event.setCanceled(true);
                        }
                        if (amount >= 5.0d) {
                            if (!entity.level.isClientSide() && entity.getServer() != null) {
                                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle annoying_villagersbychentu:spark ^ ^1.5 ^0.8 0 0 0 0.1 100");
                            }
                            if (!entity.level.isClientSide() && entity.getServer() != null) {
                                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle epicfight:hit_blunt ^ ^1.5 ^0.8 0.1 0.1 0.1 1 1");
                            }
                            if (world instanceof Level _level2) {
                                if (!_level2.isClientSide()) {
                                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:sword_clash")), SoundSource.NEUTRAL, (float) (amount * 0.1d), (float) Mth.nextDouble(new Random(), 0.89d, 1.0d));
                                } else {
                                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:sword_clash")), SoundSource.NEUTRAL, (float) (amount * 0.1d), (float) Mth.nextDouble(new Random(), 0.89d, 1.0d), false);
                                }
                            }
                            entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * Math.max(amount, 0.5d) * (-0.1d), 0.1d, entity.getLookAngle().z * Math.max(amount, 0.5d) * (-0.1d)));
                        }
                    } else if (entity.isOnFire()) {
                        entity.setSprinting(true);
                    }
                }
            }
        }
        if (entity.isOnFire()) {
            entity.setSprinting(false);
            return;
        }
        if (entity instanceof LivingEntity _livEnt4) {
            if (_livEnt4.hasEffect(AnnoyingVillagersbychentuModMobEffects.GEDANG.get())) {
                if (world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.AIR) {
                    if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("minecraft:player")) {
                        if (Math.random() <= 0.3d) {
                            if (entity instanceof LivingEntity _livEnt5) {
                                itemStack7 = _livEnt5.getMainHandItem();
                            } else {
                                itemStack7 = ItemStack.EMPTY;
                            }
                            ItemStack _ist = itemStack7;
                            if (_ist.hurt((int) (amount), new Random(), null)) {
                                _ist.shrink(1);
                                _ist.setDamageValue(0);
                            }
                            if (entity instanceof LivingEntity _livEnt6) {
                                itemStack8 = _livEnt6.getOffhandItem();
                            } else {
                                itemStack8 = ItemStack.EMPTY;
                            }
                            ItemStack _ist2 = itemStack8;
                            if (_ist2.hurt((int) (amount), new Random(), null)) {
                                _ist2.shrink(1);
                                _ist2.setDamageValue(0);
                            }
                        }
                        if (event != null && event.isCancelable()) {
                            event.setCanceled(true);
                        }
                        if (world instanceof Level _level3) {
                            if (!_level3.isClientSide()) {
                                _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:sword_clash")), SoundSource.NEUTRAL, (float) (amount * 0.1d), (float) Mth.nextDouble(new Random(), 0.6d, 1.2d));
                            } else {
                                _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:sword_clash")), SoundSource.NEUTRAL, (float) (amount * 0.1d), (float) Mth.nextDouble(new Random(), 0.6d, 1.2d), false);
                            }
                        }
                        if (amount >= 5.0d) {
                            if (!entity.level.isClientSide() && entity.getServer() != null) {
                                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle epicfight:hit_blunt ^ ^1.5 ^0.8 0.1 0.1 0.1 1 1");
                            }
                            if (!entity.level.isClientSide() && entity.getServer() != null) {
                                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle annoying_villagersbychentu:spark ^ ^1.5 ^0.8 0 0 0 0.1 100");
                            }
                            if (entity instanceof LivingEntity _entity) {
                                if (!_entity.level.isClientSide()) {
                                    _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2, 2, false, false));
                                }
                            }
                            if (entity instanceof Player) {
                                ((Player) entity).causeFoodExhaustion(0.1f);
                            }
                            entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * (-0.1d), 0.1d, entity.getLookAngle().z * (-0.1d)));
                            if (Math.random() <= 0.1d) {
                                entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * Math.max(amount, 0.5d) * (-0.1d), 0.1d, entity.getLookAngle().z * Math.max(amount, 0.5d) * (-0.1d)));
                                if (world instanceof Level _level4) {
                                    if (!_level4.isClientSide()) {
                                        _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                                    } else {
                                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                                    }
                                }
                                if (entity instanceof LivingEntity _livEnt7) {
                                    itemStack5 = _livEnt7.getMainHandItem();
                                } else {
                                    itemStack5 = ItemStack.EMPTY;
                                }
                                ItemStack _ist3 = itemStack5;
                                if (_ist3.hurt((int) (amount * 5.0d), new Random(), null)) {
                                    _ist3.shrink(1);
                                    _ist3.setDamageValue(0);
                                }
                                if (entity instanceof LivingEntity _livEnt8) {
                                    itemStack6 = _livEnt8.getOffhandItem();
                                } else {
                                    itemStack6 = ItemStack.EMPTY;
                                }
                                ItemStack _ist4 = itemStack6;
                                if (_ist4.hurt((int) (amount * 5.0d), new Random(), null)) {
                                    _ist4.shrink(1);
                                    _ist4.setDamageValue(0);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Vec3 _center = new Vec3(x, y, z);
                    List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(45.0d), e -> {
                        return true;
                    }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_center);
                    })).collect(Collectors.toList());
                    for (Entity entity2 : _entfound) {
                        if (entity instanceof Mob _mobEnt) {
                            livingEntity = _mobEnt.getTarget();
                        } else {
                            livingEntity = null;
                        }
                        if (entity2 == livingEntity) {
                            if (event != null && event.isCancelable()) {
                                event.setCanceled(true);
                            }
                            if (world instanceof Level _level5) {
                                if (!_level5.isClientSide()) {
                                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:sword_clash")), SoundSource.NEUTRAL, (float) (amount * 0.1d), (float) Mth.nextDouble(new Random(), 0.6d, 1.2d));
                                } else {
                                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:sword_clash")), SoundSource.NEUTRAL, (float) (amount * 0.1d), (float) Mth.nextDouble(new Random(), 0.6d, 1.2d), false);
                                }
                            }
                            if (amount >= 5.0d) {
                                if (!entity.level.isClientSide() && entity.getServer() != null) {
                                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle epicfight:hit_blunt ^ ^1.5 ^0.8 0.1 0.1 0.1 1 1");
                                }
                                if (!entity.level.isClientSide() && entity.getServer() != null) {
                                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle annoying_villagersbychentu:spark ^ ^1.5 ^0.8 0 0 0 0.1 100");
                                }
                                if (entity instanceof LivingEntity _entity2) {
                                    if (!_entity2.level.isClientSide()) {
                                        _entity2.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2, 2, false, false));
                                    }
                                }
                                if (entity instanceof Player) {
                                    ((Player) entity).causeFoodExhaustion(0.1f);
                                }
                                entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * (-0.1d), 0.1d, entity.getLookAngle().z * (-0.1d)));
                                if (Math.random() <= 0.1d) {
                                    entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * Math.max(amount, 0.5d) * (-0.1d), 0.1d, entity.getLookAngle().z * Math.max(amount, 0.5d) * (-0.1d)));
                                    if (entity instanceof LivingEntity _livEnt9) {
                                        itemStack3 = _livEnt9.getMainHandItem();
                                    } else {
                                        itemStack3 = ItemStack.EMPTY;
                                    }
                                    ItemStack _ist5 = itemStack3;
                                    if (_ist5.hurt((int) (amount * 5.0d), new Random(), null)) {
                                        _ist5.shrink(1);
                                        _ist5.setDamageValue(0);
                                    }
                                    if (entity instanceof LivingEntity _livEnt10) {
                                        itemStack4 = _livEnt10.getOffhandItem();
                                    } else {
                                        itemStack4 = ItemStack.EMPTY;
                                    }
                                    ItemStack _ist6 = itemStack4;
                                    if (_ist6.hurt((int) (amount * 5.0d), new Random(), null)) {
                                        _ist6.shrink(1);
                                        _ist6.setDamageValue(0);
                                    }
                                    if (world instanceof Level _level6) {
                                        if (!_level6.isClientSide()) {
                                            _level6.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 2.0f, 1.0f);
                                        } else {
                                            _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:bloom")), SoundSource.NEUTRAL, 2.0f, 1.0f, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
        }
        if (entity instanceof LivingEntity _livEnt11) {
            if (_livEnt11.hasEffect(AnnoyingVillagersbychentuModMobEffects.FULU.get())) {
                if (event != null && event.isCancelable()) {
                    event.setCanceled(true);
                    return;
                }
                return;
            }
        }
        if (entity instanceof LivingEntity _livEnt12) {
            if (_livEnt12.hasEffect(MobEffects.POISON)) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).removeEffect(AnnoyingVillagersbychentuModMobEffects.GEDANG.get());
                    return;
                }
                return;
            }
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.BISHOU.get()) {
            if (entity instanceof Player _player) {
                _player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                _player.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living) {
                _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
            }
            if (world instanceof Level _level7) {
                if (!_level7.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level7, x, y, z, new ItemStack(AnnoyingVillagersbychentuModItems.BISHOU.get()));
                    entityToSpawn.setPickUpDelay(100);
                    _level7.addFreshEntity(entityToSpawn);
                    return;
                }
                return;
            }
            return;
        }
        if (entity instanceof LivingEntity _livEnt13) {
            itemStack2 = _livEnt13.getMainHandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (itemStack2.getItem() == AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get() && event != null && event.isCancelable()) {
            event.setCanceled(true);
        }
    }
}
