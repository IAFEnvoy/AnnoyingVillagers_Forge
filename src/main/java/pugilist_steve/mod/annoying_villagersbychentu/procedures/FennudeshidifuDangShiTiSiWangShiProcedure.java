package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.SteveDeadEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class FennudeshidifuDangShiTiSiWangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiSiWangShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"<Steve> 不！！\"}");
        }
        if (world instanceof ServerLevel _level) {
            Mob steveDeadEntity = new SteveDeadEntity(AnnoyingVillagersbychentuModEntities.STEVE_DEAD.get(), _level);
            steveDeadEntity.moveTo(x, y, z, 0.0f, 0.0f);
            steveDeadEntity.setYBodyRot(0.0f);
            steveDeadEntity.setYHeadRot(0.0f);
            if (steveDeadEntity instanceof Mob) {
                Mob _mobToSpawn = steveDeadEntity;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(steveDeadEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(steveDeadEntity);
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesayno")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesayno")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangShiTiSiWangShiProcedure.1
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
                    Level _level3 = level;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_SWORD));
                        entityToSpawn.setPickUpDelay(10);
                        _level3.addFreshEntity(entityToSpawn);
                    }
                }
                Level level2 = this.world;
                if (level2 instanceof Level) {
                    Level _level4 = level2;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn2.setPickUpDelay(10);
                        _level4.addFreshEntity(entityToSpawn2);
                    }
                }
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level5 = level3;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level5, x, y + 1.0d, z, new ItemStack(Items.WHEAT));
                        entityToSpawn3.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn3);
                    }
                }
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level6 = level4;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn4.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn4);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level7 = level5;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn5.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn5);
                    }
                }
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level8 = level6;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn6 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn6.setPickUpDelay(10);
                        _level8.addFreshEntity(entityToSpawn6);
                    }
                }
                Level level7 = this.world;
                if (level7 instanceof Level) {
                    Level _level9 = level7;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn7.setPickUpDelay(10);
                        _level9.addFreshEntity(entityToSpawn7);
                    }
                }
                Level level8 = this.world;
                if (level8 instanceof Level) {
                    Level _level10 = level8;
                    if (!_level10.isClientSide()) {
                        ItemEntity entityToSpawn8 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn8.setPickUpDelay(10);
                        _level10.addFreshEntity(entityToSpawn8);
                    }
                }
                Level level9 = this.world;
                if (level9 instanceof Level) {
                    Level _level11 = level9;
                    if (!_level11.isClientSide()) {
                        ItemEntity entityToSpawn9 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn9.setPickUpDelay(10);
                        _level11.addFreshEntity(entityToSpawn9);
                    }
                }
                Level level10 = this.world;
                if (level10 instanceof Level) {
                    Level _level12 = level10;
                    if (!_level12.isClientSide()) {
                        ItemEntity entityToSpawn10 = new ItemEntity(_level12, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn10.setPickUpDelay(10);
                        _level12.addFreshEntity(entityToSpawn10);
                    }
                }
                Level level11 = this.world;
                if (level11 instanceof Level) {
                    Level _level13 = level11;
                    if (!_level13.isClientSide()) {
                        ItemEntity entityToSpawn11 = new ItemEntity(_level13, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn11.setPickUpDelay(10);
                        _level13.addFreshEntity(entityToSpawn11);
                    }
                }
                Level level12 = this.world;
                if (level12 instanceof Level) {
                    Level _level14 = level12;
                    if (!_level14.isClientSide()) {
                        ItemEntity entityToSpawn12 = new ItemEntity(_level14, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn12.setPickUpDelay(10);
                        _level14.addFreshEntity(entityToSpawn12);
                    }
                }
                Level level13 = this.world;
                if (level13 instanceof Level) {
                    Level _level15 = level13;
                    if (!_level15.isClientSide()) {
                        ItemEntity entityToSpawn13 = new ItemEntity(_level15, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn13.setPickUpDelay(10);
                        _level15.addFreshEntity(entityToSpawn13);
                    }
                }
                Level level14 = this.world;
                if (level14 instanceof Level) {
                    Level _level16 = level14;
                    if (!_level16.isClientSide()) {
                        ItemEntity entityToSpawn14 = new ItemEntity(_level16, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn14.setPickUpDelay(10);
                        _level16.addFreshEntity(entityToSpawn14);
                    }
                }
                Level level15 = this.world;
                if (level15 instanceof Level) {
                    Level _level17 = level15;
                    if (!_level17.isClientSide()) {
                        ItemEntity entityToSpawn15 = new ItemEntity(_level17, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn15.setPickUpDelay(10);
                        _level17.addFreshEntity(entityToSpawn15);
                    }
                }
                Level level16 = this.world;
                if (level16 instanceof Level) {
                    Level _level18 = level16;
                    if (!_level18.isClientSide()) {
                        ItemEntity entityToSpawn16 = new ItemEntity(_level18, x, y + 1.0d, z, new ItemStack(Blocks.BIRCH_PLANKS));
                        entityToSpawn16.setPickUpDelay(10);
                        _level18.addFreshEntity(entityToSpawn16);
                    }
                }
                Level level17 = this.world;
                if (level17 instanceof Level) {
                    Level _level19 = level17;
                    if (!_level19.isClientSide()) {
                        ItemEntity entityToSpawn17 = new ItemEntity(_level19, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn17.setPickUpDelay(10);
                        _level19.addFreshEntity(entityToSpawn17);
                    }
                }
                Level level18 = this.world;
                if (level18 instanceof Level) {
                    Level _level20 = level18;
                    if (!_level20.isClientSide()) {
                        ItemEntity entityToSpawn18 = new ItemEntity(_level20, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn18.setPickUpDelay(10);
                        _level20.addFreshEntity(entityToSpawn18);
                    }
                }
                Level level19 = this.world;
                if (level19 instanceof Level) {
                    Level _level21 = level19;
                    if (!_level21.isClientSide()) {
                        ItemEntity entityToSpawn19 = new ItemEntity(_level21, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn19.setPickUpDelay(10);
                        _level21.addFreshEntity(entityToSpawn19);
                    }
                }
                Level level20 = this.world;
                if (level20 instanceof Level) {
                    Level _level22 = level20;
                    if (!_level22.isClientSide()) {
                        ItemEntity entityToSpawn20 = new ItemEntity(_level22, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn20.setPickUpDelay(10);
                        _level22.addFreshEntity(entityToSpawn20);
                    }
                }
                Level level21 = this.world;
                if (level21 instanceof Level) {
                    Level _level23 = level21;
                    if (!_level23.isClientSide()) {
                        ItemEntity entityToSpawn21 = new ItemEntity(_level23, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn21.setPickUpDelay(10);
                        _level23.addFreshEntity(entityToSpawn21);
                    }
                }
                Level level22 = this.world;
                if (level22 instanceof Level) {
                    Level _level24 = level22;
                    if (!_level24.isClientSide()) {
                        ItemEntity entityToSpawn22 = new ItemEntity(_level24, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn22.setPickUpDelay(10);
                        _level24.addFreshEntity(entityToSpawn22);
                    }
                }
                Level level23 = this.world;
                if (level23 instanceof Level) {
                    Level _level25 = level23;
                    if (!_level25.isClientSide()) {
                        ItemEntity entityToSpawn23 = new ItemEntity(_level25, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn23.setPickUpDelay(10);
                        _level25.addFreshEntity(entityToSpawn23);
                    }
                }
                Level level24 = this.world;
                if (level24 instanceof Level) {
                    Level _level26 = level24;
                    if (!_level26.isClientSide()) {
                        ItemEntity entityToSpawn24 = new ItemEntity(_level26, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn24.setPickUpDelay(10);
                        _level26.addFreshEntity(entityToSpawn24);
                    }
                }
                Level level25 = this.world;
                if (level25 instanceof Level) {
                    Level _level27 = level25;
                    if (!_level27.isClientSide()) {
                        ItemEntity entityToSpawn25 = new ItemEntity(_level27, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn25.setPickUpDelay(10);
                        _level27.addFreshEntity(entityToSpawn25);
                    }
                }
                Level level26 = this.world;
                if (level26 instanceof Level) {
                    Level _level28 = level26;
                    if (!_level28.isClientSide()) {
                        ItemEntity entityToSpawn26 = new ItemEntity(_level28, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn26.setPickUpDelay(10);
                        _level28.addFreshEntity(entityToSpawn26);
                    }
                }
                Level level27 = this.world;
                if (level27 instanceof Level) {
                    Level _level29 = level27;
                    if (!_level29.isClientSide()) {
                        ItemEntity entityToSpawn27 = new ItemEntity(_level29, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn27.setPickUpDelay(10);
                        _level29.addFreshEntity(entityToSpawn27);
                    }
                }
                Level level28 = this.world;
                if (level28 instanceof Level) {
                    Level _level30 = level28;
                    if (!_level30.isClientSide()) {
                        ItemEntity entityToSpawn28 = new ItemEntity(_level30, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn28.setPickUpDelay(10);
                        _level30.addFreshEntity(entityToSpawn28);
                    }
                }
                Level level29 = this.world;
                if (level29 instanceof Level) {
                    Level _level31 = level29;
                    if (!_level31.isClientSide()) {
                        ItemEntity entityToSpawn29 = new ItemEntity(_level31, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn29.setPickUpDelay(10);
                        _level31.addFreshEntity(entityToSpawn29);
                    }
                }
                Level level30 = this.world;
                if (level30 instanceof Level) {
                    Level _level32 = level30;
                    if (!_level32.isClientSide()) {
                        ItemEntity entityToSpawn30 = new ItemEntity(_level32, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn30.setPickUpDelay(10);
                        _level32.addFreshEntity(entityToSpawn30);
                    }
                }
                Level level31 = this.world;
                if (level31 instanceof Level) {
                    Level _level33 = level31;
                    if (!_level33.isClientSide()) {
                        ItemEntity entityToSpawn31 = new ItemEntity(_level33, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn31.setPickUpDelay(10);
                        _level33.addFreshEntity(entityToSpawn31);
                    }
                }
                Level level32 = this.world;
                if (level32 instanceof Level) {
                    Level _level34 = level32;
                    if (!_level34.isClientSide()) {
                        ItemEntity entityToSpawn32 = new ItemEntity(_level34, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.FUMOMUMEN.get()));
                        entityToSpawn32.setPickUpDelay(10);
                        _level34.addFreshEntity(entityToSpawn32);
                    }
                }
                Level level33 = this.world;
                if (level33 instanceof Level) {
                    Level _level35 = level33;
                    if (!_level35.isClientSide()) {
                        ItemEntity entityToSpawn33 = new ItemEntity(_level35, x, y + 1.0d, z, new ItemStack(Blocks.TNT));
                        entityToSpawn33.setPickUpDelay(10);
                        _level35.addFreshEntity(entityToSpawn33);
                    }
                }
                Level level34 = this.world;
                if (level34 instanceof Level) {
                    Level _level36 = level34;
                    if (!_level36.isClientSide()) {
                        ItemEntity entityToSpawn34 = new ItemEntity(_level36, x, y + 1.0d, z, new ItemStack(Blocks.TNT));
                        entityToSpawn34.setPickUpDelay(10);
                        _level36.addFreshEntity(entityToSpawn34);
                    }
                }
                Level level35 = this.world;
                if (level35 instanceof Level) {
                    Level _level37 = level35;
                    if (!_level37.isClientSide()) {
                        ItemEntity entityToSpawn35 = new ItemEntity(_level37, x, y + 1.0d, z, new ItemStack(Blocks.LADDER));
                        entityToSpawn35.setPickUpDelay(10);
                        _level37.addFreshEntity(entityToSpawn35);
                    }
                }
                Level level36 = this.world;
                if (level36 instanceof Level) {
                    Level _level38 = level36;
                    if (!_level38.isClientSide()) {
                        ItemEntity entityToSpawn36 = new ItemEntity(_level38, x, y + 1.0d, z, new ItemStack(Blocks.LADDER));
                        entityToSpawn36.setPickUpDelay(10);
                        _level38.addFreshEntity(entityToSpawn36);
                    }
                }
                Level level37 = this.world;
                if (level37 instanceof Level) {
                    Level _level39 = level37;
                    if (!_level39.isClientSide()) {
                        ItemEntity entityToSpawn37 = new ItemEntity(_level39, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn37.setPickUpDelay(10);
                        _level39.addFreshEntity(entityToSpawn37);
                    }
                }
                Level level38 = this.world;
                if (level38 instanceof Level) {
                    Level _level40 = level38;
                    if (!_level40.isClientSide()) {
                        ItemEntity entityToSpawn38 = new ItemEntity(_level40, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn38.setPickUpDelay(10);
                        _level40.addFreshEntity(entityToSpawn38);
                    }
                }
                Level level39 = this.world;
                if (level39 instanceof Level) {
                    Level _level41 = level39;
                    if (!_level41.isClientSide()) {
                        ItemEntity entityToSpawn39 = new ItemEntity(_level41, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn39.setPickUpDelay(10);
                        _level41.addFreshEntity(entityToSpawn39);
                    }
                }
                Level level40 = this.world;
                if (level40 instanceof Level) {
                    Level _level42 = level40;
                    if (!_level42.isClientSide()) {
                        ItemEntity entityToSpawn40 = new ItemEntity(_level42, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn40.setPickUpDelay(10);
                        _level42.addFreshEntity(entityToSpawn40);
                    }
                }
                Level level41 = this.world;
                if (level41 instanceof Level) {
                    Level _level43 = level41;
                    if (!_level43.isClientSide()) {
                        ItemEntity entityToSpawn41 = new ItemEntity(_level43, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn41.setPickUpDelay(10);
                        _level43.addFreshEntity(entityToSpawn41);
                    }
                }
                Level level42 = this.world;
                if (level42 instanceof Level) {
                    Level _level44 = level42;
                    if (!_level44.isClientSide()) {
                        ItemEntity entityToSpawn42 = new ItemEntity(_level44, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn42.setPickUpDelay(10);
                        _level44.addFreshEntity(entityToSpawn42);
                    }
                }
                Level level43 = this.world;
                if (level43 instanceof Level) {
                    Level _level45 = level43;
                    if (!_level45.isClientSide()) {
                        ItemEntity entityToSpawn43 = new ItemEntity(_level45, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn43.setPickUpDelay(10);
                        _level45.addFreshEntity(entityToSpawn43);
                    }
                }
                Level level44 = this.world;
                if (level44 instanceof Level) {
                    Level _level46 = level44;
                    if (!_level46.isClientSide()) {
                        ItemEntity entityToSpawn44 = new ItemEntity(_level46, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn44.setPickUpDelay(10);
                        _level46.addFreshEntity(entityToSpawn44);
                    }
                }
                Level level45 = this.world;
                if (level45 instanceof Level) {
                    Level _level47 = level45;
                    if (!_level47.isClientSide()) {
                        ItemEntity entityToSpawn45 = new ItemEntity(_level47, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn45.setPickUpDelay(10);
                        _level47.addFreshEntity(entityToSpawn45);
                    }
                }
                Level level46 = this.world;
                if (level46 instanceof Level) {
                    Level _level48 = level46;
                    if (!_level48.isClientSide()) {
                        ItemEntity entityToSpawn46 = new ItemEntity(_level48, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn46.setPickUpDelay(10);
                        _level48.addFreshEntity(entityToSpawn46);
                    }
                }
                Level level47 = this.world;
                if (level47 instanceof Level) {
                    Level _level49 = level47;
                    if (!_level49.isClientSide()) {
                        ItemEntity entityToSpawn47 = new ItemEntity(_level49, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_JU_JIAN.get()));
                        entityToSpawn47.setPickUpDelay(10);
                        _level49.addFreshEntity(entityToSpawn47);
                    }
                }
                Level level48 = this.world;
                if (level48 instanceof Level) {
                    Level _level50 = level48;
                    if (!_level50.isClientSide()) {
                        ItemEntity entityToSpawn48 = new ItemEntity(_level50, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_FU_MO_JIAN.get()));
                        entityToSpawn48.setPickUpDelay(10);
                        _level50.addFreshEntity(entityToSpawn48);
                    }
                }
                Level level49 = this.world;
                if (level49 instanceof Level) {
                    Level _level51 = level49;
                    if (!_level51.isClientSide()) {
                        ItemEntity entityToSpawn49 = new ItemEntity(_level51, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_CHESTPLATE));
                        entityToSpawn49.setPickUpDelay(10);
                        _level51.addFreshEntity(entityToSpawn49);
                    }
                }
                Level level50 = this.world;
                if (level50 instanceof Level) {
                    Level _level52 = level50;
                    if (!_level52.isClientSide()) {
                        ItemEntity entityToSpawn50 = new ItemEntity(_level52, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_CHESTPLATE));
                        entityToSpawn50.setPickUpDelay(10);
                        _level52.addFreshEntity(entityToSpawn50);
                    }
                }
                Level level51 = this.world;
                if (level51 instanceof Level) {
                    Level _level53 = level51;
                    if (!_level53.isClientSide()) {
                        ItemEntity entityToSpawn51 = new ItemEntity(_level53, x, y + 1.0d, z, new ItemStack(Blocks.DIAMOND_BLOCK));
                        entityToSpawn51.setPickUpDelay(10);
                        _level53.addFreshEntity(entityToSpawn51);
                    }
                }
                Level level52 = this.world;
                if (level52 instanceof Level) {
                    Level _level54 = level52;
                    if (!_level54.isClientSide()) {
                        ItemEntity entityToSpawn52 = new ItemEntity(_level54, x, y + 1.0d, z, new ItemStack(Items.WHITE_BED));
                        entityToSpawn52.setPickUpDelay(10);
                        _level54.addFreshEntity(entityToSpawn52);
                    }
                }
                Level level53 = this.world;
                if (level53 instanceof Level) {
                    Level _level55 = level53;
                    if (!_level55.isClientSide()) {
                        ItemEntity entityToSpawn53 = new ItemEntity(_level55, x, y + 1.0d, z, new ItemStack(Items.CAKE));
                        entityToSpawn53.setPickUpDelay(10);
                        _level55.addFreshEntity(entityToSpawn53);
                    }
                }
                Level level54 = this.world;
                if (level54 instanceof Level) {
                    Level _level56 = level54;
                    if (!_level56.isClientSide()) {
                        ItemEntity entityToSpawn54 = new ItemEntity(_level56, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn54.setPickUpDelay(10);
                        _level56.addFreshEntity(entityToSpawn54);
                    }
                }
                Level level55 = this.world;
                if (level55 instanceof Level) {
                    Level _level57 = level55;
                    if (!_level57.isClientSide()) {
                        ItemEntity entityToSpawn55 = new ItemEntity(_level57, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn55.setPickUpDelay(10);
                        _level57.addFreshEntity(entityToSpawn55);
                    }
                }
                Level level56 = this.world;
                if (level56 instanceof Level) {
                    Level _level58 = level56;
                    if (!_level58.isClientSide()) {
                        ItemEntity entityToSpawn56 = new ItemEntity(_level58, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn56.setPickUpDelay(10);
                        _level58.addFreshEntity(entityToSpawn56);
                    }
                }
                Level level57 = this.world;
                if (level57 instanceof Level) {
                    Level _level59 = level57;
                    if (!_level59.isClientSide()) {
                        ItemEntity entityToSpawn57 = new ItemEntity(_level59, x, y + 1.0d, z, new ItemStack(Items.WATER_BUCKET));
                        entityToSpawn57.setPickUpDelay(10);
                        _level59.addFreshEntity(entityToSpawn57);
                    }
                }
                Level level58 = this.world;
                if (level58 instanceof Level) {
                    Level _level60 = level58;
                    if (!_level60.isClientSide()) {
                        ItemEntity entityToSpawn58 = new ItemEntity(_level60, x, y + 1.0d, z, new ItemStack(Items.IRON_CHESTPLATE));
                        entityToSpawn58.setPickUpDelay(10);
                        _level60.addFreshEntity(entityToSpawn58);
                    }
                }
                Level level59 = this.world;
                if (level59 instanceof Level) {
                    Level _level61 = level59;
                    if (!_level61.isClientSide()) {
                        ItemEntity entityToSpawn59 = new ItemEntity(_level61, x, y + 1.0d, z, new ItemStack(Items.STICK));
                        entityToSpawn59.setPickUpDelay(10);
                        _level61.addFreshEntity(entityToSpawn59);
                    }
                }
                Level level60 = this.world;
                if (level60 instanceof Level) {
                    Level _level62 = level60;
                    if (!_level62.isClientSide()) {
                        ItemEntity entityToSpawn60 = new ItemEntity(_level62, x, y + 1.0d, z, new ItemStack(Items.STICK));
                        entityToSpawn60.setPickUpDelay(10);
                        _level62.addFreshEntity(entityToSpawn60);
                    }
                }
                Level level61 = this.world;
                if (level61 instanceof Level) {
                    Level _level63 = level61;
                    if (!_level63.isClientSide()) {
                        ItemEntity entityToSpawn61 = new ItemEntity(_level63, x, y + 1.0d, z, new ItemStack(Items.STICK));
                        entityToSpawn61.setPickUpDelay(10);
                        _level63.addFreshEntity(entityToSpawn61);
                    }
                }
                Level level62 = this.world;
                if (level62 instanceof Level) {
                    Level _level64 = level62;
                    if (!_level64.isClientSide()) {
                        ItemEntity entityToSpawn62 = new ItemEntity(_level64, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_PICKAXE));
                        entityToSpawn62.setPickUpDelay(10);
                        _level64.addFreshEntity(entityToSpawn62);
                    }
                }
                Level level63 = this.world;
                if (level63 instanceof Level) {
                    Level _level65 = level63;
                    if (!_level65.isClientSide()) {
                        ItemEntity entityToSpawn63 = new ItemEntity(_level65, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_PICKAXE));
                        entityToSpawn63.setPickUpDelay(10);
                        _level65.addFreshEntity(entityToSpawn63);
                    }
                }
                Level level64 = this.world;
                if (level64 instanceof Level) {
                    Level _level66 = level64;
                    if (!_level66.isClientSide()) {
                        ItemEntity entityToSpawn64 = new ItemEntity(_level66, x, y + 1.0d, z, new ItemStack(Items.IRON_SWORD));
                        entityToSpawn64.setPickUpDelay(10);
                        _level66.addFreshEntity(entityToSpawn64);
                    }
                }
                Level level65 = this.world;
                if (level65 instanceof Level) {
                    Level _level67 = level65;
                    if (!_level67.isClientSide()) {
                        ItemEntity entityToSpawn65 = new ItemEntity(_level67, x, y + 1.0d, z, new ItemStack(Items.IRON_SWORD));
                        entityToSpawn65.setPickUpDelay(10);
                        _level67.addFreshEntity(entityToSpawn65);
                    }
                }
                Level level66 = this.world;
                if (level66 instanceof Level) {
                    Level _level68 = level66;
                    if (!_level68.isClientSide()) {
                        ItemEntity entityToSpawn66 = new ItemEntity(_level68, x, y + 1.0d, z, new ItemStack(Items.COOKED_BEEF));
                        entityToSpawn66.setPickUpDelay(10);
                        _level68.addFreshEntity(entityToSpawn66);
                    }
                }
                Level level67 = this.world;
                if (level67 instanceof Level) {
                    Level _level69 = level67;
                    if (!_level69.isClientSide()) {
                        ItemEntity entityToSpawn67 = new ItemEntity(_level69, x, y + 1.0d, z, new ItemStack(Items.COOKED_BEEF));
                        entityToSpawn67.setPickUpDelay(10);
                        _level69.addFreshEntity(entityToSpawn67);
                    }
                }
                Level level68 = this.world;
                if (level68 instanceof Level) {
                    Level _level70 = level68;
                    if (!_level70.isClientSide()) {
                        ItemEntity entityToSpawn68 = new ItemEntity(_level70, x, y + 1.0d, z, new ItemStack(Items.COOKED_BEEF));
                        entityToSpawn68.setPickUpDelay(10);
                        _level70.addFreshEntity(entityToSpawn68);
                    }
                }
                Level level69 = this.world;
                if (level69 instanceof Level) {
                    Level _level71 = level69;
                    if (!_level71.isClientSide()) {
                        ItemEntity entityToSpawn69 = new ItemEntity(_level71, x, y + 1.0d, z, new ItemStack(Items.FISHING_ROD));
                        entityToSpawn69.setPickUpDelay(10);
                        _level71.addFreshEntity(entityToSpawn69);
                    }
                }
                Level level70 = this.world;
                if (level70 instanceof Level) {
                    Level _level72 = level70;
                    if (!_level72.isClientSide()) {
                        ItemEntity entityToSpawn70 = new ItemEntity(_level72, x, y + 1.0d, z, new ItemStack(Items.LIGHT_GRAY_DYE));
                        entityToSpawn70.setPickUpDelay(10);
                        _level72.addFreshEntity(entityToSpawn70);
                    }
                }
                Level level71 = this.world;
                if (level71 instanceof Level) {
                    Level _level73 = level71;
                    if (!_level73.isClientSide()) {
                        ItemEntity entityToSpawn71 = new ItemEntity(_level73, x, y + 1.0d, z, new ItemStack(Items.BIRCH_SIGN));
                        entityToSpawn71.setPickUpDelay(10);
                        _level73.addFreshEntity(entityToSpawn71);
                    }
                }
                Level level72 = this.world;
                if (level72 instanceof Level) {
                    Level _level74 = level72;
                    if (!_level74.isClientSide()) {
                        ItemEntity entityToSpawn72 = new ItemEntity(_level74, x, y + 1.0d, z, new ItemStack(Items.BIRCH_SIGN));
                        entityToSpawn72.setPickUpDelay(10);
                        _level74.addFreshEntity(entityToSpawn72);
                    }
                }
                Level level73 = this.world;
                if (level73 instanceof Level) {
                    Level _level75 = level73;
                    if (!_level75.isClientSide()) {
                        ItemEntity entityToSpawn73 = new ItemEntity(_level75, x, y + 1.0d, z, new ItemStack(Items.CARROT));
                        entityToSpawn73.setPickUpDelay(10);
                        _level75.addFreshEntity(entityToSpawn73);
                    }
                }
                Level level74 = this.world;
                if (level74 instanceof Level) {
                    Level _level76 = level74;
                    if (!_level76.isClientSide()) {
                        ItemEntity entityToSpawn74 = new ItemEntity(_level76, x, y + 1.0d, z, new ItemStack(Items.CARROT));
                        entityToSpawn74.setPickUpDelay(10);
                        _level76.addFreshEntity(entityToSpawn74);
                    }
                }
                Level level75 = this.world;
                if (level75 instanceof Level) {
                    Level _level77 = level75;
                    if (!_level77.isClientSide()) {
                        ItemEntity entityToSpawn75 = new ItemEntity(_level77, x, y + 1.0d, z, new ItemStack(Items.BAKED_POTATO));
                        entityToSpawn75.setPickUpDelay(10);
                        _level77.addFreshEntity(entityToSpawn75);
                    }
                }
                Level level76 = this.world;
                if (level76 instanceof Level) {
                    Level _level78 = level76;
                    if (!_level78.isClientSide()) {
                        ItemEntity entityToSpawn76 = new ItemEntity(_level78, x, y + 1.0d, z, new ItemStack(Items.BAKED_POTATO));
                        entityToSpawn76.setPickUpDelay(10);
                        _level78.addFreshEntity(entityToSpawn76);
                    }
                }
                Level level77 = this.world;
                if (level77 instanceof Level) {
                    Level _level79 = level77;
                    if (!_level79.isClientSide()) {
                        ItemEntity entityToSpawn77 = new ItemEntity(_level79, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn77.setPickUpDelay(10);
                        _level79.addFreshEntity(entityToSpawn77);
                    }
                }
                Level level78 = this.world;
                if (level78 instanceof Level) {
                    Level _level80 = level78;
                    if (!_level80.isClientSide()) {
                        ItemEntity entityToSpawn78 = new ItemEntity(_level80, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn78.setPickUpDelay(10);
                        _level80.addFreshEntity(entityToSpawn78);
                    }
                }
                Level level79 = this.world;
                if (level79 instanceof Level) {
                    Level _level81 = level79;
                    if (!_level81.isClientSide()) {
                        ItemEntity entityToSpawn79 = new ItemEntity(_level81, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn79.setPickUpDelay(10);
                        _level81.addFreshEntity(entityToSpawn79);
                    }
                }
                Level level80 = this.world;
                if (level80 instanceof Level) {
                    Level _level82 = level80;
                    if (!_level82.isClientSide()) {
                        ItemEntity entityToSpawn80 = new ItemEntity(_level82, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn80.setPickUpDelay(10);
                        _level82.addFreshEntity(entityToSpawn80);
                    }
                }
                Level level81 = this.world;
                if (level81 instanceof Level) {
                    Level _level83 = level81;
                    if (!_level83.isClientSide()) {
                        ItemEntity entityToSpawn81 = new ItemEntity(_level83, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn81.setPickUpDelay(10);
                        _level83.addFreshEntity(entityToSpawn81);
                    }
                }
                Level level82 = this.world;
                if (level82 instanceof Level) {
                    Level _level84 = level82;
                    if (!_level84.isClientSide()) {
                        ItemEntity entityToSpawn82 = new ItemEntity(_level84, x, y + 1.0d, z, new ItemStack(Blocks.DRAGON_EGG));
                        entityToSpawn82.setPickUpDelay(10);
                        _level84.addFreshEntity(entityToSpawn82);
                    }
                }
                Level level83 = this.world;
                if (level83 instanceof Level) {
                    Level _level85 = level83;
                    if (!_level85.isClientSide()) {
                        ItemEntity entityToSpawn83 = new ItemEntity(_level85, x, y + 1.0d, z, new ItemStack(Items.STICK));
                        entityToSpawn83.setPickUpDelay(10);
                        _level85.addFreshEntity(entityToSpawn83);
                    }
                }
                Level level84 = this.world;
                if (level84 instanceof Level) {
                    Level _level86 = level84;
                    if (!_level86.isClientSide()) {
                        ItemEntity entityToSpawn84 = new ItemEntity(_level86, x, y + 1.0d, z, new ItemStack(Items.STICK));
                        entityToSpawn84.setPickUpDelay(10);
                        _level86.addFreshEntity(entityToSpawn84);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
    }
}
