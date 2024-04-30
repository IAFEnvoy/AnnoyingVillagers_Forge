package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class ZaiEZhiWangDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v25, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v65, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v66, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure$2] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        LivingEntity livingEntity;
        float f;
        ItemStack itemStack;
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
                if (Math.random() <= 0.1d) {
                    if (entity instanceof LivingEntity _livEnt) {
                        itemStack = _livEnt.getMainHandItem();
                    } else {
                        itemStack = ItemStack.EMPTY;
                    }
                    if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.HONG_BAO_SHI_FU_JU_DA.get()) {
                        new C13491(entity).start(world, Mth.nextInt(new Random(), 15, 20));
                    }
                }
                if (Math.random() <= 0.009d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure.2
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
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:vindicator ^ ^ ^6");
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, Mth.nextInt(new Random(), 20, 40));
                }
                if (Math.random() <= 0.005d) {
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure.3
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
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:vindicator ^5 ^ ^8");
                            }
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(world, Mth.nextInt(new Random(), 20, 40));
                }
                if (Math.random() <= 0.009d && !entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:tnt ^ ^ ^2");
                }
                entity.setSprinting(true);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure.4
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
                if (entity instanceof LivingEntity _livEnt2) {
                    f = _livEnt2.getHealth();
                } else {
                    f = -1.0f;
                }
                if (f <= 15.0f && (entity instanceof LivingEntity _entity)) {
                    if (!_entity.level.isClientSide()) {
                        _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 1, false, false));
                    }
                }
                if (Math.random() <= 0.65d && (entity instanceof LivingEntity _entity2)) {
                    if (!_entity2.level.isClientSide()) {
                        _entity2.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C13491 {
        final Entity val$entity;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C13491(Entity entity) {
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
            if (this.val$entity instanceof LivingEntity) {
                Player player = (LivingEntity) this.val$entity;
                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.HONG_BAO_SHI_FU_CHANG_BING.get());
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
            new C13501().start(this.world, Mth.nextInt(new Random(), 10, 20));
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C13501 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C13501() {
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
                if (C13491.this.val$entity instanceof LivingEntity) {
                    Player player = (LivingEntity) C13491.this.val$entity;
                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.HONGBAOSHIFUSAOCHANG.get());
                    _setstack.setCount(1);
                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().setChanged();
                    }
                }
                new C13511().start(this.world, Mth.nextInt(new Random(), 10, 20));
                MinecraftForge.EVENT_BUS.unregister(this);
            }

            /* JADX INFO: Access modifiers changed from: package-private */


            public class C13511 {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                C13511() {
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
                    if (C13491.this.val$entity instanceof LivingEntity) {
                        Player player = (LivingEntity) C13491.this.val$entity;
                        ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.HONGBAOSHIFUZHONGCHANG.get());
                        _setstack.setCount(1);
                        player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (player instanceof Player) {
                            Player _player = player;
                            _player.getInventory().setChanged();
                        }
                    }
                    new C13521().start(this.world, Mth.nextInt(new Random(), 10, 20));
                    MinecraftForge.EVENT_BUS.unregister(this);
                }

                /* JADX INFO: Access modifiers changed from: package-private */


                public class C13521 {
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    C13521() {
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
                        if (C13491.this.val$entity instanceof LivingEntity) {
                            Player player = (LivingEntity) C13491.this.val$entity;
                            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.HONGBAOSHIFUCHAOCHANG.get());
                            _setstack.setCount(1);
                            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (player instanceof Player) {
                                Player _player = player;
                                _player.getInventory().setChanged();
                            }
                        }
                        new C13531().start(this.world, Mth.nextInt(new Random(), 150, 300));
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */


                    public class C13531 {
                        private int ticks = 0;
                        private float waitTicks;
                        private LevelAccessor world;

                        C13531() {
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
                            if (C13491.this.val$entity instanceof LivingEntity) {
                                Player player = (LivingEntity) C13491.this.val$entity;
                                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.HONGBAOSHIFUZHONGCHANG.get());
                                _setstack.setCount(1);
                                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                if (player instanceof Player) {
                                    Player _player = player;
                                    _player.getInventory().setChanged();
                                }
                            }
                            new C13541().start(this.world, 5);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */


                        public class C13541 {
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            C13541() {
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

                            /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure$1$1$1$1$1$1$1] */
                            private void run() {
                                if (C13491.this.val$entity instanceof LivingEntity) {
                                    Player player = (LivingEntity) C13491.this.val$entity;
                                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.HONGBAOSHIFUSAOCHANG.get());
                                    _setstack.setCount(1);
                                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                                    if (player instanceof Player) {
                                        Player _player = player;
                                        _player.getInventory().setChanged();
                                    }
                                }
                                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure.1.1.1.1.1.1.1
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

                                    /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure$1$1$1$1$1$1$1$1] */
                                    private void run() {
                                        if (C13491.this.val$entity instanceof LivingEntity) {
                                            Player player2 = (LivingEntity) C13491.this.val$entity;
                                            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.HONG_BAO_SHI_FU_CHANG_BING.get());
                                            _setstack2.setCount(1);
                                            player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                                            if (player2 instanceof Player) {
                                                Player _player2 = player2;
                                                _player2.getInventory().setChanged();
                                            }
                                        }
                                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure.1.1.1.1.1.1.1.1
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
                                                if (C13491.this.val$entity instanceof LivingEntity) {
                                                    Player player3 = (LivingEntity) C13491.this.val$entity;
                                                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.HONG_BAO_SHI_FU_JU_DA.get());
                                                    _setstack3.setCount(1);
                                                    player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                                                    if (player3 instanceof Player) {
                                                        Player _player3 = player3;
                                                        _player3.getInventory().setChanged();
                                                    }
                                                }
                                                MinecraftForge.EVENT_BUS.unregister(this);
                                            }
                                        }.start(this.world, 5);
                                        MinecraftForge.EVENT_BUS.unregister(this);
                                    }
                                }.start(this.world, 5);
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }
                    }
                }
            }
        }
    }
}
