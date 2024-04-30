package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;


public class NishidierjieDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v2, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NishidierjieDangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NishidierjieDangShiTiShouShangShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NishidierjieDangShiTiShouShangShiProcedure$3] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setSprinting(true);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NishidierjieDangShiTiShouShangShiProcedure.1
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
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NishidierjieDangShiTiShouShangShiProcedure.2
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
                if (Math.random() <= 0.01d) {
                    Entity _ent = entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:lightning_bolt ^ ^ ^");
                    }
                }
                if (Math.random() <= 0.01d) {
                    Entity _ent2 = entity;
                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:lightning_bolt ^ ^ ^2");
                    }
                }
                if (Math.random() <= 0.01d) {
                    Entity _ent3 = entity;
                    if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                        _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:lightning_bolt ^1 ^ ^1");
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        entity.setSprinting(true);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NishidierjieDangShiTiShouShangShiProcedure.3
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
        if (Math.random() > 0.6d || !(entity instanceof LivingEntity _entity)) {
            return;
        }
        if (!_entity.level.isClientSide()) {
            _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
        }
    }
}
