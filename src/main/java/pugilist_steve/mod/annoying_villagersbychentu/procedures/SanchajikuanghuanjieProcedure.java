package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
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
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class SanchajikuanghuanjieProcedure {
    /* JADX WARN: Type inference failed for: r0v12, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.SanchajikuanghuanjieProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.SanchajikuanghuanjieProcedure$2] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        if (world instanceof ServerLevel _level) {
            LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
            entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn.setVisualOnly(true);
            _level.addFreshEntity(entityToSpawn);
        }
        if (world instanceof ServerLevel _level2) {
            LightningBolt entityToSpawn2 = EntityType.LIGHTNING_BOLT.create(_level2);
            entityToSpawn2.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn2.setVisualOnly(true);
            _level2.addFreshEntity(entityToSpawn2);
        }
        if (world instanceof ServerLevel _level3) {
            LightningBolt entityToSpawn3 = EntityType.LIGHTNING_BOLT.create(_level3);
            entityToSpawn3.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn3.setVisualOnly(true);
            _level3.addFreshEntity(entityToSpawn3);
        }
        if (world instanceof ServerLevel _level4) {
            LightningBolt entityToSpawn4 = EntityType.LIGHTNING_BOLT.create(_level4);
            entityToSpawn4.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn4.setVisualOnly(true);
            _level4.addFreshEntity(entityToSpawn4);
        }
        if (world instanceof ServerLevel _level5) {
            LightningBolt entityToSpawn5 = EntityType.LIGHTNING_BOLT.create(_level5);
            entityToSpawn5.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn5.setVisualOnly(true);
            _level5.addFreshEntity(entityToSpawn5);
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> You win"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.SanchajikuanghuanjieProcedure.1
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
                    this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> you are winner......"), ChatType.SYSTEM, Util.NIL_UUID);
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 70);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.SanchajikuanghuanjieProcedure.2
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
                        ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.ZHAN_SHEN_ZHI_REN.get()));
                        entityToSpawn6.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn6);
                    }
                }
                Level level2 = this.world;
                if (level2 instanceof Level) {
                    Level _level7 = level2;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_CHESTPLATE));
                        entityToSpawn7.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn7);
                    }
                }
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level8 = level3;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Items.ENDER_EYE));
                        entityToSpawn8.setPickUpDelay(10);
                        _level8.addFreshEntity(entityToSpawn8);
                    }
                }
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level9 = level4;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(Items.ENDER_EYE));
                        entityToSpawn9.setPickUpDelay(10);
                        _level9.addFreshEntity(entityToSpawn9);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level10 = level5;
                    if (!_level10.isClientSide()) {
                        ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn10.setPickUpDelay(10);
                        _level10.addFreshEntity(entityToSpawn10);
                    }
                }
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level11 = level6;
                    if (!_level11.isClientSide()) {
                        ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.NETHER_STAR));
                        entityToSpawn11.setPickUpDelay(10);
                        _level11.addFreshEntity(entityToSpawn11);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
    }
}
