package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Random;


public class Steve2DangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v61, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v72, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v96, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.16d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.1
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

                /* JADX WARN: Type inference failed for: r0v14, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$1$7] */
                /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$1$6] */
                /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$1$5] */
                /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$1$4] */
                /* JADX WARN: Type inference failed for: r0v18, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$1$3] */
                /* JADX WARN: Type inference failed for: r0v19, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$1$2] */
                /* JADX WARN: Type inference failed for: r0v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$1$1] */
                private void run() {
                    if (Math.random() <= 0.12d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.1.1
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
                                ItemStack itemStack;
                                ItemStack itemStack2;
                                ItemStack itemStack3;
                                if (entity instanceof LivingEntity) {
                                    Player player = (LivingEntity) entity;
                                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.DAN_SHOU_ZHAN_SHEN_ZHI_REN.get());
                                    _setstack.setCount(1);
                                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                    if (player instanceof Player) {
                                        Player _player = player;
                                        _player.getInventory().setChanged();
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = entity;
                                    itemStack = _livEnt.getMainHandItem();
                                } else {
                                    itemStack = ItemStack.EMPTY;
                                }
                                itemStack.enchant(Enchantments.SMITE, 4);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt2 = entity;
                                    itemStack2 = _livEnt2.getMainHandItem();
                                } else {
                                    itemStack2 = ItemStack.EMPTY;
                                }
                                itemStack2.enchant(Enchantments.SHARPNESS, 4);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt3 = entity;
                                    itemStack3 = _livEnt3.getMainHandItem();
                                } else {
                                    itemStack3 = ItemStack.EMPTY;
                                }
                                itemStack3.enchant(Enchantments.SWEEPING_EDGE, 4);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 40);
                    } else if (Math.random() <= 0.14d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.1.2
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
                                ItemStack itemStack;
                                ItemStack itemStack2;
                                ItemStack itemStack3;
                                if (entity instanceof LivingEntity) {
                                    Player player = (LivingEntity) entity;
                                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.GGONGZUOTAI.get());
                                    _setstack.setCount(1);
                                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                    if (player instanceof Player) {
                                        Player _player = player;
                                        _player.getInventory().setChanged();
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = entity;
                                    itemStack = _livEnt.getMainHandItem();
                                } else {
                                    itemStack = ItemStack.EMPTY;
                                }
                                itemStack.enchant(Enchantments.SMITE, 4);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt2 = entity;
                                    itemStack2 = _livEnt2.getMainHandItem();
                                } else {
                                    itemStack2 = ItemStack.EMPTY;
                                }
                                itemStack2.enchant(Enchantments.SHARPNESS, 4);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt3 = entity;
                                    itemStack3 = _livEnt3.getMainHandItem();
                                } else {
                                    itemStack3 = ItemStack.EMPTY;
                                }
                                itemStack3.enchant(Enchantments.SWEEPING_EDGE, 4);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 40);
                    } else if (Math.random() <= 0.1d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.1.3
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
                                ItemStack itemStack;
                                ItemStack itemStack2;
                                if (entity instanceof LivingEntity) {
                                    Player player = (LivingEntity) entity;
                                    ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD);
                                    _setstack.setCount(1);
                                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                    if (player instanceof Player) {
                                        Player _player = player;
                                        _player.getInventory().setChanged();
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = entity;
                                    itemStack = _livEnt.getMainHandItem();
                                } else {
                                    itemStack = ItemStack.EMPTY;
                                }
                                itemStack.enchant(Enchantments.SHARPNESS, 7);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt2 = entity;
                                    itemStack2 = _livEnt2.getMainHandItem();
                                } else {
                                    itemStack2 = ItemStack.EMPTY;
                                }
                                itemStack2.enchant(Enchantments.SWEEPING_EDGE, 4);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 40);
                    } else if (Math.random() <= 0.1d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.1.4
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
                                ItemStack itemStack;
                                ItemStack itemStack2;
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
                                    LivingEntity _livEnt = entity;
                                    itemStack = _livEnt.getMainHandItem();
                                } else {
                                    itemStack = ItemStack.EMPTY;
                                }
                                itemStack.enchant(Enchantments.SHARPNESS, 7);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt2 = entity;
                                    itemStack2 = _livEnt2.getMainHandItem();
                                } else {
                                    itemStack2 = ItemStack.EMPTY;
                                }
                                itemStack2.enchant(Enchantments.SWEEPING_EDGE, 4);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 40);
                    } else if (Math.random() <= 0.1d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.1.5
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
                                ItemStack itemStack;
                                ItemStack itemStack2;
                                ItemStack itemStack3;
                                if (entity instanceof LivingEntity) {
                                    Player player = (LivingEntity) entity;
                                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.FUMOMUMEN.get());
                                    _setstack.setCount(1);
                                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                    if (player instanceof Player) {
                                        Player _player = player;
                                        _player.getInventory().setChanged();
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = entity;
                                    itemStack = _livEnt.getMainHandItem();
                                } else {
                                    itemStack = ItemStack.EMPTY;
                                }
                                itemStack.enchant(Enchantments.SMITE, 4);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt2 = entity;
                                    itemStack2 = _livEnt2.getMainHandItem();
                                } else {
                                    itemStack2 = ItemStack.EMPTY;
                                }
                                itemStack2.enchant(Enchantments.SHARPNESS, 4);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt3 = entity;
                                    itemStack3 = _livEnt3.getMainHandItem();
                                } else {
                                    itemStack3 = ItemStack.EMPTY;
                                }
                                itemStack3.enchant(Enchantments.SWEEPING_EDGE, 4);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 40);
                    } else if (Math.random() <= 0.3d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.1.6
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
                                ItemStack itemStack;
                                ItemStack itemStack2;
                                if (entity instanceof LivingEntity) {
                                    Player player = (LivingEntity) entity;
                                    ItemStack _setstack = new ItemStack(Items.DIAMOND_SWORD);
                                    _setstack.setCount(1);
                                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                    if (player instanceof Player) {
                                        Player _player = player;
                                        _player.getInventory().setChanged();
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = entity;
                                    itemStack = _livEnt.getMainHandItem();
                                } else {
                                    itemStack = ItemStack.EMPTY;
                                }
                                itemStack.enchant(Enchantments.SHARPNESS, 7);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt2 = entity;
                                    itemStack2 = _livEnt2.getMainHandItem();
                                } else {
                                    itemStack2 = ItemStack.EMPTY;
                                }
                                itemStack2.enchant(Enchantments.SWEEPING_EDGE, 4);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 40);
                    } else if (Math.random() <= 0.7d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.1.7
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
                                ItemStack itemStack;
                                ItemStack itemStack2;
                                ItemStack itemStack3;
                                if (entity instanceof LivingEntity) {
                                    Player player = (LivingEntity) entity;
                                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_FU_MO_JIAN.get());
                                    _setstack.setCount(1);
                                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                    if (player instanceof Player) {
                                        Player _player = player;
                                        _player.getInventory().setChanged();
                                    }
                                }
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt = entity;
                                    itemStack = _livEnt.getMainHandItem();
                                } else {
                                    itemStack = ItemStack.EMPTY;
                                }
                                itemStack.enchant(Enchantments.SMITE, 4);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt2 = entity;
                                    itemStack2 = _livEnt2.getMainHandItem();
                                } else {
                                    itemStack2 = ItemStack.EMPTY;
                                }
                                itemStack2.enchant(Enchantments.SHARPNESS, 4);
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt3 = entity;
                                    itemStack3 = _livEnt3.getMainHandItem();
                                } else {
                                    itemStack3 = ItemStack.EMPTY;
                                }
                                itemStack3.enchant(Enchantments.SWEEPING_EDGE, 4);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 20);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 100);
        }
        if (Math.random() <= 0.0098d) {
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Steve> 为什么?"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesaywhy")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesaywhy")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
        if (Math.random() <= 0.09d) {
            if (Math.random() <= 0.03d && (world instanceof Level _level2)) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:steveattack")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:steveattack")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.2
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

                /* JADX WARN: Type inference failed for: r0v19, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$2$2] */
                /* JADX WARN: Type inference failed for: r0v20, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$2$1] */
                private void run() {
                    LivingEntity livingEntity = entity;
                    livingEntity.setYRot(0.0f);
                    livingEntity.setXRot((float) Mth.nextDouble(new Random(), -90.0d, -180.0d));
                    livingEntity.setYBodyRot(livingEntity.getYRot());
                    livingEntity.setYHeadRot(livingEntity.getYRot());
                    livingEntity.yRotO = livingEntity.getYRot();
                    livingEntity.xRotO = livingEntity.getXRot();
                    if (livingEntity instanceof LivingEntity) {
                        LivingEntity _entity = livingEntity;
                        _entity.yBodyRotO = _entity.getYRot();
                        _entity.yHeadRotO = _entity.getYRot();
                    }
                    Entity _shootFrom = entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.2.1
                            public Projectile getProjectile(Level level, Entity shooter) {
                                ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                thrownEnderpearl.setOwner(shooter);
                                return thrownEnderpearl;
                            }
                        }.getProjectile(projectileLevel, entity);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    if (Math.random() <= 0.2d) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.2.2
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

                            /* JADX WARN: Type inference failed for: r0v18, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$2$2$1] */
                            private void run() {
                                Entity _shootFrom2 = entity;
                                Level projectileLevel2 = _shootFrom2.level;
                                if (!projectileLevel2.isClientSide()) {
                                    Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.2.2.1
                                        public Projectile getProjectile(Level level, Entity shooter) {
                                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                            thrownEnderpearl.setOwner(shooter);
                                            return thrownEnderpearl;
                                        }
                                    }.getProjectile(projectileLevel2, entity);
                                    _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                    _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 1.8f, 0.0f);
                                    projectileLevel2.addFreshEntity(_entityToSpawn2);
                                }
                                Level level = this.world;
                                if (level instanceof Level) {
                                    Level _level3 = level;
                                    if (!_level3.isClientSide()) {
                                        _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevechuanqi")), SoundSource.NEUTRAL, 0.4f, 1.0f);
                                    } else {
                                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevechuanqi")), SoundSource.NEUTRAL, 0.4f, 1.0f, false);
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 40);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 20);
        }
        if (Math.random() <= 0.05d && (world instanceof Level _level3)) {
            if (!_level3.isClientSide()) {
                _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevechuanqi")), SoundSource.NEUTRAL, 0.4f, 1.0f);
            } else {
                _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevechuanqi")), SoundSource.NEUTRAL, 0.4f, 1.0f, false);
            }
        }
        if (Math.random() <= 0.09d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.3
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

                /* JADX WARN: Type inference failed for: r0v29, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$3$2] */
                /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$3$3] */
                /* JADX WARN: Type inference failed for: r0v54, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$3$1] */
                private void run() {
                    ItemStack itemStack;
                    ItemStack itemStack2;
                    LivingEntity livingEntity = entity;
                    livingEntity.setYRot(0.0f);
                    livingEntity.setXRot(180.0f);
                    livingEntity.setYBodyRot(livingEntity.getYRot());
                    livingEntity.setYHeadRot(livingEntity.getYRot());
                    livingEntity.yRotO = livingEntity.getYRot();
                    livingEntity.xRotO = livingEntity.getXRot();
                    if (livingEntity instanceof LivingEntity) {
                        LivingEntity _entity = livingEntity;
                        _entity.yBodyRotO = _entity.getYRot();
                        _entity.yHeadRotO = _entity.getYRot();
                    }
                    Entity _shootFrom = entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.3.1
                            public Projectile getProjectile(Level level, Entity shooter) {
                                ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                thrownEnderpearl.setOwner(shooter);
                                return thrownEnderpearl;
                            }
                        }.getProjectile(projectileLevel, entity);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
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
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt = entity;
                        itemStack = _livEnt.getMainHandItem();
                    } else {
                        itemStack = ItemStack.EMPTY;
                    }
                    itemStack.enchant(Enchantments.POWER_ARROWS, 5);
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt2 = entity;
                        itemStack2 = _livEnt2.getMainHandItem();
                    } else {
                        itemStack2 = ItemStack.EMPTY;
                    }
                    itemStack2.enchant(Enchantments.PUNCH_ARROWS, 5);
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.3.2
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
                            if (entity instanceof LivingEntity) {
                                LivingEntity _entity2 = entity;
                                if (!_entity2.level.isClientSide()) {
                                    _entity2.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 20);
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.3.3
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

                        /* JADX WARN: Type inference failed for: r0v64, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure$3$3$1] */
                        private void run() {
                            ItemStack itemStack3;
                            ItemStack itemStack4;
                            LivingEntity livingEntity2 = entity;
                            livingEntity2.setYRot(0.0f);
                            livingEntity2.setXRot(180.0f);
                            livingEntity2.setYBodyRot(livingEntity2.getYRot());
                            livingEntity2.setYHeadRot(livingEntity2.getYRot());
                            livingEntity2.yRotO = livingEntity2.getYRot();
                            livingEntity2.xRotO = livingEntity2.getXRot();
                            if (livingEntity2 instanceof LivingEntity) {
                                LivingEntity _entity2 = livingEntity2;
                                _entity2.yBodyRotO = _entity2.getYRot();
                                _entity2.yHeadRotO = _entity2.getYRot();
                            }
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level4 = level;
                                if (!_level4.isClientSide()) {
                                    _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevechuanqi")), SoundSource.NEUTRAL, 0.4f, 1.0f);
                                } else {
                                    _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevechuanqi")), SoundSource.NEUTRAL, 0.4f, 1.0f, false);
                                }
                            }
                            Entity _shootFrom2 = entity;
                            Level projectileLevel2 = _shootFrom2.level;
                            if (!projectileLevel2.isClientSide()) {
                                Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.3.3.1
                                    public Projectile getProjectile(Level level2, Entity shooter) {
                                        ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level2);
                                        thrownEnderpearl.setOwner(shooter);
                                        return thrownEnderpearl;
                                    }
                                }.getProjectile(projectileLevel2, entity);
                                _entityToSpawn2.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                _entityToSpawn2.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.0f, 0.0f);
                                projectileLevel2.addFreshEntity(_entityToSpawn2);
                            }
                            if (entity instanceof LivingEntity) {
                                Player player2 = (LivingEntity) entity;
                                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_FU_MO_JIAN.get());
                                _setstack2.setCount(1);
                                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                                if (player2 instanceof Player) {
                                    Player _player2 = player2;
                                    _player2.getInventory().setChanged();
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt3 = entity;
                                itemStack3 = _livEnt3.getMainHandItem();
                            } else {
                                itemStack3 = ItemStack.EMPTY;
                            }
                            itemStack3.enchant(Enchantments.SHARPNESS, 5);
                            if (entity instanceof LivingEntity) {
                                LivingEntity _livEnt4 = entity;
                                itemStack4 = _livEnt4.getMainHandItem();
                            } else {
                                itemStack4 = ItemStack.EMPTY;
                            }
                            itemStack4.enchant(Enchantments.MENDING, 5);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 80);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 20);
        }
        if (Math.random() <= 0.009d && (world instanceof Level _level4)) {
            if (!_level4.isClientSide()) {
                _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevechuanqi")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevechuanqi")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (Math.random() <= 0.01d) {
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Steve> Why?"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            if (world instanceof Level _level5) {
                if (!_level5.isClientSide()) {
                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesaywhy")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesaywhy")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2DangShiTiShouShangShiProcedure.4
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
                if (entity instanceof LivingEntity) {
                    Player player = (LivingEntity) entity;
                    ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
                    _setstack.setCount(1);
                    player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().setChanged();
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 80);
        if (Math.random() <= 0.39d && (entity instanceof LivingEntity _entity)) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.TAOTUOBUFF.get(), 1, 1, false, false));
            }
        }
        if (Math.random() > 0.53d || !(entity instanceof LivingEntity _entity2)) {
            return;
        }
        if (!_entity2.level.isClientSide()) {
            _entity2.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
        }
    }
}
