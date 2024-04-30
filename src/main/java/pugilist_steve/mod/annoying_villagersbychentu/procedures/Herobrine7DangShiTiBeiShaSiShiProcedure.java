package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class Herobrine7DangShiTiBeiShaSiShiProcedure {
    /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine7DangShiTiBeiShaSiShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel _level) {
            LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
            entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn.setVisualOnly(true);
            _level.addFreshEntity(entityToSpawn);
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("分身已被摧毁，数据已传入终端"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon player_mobs:player_mob");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tp @r[gamemode=spectator] @s");
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine7DangShiTiBeiShaSiShiProcedure.1
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
                    Level _level2 = level;
                    if (!_level2.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                        entityToSpawn2.setPickUpDelay(10);
                        _level2.addFreshEntity(entityToSpawn2);
                    }
                }
                Level level2 = this.world;
                if (level2 instanceof Level) {
                    Level _level3 = level2;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                        entityToSpawn3.setPickUpDelay(10);
                        _level3.addFreshEntity(entityToSpawn3);
                    }
                }
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level4 = level3;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                        entityToSpawn4.setPickUpDelay(10);
                        _level4.addFreshEntity(entityToSpawn4);
                    }
                }
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level5 = level4;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                        entityToSpawn5.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn5);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level6 = level5;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(Items.ENDER_EYE));
                        entityToSpawn6.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn6);
                    }
                }
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level7 = level6;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Items.ENDER_EYE));
                        entityToSpawn7.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn7);
                    }
                }
                Level level7 = this.world;
                if (level7 instanceof Level) {
                    Level _level8 = level7;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Items.ENDER_EYE));
                        entityToSpawn8.setPickUpDelay(10);
                        _level8.addFreshEntity(entityToSpawn8);
                    }
                }
                Level level8 = this.world;
                if (level8 instanceof Level) {
                    Level _level9 = level8;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                        entityToSpawn9.setPickUpDelay(10);
                        _level9.addFreshEntity(entityToSpawn9);
                    }
                }
                Level level9 = this.world;
                if (level9 instanceof Level) {
                    Level _level10 = level9;
                    if (!_level10.isClientSide()) {
                        ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                        entityToSpawn10.setPickUpDelay(10);
                        _level10.addFreshEntity(entityToSpawn10);
                    }
                }
                Level level10 = this.world;
                if (level10 instanceof Level) {
                    Level _level11 = level10;
                    if (!_level11.isClientSide()) {
                        ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_BOOK));
                        entityToSpawn11.setPickUpDelay(10);
                        _level11.addFreshEntity(entityToSpawn11);
                    }
                }
                Level level11 = this.world;
                if (level11 instanceof Level) {
                    Level _level12 = level11;
                    if (!_level12.isClientSide()) {
                        ItemEntity entityToSpawn12 = new ItemEntity(_level12, x, y + 1.0d, z, new ItemStack(Items.COAL));
                        entityToSpawn12.setPickUpDelay(10);
                        _level12.addFreshEntity(entityToSpawn12);
                    }
                }
                Level level12 = this.world;
                if (level12 instanceof Level) {
                    Level _level13 = level12;
                    if (!_level13.isClientSide()) {
                        ItemEntity entityToSpawn13 = new ItemEntity(_level13, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIWUQI.get()));
                        entityToSpawn13.setPickUpDelay(10);
                        _level13.addFreshEntity(entityToSpawn13);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
    }
}
