package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class LuCunQiDangShiTiSiWangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiDangShiTiSiWangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v10, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiDangShiTiSiWangShiProcedure$2] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiDangShiTiSiWangShiProcedure.1
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
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(Items.APPLE));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
                Level level2 = this.world;
                if (level2 instanceof Level) {
                    Level _level2 = level2;
                    if (!_level2.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(Items.APPLE));
                        entityToSpawn2.setPickUpDelay(10);
                        _level2.addFreshEntity(entityToSpawn2);
                    }
                }
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level3 = level3;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(Items.BREAD));
                        entityToSpawn3.setPickUpDelay(10);
                        _level3.addFreshEntity(entityToSpawn3);
                    }
                }
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level4 = level4;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn4.setPickUpDelay(10);
                        _level4.addFreshEntity(entityToSpawn4);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level5 = level5;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn5.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn5);
                    }
                }
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level6 = level6;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn6.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn6);
                    }
                }
                Level level7 = this.world;
                if (level7 instanceof Level) {
                    Level _level7 = level7;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn7.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn7);
                    }
                }
                Level level8 = this.world;
                if (level8 instanceof Level) {
                    Level _level8 = level8;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn8.setPickUpDelay(10);
                        _level8.addFreshEntity(entityToSpawn8);
                    }
                }
                Level level9 = this.world;
                if (level9 instanceof Level) {
                    Level _level9 = level9;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn9.setPickUpDelay(10);
                        _level9.addFreshEntity(entityToSpawn9);
                    }
                }
                Level level10 = this.world;
                if (level10 instanceof Level) {
                    Level _level10 = level10;
                    if (!_level10.isClientSide()) {
                        ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CUNZHENTOUKUI.get()));
                        entityToSpawn10.setPickUpDelay(10);
                        _level10.addFreshEntity(entityToSpawn10);
                    }
                }
                Level level11 = this.world;
                if (level11 instanceof Level) {
                    Level _level11 = level11;
                    if (!_level11.isClientSide()) {
                        ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_SWORD));
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
                        ItemEntity entityToSpawn15 = new ItemEntity(_level15, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn15.setPickUpDelay(10);
                        _level15.addFreshEntity(entityToSpawn15);
                    }
                }
                Level level16 = this.world;
                if (level16 instanceof Level) {
                    Level _level16 = level16;
                    if (!_level16.isClientSide()) {
                        ItemEntity entityToSpawn16 = new ItemEntity(_level16, x, y + 1.0d, z, new ItemStack(Items.GOLD_INGOT));
                        entityToSpawn16.setPickUpDelay(10);
                        _level16.addFreshEntity(entityToSpawn16);
                    }
                }
                Level level17 = this.world;
                if (level17 instanceof Level) {
                    Level _level17 = level17;
                    if (!_level17.isClientSide()) {
                        ItemEntity entityToSpawn17 = new ItemEntity(_level17, x, y + 1.0d, z, new ItemStack(Items.GOLD_INGOT));
                        entityToSpawn17.setPickUpDelay(10);
                        _level17.addFreshEntity(entityToSpawn17);
                    }
                }
                Level level18 = this.world;
                if (level18 instanceof Level) {
                    Level _level18 = level18;
                    if (!_level18.isClientSide()) {
                        ItemEntity entityToSpawn18 = new ItemEntity(_level18, x, y + 1.0d, z, new ItemStack(Items.GOLD_INGOT));
                        entityToSpawn18.setPickUpDelay(10);
                        _level18.addFreshEntity(entityToSpawn18);
                    }
                }
                Level level19 = this.world;
                if (level19 instanceof Level) {
                    Level _level19 = level19;
                    if (!_level19.isClientSide()) {
                        ItemEntity entityToSpawn19 = new ItemEntity(_level19, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                        entityToSpawn19.setPickUpDelay(10);
                        _level19.addFreshEntity(entityToSpawn19);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        if (Math.random() <= 0.11d) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon firework_rocket ~ ~10 ~ {LifeTime:10,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:3,Colors:[0],Flicker:1}]}},display:{Name:\"Black Creeper Firework\"}}}");
            }
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<村民绿骑兵> 请求支援！"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LuCunQiDangShiTiSiWangShiProcedure.2
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
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<村民侦察兵> 援军到了！"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    Entity _ent = entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing ^ ^ ^10");
                    }
                    Entity _ent2 = entity;
                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing ^ ^ ^15");
                    }
                    Entity _ent3 = entity;
                    if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                        _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:lan_cun_qi ^10 ^ ^20");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 400);
        }
    }
}
