package pugilist_steve.mod.annoying_villagersbychentu.procedures;

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
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class PlayermobProcedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().level, event.getEntity());
        }
    }

    public static void execute(LevelAccessor world, Entity entity) {
        execute(null, world, entity);
    }

    /* JADX WARN: Type inference failed for: r0v117, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$11] */
    /* JADX WARN: Type inference failed for: r0v132, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$10] */
    /* JADX WARN: Type inference failed for: r0v156, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$9] */
    /* JADX WARN: Type inference failed for: r0v183, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$8] */
    /* JADX WARN: Type inference failed for: r0v198, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$7] */
    /* JADX WARN: Type inference failed for: r0v222, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$6] */
    /* JADX WARN: Type inference failed for: r0v272, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$5] */
    /* JADX WARN: Type inference failed for: r0v296, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v323, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v324, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v339, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v37, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$15] */
    /* JADX WARN: Type inference failed for: r0v52, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$14] */
    /* JADX WARN: Type inference failed for: r0v76, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$13] */
    /* JADX WARN: Type inference failed for: r0v99, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$12] */
    private static void execute(@Nullable Event event, LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("player_mobs:player_mob")) {
            if (Math.random() <= 0.3d && (entity instanceof LivingEntity _entity)) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                }
            }
            if (Math.random() <= 0.09d) {
                entity.setYRot(0.0f);
                entity.setXRot(180.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity2) {
                    _entity2.yBodyRotO = _entity2.getYRot();
                    _entity2.yHeadRotO = _entity2.getYRot();
                }
                Level projectileLevel = entity.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.1
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel, entity);
                    _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
            }
            if (Math.random() <= 0.05d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.2
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

                    /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$2$1] */
                    private void run() {
                        LivingEntity livingEntity = entity;
                        livingEntity.setYRot(0.0f);
                        livingEntity.setXRot(90.0f);
                        livingEntity.setYBodyRot(livingEntity.getYRot());
                        livingEntity.setYHeadRot(livingEntity.getYRot());
                        livingEntity.yRotO = livingEntity.getYRot();
                        livingEntity.xRotO = livingEntity.getXRot();
                        if (livingEntity instanceof LivingEntity) {
                            LivingEntity _entity3 = livingEntity;
                            _entity3.yBodyRotO = _entity3.getYRot();
                            _entity3.yHeadRotO = _entity3.getYRot();
                        }
                        Entity _shootFrom = entity;
                        Level projectileLevel2 = _shootFrom.level;
                        if (!projectileLevel2.isClientSide()) {
                            Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.2.1
                                public Projectile getProjectile(Level level, Entity shooter) {
                                    ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                    thrownEnderpearl.setOwner(shooter);
                                    return thrownEnderpearl;
                                }
                            }.getProjectile(projectileLevel2, entity);
                            _entityToSpawn2.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn2.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel2.addFreshEntity(_entityToSpawn2);
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 20);
            }
            if (Math.random() <= 0.09d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.3
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

                    /* JADX WARN: Type inference failed for: r0v24, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$3$2] */
                    /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$3$3] */
                    /* JADX WARN: Type inference failed for: r0v54, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$3$1] */
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
                            LivingEntity _entity3 = livingEntity;
                            _entity3.yBodyRotO = _entity3.getYRot();
                            _entity3.yHeadRotO = _entity3.getYRot();
                        }
                        Entity _shootFrom = entity;
                        Level projectileLevel2 = _shootFrom.level;
                        if (!projectileLevel2.isClientSide()) {
                            Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.3.1
                                public Projectile getProjectile(Level level, Entity shooter) {
                                    ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                    thrownEnderpearl.setOwner(shooter);
                                    return thrownEnderpearl;
                                }
                            }.getProjectile(projectileLevel2, entity);
                            _entityToSpawn2.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn2.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                            projectileLevel2.addFreshEntity(_entityToSpawn2);
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
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.3.2
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

                            private void run() {
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity4 = entity;
                                    if (!_entity4.level.isClientSide()) {
                                        _entity4.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 20);
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt2 = entity;
                            itemStack2 = _livEnt2.getMainHandItem();
                        } else {
                            itemStack2 = ItemStack.EMPTY;
                        }
                        itemStack2.enchant(Enchantments.PUNCH_ARROWS, 5);
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.3.3
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

                            /* JADX WARN: Type inference failed for: r0v170, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$3$3$1] */
                            private void run() {
                                ItemStack itemStack3;
                                ItemStack itemStack4;
                                ItemStack itemStack5;
                                ItemStack itemStack6;
                                ItemStack itemStack7;
                                ItemStack itemStack8;
                                ItemStack itemStack9;
                                Entity _shootFrom2 = entity;
                                Level projectileLevel3 = _shootFrom2.level;
                                if (!projectileLevel3.isClientSide()) {
                                    Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.3.3.1
                                        public Projectile getProjectile(Level level, Entity shooter) {
                                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                            thrownEnderpearl.setOwner(shooter);
                                            return thrownEnderpearl;
                                        }
                                    }.getProjectile(projectileLevel3, entity);
                                    _entityToSpawn3.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                    _entityToSpawn3.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.0f, 0.0f);
                                    projectileLevel3.addFreshEntity(_entityToSpawn3);
                                }
                                if (entity.getDisplayName().getString().equals("Pugilist_Steve")) {
                                    if (entity instanceof LivingEntity) {
                                        Player player2 = (LivingEntity) entity;
                                        ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.DAN_SHOU_ZHAN_SHEN_ZHI_REN.get());
                                        _setstack2.setCount(1);
                                        player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                                        if (player2 instanceof Player) {
                                            Player _player2 = player2;
                                            _player2.getInventory().setChanged();
                                        }
                                    }
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt3 = entity;
                                        itemStack9 = _livEnt3.getMainHandItem();
                                    } else {
                                        itemStack9 = ItemStack.EMPTY;
                                    }
                                    itemStack9.enchant(Enchantments.SHARPNESS, 5);
                                } else {
                                    if (entity instanceof LivingEntity) {
                                        Player player3 = (LivingEntity) entity;
                                        ItemStack _setstack3 = new ItemStack(Items.DIAMOND_SWORD);
                                        _setstack3.setCount(1);
                                        player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                                        if (player3 instanceof Player) {
                                            Player _player3 = player3;
                                            _player3.getInventory().setChanged();
                                        }
                                    }
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt4 = entity;
                                        itemStack3 = _livEnt4.getMainHandItem();
                                    } else {
                                        itemStack3 = ItemStack.EMPTY;
                                    }
                                    itemStack3.enchant(Enchantments.SHARPNESS, 5);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt5 = entity;
                                        itemStack4 = _livEnt5.getMainHandItem();
                                    } else {
                                        itemStack4 = ItemStack.EMPTY;
                                    }
                                    itemStack4.enchant(Enchantments.MENDING, 5);
                                    if (Math.random() <= 0.2d) {
                                        if (entity instanceof LivingEntity) {
                                            Player player4 = (LivingEntity) entity;
                                            ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_MAO.get());
                                            _setstack4.setCount(1);
                                            player4.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
                                            if (player4 instanceof Player) {
                                                Player _player4 = player4;
                                                _player4.getInventory().setChanged();
                                            }
                                        }
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt6 = entity;
                                            itemStack7 = _livEnt6.getMainHandItem();
                                        } else {
                                            itemStack7 = ItemStack.EMPTY;
                                        }
                                        itemStack7.enchant(Enchantments.SHARPNESS, 5);
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt7 = entity;
                                            itemStack8 = _livEnt7.getMainHandItem();
                                        } else {
                                            itemStack8 = ItemStack.EMPTY;
                                        }
                                        itemStack8.enchant(Enchantments.MENDING, 5);
                                    }
                                    if (Math.random() <= 0.1d) {
                                        if (entity instanceof LivingEntity) {
                                            Player player5 = (LivingEntity) entity;
                                            ItemStack _setstack5 = new ItemStack(Items.STONE_SWORD);
                                            _setstack5.setCount(1);
                                            player5.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
                                            if (player5 instanceof Player) {
                                                Player _player5 = player5;
                                                _player5.getInventory().setChanged();
                                            }
                                        }
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt8 = entity;
                                            itemStack5 = _livEnt8.getMainHandItem();
                                        } else {
                                            itemStack5 = ItemStack.EMPTY;
                                        }
                                        itemStack5.enchant(Enchantments.SHARPNESS, 5);
                                        if (entity instanceof LivingEntity) {
                                            LivingEntity _livEnt9 = entity;
                                            itemStack6 = _livEnt9.getMainHandItem();
                                        } else {
                                            itemStack6 = ItemStack.EMPTY;
                                        }
                                        itemStack6.enchant(Enchantments.MENDING, 5);
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 80);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 20);
            }
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("humancompanions:knight")) {
            if (Math.random() <= 0.4d && (entity instanceof LivingEntity _entity3)) {
                if (!_entity3.level.isClientSide()) {
                    _entity3.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                }
            }
            if (Math.random() <= 0.09d) {
                entity.setYRot(0.0f);
                entity.setXRot(180.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity4) {
                    _entity4.yBodyRotO = _entity4.getYRot();
                    _entity4.yHeadRotO = _entity4.getYRot();
                }
                Level projectileLevel2 = entity.level;
                if (!projectileLevel2.isClientSide()) {
                    Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.4
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel2, entity);
                    _entityToSpawn2.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn2.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel2.addFreshEntity(_entityToSpawn2);
                }
            }
            if (Math.random() <= 0.05d) {
                entity.setYRot(0.0f);
                entity.setXRot(90.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity5) {
                    _entity5.yBodyRotO = _entity5.getYRot();
                    _entity5.yHeadRotO = _entity5.getYRot();
                }
                Level projectileLevel3 = entity.level;
                if (!projectileLevel3.isClientSide()) {
                    Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.5
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel3, entity);
                    _entityToSpawn3.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn3.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel3.addFreshEntity(_entityToSpawn3);
                }
            }
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("humancompanions:axeguard") && Math.random() <= 0.4d && (entity instanceof LivingEntity _entity6)) {
            if (!_entity6.level.isClientSide()) {
                _entity6.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
            }
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("hostile_humans:human_roamer")) {
            if (Math.random() <= 0.35d && (entity instanceof LivingEntity _entity7)) {
                if (!_entity7.level.isClientSide()) {
                    _entity7.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                }
            }
            if (Math.random() <= 0.09d) {
                entity.setYRot(0.0f);
                entity.setXRot(180.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity8) {
                    _entity8.yBodyRotO = _entity8.getYRot();
                    _entity8.yHeadRotO = _entity8.getYRot();
                }
                Level projectileLevel4 = entity.level;
                if (!projectileLevel4.isClientSide()) {
                    Projectile _entityToSpawn4 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.6
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel4, entity);
                    _entityToSpawn4.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn4.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel4.addFreshEntity(_entityToSpawn4);
                }
            }
            if (Math.random() <= 0.05d) {
                entity.setYRot(0.0f);
                entity.setXRot(90.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity9) {
                    _entity9.yBodyRotO = _entity9.getYRot();
                    _entity9.yHeadRotO = _entity9.getYRot();
                }
                Level projectileLevel5 = entity.level;
                if (!projectileLevel5.isClientSide()) {
                    Projectile _entityToSpawn5 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.7
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel5, entity);
                    _entityToSpawn5.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn5.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel5.addFreshEntity(_entityToSpawn5);
                }
            }
            if (Math.random() <= 0.095d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.8
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

                    /* JADX WARN: Type inference failed for: r0v29, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$8$2] */
                    /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$8$3] */
                    /* JADX WARN: Type inference failed for: r0v54, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$8$1] */
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
                            LivingEntity _entity10 = livingEntity;
                            _entity10.yBodyRotO = _entity10.getYRot();
                            _entity10.yHeadRotO = _entity10.getYRot();
                        }
                        Entity _shootFrom = entity;
                        Level projectileLevel6 = _shootFrom.level;
                        if (!projectileLevel6.isClientSide()) {
                            Projectile _entityToSpawn6 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.8.1
                                public Projectile getProjectile(Level level, Entity shooter) {
                                    ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                    thrownEnderpearl.setOwner(shooter);
                                    return thrownEnderpearl;
                                }
                            }.getProjectile(projectileLevel6, entity);
                            _entityToSpawn6.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn6.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                            projectileLevel6.addFreshEntity(_entityToSpawn6);
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
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.8.2
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

                            private void run() {
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity11 = entity;
                                    if (!_entity11.level.isClientSide()) {
                                        _entity11.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 20);
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.8.3
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

                            /* JADX WARN: Type inference failed for: r0v60, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$8$3$1] */
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
                                    LivingEntity _entity11 = livingEntity2;
                                    _entity11.yBodyRotO = _entity11.getYRot();
                                    _entity11.yHeadRotO = _entity11.getYRot();
                                }
                                Entity _shootFrom2 = entity;
                                Level projectileLevel7 = _shootFrom2.level;
                                if (!projectileLevel7.isClientSide()) {
                                    Projectile _entityToSpawn7 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.8.3.1
                                        public Projectile getProjectile(Level level, Entity shooter) {
                                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                            thrownEnderpearl.setOwner(shooter);
                                            return thrownEnderpearl;
                                        }
                                    }.getProjectile(projectileLevel7, entity);
                                    _entityToSpawn7.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                    _entityToSpawn7.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.0f, 0.0f);
                                    projectileLevel7.addFreshEntity(_entityToSpawn7);
                                }
                                if (entity instanceof LivingEntity) {
                                    Player player2 = (LivingEntity) entity;
                                    ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.TTIECHANGJIAN.get());
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
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("hostile_humans:human_tier1")) {
            if (Math.random() <= 0.3d && (entity instanceof LivingEntity _entity10)) {
                if (!_entity10.level.isClientSide()) {
                    _entity10.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                }
            }
            if (Math.random() <= 0.09d) {
                entity.setYRot(0.0f);
                entity.setXRot(180.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity11) {
                    _entity11.yBodyRotO = _entity11.getYRot();
                    _entity11.yHeadRotO = _entity11.getYRot();
                }
                Level projectileLevel6 = entity.level;
                if (!projectileLevel6.isClientSide()) {
                    Projectile _entityToSpawn6 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.9
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel6, entity);
                    _entityToSpawn6.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn6.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel6.addFreshEntity(_entityToSpawn6);
                }
            }
            if (Math.random() <= 0.05d) {
                entity.setYRot(0.0f);
                entity.setXRot(90.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity12) {
                    _entity12.yBodyRotO = _entity12.getYRot();
                    _entity12.yHeadRotO = _entity12.getYRot();
                }
                Level projectileLevel7 = entity.level;
                if (!projectileLevel7.isClientSide()) {
                    Projectile _entityToSpawn7 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.10
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel7, entity);
                    _entityToSpawn7.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn7.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel7.addFreshEntity(_entityToSpawn7);
                }
            }
            if (Math.random() <= 0.09d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.11
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

                    /* JADX WARN: Type inference failed for: r0v29, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$11$2] */
                    /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$11$3] */
                    /* JADX WARN: Type inference failed for: r0v54, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$11$1] */
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
                            LivingEntity _entity13 = livingEntity;
                            _entity13.yBodyRotO = _entity13.getYRot();
                            _entity13.yHeadRotO = _entity13.getYRot();
                        }
                        Entity _shootFrom = entity;
                        Level projectileLevel8 = _shootFrom.level;
                        if (!projectileLevel8.isClientSide()) {
                            Projectile _entityToSpawn8 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.11.1
                                public Projectile getProjectile(Level level, Entity shooter) {
                                    ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                    thrownEnderpearl.setOwner(shooter);
                                    return thrownEnderpearl;
                                }
                            }.getProjectile(projectileLevel8, entity);
                            _entityToSpawn8.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn8.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                            projectileLevel8.addFreshEntity(_entityToSpawn8);
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
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.11.2
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

                            private void run() {
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity14 = entity;
                                    if (!_entity14.level.isClientSide()) {
                                        _entity14.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 20);
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.11.3
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

                            /* JADX WARN: Type inference failed for: r0v60, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$11$3$1] */
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
                                    LivingEntity _entity14 = livingEntity2;
                                    _entity14.yBodyRotO = _entity14.getYRot();
                                    _entity14.yHeadRotO = _entity14.getYRot();
                                }
                                Entity _shootFrom2 = entity;
                                Level projectileLevel9 = _shootFrom2.level;
                                if (!projectileLevel9.isClientSide()) {
                                    Projectile _entityToSpawn9 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.11.3.1
                                        public Projectile getProjectile(Level level, Entity shooter) {
                                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                            thrownEnderpearl.setOwner(shooter);
                                            return thrownEnderpearl;
                                        }
                                    }.getProjectile(projectileLevel9, entity);
                                    _entityToSpawn9.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                    _entityToSpawn9.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.0f, 0.0f);
                                    projectileLevel9.addFreshEntity(_entityToSpawn9);
                                }
                                if (entity instanceof LivingEntity) {
                                    Player player2 = (LivingEntity) entity;
                                    ItemStack _setstack2 = new ItemStack(Items.DIAMOND_SWORD);
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
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("hostile_humans:human_tier2")) {
            if (Math.random() <= 0.39d && (entity instanceof LivingEntity _entity13)) {
                if (!_entity13.level.isClientSide()) {
                    _entity13.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                }
            }
            if (Math.random() <= 0.09d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.12
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

                    /* JADX WARN: Type inference failed for: r0v29, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$12$2] */
                    /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$12$3] */
                    /* JADX WARN: Type inference failed for: r0v54, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$12$1] */
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
                            LivingEntity _entity14 = livingEntity;
                            _entity14.yBodyRotO = _entity14.getYRot();
                            _entity14.yHeadRotO = _entity14.getYRot();
                        }
                        Entity _shootFrom = entity;
                        Level projectileLevel8 = _shootFrom.level;
                        if (!projectileLevel8.isClientSide()) {
                            Projectile _entityToSpawn8 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.12.1
                                public Projectile getProjectile(Level level, Entity shooter) {
                                    ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                    thrownEnderpearl.setOwner(shooter);
                                    return thrownEnderpearl;
                                }
                            }.getProjectile(projectileLevel8, entity);
                            _entityToSpawn8.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn8.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                            projectileLevel8.addFreshEntity(_entityToSpawn8);
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
                        itemStack.enchant(Enchantments.POWER_ARROWS, 6);
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt2 = entity;
                            itemStack2 = _livEnt2.getMainHandItem();
                        } else {
                            itemStack2 = ItemStack.EMPTY;
                        }
                        itemStack2.enchant(Enchantments.PUNCH_ARROWS, 5);
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.12.2
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

                            private void run() {
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity15 = entity;
                                    if (!_entity15.level.isClientSide()) {
                                        _entity15.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 20);
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.12.3
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

                            /* JADX WARN: Type inference failed for: r0v60, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$12$3$1] */
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
                                    LivingEntity _entity15 = livingEntity2;
                                    _entity15.yBodyRotO = _entity15.getYRot();
                                    _entity15.yHeadRotO = _entity15.getYRot();
                                }
                                Entity _shootFrom2 = entity;
                                Level projectileLevel9 = _shootFrom2.level;
                                if (!projectileLevel9.isClientSide()) {
                                    Projectile _entityToSpawn9 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.12.3.1
                                        public Projectile getProjectile(Level level, Entity shooter) {
                                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                            thrownEnderpearl.setOwner(shooter);
                                            return thrownEnderpearl;
                                        }
                                    }.getProjectile(projectileLevel9, entity);
                                    _entityToSpawn9.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                    _entityToSpawn9.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.0f, 0.0f);
                                    projectileLevel9.addFreshEntity(_entityToSpawn9);
                                }
                                if (entity instanceof LivingEntity) {
                                    Player player2 = (LivingEntity) entity;
                                    ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_JIAN.get());
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
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("guardvillagers:guard")) {
            if (Math.random() <= 0.35d && (entity instanceof LivingEntity _entity14)) {
                if (!_entity14.level.isClientSide()) {
                    _entity14.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                }
            }
            if (Math.random() <= 0.09d) {
                entity.setYRot(0.0f);
                entity.setXRot(180.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity15) {
                    _entity15.yBodyRotO = _entity15.getYRot();
                    _entity15.yHeadRotO = _entity15.getYRot();
                }
                Level projectileLevel8 = entity.level;
                if (!projectileLevel8.isClientSide()) {
                    Projectile _entityToSpawn8 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.13
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel8, entity);
                    _entityToSpawn8.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn8.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel8.addFreshEntity(_entityToSpawn8);
                }
            }
            if (Math.random() <= 0.05d) {
                entity.setYRot(0.0f);
                entity.setXRot(90.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity16) {
                    _entity16.yBodyRotO = _entity16.getYRot();
                    _entity16.yHeadRotO = _entity16.getYRot();
                }
                Level projectileLevel9 = entity.level;
                if (!projectileLevel9.isClientSide()) {
                    Projectile _entityToSpawn9 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.14
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel9, entity);
                    _entityToSpawn9.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn9.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel9.addFreshEntity(_entityToSpawn9);
                }
            }
            if (Math.random() <= 0.09d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.15
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

                    /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$15$1] */
                    /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$15$3] */
                    /* JADX WARN: Type inference failed for: r0v54, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$15$2] */
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
                            LivingEntity _entity17 = livingEntity;
                            _entity17.yBodyRotO = _entity17.getYRot();
                            _entity17.yHeadRotO = _entity17.getYRot();
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.15.1
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

                            private void run() {
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _entity18 = entity;
                                    if (!_entity18.level.isClientSide()) {
                                        _entity18.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
                                    }
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 20);
                        Entity _shootFrom = entity;
                        Level projectileLevel10 = _shootFrom.level;
                        if (!projectileLevel10.isClientSide()) {
                            Projectile _entityToSpawn10 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.15.2
                                public Projectile getProjectile(Level level, Entity shooter) {
                                    ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                    thrownEnderpearl.setOwner(shooter);
                                    return thrownEnderpearl;
                                }
                            }.getProjectile(projectileLevel10, entity);
                            _entityToSpawn10.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn10.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.0f, 0.0f);
                            projectileLevel10.addFreshEntity(_entityToSpawn10);
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
                        itemStack.enchant(Enchantments.POWER_ARROWS, 6);
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt2 = entity;
                            itemStack2 = _livEnt2.getMainHandItem();
                        } else {
                            itemStack2 = ItemStack.EMPTY;
                        }
                        itemStack2.enchant(Enchantments.PUNCH_ARROWS, 5);
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.15.3
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

                            /* JADX WARN: Type inference failed for: r0v189, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure$15$3$1] */
                            private void run() {
                                ItemStack itemStack3;
                                ItemStack itemStack4;
                                ItemStack itemStack5;
                                ItemStack itemStack6;
                                ItemStack itemStack7;
                                ItemStack itemStack8;
                                ItemStack itemStack9;
                                ItemStack itemStack10;
                                LivingEntity livingEntity2 = entity;
                                livingEntity2.setYRot(0.0f);
                                livingEntity2.setXRot(180.0f);
                                livingEntity2.setYBodyRot(livingEntity2.getYRot());
                                livingEntity2.setYHeadRot(livingEntity2.getYRot());
                                livingEntity2.yRotO = livingEntity2.getYRot();
                                livingEntity2.xRotO = livingEntity2.getXRot();
                                if (livingEntity2 instanceof LivingEntity) {
                                    LivingEntity _entity18 = livingEntity2;
                                    _entity18.yBodyRotO = _entity18.getYRot();
                                    _entity18.yHeadRotO = _entity18.getYRot();
                                }
                                Entity _shootFrom2 = entity;
                                Level projectileLevel11 = _shootFrom2.level;
                                if (!projectileLevel11.isClientSide()) {
                                    Projectile _entityToSpawn11 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobProcedure.15.3.1
                                        public Projectile getProjectile(Level level, Entity shooter) {
                                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                                            thrownEnderpearl.setOwner(shooter);
                                            return thrownEnderpearl;
                                        }
                                    }.getProjectile(projectileLevel11, entity);
                                    _entityToSpawn11.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                    _entityToSpawn11.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 2.0f, 0.0f);
                                    projectileLevel11.addFreshEntity(_entityToSpawn11);
                                }
                                if (entity instanceof LivingEntity) {
                                    Player player2 = (LivingEntity) entity;
                                    ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_JIAN.get());
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
                                if (Math.random() <= 0.2d) {
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
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt5 = entity;
                                        itemStack9 = _livEnt5.getMainHandItem();
                                    } else {
                                        itemStack9 = ItemStack.EMPTY;
                                    }
                                    itemStack9.enchant(Enchantments.SHARPNESS, 5);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt6 = entity;
                                        itemStack10 = _livEnt6.getMainHandItem();
                                    } else {
                                        itemStack10 = ItemStack.EMPTY;
                                    }
                                    itemStack10.enchant(Enchantments.MENDING, 5);
                                }
                                if (Math.random() <= 0.2d) {
                                    if (entity instanceof LivingEntity) {
                                        Player player4 = (LivingEntity) entity;
                                        ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_DAO_PIAN.get());
                                        _setstack4.setCount(1);
                                        player4.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
                                        if (player4 instanceof Player) {
                                            Player _player4 = player4;
                                            _player4.getInventory().setChanged();
                                        }
                                    }
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt7 = entity;
                                        itemStack7 = _livEnt7.getMainHandItem();
                                    } else {
                                        itemStack7 = ItemStack.EMPTY;
                                    }
                                    itemStack7.enchant(Enchantments.SHARPNESS, 5);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt8 = entity;
                                        itemStack8 = _livEnt8.getMainHandItem();
                                    } else {
                                        itemStack8 = ItemStack.EMPTY;
                                    }
                                    itemStack8.enchant(Enchantments.MENDING, 5);
                                }
                                if (Math.random() <= 0.2d) {
                                    if (entity instanceof LivingEntity) {
                                        Player player5 = (LivingEntity) entity;
                                        ItemStack _setstack5 = new ItemStack(AnnoyingVillagersbychentuModItems.GOU_ZHUANG_ZUAN_SHI_JIAN.get());
                                        _setstack5.setCount(1);
                                        player5.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
                                        if (player5 instanceof Player) {
                                            Player _player5 = player5;
                                            _player5.getInventory().setChanged();
                                        }
                                    }
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt9 = entity;
                                        itemStack5 = _livEnt9.getMainHandItem();
                                    } else {
                                        itemStack5 = ItemStack.EMPTY;
                                    }
                                    itemStack5.enchant(Enchantments.SHARPNESS, 5);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt10 = entity;
                                        itemStack6 = _livEnt10.getMainHandItem();
                                    } else {
                                        itemStack6 = ItemStack.EMPTY;
                                    }
                                    itemStack6.enchant(Enchantments.MENDING, 5);
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 80);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 20);
            }
        }
    }
}
