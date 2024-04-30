package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber

public class BleedingProcedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingHurtEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getAmount());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, double amount) {
        execute(null, world, x, y, z, entity, amount);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BleedingProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, final Entity entity, double amount) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.BLEED.get(), (int) (amount), 1, false, false));
            }
        }
        if (ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("player_mobs:player_mob") && !world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 30.0d, 30.0d, 30.0d), e -> {
            return true;
        }).isEmpty()) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BleedingProcedure.1
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
                    if (Math.random() <= 0.03d) {
                        Entity _ent = entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say e");
                        }
                    } else if (Math.random() <= 0.03d) {
                        Entity _ent2 = entity;
                        if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                            _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say wtf?");
                        }
                    } else if (Math.random() <= 0.03d) {
                        Entity _ent3 = entity;
                        if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                            _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say huh");
                        }
                    } else if (Math.random() <= 0.03d) {
                        Entity _ent4 = entity;
                        if (!_ent4.level.isClientSide() && _ent4.getServer() != null) {
                            _ent4.getServer().getCommands().performCommand(_ent4.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say shit");
                        }
                    } else if (Math.random() <= 0.03d) {
                        Entity _ent5 = entity;
                        if (!_ent5.level.isClientSide() && _ent5.getServer() != null) {
                            _ent5.getServer().getCommands().performCommand(_ent5.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say damn");
                        }
                    } else if (Math.random() <= 0.01d) {
                        Entity _ent6 = entity;
                        if (!_ent6.level.isClientSide() && _ent6.getServer() != null) {
                            _ent6.getServer().getCommands().performCommand(_ent6.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say :(");
                        }
                    } else if (Math.random() <= 0.01d) {
                        Entity _ent7 = entity;
                        if (!_ent7.level.isClientSide() && _ent7.getServer() != null) {
                            _ent7.getServer().getCommands().performCommand(_ent7.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say lol");
                        }
                    } else if (Math.random() <= 0.01d) {
                        Entity _ent8 = entity;
                        if (!_ent8.level.isClientSide() && _ent8.getServer() != null) {
                            _ent8.getServer().getCommands().performCommand(_ent8.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say how?");
                        }
                    } else if (Math.random() <= 0.01d) {
                        Entity _ent9 = entity;
                        if (!_ent9.level.isClientSide() && _ent9.getServer() != null) {
                            _ent9.getServer().getCommands().performCommand(_ent9.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say Why?");
                        }
                    } else if (Math.random() <= 0.01d) {
                        Entity _ent10 = entity;
                        if (!_ent10.level.isClientSide() && _ent10.getServer() != null) {
                            _ent10.getServer().getCommands().performCommand(_ent10.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say What?");
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, Mth.nextInt(new Random(), 30, 70));
        }
    }
}
