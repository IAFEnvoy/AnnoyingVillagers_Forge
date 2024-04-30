package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.YinshenEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class DiJiherobrineDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v19, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v51, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure$5] */
    /* JADX WARN: Type inference failed for: r0v52, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure$6] */
    /* JADX WARN: Type inference failed for: r0v75, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v81, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure$3] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        LivingEntity livingEntity;
        if (entity == null) {
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
                if (Math.random() <= 0.01d) {
                    if (world instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fangzhiheiyaoshi")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    if (!entity.level.isClientSide() && entity.getServer() != null) {
                        entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^1 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C04271(entity).start(world, 1);
                }
                entity.setSprinting(true);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure.2
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
                if (Math.random() <= 0.32d) {
                    if (world instanceof Level _level2) {
                        if (!_level2.isClientSide()) {
                            _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    if (world instanceof Level _level3) {
                        if (!_level3.isClientSide()) {
                            _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                        } else {
                            _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                        }
                    }
                    Level projectileLevel = entity.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure.3
                            public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
                                AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setPierceLevel(piercing);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel, 13.0f, 2, (byte) 2);
                        _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                        _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    Level projectileLevel2 = entity.level;
                    if (!projectileLevel2.isClientSide()) {
                        Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure.4
                            public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
                                AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setPierceLevel(piercing);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel2, 10.0f, 2, (byte) 2);
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
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure.5
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

                        /* JADX WARN: Type inference failed for: r0v57, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure$5$2] */
                        /* JADX WARN: Type inference failed for: r0v63, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure$5$1] */
                        private void run() {
                            Level level = this.world;
                            if (level instanceof Level) {
                                Level _level4 = level;
                                if (!_level4.isClientSide()) {
                                    _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.attack.sweep")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            Entity _shootFrom = entity;
                            Level projectileLevel3 = _shootFrom.level;
                            if (!projectileLevel3.isClientSide()) {
                                Projectile _entityToSpawn3 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure.5.1
                                    public Projectile getArrow(Level level2, float damage, int knockback, byte piercing) {
                                        AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level2);
                                        entityToSpawn.setBaseDamage(damage);
                                        entityToSpawn.setKnockback(knockback);
                                        entityToSpawn.setSilent(true);
                                        entityToSpawn.setPierceLevel(piercing);
                                        return entityToSpawn;
                                    }
                                }.getArrow(projectileLevel3, 13.0f, 2, (byte) 2);
                                _entityToSpawn3.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                                _entityToSpawn3.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1.0f, 0.0f);
                                projectileLevel3.addFreshEntity(_entityToSpawn3);
                            }
                            Entity _shootFrom2 = entity;
                            Level projectileLevel4 = _shootFrom2.level;
                            if (!projectileLevel4.isClientSide()) {
                                Projectile _entityToSpawn4 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure.5.2
                                    public Projectile getArrow(Level level2, float damage, int knockback, byte piercing) {
                                        AbstractArrow entityToSpawn = new YinshenEntity(AnnoyingVillagersbychentuModEntities.YINSHEN.get(), level2);
                                        entityToSpawn.setBaseDamage(damage);
                                        entityToSpawn.setKnockback(knockback);
                                        entityToSpawn.setSilent(true);
                                        entityToSpawn.setPierceLevel(piercing);
                                        return entityToSpawn;
                                    }
                                }.getArrow(projectileLevel4, 13.0f, 3, (byte) 2);
                                _entityToSpawn4.setPos(_shootFrom2.getX(), _shootFrom2.getEyeY() - 0.1d, _shootFrom2.getZ());
                                _entityToSpawn4.shoot(_shootFrom2.getLookAngle().x, _shootFrom2.getLookAngle().y, _shootFrom2.getLookAngle().z, 1.0f, 0.0f);
                                projectileLevel4.addFreshEntity(_entityToSpawn4);
                            }
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
                            Level level2 = this.world;
                            if (level2 instanceof Level) {
                                Level _level5 = level2;
                                if (!_level5.isClientSide()) {
                                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.stone.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, 5);
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure.6
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
                                Level _level4 = level;
                                if (!_level4.isClientSide()) {
                                    _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                                } else {
                                    _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                                }
                            }
                            if (entity instanceof LivingEntity) {
                                Player player3 = (LivingEntity) entity;
                                ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.OBSIDIANWEAPONS.get());
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
                if (Math.random() <= 0.3d && (entity instanceof LivingEntity _entity)) {
                    if (!_entity.level.isClientSide()) {
                        _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C04271 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C04271(Entity entity) {
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
            new C04281().start(this.world, 1);
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C04281 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C04281() {
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
                Entity _ent = C04271.this.val$entity;
                if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^2 annoying_villagersbychentu:putongheiyaoshi");
                }
                new C04291().start(this.world, 1);
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C04291 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C04291() {
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
                    Entity _ent = C04271.this.val$entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^3 annoying_villagersbychentu:putongheiyaoshi");
                    }
                    new C04301().start(this.world, 1);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C04301 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C04301() {
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

                    /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure$1$1$1$1$1] */
                    private void run() {
                        Entity _ent = C04271.this.val$entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^4 annoying_villagersbychentu:putongheiyaoshi");
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure.1.1.1.1.1
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

                            /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure$1$1$1$1$1$1] */
                            private void run() {
                                Entity _ent2 = C04271.this.val$entity;
                                if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                    _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^5 annoying_villagersbychentu:putongheiyaoshi");
                                }
                                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineDangShiTiShouShangShiProcedure.1.1.1.1.1.1
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
                                        Entity _ent3 = C04271.this.val$entity;
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
}
