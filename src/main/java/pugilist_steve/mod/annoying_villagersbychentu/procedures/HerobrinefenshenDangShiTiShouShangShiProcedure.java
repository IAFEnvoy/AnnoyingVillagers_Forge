package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.YinshenEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;


public class HerobrinefenshenDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v122, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r0v128, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r0v152, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v153, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v176, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v182, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v24, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$12] */
    /* JADX WARN: Type inference failed for: r0v28, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$11] */
    /* JADX WARN: Type inference failed for: r0v52, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$17] */
    /* JADX WARN: Type inference failed for: r0v75, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$16] */
    /* JADX WARN: Type inference failed for: r0v76, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$15] */
    /* JADX WARN: Type inference failed for: r0v77, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$14] */
    /* JADX WARN: Type inference failed for: r0v98, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$7] */
    /* JADX WARN: Type inference failed for: r0v99, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$8] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        float f;
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.01d && (world instanceof Level _level)) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:humchuanqi")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:humchuanqi")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (Math.random() <= 0.008d) {
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsaydzlsddds")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsaydzlsddds")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> 所有挡在我路上的人都应该死！"), ChatType.SYSTEM, Util.NIL_UUID);
            }
        }
        if (entity instanceof LivingEntity _livEnt) {
            f = _livEnt.getHealth();
        } else {
            f = -1.0f;
        }
        if (f <= 5.0f) {
            if (Math.random() <= 0.4d) {
                if (world instanceof Level _level3) {
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level _level4) {
                    if (!_level4.isClientSide()) {
                        _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                Level projectileLevel = entity.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.1
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            entityToSpawn.setPierceLevel(piercing);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel, entity, 19.0f, 5, (byte) 4);
                    _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.5f, 0.0f);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
                Level projectileLevel2 = entity.level;
                if (!projectileLevel2.isClientSide()) {
                    Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.2
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            entityToSpawn.setPierceLevel(piercing);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel2, entity, 18.0f, 5, (byte) 3);
                    _entityToSpawn2.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn2.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel2.addFreshEntity(_entityToSpawn2);
                }
                if (entity instanceof LivingEntity) {
                    Player player = (LivingEntity) entity;
                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHIZHU.get());
                    _setstack.setCount(1);
                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().setChanged();
                    }
                }
                if (entity instanceof LivingEntity) {
                    Player player2 = (LivingEntity) entity;
                    ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHISHIFANGSHI.get());
                    _setstack2.setCount(1);
                    player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                    if (player2 instanceof Player) {
                        Player _player2 = player2;
                        _player2.getInventory().setChanged();
                    }
                }
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.3
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

                    /* JADX WARN: Type inference failed for: r0v19, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$3$2] */
                    /* JADX WARN: Type inference failed for: r0v25, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$3$1] */
                    private void run() {
                        if (entity instanceof LivingEntity) {
                            Player player3 = (LivingEntity) entity;
                            ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHIZHU.get());
                            _setstack3.setCount(1);
                            player3.setItemInHand(InteractionHand.OFF_HAND, _setstack3);
                            if (player3 instanceof Player) {
                                Player _player3 = player3;
                                _player3.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            Player player4 = (LivingEntity) entity;
                            ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHISHIFANGSHI.get());
                            _setstack4.setCount(1);
                            player4.setItemInHand(InteractionHand.MAIN_HAND, _setstack4);
                            if (player4 instanceof Player) {
                                Player _player4 = player4;
                                _player4.getInventory().setChanged();
                            }
                        }
                        Entity _shootFrom = entity;
                        Level projectileLevel3 = _shootFrom.level;
                        if (!projectileLevel3.isClientSide()) {
                            Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.3.1
                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                    AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                    entityToSpawn.setOwner(shooter);
                                    entityToSpawn.setBaseDamage(damage);
                                    entityToSpawn.setKnockback(knockback);
                                    entityToSpawn.setSilent(true);
                                    entityToSpawn.setPierceLevel(piercing);
                                    return entityToSpawn;
                                }
                            }.getArrow(projectileLevel3, entity, 18.0f, 5, (byte) 3);
                            _entityToSpawn3.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn3.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel3.addFreshEntity(_entityToSpawn3);
                        }
                        Entity _shootFrom2 = entity;
                        Level projectileLevel4 = _shootFrom2.level;
                        if (!projectileLevel4.isClientSide()) {
                            Projectile _entityToSpawn4 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.3.2
                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                    AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                    entityToSpawn.setOwner(shooter);
                                    entityToSpawn.setBaseDamage(damage);
                                    entityToSpawn.setKnockback(knockback);
                                    entityToSpawn.setSilent(true);
                                    entityToSpawn.setPierceLevel(piercing);
                                    return entityToSpawn;
                                }
                            }.getArrow(projectileLevel4, entity, 19.0f, 5, (byte) 5);
                            _entityToSpawn4.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                            _entityToSpawn4.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel4.addFreshEntity(_entityToSpawn4);
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 5);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.4
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
                            Level _level5 = level;
                            if (!_level5.isClientSide()) {
                                _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            } else {
                                _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            Player player3 = (LivingEntity) entity;
                            ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get());
                            _setstack3.setCount(1);
                            player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                            if (player3 instanceof Player) {
                                Player _player3 = player3;
                                _player3.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            Player player4 = (LivingEntity) entity;
                            ItemStack _setstack4 = new ItemStack(Blocks.AIR);
                            _setstack4.setCount(1);
                            player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                            if (player4 instanceof Player) {
                                Player _player4 = player4;
                                _player4.getInventory().setChanged();
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 10);
            }
            if (Math.random() <= 0.76d && Math.random() <= 0.44d) {
                Level projectileLevel3 = entity.level;
                if (!projectileLevel3.isClientSide()) {
                    Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.5
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel3, entity, 18.0f, 5);
                    _entityToSpawn3.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn3.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel3.addFreshEntity(_entityToSpawn3);
                }
                Level projectileLevel4 = entity.level;
                if (!projectileLevel4.isClientSide()) {
                    Projectile _entityToSpawn4 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.6
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel4, entity, 19.0f, 5);
                    _entityToSpawn4.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn4.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                    projectileLevel4.addFreshEntity(_entityToSpawn4);
                }
                if (entity instanceof LivingEntity) {
                    Player player3 = (LivingEntity) entity;
                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHIZHU.get());
                    _setstack3.setCount(1);
                    player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                    if (player3 instanceof Player) {
                        Player _player3 = player3;
                        _player3.getInventory().setChanged();
                    }
                }
                if (entity instanceof LivingEntity) {
                    Player player4 = (LivingEntity) entity;
                    ItemStack _setstack4 = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHISHIFANGSHI.get());
                    _setstack4.setCount(1);
                    player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                    if (player4 instanceof Player) {
                        Player _player4 = player4;
                        _player4.getInventory().setChanged();
                    }
                }
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.7
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

                    /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$7$1] */
                    private void run() {
                        if (entity instanceof LivingEntity) {
                            Player player5 = (LivingEntity) entity;
                            ItemStack _setstack5 = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHIZHU.get());
                            _setstack5.setCount(1);
                            player5.setItemInHand(InteractionHand.OFF_HAND, _setstack5);
                            if (player5 instanceof Player) {
                                Player _player5 = player5;
                                _player5.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            Player player6 = (LivingEntity) entity;
                            ItemStack _setstack6 = new ItemStack(AnnoyingVillagersbychentuModItems.PUTONGHEIYAOSHISHIFANGSHI.get());
                            _setstack6.setCount(1);
                            player6.setItemInHand(InteractionHand.MAIN_HAND, _setstack6);
                            if (player6 instanceof Player) {
                                Player _player6 = player6;
                                _player6.getInventory().setChanged();
                            }
                        }
                        Entity _shootFrom = entity;
                        Level projectileLevel5 = _shootFrom.level;
                        if (!projectileLevel5.isClientSide()) {
                            Projectile _entityToSpawn5 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.7.1
                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                    AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                    entityToSpawn.setOwner(shooter);
                                    entityToSpawn.setBaseDamage(damage);
                                    entityToSpawn.setKnockback(knockback);
                                    entityToSpawn.setSilent(true);
                                    entityToSpawn.setPierceLevel(piercing);
                                    return entityToSpawn;
                                }
                            }.getArrow(projectileLevel5, entity, 18.0f, 5, (byte) 3);
                            _entityToSpawn5.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                            _entityToSpawn5.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel5.addFreshEntity(_entityToSpawn5);
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 5);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.8
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
                            Player player5 = (LivingEntity) entity;
                            ItemStack _setstack5 = new ItemStack(AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get());
                            _setstack5.setCount(1);
                            player5.setItemInHand(InteractionHand.MAIN_HAND, _setstack5);
                            if (player5 instanceof Player) {
                                Player _player5 = player5;
                                _player5.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            Player player6 = (LivingEntity) entity;
                            ItemStack _setstack6 = new ItemStack(Blocks.AIR);
                            _setstack6.setCount(1);
                            player6.setItemInHand(InteractionHand.OFF_HAND, _setstack6);
                            if (player6 instanceof Player) {
                                Player _player6 = player6;
                                _player6.getInventory().setChanged();
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 10);
            }
        } else if (Math.random() <= 0.32d) {
            if (Math.random() <= 0.05d && (world instanceof Level _level5)) {
                if (!_level5.isClientSide()) {
                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himattack")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himattack")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
            }
            new C08479(entity).start(world, 1);
            entity.setSprinting(true);
            if (Math.random() <= 0.2d) {
                new C080710(entity).start(world, 10);
            }
            if (Math.random() <= 0.09d) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.11
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

                    /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$11$1] */
                    private void run() {
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entity = entity;
                            if (!_entity.level.isClientSide()) {
                                _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 25, 10, false, false));
                            }
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.11.1
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
                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^-1 ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent2 = entity;
                                if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                    _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^-1 ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent3 = entity;
                                if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                    _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^1 ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent4 = entity;
                                if (!_ent4.level.isClientSide() && _ent4.getServer() != null) {
                                    _ent4.getServer().getCommands().performCommand(_ent4.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^2 ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent5 = entity;
                                if (!_ent5.level.isClientSide() && _ent5.getServer() != null) {
                                    _ent5.getServer().getCommands().performCommand(_ent5.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^1 ^1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent6 = entity;
                                if (!_ent6.level.isClientSide() && _ent6.getServer() != null) {
                                    _ent6.getServer().getCommands().performCommand(_ent6.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^2 ^1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent7 = entity;
                                if (!_ent7.level.isClientSide() && _ent7.getServer() != null) {
                                    _ent7.getServer().getCommands().performCommand(_ent7.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^-1 ^1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent8 = entity;
                                if (!_ent8.level.isClientSide() && _ent8.getServer() != null) {
                                    _ent8.getServer().getCommands().performCommand(_ent8.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^-2 ^1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent9 = entity;
                                if (!_ent9.level.isClientSide() && _ent9.getServer() != null) {
                                    _ent9.getServer().getCommands().performCommand(_ent9.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^-1 ^2 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent10 = entity;
                                if (!_ent10.level.isClientSide() && _ent10.getServer() != null) {
                                    _ent10.getServer().getCommands().performCommand(_ent10.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^-2 ^2 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent11 = entity;
                                if (!_ent11.level.isClientSide() && _ent11.getServer() != null) {
                                    _ent11.getServer().getCommands().performCommand(_ent11.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^1 ^2 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                Entity _ent12 = entity;
                                if (!_ent12.level.isClientSide() && _ent12.getServer() != null) {
                                    _ent12.getServer().getCommands().performCommand(_ent12.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^2 ^2 ^1 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 1);
                        Entity _ent = entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        Entity _ent2 = entity;
                        if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                            _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        Entity _ent3 = entity;
                        if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                            _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^1 ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        Entity _ent4 = entity;
                        if (!_ent4.level.isClientSide() && _ent4.getServer() != null) {
                            _ent4.getServer().getCommands().performCommand(_ent4.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^2 ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 2);
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.12
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
                    entity.setSprinting(false);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 10);
            if (Math.random() <= 0.23d) {
                new C082213(entity).start(world, 5);
            }
        }
        if (Math.random() <= 0.01d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.14
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
                        Level _level6 = level;
                        if (!_level6.isClientSide()) {
                            _level6.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himattack2")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himattack2")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 10);
        }
        if (Math.random() <= 0.009d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.15
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
                        Level _level6 = level;
                        if (!_level6.isClientSide()) {
                            _level6.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsayenough")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsayenough")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> 够了！"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 20);
        }
        if (Math.random() <= 0.0098d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.16
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
                        Level _level6 = level;
                        if (!_level6.isClientSide()) {
                            _level6.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsaytaiyuchunle")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsaytaiyuchunle")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> 多么愚蠢……"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 55);
        }
        if (entity instanceof LivingEntity) {
            Player player5 = (LivingEntity) entity;
            ItemStack _setstack5 = new ItemStack(AnnoyingVillagersbychentuModItems.OBSIDIANWEAPONS.get());
            _setstack5.setCount(1);
            player5.setItemInHand(InteractionHand.OFF_HAND, _setstack5);
            if (player5 instanceof Player) {
                Player _player5 = player5;
                _player5.getInventory().setChanged();
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.17
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
                    Player player6 = (LivingEntity) entity;
                    ItemStack _setstack6 = new ItemStack(Blocks.AIR);
                    _setstack6.setCount(1);
                    player6.setItemInHand(InteractionHand.OFF_HAND, _setstack6);
                    if (player6 instanceof Player) {
                        Player _player6 = player6;
                        _player6.getInventory().setChanged();
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 32);
        if (Math.random() > 0.56d || !(entity instanceof LivingEntity _entity)) {
            return;
        }
        if (!_entity.level.isClientSide()) {
            _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C08479 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C08479(Entity entity) {
            this.val$entity = entity;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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
            Entity _ent = this.val$entity;
            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
            }
            new C08481().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C08481 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C08481() {
            }

            public void start(LevelAccessor world, int waitTicks) {
                this.waitTicks = waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world;
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
                Entity _ent = C08479.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C08491().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C08491 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C08491() {
                }

                public void start(LevelAccessor world, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world;
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
                    Entity _ent = C08479.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C08501().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C08501 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C08501() {
                    }

                    public void start(LevelAccessor world, int waitTicks) {
                        this.waitTicks = waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world;
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

                    /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$9$1$1$1$1] */
                    private void run() {
                        Entity _ent = C08479.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.9.1.1.1.1
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            public void start(LevelAccessor world, int waitTicks) {
                                this.waitTicks = waitTicks;
                                MinecraftForge.EVENT_BUS.register(this);
                                this.world = world;
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

                            /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$9$1$1$1$1$1] */
                            private void run() {
                                Entity _ent2 = C08479.this.val$entity;
                                if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                    _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.9.1.1.1.1.1
                                    private int ticks = 0;
                                    private float waitTicks;
                                    private LevelAccessor world;

                                    public void start(LevelAccessor world, int waitTicks) {
                                        this.waitTicks = waitTicks;
                                        MinecraftForge.EVENT_BUS.register(this);
                                        this.world = world;
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
                                        Entity _ent3 = C08479.this.val$entity;
                                        if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                            _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                        }
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }
                                }.start(this.world, 1);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C080710 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C080710(Entity entity) {
            this.val$entity = entity;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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
            Entity _ent = this.val$entity;
            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
            }
            new C08081().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C08081 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C08081() {
            }

            public void start(LevelAccessor world, int waitTicks) {
                this.waitTicks = waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world;
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
                Entity _ent = C080710.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C08091().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C08091 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C08091() {
                }

                public void start(LevelAccessor world, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world;
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
                    Entity _ent = C080710.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C08101().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C08101 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C08101() {
                    }

                    public void start(LevelAccessor world, int waitTicks) {
                        this.waitTicks = waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world;
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
                        Entity _ent = C080710.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C08111().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C08111 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C08111() {
                        }

                        public void start(LevelAccessor world, int waitTicks) {
                            this.waitTicks = waitTicks;
                            MinecraftForge.EVENT_BUS.register(this);
                            this.world = world;
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
                            Entity _ent = C080710.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new C08121().start(this.world, 1);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C08121 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C08121() {
                            }

                            public void start(LevelAccessor world, int waitTicks) {
                                this.waitTicks = waitTicks;
                                MinecraftForge.EVENT_BUS.register(this);
                                this.world = world;
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
                                Entity _ent = C080710.this.val$entity;
                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                new C08131().start(this.world, 1);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */


                            public class C08131 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C08131() {
                                }

                                public void start(LevelAccessor world, int waitTicks) {
                                    this.waitTicks = waitTicks;
                                    MinecraftForge.EVENT_BUS.register(this);
                                    this.world = world;
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
                                    Entity _ent = C080710.this.val$entity;
                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new C08141().start(this.world, 1);
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */


                                public class C08141 {
                                    private int ticks = 0;
                                    private float waitTicks;
                                    private LevelAccessor world;

                                    C08141() {
                                    }

                                    public void start(LevelAccessor world, int waitTicks) {
                                        this.waitTicks = waitTicks;
                                        MinecraftForge.EVENT_BUS.register(this);
                                        this.world = world;
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
                                        Entity _ent = C080710.this.val$entity;
                                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^7 annoying_villagersbychentu:putongheiyaoshi");
                                        }
                                        new C08151().start(this.world, 1);
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }

                                    /* JADX INFO: Access modifiers changed from: package-private */


                                    public class C08151 {
                                        private int ticks = 0;
                                        private float waitTicks;
                                        private LevelAccessor world;

                                        C08151() {
                                        }

                                        public void start(LevelAccessor world, int waitTicks) {
                                            this.waitTicks = waitTicks;
                                            MinecraftForge.EVENT_BUS.register(this);
                                            this.world = world;
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
                                            Entity _ent = C080710.this.val$entity;
                                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^8 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            new C08161().start(this.world, 1);
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }

                                        /* JADX INFO: Access modifiers changed from: package-private */


                                        public class C08161 {
                                            private int ticks = 0;
                                            private float waitTicks;
                                            private LevelAccessor world;

                                            C08161() {
                                            }

                                            public void start(LevelAccessor world, int waitTicks) {
                                                this.waitTicks = waitTicks;
                                                MinecraftForge.EVENT_BUS.register(this);
                                                this.world = world;
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

                                            /* JADX WARN: Type inference failed for: r0v14, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$10$1$1$1$1$1$1$1$1$1$1] */
                                            private void run() {
                                                Entity _ent = C080710.this.val$entity;
                                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^9 annoying_villagersbychentu:putongheiyaoshi");
                                                }
                                                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.10.1.1.1.1.1.1.1.1.1.1
                                                    private int ticks = 0;
                                                    private float waitTicks;
                                                    private LevelAccessor world;

                                                    public void start(LevelAccessor world, int waitTicks) {
                                                        this.waitTicks = waitTicks;
                                                        MinecraftForge.EVENT_BUS.register(this);
                                                        this.world = world;
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

                                                    /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$10$1$1$1$1$1$1$1$1$1$1$1] */
                                                    private void run() {
                                                        Entity _ent2 = C080710.this.val$entity;
                                                        if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                                            _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^10 annoying_villagersbychentu:putongheiyaoshi");
                                                        }
                                                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.10.1.1.1.1.1.1.1.1.1.1.1
                                                            private int ticks = 0;
                                                            private float waitTicks;
                                                            private LevelAccessor world;

                                                            public void start(LevelAccessor world, int waitTicks) {
                                                                this.waitTicks = waitTicks;
                                                                MinecraftForge.EVENT_BUS.register(this);
                                                                this.world = world;
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
                                                                Entity _ent3 = C080710.this.val$entity;
                                                                if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                                    _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^11 annoying_villagersbychentu:putongheiyaoshi");
                                                                }
                                                                MinecraftForge.EVENT_BUS.unregister(this);
                                                            }
                                                        }.start(this.world, 1);
                                                        MinecraftForge.EVENT_BUS.unregister(this);
                                                    }
                                                }.start(this.world, 1);
                                                MinecraftForge.EVENT_BUS.unregister(this);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C082213 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C082213(Entity entity) {
            this.val$entity = entity;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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
            Entity _ent = this.val$entity;
            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
            }
            new C08231().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C08231 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C08231() {
            }

            public void start(LevelAccessor world, int waitTicks) {
                this.waitTicks = waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world;
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
                Entity _ent = C082213.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^1 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C08241().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C08241 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C08241() {
                }

                public void start(LevelAccessor world, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world;
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
                    Entity _ent = C082213.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C08251().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C08251 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C08251() {
                    }

                    public void start(LevelAccessor world, int waitTicks) {
                        this.waitTicks = waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world;
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
                        Entity _ent = C082213.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new C08261().start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C08261 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C08261() {
                        }

                        public void start(LevelAccessor world, int waitTicks) {
                            this.waitTicks = waitTicks;
                            MinecraftForge.EVENT_BUS.register(this);
                            this.world = world;
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
                            Entity _ent = C082213.this.val$entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                            }
                            new C08271().start(this.world, 1);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C08271 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C08271() {
                            }

                            public void start(LevelAccessor world, int waitTicks) {
                                this.waitTicks = waitTicks;
                                MinecraftForge.EVENT_BUS.register(this);
                                this.world = world;
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
                                Entity _ent = C082213.this.val$entity;
                                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                new C08281().start(this.world, 1);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }

                            /* JADX INFO: Access modifiers changed from: package-private */


                            public class C08281 {
                                private int ticks = 0;
                                private float waitTicks;
                                private LevelAccessor world;

                                C08281() {
                                }

                                public void start(LevelAccessor world, int waitTicks) {
                                    this.waitTicks = waitTicks;
                                    MinecraftForge.EVENT_BUS.register(this);
                                    this.world = world;
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
                                    Entity _ent = C082213.this.val$entity;
                                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^6 annoying_villagersbychentu:putongheiyaoshi");
                                    }
                                    new C08291().start(this.world, 1);
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }

                                /* JADX INFO: Access modifiers changed from: package-private */


                                public class C08291 {
                                    private int ticks = 0;
                                    private float waitTicks;
                                    private LevelAccessor world;

                                    C08291() {
                                    }

                                    public void start(LevelAccessor world, int waitTicks) {
                                        this.waitTicks = waitTicks;
                                        MinecraftForge.EVENT_BUS.register(this);
                                        this.world = world;
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
                                        Entity _ent = C082213.this.val$entity;
                                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^7 annoying_villagersbychentu:putongheiyaoshi");
                                        }
                                        new C08301().start(this.world, 1);
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }

                                    /* JADX INFO: Access modifiers changed from: package-private */


                                    public class C08301 {
                                        private int ticks = 0;
                                        private float waitTicks;
                                        private LevelAccessor world;

                                        C08301() {
                                        }

                                        public void start(LevelAccessor world, int waitTicks) {
                                            this.waitTicks = waitTicks;
                                            MinecraftForge.EVENT_BUS.register(this);
                                            this.world = world;
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

                                        /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$13$1$1$1$1$1$1$1$1$1] */
                                        private void run() {
                                            Entity _ent = C082213.this.val$entity;
                                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^8 annoying_villagersbychentu:putongheiyaoshi");
                                            }
                                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.13.1.1.1.1.1.1.1.1.1
                                                private int ticks = 0;
                                                private float waitTicks;
                                                private LevelAccessor world;

                                                public void start(LevelAccessor world, int waitTicks) {
                                                    this.waitTicks = waitTicks;
                                                    MinecraftForge.EVENT_BUS.register(this);
                                                    this.world = world;
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

                                                /* JADX WARN: Type inference failed for: r0v14, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure$13$1$1$1$1$1$1$1$1$1$1] */
                                                private void run() {
                                                    Entity _ent2 = C082213.this.val$entity;
                                                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^9 annoying_villagersbychentu:putongheiyaoshi");
                                                    }
                                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefenshenDangShiTiShouShangShiProcedure.13.1.1.1.1.1.1.1.1.1.1
                                                        private int ticks = 0;
                                                        private float waitTicks;
                                                        private LevelAccessor world;

                                                        public void start(LevelAccessor world, int waitTicks) {
                                                            this.waitTicks = waitTicks;
                                                            MinecraftForge.EVENT_BUS.register(this);
                                                            this.world = world;
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
                                                            Entity _ent3 = C082213.this.val$entity;
                                                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^10 annoying_villagersbychentu:putongheiyaoshi");
                                                            }
                                                            MinecraftForge.EVENT_BUS.unregister(this);
                                                        }
                                                    }.start(this.world, 1);
                                                    MinecraftForge.EVENT_BUS.unregister(this);
                                                }
                                            }.start(this.world, 1);
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
