package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.CunMinZhenChaBingEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.GraveEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LanCunQiEntity;

import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber

public class NpcsayProcedure {
    @SubscribeEvent
    public static void onChat(ServerChatEvent event) {
        execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ());
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        execute(null, world, x, y, z);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure$6] */
    /* JADX WARN: Type inference failed for: r0v18, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v26, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure$7] */
    /* JADX WARN: Type inference failed for: r0v27, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure$2] */
    /* JADX WARN: Type inference failed for: r2v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure$5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure$1] */
    /* JADX WARN: Type inference failed for: r2v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure$3] */
    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15.0d), e -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.distanceToSqr(_center);
        })).collect(Collectors.toList());
        for (final Entity entityiterator : _entfound) {
            if (entityiterator == world.getEntitiesOfClass(CunMinZhenChaBingEntity.class, AABB.ofSize(new Vec3(x, y, z), 20.0d, 20.0d, 20.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd2 -> {
                        return _entcnd2.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null)) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure.2
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
                        Entity _ent = entityiterator;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say 附近有玩家");
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 20);
            } else if (entityiterator == world.getEntitiesOfClass(LanCunQiEntity.class, AABB.ofSize(new Vec3(x, y, z), 20.0d, 20.0d, 20.0d), e3 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure.3
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd2 -> {
                        return _entcnd2.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null)) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure.4
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
                        Entity _ent = entityiterator;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say 附近有玩家");
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 20);
            } else if (entityiterator == world.getEntitiesOfClass(GraveEntity.class, AABB.ofSize(new Vec3(x, y, z), 20.0d, 20.0d, 20.0d), e4 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure.5
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd2 -> {
                        return _entcnd2.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null)) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure.6
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
                        Entity _ent = entityiterator;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say :)");
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 20);
            }
            if (ForgeRegistries.ENTITIES.getKey(entityiterator.getType()).toString().equals("player_mobs:player_mob") && world.players().size() <= 22) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure.7
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

                    /* JADX WARN: Type inference failed for: r0v129, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure$7$1] */
                    private void run() {
                        if (Math.random() <= 0.07d) {
                            Entity _ent = entityiterator;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say e");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent2 = entityiterator;
                            if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say a");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent3 = entityiterator;
                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say 6");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent4 = entityiterator;
                            if (!_ent4.level.isClientSide() && _ent4.getServer() != null) {
                                _ent4.getServer().getCommands().performCommand(_ent4.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say :)");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent5 = entityiterator;
                            if (!_ent5.level.isClientSide() && _ent5.getServer() != null) {
                                _ent5.getServer().getCommands().performCommand(_ent5.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say can you？");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent6 = entityiterator;
                            if (!_ent6.level.isClientSide() && _ent6.getServer() != null) {
                                _ent6.getServer().getCommands().performCommand(_ent6.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say or PvP boss");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent7 = entityiterator;
                            if (!_ent7.level.isClientSide() && _ent7.getServer() != null) {
                                _ent7.getServer().getCommands().performCommand(_ent7.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say Who are you?");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent8 = entityiterator;
                            if (!_ent8.level.isClientSide() && _ent8.getServer() != null) {
                                _ent8.getServer().getCommands().performCommand(_ent8.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say damn");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent9 = entityiterator;
                            if (!_ent9.level.isClientSide() && _ent9.getServer() != null) {
                                _ent9.getServer().getCommands().performCommand(_ent9.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say lol");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent10 = entityiterator;
                            if (!_ent10.level.isClientSide() && _ent10.getServer() != null) {
                                _ent10.getServer().getCommands().performCommand(_ent10.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say PVP?");
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NpcsayProcedure.7.1
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
                                    Entity _ent11 = entityiterator;
                                    if (!_ent11.level.isClientSide() && _ent11.getServer() != null) {
                                        _ent11.getServer().getCommands().performCommand(_ent11.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say or PvP boss");
                                    }
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(this.world, Mth.nextInt(new Random(), 50, 80));
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent11 = entityiterator;
                            if (!_ent11.level.isClientSide() && _ent11.getServer() != null) {
                                _ent11.getServer().getCommands().performCommand(_ent11.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say hh");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent12 = entityiterator;
                            if (!_ent12.level.isClientSide() && _ent12.getServer() != null) {
                                _ent12.getServer().getCommands().performCommand(_ent12.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say huh?");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent13 = entityiterator;
                            if (!_ent13.level.isClientSide() && _ent13.getServer() != null) {
                                _ent13.getServer().getCommands().performCommand(_ent13.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say me?");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent14 = entityiterator;
                            if (!_ent14.level.isClientSide() && _ent14.getServer() != null) {
                                _ent14.getServer().getCommands().performCommand(_ent14.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say ohhh");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent15 = entityiterator;
                            if (!_ent15.level.isClientSide() && _ent15.getServer() != null) {
                                _ent15.getServer().getCommands().performCommand(_ent15.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say what the?");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent16 = entityiterator;
                            if (!_ent16.level.isClientSide() && _ent16.getServer() != null) {
                                _ent16.getServer().getCommands().performCommand(_ent16.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say no");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent17 = entityiterator;
                            if (!_ent17.level.isClientSide() && _ent17.getServer() != null) {
                                _ent17.getServer().getCommands().performCommand(_ent17.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say ?");
                            }
                        } else if (Math.random() <= 0.07d) {
                            Entity _ent18 = entityiterator;
                            if (!_ent18.level.isClientSide() && _ent18.getServer() != null) {
                                _ent18.getServer().getCommands().performCommand(_ent18.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say yep");
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, Mth.nextInt(new Random(), 25, 90));
            }
        }
    }
}
