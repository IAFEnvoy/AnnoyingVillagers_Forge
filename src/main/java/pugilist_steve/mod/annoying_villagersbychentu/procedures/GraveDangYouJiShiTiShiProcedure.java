package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Comparator;
import java.util.Random;


public class GraveDangYouJiShiTiShiProcedure {
    /* JADX WARN: Type inference failed for: r0v301, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$7] */
    /* JADX WARN: Type inference failed for: r1v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$9] */
    /* JADX WARN: Type inference failed for: r1v22, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$14] */
    /* JADX WARN: Type inference failed for: r1v28, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$15] */
    /* JADX WARN: Type inference failed for: r1v34, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$16] */
    /* JADX WARN: Type inference failed for: r1v38, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$17] */
    /* JADX WARN: Type inference failed for: r1v47, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$10] */
    /* JADX WARN: Type inference failed for: r1v53, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$11] */
    /* JADX WARN: Type inference failed for: r1v57, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$12] */
    /* JADX WARN: Type inference failed for: r1v61, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$13] */
    /* JADX WARN: Type inference failed for: r1v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r1v73, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$8] */
    /* JADX WARN: Type inference failed for: r1v84, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r1v95, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r1v99, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$3] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        int i;
        int i2;
        if (entity == null) {
            return;
        }
        LivingEntity livingEntity = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.1
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null);
        if (livingEntity instanceof LivingEntity) {
            LivingEntity _livEnt = livingEntity;
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.JOIN_GRAVE_ITEM.get()) {
            Player player = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.2
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (player instanceof Player) {
                Player _player = player;
                ItemStack _stktoremove = new ItemStack(AnnoyingVillagersbychentuModItems.JOIN_GRAVE_ITEM.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
            Entity _ent = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e3 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.3
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave @s");
            }
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 欢迎新成员"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.4
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

                /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure$4$1] */
                private void run() {
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 需要换东西吗？5级经验换4个绿宝石，拿着泥土右键我即可交换"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.4.1
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
                            if (!this.world.isClientSide() && this.world.getServer() != null) {
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 需要村民头套吗？拿着绿宝石右键我，12级经验换一个"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, Mth.nextInt(new Random(), 80, 120));
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, Mth.nextInt(new Random(), 60, 120));
        }
        LivingEntity livingEntity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e4 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.5
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null);
        if (livingEntity2 instanceof LivingEntity) {
            LivingEntity _livEnt2 = livingEntity2;
            itemStack2 = _livEnt2.getMainHandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (itemStack2.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 谢谢你，好多了"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:jinshiyinxiao")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:jinshiyinxiao")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            Player player2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e5 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.6
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (player2 instanceof Player) {
                Player _player2 = player2;
                ItemStack _stktoremove2 = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
                _player2.getInventory().clearOrCountMatchingItems(p2 -> {
                    return _stktoremove2.getItem() == p2.getItem();
                }, 1, _player2.inventoryMenu.getCraftSlots());
            }
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2));
                }
            }
        }
        LivingEntity livingEntity3 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e6 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.7
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null);
        if (livingEntity3 instanceof LivingEntity) {
            LivingEntity _livEnt3 = livingEntity3;
            itemStack3 = _livEnt3.getMainHandItem();
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        if (itemStack3.getItem() == Items.GOLDEN_APPLE) {
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> Thanks"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:jinshiyinxiao")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:jinshiyinxiao")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (entity instanceof LivingEntity _entity2) {
                if (!_entity2.level.isClientSide()) {
                    _entity2.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2));
                }
            }
            Player player3 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e7 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.8
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (player3 instanceof Player) {
                Player _player3 = player3;
                ItemStack _stktoremove3 = new ItemStack(Items.GOLDEN_APPLE);
                _player3.getInventory().clearOrCountMatchingItems(p3 -> {
                    return _stktoremove3.getItem() == p3.getItem();
                }, 1, _player3.inventoryMenu.getCraftSlots());
            }
        }
        LivingEntity livingEntity4 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e8 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.9
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null);
        if (livingEntity4 instanceof LivingEntity) {
            LivingEntity _livEnt4 = livingEntity4;
            itemStack4 = _livEnt4.getMainHandItem();
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        if (itemStack4.getItem() == Items.EMERALD) {
            Player player4 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e9 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.10
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (player4 instanceof Player) {
                Player _plr = player4;
                i2 = _plr.experienceLevel;
            } else {
                i2 = 0;
            }
            if (i2 >= 12) {
                if (!world.isClientSide() && world.getServer() != null) {
                    world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> OK，带上它村民就会把你当做他们自己人了"), ChatType.SYSTEM, Util.NIL_UUID);
                }
                Player player5 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e10 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.11
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (player5 instanceof Player) {
                    Player _player4 = player5;
                    _player4.giveExperienceLevels(-12);
                }
                Player player6 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e11 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.12
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (player6 instanceof Player) {
                    Player _player5 = player6;
                    ItemStack _stktoremove4 = new ItemStack(Items.EMERALD);
                    _player5.getInventory().clearOrCountMatchingItems(p4 -> {
                        return _stktoremove4.getItem() == p4.getItem();
                    }, 1, _player5.inventoryMenu.getCraftSlots());
                }
                Player player7 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e12 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.13
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (player7 instanceof Player) {
                    Player _player6 = player7;
                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.VILLAGERHEAD.get());
                    _setstack.setCount(1);
                    ItemHandlerHelper.giveItemToPlayer(_player6, _setstack);
                }
            } else if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 你不行，经验等级还不到12级"), ChatType.SYSTEM, Util.NIL_UUID);
            }
        }
        LivingEntity livingEntity5 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e13 -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.14
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null);
        if (livingEntity5 instanceof LivingEntity) {
            LivingEntity _livEnt5 = livingEntity5;
            itemStack5 = _livEnt5.getMainHandItem();
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        if (itemStack5.getItem() == Blocks.DIRT.asItem()) {
            Player player8 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e14 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.15
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null);
            if (player8 instanceof Player) {
                Player _plr2 = player8;
                i = _plr2.experienceLevel;
            } else {
                i = 0;
            }
            if (i >= 5) {
                if (!world.isClientSide() && world.getServer() != null) {
                    world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> OK"), ChatType.SYSTEM, Util.NIL_UUID);
                }
                Player player9 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e15 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.16
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (player9 instanceof Player) {
                    Player _player7 = player9;
                    _player7.giveExperienceLevels(-5);
                }
                Player player10 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e16 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangYouJiShiTiShiProcedure.17
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null);
                if (player10 instanceof Player) {
                    Player _player8 = player10;
                    ItemStack _setstack2 = new ItemStack(Items.EMERALD);
                    _setstack2.setCount(4);
                    ItemHandlerHelper.giveItemToPlayer(_player8, _setstack2);
                }
            } else if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 你不行，经验值还不够"), ChatType.SYSTEM, Util.NIL_UUID);
            }
        }
    }
}
