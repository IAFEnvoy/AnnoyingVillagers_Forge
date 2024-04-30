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


public class ShiTi303DangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ShiTi303DangShiTiShouShangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ShiTi303DangShiTiShouShangShiProcedure$2] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.2d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ShiTi303DangShiTiShouShangShiProcedure.1
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
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:shiti_303fenshen ^2 ^20 ^8");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 20);
        }
        entity.setSprinting(true);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ShiTi303DangShiTiShouShangShiProcedure.2
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
        if (Math.random() > 0.65d || !(entity instanceof LivingEntity _entity)) {
            return;
        }
        if (!_entity.level.isClientSide()) {
            _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
        }
    }
}
