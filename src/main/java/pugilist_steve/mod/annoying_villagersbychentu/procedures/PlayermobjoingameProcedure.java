package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.Random;

@Mod.EventBusSubscriber

public class PlayermobjoingameProcedure {
    @SubscribeEvent
    public static void onEntityJoin(EntityJoinWorldEvent event) {
        execute(event, event.getWorld(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    /* JADX WARN: Type inference failed for: r0v223, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        ItemStack itemStack;
        if (entity != null && ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("player_mobs:player_mob")) {
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10000, 0, false, false));
                }
            }
            if (Math.random() <= 0.5d) {
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add player");
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join player @s");
                }
            }
            if (entity.getDisplayName().getString().equals("Pugilist_Steve")) {
                if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20.0d, 20.0d, 20.0d), e -> {
                    return true;
                }).isEmpty() && entity.getDisplayName().getString().equals("Pugilist_Steve")) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure.1
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        public void start(LevelAccessor world2, int waitTicks) {
                            this.waitTicks = waitTicks;
                            MinecraftForge.EVENT_BUS.register(this);
                            this.world = world2;
                        }

                        @SubscribeEvent
                        public void tick(TickEvent.ServerTickEvent event2) {
                            if (event2.phase == TickEvent.Phase.END) {
                                this.ticks++;
                                if (this.ticks >= this.waitTicks) {
                                    this.run();
                                }
                            }
                        }

                        /* JADX WARN: Type inference failed for: r2v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure$1$1] */
                        /* JADX WARN: Type inference failed for: r2v42, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure$1$4] */
                        /* JADX WARN: Type inference failed for: r3v48, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure$1$5] */
                        /* JADX WARN: Type inference failed for: r3v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure$1$2] */
                        /* JADX WARN: Type inference failed for: r4v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure$1$3] */
                        /* JADX WARN: Type inference failed for: r4v49, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure$1$6] */
                        private void run() {
                            ItemStack itemStack2;
                            ItemStack itemStack3;
                            ItemStack itemStack4;
                            ItemStack itemStack5;
                            if (!this.world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 210.0d, 210.0d, 210.0d), e2 -> {
                                return true;
                            }).isEmpty()) {
                                ServerPlayer serverPlayer = entity;
                                serverPlayer.teleportTo(this.world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e3 -> {
                                    return true;
                                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure.1.1
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                        return Comparator.comparingDouble(_entcnd -> {
                                            return _entcnd.distanceToSqr(_x, _y, _z);
                                        });
                                    }
                                }.compareDistOf(x, y, z)).findFirst().orElse(null).getX(), this.world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e4 -> {
                                    return true;
                                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure.1.2
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                        return Comparator.comparingDouble(_entcnd -> {
                                            return _entcnd.distanceToSqr(_x, _y, _z);
                                        });
                                    }
                                }.compareDistOf(x, y, z)).findFirst().orElse(null).getY() + Mth.nextInt(new Random(), 2, 5), this.world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e5 -> {
                                    return true;
                                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure.1.3
                                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                        return Comparator.comparingDouble(_entcnd -> {
                                            return _entcnd.distanceToSqr(_x, _y, _z);
                                        });
                                    }
                                }.compareDistOf(x, y, z)).findFirst().orElse(null).getZ());
                                if (serverPlayer instanceof ServerPlayer) {
                                    ServerPlayer _serverPlayer = serverPlayer;
                                    _serverPlayer.connection.teleport(this.world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e6 -> {
                                        return true;
                                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure.1.4
                                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                            return Comparator.comparingDouble(_entcnd -> {
                                                return _entcnd.distanceToSqr(_x, _y, _z);
                                            });
                                        }
                                    }.compareDistOf(x, y, z)).findFirst().orElse(null).getX(), this.world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e7 -> {
                                        return true;
                                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure.1.5
                                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                            return Comparator.comparingDouble(_entcnd -> {
                                                return _entcnd.distanceToSqr(_x, _y, _z);
                                            });
                                        }
                                    }.compareDistOf(x, y, z)).findFirst().orElse(null).getY() + Mth.nextInt(new Random(), 2, 5), this.world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 200.0d, 200.0d, 200.0d), e8 -> {
                                        return true;
                                    }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobjoingameProcedure.1.6
                                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                                            return Comparator.comparingDouble(_entcnd -> {
                                                return _entcnd.distanceToSqr(_x, _y, _z);
                                            });
                                        }
                                    }.compareDistOf(x, y, z)).findFirst().orElse(null).getZ(), serverPlayer.getYRot(), serverPlayer.getXRot());
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity2 = entity;
                                    if (!_entity2.level.isClientSide()) {
                                        _entity2.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 200, 0, false, false));
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity3 = entity;
                                    if (!_entity3.level.isClientSide()) {
                                        _entity3.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 500, 4, false, false));
                                    }
                                }
                                Level level = this.world;
                                if (level instanceof Level) {
                                    Level _level = level;
                                    if (!_level.isClientSide()) {
                                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                    } else {
                                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity4 = entity;
                                    if (!_entity4.level.isClientSide()) {
                                        _entity4.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 10000, 1));
                                    }
                                }
                                ServerLevel _level2 = this.world;
                                if (_level2 instanceof ServerLevel) {
                                    _level2.sendParticles(ParticleTypes.ENTITY_EFFECT, x, y, z, 20, 3.0d, 3.0d, 3.0d, 1.0d);
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity5 = entity;
                                    if (!_entity5.level.isClientSide()) {
                                        _entity5.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 10000, 1));
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity6 = entity;
                                    if (!_entity6.level.isClientSide()) {
                                        _entity6.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.NAILI.get(), 10000, 1));
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity7 = entity;
                                    if (!_entity7.level.isClientSide()) {
                                        _entity7.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.CCDMFZSKJ.get(), 10000, 2));
                                    }
                                }
                                if (Math.random() <= 0.5d) {
                                    if (entity instanceof LivingEntity) {
                                        Player player = (LivingEntity) entity;
                                        ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_JU_JIAN.get());
                                        _setstack.setCount(1);
                                        player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                        if (player instanceof Player) {
                                            Player _player = player;
                                            _player.getInventory().setChanged();
                                        }
                                    }
                                    if (entity instanceof LivingEntity) {
                                        Player player2 = (LivingEntity) entity;
                                        ItemStack _setstack2 = new ItemStack(Items.ENDER_PEARL);
                                        _setstack2.setCount(1);
                                        player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                                        if (player2 instanceof Player) {
                                            Player _player2 = player2;
                                            _player2.getInventory().setChanged();
                                        }
                                    }
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt = entity;
                                        itemStack4 = _livEnt.getMainHandItem();
                                    } else {
                                        itemStack4 = ItemStack.EMPTY;
                                    }
                                    itemStack4.enchant(Enchantments.SHARPNESS, 5);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt2 = entity;
                                        itemStack5 = _livEnt2.getMainHandItem();
                                    } else {
                                        itemStack5 = ItemStack.EMPTY;
                                    }
                                    itemStack5.enchant(Enchantments.KNOCKBACK, 5);
                                } else {
                                    if (entity instanceof LivingEntity) {
                                        Player player3 = (LivingEntity) entity;
                                        ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.DAN_SHOU_ZHAN_SHEN_ZHI_REN.get());
                                        _setstack3.setCount(1);
                                        player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                                        if (player3 instanceof Player) {
                                            Player _player3 = player3;
                                            _player3.getInventory().setChanged();
                                        }
                                    }
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt3 = entity;
                                        itemStack2 = _livEnt3.getMainHandItem();
                                    } else {
                                        itemStack2 = ItemStack.EMPTY;
                                    }
                                    itemStack2.enchant(Enchantments.SHARPNESS, 5);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt4 = entity;
                                        itemStack3 = _livEnt4.getMainHandItem();
                                    } else {
                                        itemStack3 = ItemStack.EMPTY;
                                    }
                                    itemStack3.enchant(Enchantments.KNOCKBACK, 5);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 20);
                    return;
                }
                return;
            }
            if (entity instanceof LivingEntity _livEnt) {
                itemStack = _livEnt.getMainHandItem();
            } else {
                itemStack = ItemStack.EMPTY;
            }
            if (itemStack.getItem() == Blocks.AIR.asItem()) {
                if (entity instanceof LivingEntity) {
                    Player player = (LivingEntity) entity;
                    ItemStack _setstack = new ItemStack(Items.GOLDEN_SWORD);
                    _setstack.setCount(1);
                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().setChanged();
                    }
                }
                if (entity instanceof Player _player2) {
                    _player2.getInventory().armor.set(2, new ItemStack(Items.IRON_CHESTPLATE));
                    _player2.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living) {
                    _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.IRON_CHESTPLATE));
                }
                if (entity instanceof LivingEntity) {
                    Player player2 = (LivingEntity) entity;
                    ItemStack _setstack2 = new ItemStack(Items.ENDER_PEARL);
                    _setstack2.setCount(1);
                    player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                    if (player2 instanceof Player) {
                        Player _player3 = player2;
                        _player3.getInventory().setChanged();
                    }
                }
            } else if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity) {
                    Player player3 = (LivingEntity) entity;
                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_MAO.get());
                    _setstack3.setCount(1);
                    player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                    if (player3 instanceof Player) {
                        Player _player4 = player3;
                        _player4.getInventory().setChanged();
                    }
                }
                if (entity instanceof Player _player5) {
                    _player5.getInventory().armor.set(0, new ItemStack(Items.IRON_BOOTS));
                    _player5.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living2) {
                    _living2.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.IRON_BOOTS));
                }
            } else if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity) {
                    Player player4 = (LivingEntity) entity;
                    ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_WAN_BING_REN.get());
                    _setstack4.setCount(1);
                    player4.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
                    if (player4 instanceof Player) {
                        Player _player6 = player4;
                        _player6.getInventory().setChanged();
                    }
                }
            } else if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity) {
                    Player player5 = (LivingEntity) entity;
                    ItemStack _setstack5 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_JU_REN.get());
                    _setstack5.setCount(1);
                    player5.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
                    if (player5 instanceof Player) {
                        Player _player7 = player5;
                        _player7.getInventory().setChanged();
                    }
                }
            } else if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity) {
                    Player player6 = (LivingEntity) entity;
                    ItemStack _setstack6 = new ItemStack(AnnoyingVillagersbychentuModItems.TTIEZHIJUPIDAO.get());
                    _setstack6.setCount(1);
                    player6.setItemInHand(InteractionHand.MAIN_HAND, _setstack6);
                    if (player6 instanceof Player) {
                        Player _player8 = player6;
                        _player8.getInventory().setChanged();
                    }
                }
                if (entity instanceof Player _player9) {
                    _player9.getInventory().armor.set(3, new ItemStack(Items.DIAMOND_HELMET));
                    _player9.getInventory().setChanged();
                } else if (entity instanceof LivingEntity _living3) {
                    _living3.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.DIAMOND_HELMET));
                }
            } else if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity) {
                    Player player7 = (LivingEntity) entity;
                    ItemStack _setstack7 = new ItemStack(AnnoyingVillagersbychentuModItems.LLBSJ.get());
                    _setstack7.setCount(1);
                    player7.setItemInHand(InteractionHand.MAIN_HAND, _setstack7);
                    if (player7 instanceof Player) {
                        Player _player10 = player7;
                        _player10.getInventory().setChanged();
                    }
                }
            } else if (Math.random() <= 0.1d) {
                if (entity instanceof LivingEntity) {
                    Player player8 = (LivingEntity) entity;
                    ItemStack _setstack8 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_DAO_PIAN.get());
                    _setstack8.setCount(1);
                    player8.setItemInHand(InteractionHand.MAIN_HAND, _setstack8);
                    if (player8 instanceof Player) {
                        Player _player11 = player8;
                        _player11.getInventory().setChanged();
                    }
                }
            } else if (Math.random() <= 0.3d) {
                if (entity instanceof LivingEntity) {
                    Player player9 = (LivingEntity) entity;
                    ItemStack _setstack9 = new ItemStack(Items.IRON_SWORD);
                    _setstack9.setCount(1);
                    player9.setItemInHand(InteractionHand.MAIN_HAND, _setstack9);
                    if (player9 instanceof Player) {
                        Player _player12 = player9;
                        _player12.getInventory().setChanged();
                    }
                }
            } else if (Math.random() <= 0.1d && (entity instanceof LivingEntity)) {
                Player player10 = (LivingEntity) entity;
                ItemStack _setstack10 = new ItemStack(AnnoyingVillagersbychentuModItems.LAN_YAN_JIAN.get());
                _setstack10.setCount(1);
                player10.setItemInHand(InteractionHand.MAIN_HAND, _setstack10);
                if (player10 instanceof Player) {
                    Player _player13 = player10;
                    _player13.getInventory().setChanged();
                }
            }
        }
    }
}
