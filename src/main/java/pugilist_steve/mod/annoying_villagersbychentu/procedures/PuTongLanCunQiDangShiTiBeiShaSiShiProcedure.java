package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LanCunQiFuLuEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;


public class PuTongLanCunQiDangShiTiBeiShaSiShiProcedure {
    /* JADX WARN: Type inference failed for: r0v105, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PuTongLanCunQiDangShiTiBeiShaSiShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(Items.BREAD));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(Items.BREAD));
                entityToSpawn2.setPickUpDelay(10);
                _level2.addFreshEntity(entityToSpawn2);
            }
        }
        if (world instanceof Level _level3) {
            if (!_level3.isClientSide()) {
                ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(Items.BREAD));
                entityToSpawn3.setPickUpDelay(10);
                _level3.addFreshEntity(entityToSpawn3);
            }
        }
        if (world instanceof Level _level4) {
            if (!_level4.isClientSide()) {
                ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(Items.BREAD));
                entityToSpawn4.setPickUpDelay(10);
                _level4.addFreshEntity(entityToSpawn4);
            }
        }
        if (world instanceof Level _level5) {
            if (!_level5.isClientSide()) {
                ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y + 1.0d, z, new ItemStack(Items.WHITE_BED));
                entityToSpawn5.setPickUpDelay(10);
                _level5.addFreshEntity(entityToSpawn5);
            }
        }
        if (world instanceof Level _level6) {
            if (!_level6.isClientSide()) {
                ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_CARROT));
                entityToSpawn6.setPickUpDelay(10);
                _level6.addFreshEntity(entityToSpawn6);
            }
        }
        if (world instanceof Level _level7) {
            if (!_level7.isClientSide()) {
                ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_CARROT));
                entityToSpawn7.setPickUpDelay(10);
                _level7.addFreshEntity(entityToSpawn7);
            }
        }
        if (world instanceof Level _level8) {
            if (!_level8.isClientSide()) {
                ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Items.COOKIE));
                entityToSpawn8.setPickUpDelay(10);
                _level8.addFreshEntity(entityToSpawn8);
            }
        }
        if (world instanceof Level _level9) {
            if (!_level9.isClientSide()) {
                ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(Items.WATER_BUCKET));
                entityToSpawn9.setPickUpDelay(10);
                _level9.addFreshEntity(entityToSpawn9);
            }
        }
        if (world instanceof Level _level10) {
            if (!_level10.isClientSide()) {
                ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_SWORD));
                entityToSpawn10.setPickUpDelay(10);
                _level10.addFreshEntity(entityToSpawn10);
            }
        }
        if (world instanceof Level _level11) {
            if (!_level11.isClientSide()) {
                ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.WHEAT));
                entityToSpawn11.setPickUpDelay(10);
                _level11.addFreshEntity(entityToSpawn11);
            }
        }
        if (world instanceof Level _level12) {
            if (!_level12.isClientSide()) {
                ItemEntity entityToSpawn12 = new ItemEntity(_level12, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                entityToSpawn12.setPickUpDelay(10);
                _level12.addFreshEntity(entityToSpawn12);
            }
        }
        if (world instanceof Level _level13) {
            if (!_level13.isClientSide()) {
                ItemEntity entityToSpawn13 = new ItemEntity(_level13, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                entityToSpawn13.setPickUpDelay(10);
                _level13.addFreshEntity(entityToSpawn13);
            }
        }
        if (world instanceof Level _level14) {
            if (!_level14.isClientSide()) {
                ItemEntity entityToSpawn14 = new ItemEntity(_level14, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                entityToSpawn14.setPickUpDelay(10);
                _level14.addFreshEntity(entityToSpawn14);
            }
        }
        if (world instanceof Level _level15) {
            if (!_level15.isClientSide()) {
                ItemEntity entityToSpawn15 = new ItemEntity(_level15, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                entityToSpawn15.setPickUpDelay(10);
                _level15.addFreshEntity(entityToSpawn15);
            }
        }
        if (world instanceof Level _level16) {
            if (!_level16.isClientSide()) {
                ItemEntity entityToSpawn16 = new ItemEntity(_level16, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                entityToSpawn16.setPickUpDelay(10);
                _level16.addFreshEntity(entityToSpawn16);
            }
        }
        if (world instanceof Level _level17) {
            if (!_level17.isClientSide()) {
                ItemEntity entityToSpawn17 = new ItemEntity(_level17, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                entityToSpawn17.setPickUpDelay(10);
                _level17.addFreshEntity(entityToSpawn17);
            }
        }
        if (world instanceof Level _level18) {
            if (!_level18.isClientSide()) {
                ItemEntity entityToSpawn18 = new ItemEntity(_level18, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                entityToSpawn18.setPickUpDelay(10);
                _level18.addFreshEntity(entityToSpawn18);
            }
        }
        if (world instanceof Level _level19) {
            if (!_level19.isClientSide()) {
                ItemEntity entityToSpawn19 = new ItemEntity(_level19, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                entityToSpawn19.setPickUpDelay(10);
                _level19.addFreshEntity(entityToSpawn19);
            }
        }
        if (world instanceof Level _level20) {
            if (!_level20.isClientSide()) {
                ItemEntity entityToSpawn20 = new ItemEntity(_level20, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn20.setPickUpDelay(10);
                _level20.addFreshEntity(entityToSpawn20);
            }
        }
        if (world instanceof Level _level21) {
            if (!_level21.isClientSide()) {
                ItemEntity entityToSpawn21 = new ItemEntity(_level21, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn21.setPickUpDelay(10);
                _level21.addFreshEntity(entityToSpawn21);
            }
        }
        if (world instanceof Level _level22) {
            if (!_level22.isClientSide()) {
                ItemEntity entityToSpawn22 = new ItemEntity(_level22, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn22.setPickUpDelay(10);
                _level22.addFreshEntity(entityToSpawn22);
            }
        }
        if (world instanceof Level _level23) {
            if (!_level23.isClientSide()) {
                ItemEntity entityToSpawn23 = new ItemEntity(_level23, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn23.setPickUpDelay(10);
                _level23.addFreshEntity(entityToSpawn23);
            }
        }
        if (world instanceof Level _level24) {
            if (!_level24.isClientSide()) {
                ItemEntity entityToSpawn24 = new ItemEntity(_level24, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn24.setPickUpDelay(10);
                _level24.addFreshEntity(entityToSpawn24);
            }
        }
        if (world instanceof Level _level25) {
            if (!_level25.isClientSide()) {
                ItemEntity entityToSpawn25 = new ItemEntity(_level25, x, y + 1.0d, z, new ItemStack(Blocks.OAK_SIGN));
                entityToSpawn25.setPickUpDelay(10);
                _level25.addFreshEntity(entityToSpawn25);
            }
        }
        if (world instanceof Level _level26) {
            if (!_level26.isClientSide()) {
                ItemEntity entityToSpawn26 = new ItemEntity(_level26, x, y + 1.0d, z, new ItemStack(Items.SNOWBALL));
                entityToSpawn26.setPickUpDelay(10);
                _level26.addFreshEntity(entityToSpawn26);
            }
        }
        if (world instanceof Level _level27) {
            if (!_level27.isClientSide()) {
                ItemEntity entityToSpawn27 = new ItemEntity(_level27, x, y + 1.0d, z, new ItemStack(Items.SNOWBALL));
                entityToSpawn27.setPickUpDelay(10);
                _level27.addFreshEntity(entityToSpawn27);
            }
        }
        if (world instanceof Level _level28) {
            if (!_level28.isClientSide()) {
                ItemEntity entityToSpawn28 = new ItemEntity(_level28, x, y + 1.0d, z, new ItemStack(Items.IRON_PICKAXE));
                entityToSpawn28.setPickUpDelay(10);
                _level28.addFreshEntity(entityToSpawn28);
            }
        }
        if (world instanceof Level _level29) {
            if (!_level29.isClientSide()) {
                ItemEntity entityToSpawn29 = new ItemEntity(_level29, x, y + 1.0d, z, new ItemStack(Items.CARROT));
                entityToSpawn29.setPickUpDelay(10);
                _level29.addFreshEntity(entityToSpawn29);
            }
        }
        if (world instanceof Level _level30) {
            if (!_level30.isClientSide()) {
                ItemEntity entityToSpawn30 = new ItemEntity(_level30, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                entityToSpawn30.setPickUpDelay(10);
                _level30.addFreshEntity(entityToSpawn30);
            }
        }
        if (world instanceof Level _level31) {
            if (!_level31.isClientSide()) {
                ItemEntity entityToSpawn31 = new ItemEntity(_level31, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                entityToSpawn31.setPickUpDelay(10);
                _level31.addFreshEntity(entityToSpawn31);
            }
        }
        if (world instanceof Level _level32) {
            if (!_level32.isClientSide()) {
                ItemEntity entityToSpawn32 = new ItemEntity(_level32, x, y + 1.0d, z, new ItemStack(Items.APPLE));
                entityToSpawn32.setPickUpDelay(10);
                _level32.addFreshEntity(entityToSpawn32);
            }
        }
        if (world instanceof Level _level33) {
            if (!_level33.isClientSide()) {
                ItemEntity entityToSpawn33 = new ItemEntity(_level33, x, y + 1.0d, z, new ItemStack(Items.APPLE));
                entityToSpawn33.setPickUpDelay(10);
                _level33.addFreshEntity(entityToSpawn33);
            }
        }
        if (world instanceof Level _level34) {
            if (!_level34.isClientSide()) {
                ItemEntity entityToSpawn34 = new ItemEntity(_level34, x, y + 1.0d, z, new ItemStack(Items.APPLE));
                entityToSpawn34.setPickUpDelay(10);
                _level34.addFreshEntity(entityToSpawn34);
            }
        }
        if (world instanceof Level _level35) {
            if (!_level35.isClientSide()) {
                ItemEntity entityToSpawn35 = new ItemEntity(_level35, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                entityToSpawn35.setPickUpDelay(10);
                _level35.addFreshEntity(entityToSpawn35);
            }
        }
        if (world instanceof Level _level36) {
            if (!_level36.isClientSide()) {
                ItemEntity entityToSpawn36 = new ItemEntity(_level36, x, y + 1.0d, z, new ItemStack(Blocks.TNT));
                entityToSpawn36.setPickUpDelay(10);
                _level36.addFreshEntity(entityToSpawn36);
            }
        }
        if (world instanceof Level _level37) {
            if (!_level37.isClientSide()) {
                ItemEntity entityToSpawn37 = new ItemEntity(_level37, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                entityToSpawn37.setPickUpDelay(10);
                _level37.addFreshEntity(entityToSpawn37);
            }
        }
        if (world instanceof Level _level38) {
            if (!_level38.isClientSide()) {
                ItemEntity entityToSpawn38 = new ItemEntity(_level38, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                entityToSpawn38.setPickUpDelay(10);
                _level38.addFreshEntity(entityToSpawn38);
            }
        }
        if (world instanceof Level _level39) {
            if (!_level39.isClientSide()) {
                ItemEntity entityToSpawn39 = new ItemEntity(_level39, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                entityToSpawn39.setPickUpDelay(10);
                _level39.addFreshEntity(entityToSpawn39);
            }
        }
        if (world instanceof Level _level40) {
            if (!_level40.isClientSide()) {
                ItemEntity entityToSpawn40 = new ItemEntity(_level40, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                entityToSpawn40.setPickUpDelay(10);
                _level40.addFreshEntity(entityToSpawn40);
            }
        }
        if (world instanceof Level _level41) {
            if (!_level41.isClientSide()) {
                ItemEntity entityToSpawn41 = new ItemEntity(_level41, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                entityToSpawn41.setPickUpDelay(10);
                _level41.addFreshEntity(entityToSpawn41);
            }
        }
        if (world instanceof Level _level42) {
            if (!_level42.isClientSide()) {
                ItemEntity entityToSpawn42 = new ItemEntity(_level42, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                entityToSpawn42.setPickUpDelay(10);
                _level42.addFreshEntity(entityToSpawn42);
            }
        }
        if (world instanceof Level _level43) {
            if (!_level43.isClientSide()) {
                ItemEntity entityToSpawn43 = new ItemEntity(_level43, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                entityToSpawn43.setPickUpDelay(10);
                _level43.addFreshEntity(entityToSpawn43);
            }
        }
        if (world instanceof Level _level44) {
            if (!_level44.isClientSide()) {
                ItemEntity entityToSpawn44 = new ItemEntity(_level44, x, y + 1.0d, z, new ItemStack(Blocks.CHEST));
                entityToSpawn44.setPickUpDelay(10);
                _level44.addFreshEntity(entityToSpawn44);
            }
        }
        if (world instanceof Level _level45) {
            if (!_level45.isClientSide()) {
                ItemEntity entityToSpawn45 = new ItemEntity(_level45, x, y + 1.0d, z, new ItemStack(Blocks.BOOKSHELF));
                entityToSpawn45.setPickUpDelay(10);
                _level45.addFreshEntity(entityToSpawn45);
            }
        }
        if (world instanceof Level _level46) {
            if (!_level46.isClientSide()) {
                ItemEntity entityToSpawn46 = new ItemEntity(_level46, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                entityToSpawn46.setPickUpDelay(10);
                _level46.addFreshEntity(entityToSpawn46);
            }
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("<村民蓝骑兵> 至死效力于村民国王......"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        if (entity.isPassenger()) {
            if (world instanceof ServerLevel _level47) {
                Mob lanCunQiFuLuEntity = new LanCunQiFuLuEntity(AnnoyingVillagersbychentuModEntities.LAN_CUN_QI_FU_LU.get(), _level47);
                lanCunQiFuLuEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (lanCunQiFuLuEntity instanceof Mob) {
                    Mob _mobToSpawn = lanCunQiFuLuEntity;
                    _mobToSpawn.finalizeSpawn(_level47, world.getCurrentDifficultyAt(lanCunQiFuLuEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(lanCunQiFuLuEntity);
            }
            world.setBlock(new BlockPos(x, y - 1.0d, z), Blocks.SMITHING_TABLE.defaultBlockState(), 3);
        }
        if (Math.random() <= 0.11d) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon firework_rocket ~ ~10 ~ {LifeTime:10,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:3,Colors:[0],Flicker:1}]}},display:{Name:\"Black Creeper Firework\"}}}");
            }
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<村民蓝骑兵> 请求支援！"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PuTongLanCunQiDangShiTiBeiShaSiShiProcedure.1
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
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing_1 ^ ^ ^10");
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
