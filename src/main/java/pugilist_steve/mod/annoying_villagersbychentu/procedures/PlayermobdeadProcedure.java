package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber

public class PlayermobdeadProcedure {
    @SubscribeEvent
    public static void onEntityDeath(LivingDeathEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobdeadProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobdeadProcedure$2] */
    private static void execute(@Nullable Event event, LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity != null && ForgeRegistries.ENTITIES.getKey(entity.getType()).toString().equals("player_mobs:player_mob")) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobdeadProcedure.1
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
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.isClientSide()) {
                            ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(Items.IRON_SWORD));
                            entityToSpawn.setPickUpDelay(10);
                            _level.addFreshEntity(entityToSpawn);
                        }
                    }
                    Level level2 = this.world;
                    if (level2 instanceof Level) {
                        Level _level2 = level2;
                        if (!_level2.isClientSide()) {
                            ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(Items.WHITE_BED));
                            entityToSpawn2.setPickUpDelay(10);
                            _level2.addFreshEntity(entityToSpawn2);
                        }
                    }
                    Level level3 = this.world;
                    if (level3 instanceof Level) {
                        Level _level3 = level3;
                        if (!_level3.isClientSide()) {
                            ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                            entityToSpawn3.setPickUpDelay(10);
                            _level3.addFreshEntity(entityToSpawn3);
                        }
                    }
                    Level level4 = this.world;
                    if (level4 instanceof Level) {
                        Level _level4 = level4;
                        if (!_level4.isClientSide()) {
                            ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                            entityToSpawn4.setPickUpDelay(10);
                            _level4.addFreshEntity(entityToSpawn4);
                        }
                    }
                    Level level5 = this.world;
                    if (level5 instanceof Level) {
                        Level _level5 = level5;
                        if (!_level5.isClientSide()) {
                            ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                            entityToSpawn5.setPickUpDelay(10);
                            _level5.addFreshEntity(entityToSpawn5);
                        }
                    }
                    Level level6 = this.world;
                    if (level6 instanceof Level) {
                        Level _level6 = level6;
                        if (!_level6.isClientSide()) {
                            ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                            entityToSpawn6.setPickUpDelay(10);
                            _level6.addFreshEntity(entityToSpawn6);
                        }
                    }
                    Level level7 = this.world;
                    if (level7 instanceof Level) {
                        Level _level7 = level7;
                        if (!_level7.isClientSide()) {
                            ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Blocks.CRAFTING_TABLE));
                            entityToSpawn7.setPickUpDelay(10);
                            _level7.addFreshEntity(entityToSpawn7);
                        }
                    }
                    Level level8 = this.world;
                    if (level8 instanceof Level) {
                        Level _level8 = level8;
                        if (!_level8.isClientSide()) {
                            ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Items.BOW));
                            entityToSpawn8.setPickUpDelay(10);
                            _level8.addFreshEntity(entityToSpawn8);
                        }
                    }
                    Level level9 = this.world;
                    if (level9 instanceof Level) {
                        Level _level9 = level9;
                        if (!_level9.isClientSide()) {
                            ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                            entityToSpawn9.setPickUpDelay(10);
                            _level9.addFreshEntity(entityToSpawn9);
                        }
                    }
                    Level level10 = this.world;
                    if (level10 instanceof Level) {
                        Level _level10 = level10;
                        if (!_level10.isClientSide()) {
                            ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                            entityToSpawn10.setPickUpDelay(10);
                            _level10.addFreshEntity(entityToSpawn10);
                        }
                    }
                    Level level11 = this.world;
                    if (level11 instanceof Level) {
                        Level _level11 = level11;
                        if (!_level11.isClientSide()) {
                            ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                            entityToSpawn11.setPickUpDelay(10);
                            _level11.addFreshEntity(entityToSpawn11);
                        }
                    }
                    Level level12 = this.world;
                    if (level12 instanceof Level) {
                        Level _level12 = level12;
                        if (!_level12.isClientSide()) {
                            ItemEntity entityToSpawn12 = new ItemEntity(_level12, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                            entityToSpawn12.setPickUpDelay(10);
                            _level12.addFreshEntity(entityToSpawn12);
                        }
                    }
                    Level level13 = this.world;
                    if (level13 instanceof Level) {
                        Level _level13 = level13;
                        if (!_level13.isClientSide()) {
                            ItemEntity entityToSpawn13 = new ItemEntity(_level13, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                            entityToSpawn13.setPickUpDelay(10);
                            _level13.addFreshEntity(entityToSpawn13);
                        }
                    }
                    Level level14 = this.world;
                    if (level14 instanceof Level) {
                        Level _level14 = level14;
                        if (!_level14.isClientSide()) {
                            ItemEntity entityToSpawn14 = new ItemEntity(_level14, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                            entityToSpawn14.setPickUpDelay(10);
                            _level14.addFreshEntity(entityToSpawn14);
                        }
                    }
                    Level level15 = this.world;
                    if (level15 instanceof Level) {
                        Level _level15 = level15;
                        if (!_level15.isClientSide()) {
                            ItemEntity entityToSpawn15 = new ItemEntity(_level15, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                            entityToSpawn15.setPickUpDelay(10);
                            _level15.addFreshEntity(entityToSpawn15);
                        }
                    }
                    Level level16 = this.world;
                    if (level16 instanceof Level) {
                        Level _level16 = level16;
                        if (!_level16.isClientSide()) {
                            ItemEntity entityToSpawn16 = new ItemEntity(_level16, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                            entityToSpawn16.setPickUpDelay(10);
                            _level16.addFreshEntity(entityToSpawn16);
                        }
                    }
                    Level level17 = this.world;
                    if (level17 instanceof Level) {
                        Level _level17 = level17;
                        if (!_level17.isClientSide()) {
                            ItemEntity entityToSpawn17 = new ItemEntity(_level17, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                            entityToSpawn17.setPickUpDelay(10);
                            _level17.addFreshEntity(entityToSpawn17);
                        }
                    }
                    Level level18 = this.world;
                    if (level18 instanceof Level) {
                        Level _level18 = level18;
                        if (!_level18.isClientSide()) {
                            ItemEntity entityToSpawn18 = new ItemEntity(_level18, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                            entityToSpawn18.setPickUpDelay(10);
                            _level18.addFreshEntity(entityToSpawn18);
                        }
                    }
                    Level level19 = this.world;
                    if (level19 instanceof Level) {
                        Level _level19 = level19;
                        if (!_level19.isClientSide()) {
                            ItemEntity entityToSpawn19 = new ItemEntity(_level19, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                            entityToSpawn19.setPickUpDelay(10);
                            _level19.addFreshEntity(entityToSpawn19);
                        }
                    }
                    Level level20 = this.world;
                    if (level20 instanceof Level) {
                        Level _level20 = level20;
                        if (!_level20.isClientSide()) {
                            ItemEntity entityToSpawn20 = new ItemEntity(_level20, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                            entityToSpawn20.setPickUpDelay(10);
                            _level20.addFreshEntity(entityToSpawn20);
                        }
                    }
                    Level level21 = this.world;
                    if (level21 instanceof Level) {
                        Level _level21 = level21;
                        if (!_level21.isClientSide()) {
                            ItemEntity entityToSpawn21 = new ItemEntity(_level21, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                            entityToSpawn21.setPickUpDelay(10);
                            _level21.addFreshEntity(entityToSpawn21);
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 20);
            if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 25.0d, 25.0d, 25.0d), e -> {
                return true;
            }).isEmpty()) {
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayermobdeadProcedure.2
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
                        if (Math.random() <= 0.05d) {
                            Entity _ent = entity;
                            if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                                _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say damn!");
                            }
                        } else if (Math.random() <= 0.05d) {
                            Entity _ent2 = entity;
                            if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                                _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say I'll come back");
                            }
                        } else if (Math.random() <= 0.05d) {
                            Entity _ent3 = entity;
                            if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                                _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say wtf?");
                            }
                        } else if (Math.random() <= 0.05d) {
                            Entity _ent4 = entity;
                            if (!_ent4.level.isClientSide() && _ent4.getServer() != null) {
                                _ent4.getServer().getCommands().performCommand(_ent4.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say How?");
                            }
                        } else if (Math.random() <= 0.05d) {
                            Entity _ent5 = entity;
                            if (!_ent5.level.isClientSide() && _ent5.getServer() != null) {
                                _ent5.getServer().getCommands().performCommand(_ent5.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run say :(");
                            }
                        }
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, Mth.nextInt(new Random(), 40, 80));
            }
        }
    }
}
