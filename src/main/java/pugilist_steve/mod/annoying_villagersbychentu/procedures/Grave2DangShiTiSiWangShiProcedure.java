package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
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
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class Grave2DangShiTiSiWangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v0, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure$2] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure.1
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
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.BISHOU.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
                Level level2 = this.world;
                if (level2 instanceof Level) {
                    Level _level2 = level2;
                    if (!_level2.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.GRAVECUIRASS_CHESTPLATE.get()));
                        entityToSpawn2.setPickUpDelay(10);
                        _level2.addFreshEntity(entityToSpawn2);
                    }
                }
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level3 = level3;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_JIAN.get()));
                        entityToSpawn3.setPickUpDelay(10);
                        _level3.addFreshEntity(entityToSpawn3);
                    }
                }
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level4 = level4;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_JIAN.get()));
                        entityToSpawn4.setPickUpDelay(10);
                        _level4.addFreshEntity(entityToSpawn4);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level5 = level5;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.SHENG_QI_SHI_ZHI_JIAN.get()));
                        entityToSpawn5.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn5);
                    }
                }
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level6 = level6;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.SHENG_QI_SHI_ZHI_JIAN.get()));
                        entityToSpawn6.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn6);
                    }
                }
                Level level7 = this.world;
                if (level7 instanceof Level) {
                    Level _level7 = level7;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn7.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn7);
                    }
                }
                Level level8 = this.world;
                if (level8 instanceof Level) {
                    Level _level8 = level8;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn8.setPickUpDelay(10);
                        _level8.addFreshEntity(entityToSpawn8);
                    }
                }
                Level level9 = this.world;
                if (level9 instanceof Level) {
                    Level _level9 = level9;
                    if (!_level9.isClientSide()) {
                        ItemEntity entityToSpawn9 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn9.setPickUpDelay(10);
                        _level9.addFreshEntity(entityToSpawn9);
                    }
                }
                Level level10 = this.world;
                if (level10 instanceof Level) {
                    Level _level10 = level10;
                    if (!_level10.isClientSide()) {
                        ItemEntity entityToSpawn10 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_PICKAXE));
                        entityToSpawn10.setPickUpDelay(10);
                        _level10.addFreshEntity(entityToSpawn10);
                    }
                }
                Level level11 = this.world;
                if (level11 instanceof Level) {
                    Level _level11 = level11;
                    if (!_level11.isClientSide()) {
                        ItemEntity entityToSpawn11 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.BOW));
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
                        ItemEntity entityToSpawn16 = new ItemEntity(_level16, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn16.setPickUpDelay(10);
                        _level16.addFreshEntity(entityToSpawn16);
                    }
                }
                Level level17 = this.world;
                if (level17 instanceof Level) {
                    Level _level17 = level17;
                    if (!_level17.isClientSide()) {
                        ItemEntity entityToSpawn17 = new ItemEntity(_level17, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn17.setPickUpDelay(10);
                        _level17.addFreshEntity(entityToSpawn17);
                    }
                }
                Level level18 = this.world;
                if (level18 instanceof Level) {
                    Level _level18 = level18;
                    if (!_level18.isClientSide()) {
                        ItemEntity entityToSpawn18 = new ItemEntity(_level18, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn18.setPickUpDelay(10);
                        _level18.addFreshEntity(entityToSpawn18);
                    }
                }
                Level level19 = this.world;
                if (level19 instanceof Level) {
                    Level _level19 = level19;
                    if (!_level19.isClientSide()) {
                        ItemEntity entityToSpawn19 = new ItemEntity(_level19, x, y + 1.0d, z, new ItemStack(Items.POISONOUS_POTATO));
                        entityToSpawn19.setPickUpDelay(10);
                        _level19.addFreshEntity(entityToSpawn19);
                    }
                }
                Level level20 = this.world;
                if (level20 instanceof Level) {
                    Level _level20 = level20;
                    if (!_level20.isClientSide()) {
                        ItemEntity entityToSpawn20 = new ItemEntity(_level20, x, y + 1.0d, z, new ItemStack(Items.WHITE_BED));
                        entityToSpawn20.setPickUpDelay(10);
                        _level20.addFreshEntity(entityToSpawn20);
                    }
                }
                Level level21 = this.world;
                if (level21 instanceof Level) {
                    Level _level21 = level21;
                    if (!_level21.isClientSide()) {
                        ItemEntity entityToSpawn21 = new ItemEntity(_level21, x, y + 1.0d, z, new ItemStack(Items.CAKE));
                        entityToSpawn21.setPickUpDelay(10);
                        _level21.addFreshEntity(entityToSpawn21);
                    }
                }
                Level level22 = this.world;
                if (level22 instanceof Level) {
                    Level _level22 = level22;
                    if (!_level22.isClientSide()) {
                        ItemEntity entityToSpawn22 = new ItemEntity(_level22, x, y + 1.0d, z, new ItemStack(Items.WATER_BUCKET));
                        entityToSpawn22.setPickUpDelay(10);
                        _level22.addFreshEntity(entityToSpawn22);
                    }
                }
                Level level23 = this.world;
                if (level23 instanceof Level) {
                    Level _level23 = level23;
                    if (!_level23.isClientSide()) {
                        ItemEntity entityToSpawn23 = new ItemEntity(_level23, x, y + 1.0d, z, new ItemStack(Items.LAVA_BUCKET));
                        entityToSpawn23.setPickUpDelay(10);
                        _level23.addFreshEntity(entityToSpawn23);
                    }
                }
                Level level24 = this.world;
                if (level24 instanceof Level) {
                    Level _level24 = level24;
                    if (!_level24.isClientSide()) {
                        ItemEntity entityToSpawn24 = new ItemEntity(_level24, x, y + 1.0d, z, new ItemStack(Items.OAK_BOAT));
                        entityToSpawn24.setPickUpDelay(10);
                        _level24.addFreshEntity(entityToSpawn24);
                    }
                }
                Level level25 = this.world;
                if (level25 instanceof Level) {
                    Level _level25 = level25;
                    if (!_level25.isClientSide()) {
                        ItemEntity entityToSpawn25 = new ItemEntity(_level25, x, y + 1.0d, z, new ItemStack(Items.WRITABLE_BOOK));
                        entityToSpawn25.setPickUpDelay(10);
                        _level25.addFreshEntity(entityToSpawn25);
                    }
                }
                Level level26 = this.world;
                if (level26 instanceof Level) {
                    Level _level26 = level26;
                    if (!_level26.isClientSide()) {
                        ItemEntity entityToSpawn26 = new ItemEntity(_level26, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_SHOVEL));
                        entityToSpawn26.setPickUpDelay(10);
                        _level26.addFreshEntity(entityToSpawn26);
                    }
                }
                Level level27 = this.world;
                if (level27 instanceof Level) {
                    Level _level27 = level27;
                    if (!_level27.isClientSide()) {
                        ItemEntity entityToSpawn27 = new ItemEntity(_level27, x, y + 1.0d, z, new ItemStack(Items.FLINT_AND_STEEL));
                        entityToSpawn27.setPickUpDelay(10);
                        _level27.addFreshEntity(entityToSpawn27);
                    }
                }
                Level level28 = this.world;
                if (level28 instanceof Level) {
                    Level _level28 = level28;
                    if (!_level28.isClientSide()) {
                        ItemEntity entityToSpawn28 = new ItemEntity(_level28, x, y + 1.0d, z, new ItemStack(Blocks.TNT));
                        entityToSpawn28.setPickUpDelay(10);
                        _level28.addFreshEntity(entityToSpawn28);
                    }
                }
                Level level29 = this.world;
                if (level29 instanceof Level) {
                    Level _level29 = level29;
                    if (!_level29.isClientSide()) {
                        ItemEntity entityToSpawn29 = new ItemEntity(_level29, x, y + 1.0d, z, new ItemStack(Blocks.TNT));
                        entityToSpawn29.setPickUpDelay(10);
                        _level29.addFreshEntity(entityToSpawn29);
                    }
                }
                Level level30 = this.world;
                if (level30 instanceof Level) {
                    Level _level30 = level30;
                    if (!_level30.isClientSide()) {
                        ItemEntity entityToSpawn30 = new ItemEntity(_level30, x, y + 1.0d, z, new ItemStack(Blocks.TNT));
                        entityToSpawn30.setPickUpDelay(10);
                        _level30.addFreshEntity(entityToSpawn30);
                    }
                }
                Level level31 = this.world;
                if (level31 instanceof Level) {
                    Level _level31 = level31;
                    if (!_level31.isClientSide()) {
                        ItemEntity entityToSpawn31 = new ItemEntity(_level31, x, y + 1.0d, z, new ItemStack(Blocks.TNT));
                        entityToSpawn31.setPickUpDelay(10);
                        _level31.addFreshEntity(entityToSpawn31);
                    }
                }
                Level level32 = this.world;
                if (level32 instanceof Level) {
                    Level _level32 = level32;
                    if (!_level32.isClientSide()) {
                        ItemEntity entityToSpawn32 = new ItemEntity(_level32, x, y + 1.0d, z, new ItemStack(Blocks.TNT));
                        entityToSpawn32.setPickUpDelay(10);
                        _level32.addFreshEntity(entityToSpawn32);
                    }
                }
                Level level33 = this.world;
                if (level33 instanceof Level) {
                    Level _level33 = level33;
                    if (!_level33.isClientSide()) {
                        ItemEntity entityToSpawn33 = new ItemEntity(_level33, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn33.setPickUpDelay(10);
                        _level33.addFreshEntity(entityToSpawn33);
                    }
                }
                Level level34 = this.world;
                if (level34 instanceof Level) {
                    Level _level34 = level34;
                    if (!_level34.isClientSide()) {
                        ItemEntity entityToSpawn34 = new ItemEntity(_level34, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn34.setPickUpDelay(10);
                        _level34.addFreshEntity(entityToSpawn34);
                    }
                }
                Level level35 = this.world;
                if (level35 instanceof Level) {
                    Level _level35 = level35;
                    if (!_level35.isClientSide()) {
                        ItemEntity entityToSpawn35 = new ItemEntity(_level35, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn35.setPickUpDelay(10);
                        _level35.addFreshEntity(entityToSpawn35);
                    }
                }
                Level level36 = this.world;
                if (level36 instanceof Level) {
                    Level _level36 = level36;
                    if (!_level36.isClientSide()) {
                        ItemEntity entityToSpawn36 = new ItemEntity(_level36, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn36.setPickUpDelay(10);
                        _level36.addFreshEntity(entityToSpawn36);
                    }
                }
                Level level37 = this.world;
                if (level37 instanceof Level) {
                    Level _level37 = level37;
                    if (!_level37.isClientSide()) {
                        ItemEntity entityToSpawn37 = new ItemEntity(_level37, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn37.setPickUpDelay(10);
                        _level37.addFreshEntity(entityToSpawn37);
                    }
                }
                Level level38 = this.world;
                if (level38 instanceof Level) {
                    Level _level38 = level38;
                    if (!_level38.isClientSide()) {
                        ItemEntity entityToSpawn38 = new ItemEntity(_level38, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn38.setPickUpDelay(10);
                        _level38.addFreshEntity(entityToSpawn38);
                    }
                }
                Level level39 = this.world;
                if (level39 instanceof Level) {
                    Level _level39 = level39;
                    if (!_level39.isClientSide()) {
                        ItemEntity entityToSpawn39 = new ItemEntity(_level39, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                        entityToSpawn39.setPickUpDelay(10);
                        _level39.addFreshEntity(entityToSpawn39);
                    }
                }
                Level level40 = this.world;
                if (level40 instanceof Level) {
                    Level _level40 = level40;
                    if (!_level40.isClientSide()) {
                        ItemEntity entityToSpawn40 = new ItemEntity(_level40, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                        entityToSpawn40.setPickUpDelay(10);
                        _level40.addFreshEntity(entityToSpawn40);
                    }
                }
                Level level41 = this.world;
                if (level41 instanceof Level) {
                    Level _level41 = level41;
                    if (!_level41.isClientSide()) {
                        ItemEntity entityToSpawn41 = new ItemEntity(_level41, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                        entityToSpawn41.setPickUpDelay(10);
                        _level41.addFreshEntity(entityToSpawn41);
                    }
                }
                Level level42 = this.world;
                if (level42 instanceof Level) {
                    Level _level42 = level42;
                    if (!_level42.isClientSide()) {
                        ItemEntity entityToSpawn42 = new ItemEntity(_level42, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                        entityToSpawn42.setPickUpDelay(10);
                        _level42.addFreshEntity(entityToSpawn42);
                    }
                }
                Level level43 = this.world;
                if (level43 instanceof Level) {
                    Level _level43 = level43;
                    if (!_level43.isClientSide()) {
                        ItemEntity entityToSpawn43 = new ItemEntity(_level43, x, y + 1.0d, z, new ItemStack(Blocks.OAK_PLANKS));
                        entityToSpawn43.setPickUpDelay(10);
                        _level43.addFreshEntity(entityToSpawn43);
                    }
                }
                Level level44 = this.world;
                if (level44 instanceof Level) {
                    Level _level44 = level44;
                    if (!_level44.isClientSide()) {
                        ItemEntity entityToSpawn44 = new ItemEntity(_level44, x, y + 1.0d, z, new ItemStack(Items.POTATO));
                        entityToSpawn44.setPickUpDelay(10);
                        _level44.addFreshEntity(entityToSpawn44);
                    }
                }
                Level level45 = this.world;
                if (level45 instanceof Level) {
                    Level _level45 = level45;
                    if (!_level45.isClientSide()) {
                        ItemEntity entityToSpawn45 = new ItemEntity(_level45, x, y + 1.0d, z, new ItemStack(Items.GOLD_INGOT));
                        entityToSpawn45.setPickUpDelay(10);
                        _level45.addFreshEntity(entityToSpawn45);
                    }
                }
                Level level46 = this.world;
                if (level46 instanceof Level) {
                    Level _level46 = level46;
                    if (!_level46.isClientSide()) {
                        ItemEntity entityToSpawn46 = new ItemEntity(_level46, x, y + 1.0d, z, new ItemStack(Items.GOLD_INGOT));
                        entityToSpawn46.setPickUpDelay(10);
                        _level46.addFreshEntity(entityToSpawn46);
                    }
                }
                Level level47 = this.world;
                if (level47 instanceof Level) {
                    Level _level47 = level47;
                    if (!_level47.isClientSide()) {
                        ItemEntity entityToSpawn47 = new ItemEntity(_level47, x, y + 1.0d, z, new ItemStack(Blocks.ANVIL));
                        entityToSpawn47.setPickUpDelay(10);
                        _level47.addFreshEntity(entityToSpawn47);
                    }
                }
                Level level48 = this.world;
                if (level48 instanceof Level) {
                    Level _level48 = level48;
                    if (!_level48.isClientSide()) {
                        ItemEntity entityToSpawn48 = new ItemEntity(_level48, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn48.setPickUpDelay(10);
                        _level48.addFreshEntity(entityToSpawn48);
                    }
                }
                Level level49 = this.world;
                if (level49 instanceof Level) {
                    Level _level49 = level49;
                    if (!_level49.isClientSide()) {
                        ItemEntity entityToSpawn49 = new ItemEntity(_level49, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn49.setPickUpDelay(10);
                        _level49.addFreshEntity(entityToSpawn49);
                    }
                }
                Level level50 = this.world;
                if (level50 instanceof Level) {
                    Level _level50 = level50;
                    if (!_level50.isClientSide()) {
                        ItemEntity entityToSpawn50 = new ItemEntity(_level50, x, y + 1.0d, z, new ItemStack(Blocks.DIRT));
                        entityToSpawn50.setPickUpDelay(10);
                        _level50.addFreshEntity(entityToSpawn50);
                    }
                }
                Level level51 = this.world;
                if (level51 instanceof Level) {
                    Level _level51 = level51;
                    if (!_level51.isClientSide()) {
                        ItemEntity entityToSpawn51 = new ItemEntity(_level51, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn51.setPickUpDelay(10);
                        _level51.addFreshEntity(entityToSpawn51);
                    }
                }
                Level level52 = this.world;
                if (level52 instanceof Level) {
                    Level _level52 = level52;
                    if (!_level52.isClientSide()) {
                        ItemEntity entityToSpawn52 = new ItemEntity(_level52, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn52.setPickUpDelay(10);
                        _level52.addFreshEntity(entityToSpawn52);
                    }
                }
                Level level53 = this.world;
                if (level53 instanceof Level) {
                    Level _level53 = level53;
                    if (!_level53.isClientSide()) {
                        ItemEntity entityToSpawn53 = new ItemEntity(_level53, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn53.setPickUpDelay(10);
                        _level53.addFreshEntity(entityToSpawn53);
                    }
                }
                Level level54 = this.world;
                if (level54 instanceof Level) {
                    Level _level54 = level54;
                    if (!_level54.isClientSide()) {
                        ItemEntity entityToSpawn54 = new ItemEntity(_level54, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn54.setPickUpDelay(10);
                        _level54.addFreshEntity(entityToSpawn54);
                    }
                }
                Level level55 = this.world;
                if (level55 instanceof Level) {
                    Level _level55 = level55;
                    if (!_level55.isClientSide()) {
                        ItemEntity entityToSpawn55 = new ItemEntity(_level55, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
                        entityToSpawn55.setPickUpDelay(10);
                        _level55.addFreshEntity(entityToSpawn55);
                    }
                }
                Level level56 = this.world;
                if (level56 instanceof Level) {
                    Level _level56 = level56;
                    if (!_level56.isClientSide()) {
                        ItemEntity entityToSpawn56 = new ItemEntity(_level56, x, y + 1.0d, z, new ItemStack(Blocks.COBBLESTONE));
                        entityToSpawn56.setPickUpDelay(10);
                        _level56.addFreshEntity(entityToSpawn56);
                    }
                }
                Level level57 = this.world;
                if (level57 instanceof Level) {
                    Level _level57 = level57;
                    if (!_level57.isClientSide()) {
                        ItemEntity entityToSpawn57 = new ItemEntity(_level57, x, y + 1.0d, z, new ItemStack(Blocks.COBBLESTONE));
                        entityToSpawn57.setPickUpDelay(10);
                        _level57.addFreshEntity(entityToSpawn57);
                    }
                }
                Level level58 = this.world;
                if (level58 instanceof Level) {
                    Level _level58 = level58;
                    if (!_level58.isClientSide()) {
                        ItemEntity entityToSpawn58 = new ItemEntity(_level58, x, y + 1.0d, z, new ItemStack(Blocks.COBBLESTONE));
                        entityToSpawn58.setPickUpDelay(10);
                        _level58.addFreshEntity(entityToSpawn58);
                    }
                }
                Level level59 = this.world;
                if (level59 instanceof Level) {
                    Level _level59 = level59;
                    if (!_level59.isClientSide()) {
                        ItemEntity entityToSpawn59 = new ItemEntity(_level59, x, y + 1.0d, z, new ItemStack(Blocks.COBBLESTONE));
                        entityToSpawn59.setPickUpDelay(10);
                        _level59.addFreshEntity(entityToSpawn59);
                    }
                }
                Level level60 = this.world;
                if (level60 instanceof Level) {
                    Level _level60 = level60;
                    if (!_level60.isClientSide()) {
                        ItemEntity entityToSpawn60 = new ItemEntity(_level60, x, y + 1.0d, z, new ItemStack(Items.BRICK));
                        entityToSpawn60.setPickUpDelay(10);
                        _level60.addFreshEntity(entityToSpawn60);
                    }
                }
                Level level61 = this.world;
                if (level61 instanceof Level) {
                    Level _level61 = level61;
                    if (!_level61.isClientSide()) {
                        ItemEntity entityToSpawn61 = new ItemEntity(_level61, x, y + 1.0d, z, new ItemStack(Items.PUMPKIN_PIE));
                        entityToSpawn61.setPickUpDelay(10);
                        _level61.addFreshEntity(entityToSpawn61);
                    }
                }
                Level level62 = this.world;
                if (level62 instanceof Level) {
                    Level _level62 = level62;
                    if (!_level62.isClientSide()) {
                        ItemEntity entityToSpawn62 = new ItemEntity(_level62, x, y + 1.0d, z, new ItemStack(Items.PUMPKIN_PIE));
                        entityToSpawn62.setPickUpDelay(10);
                        _level62.addFreshEntity(entityToSpawn62);
                    }
                }
                Level level63 = this.world;
                if (level63 instanceof Level) {
                    Level _level63 = level63;
                    if (!_level63.isClientSide()) {
                        ItemEntity entityToSpawn63 = new ItemEntity(_level63, x, y + 1.0d, z, new ItemStack(Items.PUMPKIN_PIE));
                        entityToSpawn63.setPickUpDelay(10);
                        _level63.addFreshEntity(entityToSpawn63);
                    }
                }
                Level level64 = this.world;
                if (level64 instanceof Level) {
                    Level _level64 = level64;
                    if (!_level64.isClientSide()) {
                        ItemEntity entityToSpawn64 = new ItemEntity(_level64, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_BOOTS));
                        entityToSpawn64.setPickUpDelay(10);
                        _level64.addFreshEntity(entityToSpawn64);
                    }
                }
                Level level65 = this.world;
                if (level65 instanceof Level) {
                    Level _level65 = level65;
                    if (!_level65.isClientSide()) {
                        ItemEntity entityToSpawn65 = new ItemEntity(_level65, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_SWORD));
                        entityToSpawn65.setPickUpDelay(10);
                        _level65.addFreshEntity(entityToSpawn65);
                    }
                }
                Level level66 = this.world;
                if (level66 instanceof Level) {
                    Level _level66 = level66;
                    if (!_level66.isClientSide()) {
                        ItemEntity entityToSpawn66 = new ItemEntity(_level66, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_JIAN.get()));
                        entityToSpawn66.setPickUpDelay(10);
                        _level66.addFreshEntity(entityToSpawn66);
                    }
                }
                Level level67 = this.world;
                if (level67 instanceof Level) {
                    Level _level67 = level67;
                    if (!_level67.isClientSide()) {
                        ItemEntity entityToSpawn67 = new ItemEntity(_level67, x, y + 1.0d, z, new ItemStack(Items.SHIELD));
                        entityToSpawn67.setPickUpDelay(10);
                        _level67.addFreshEntity(entityToSpawn67);
                    }
                }
                Level level68 = this.world;
                if (level68 instanceof Level) {
                    Level _level68 = level68;
                    if (!_level68.isClientSide()) {
                        ItemEntity entityToSpawn68 = new ItemEntity(_level68, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn68.setPickUpDelay(10);
                        _level68.addFreshEntity(entityToSpawn68);
                    }
                }
                Level level69 = this.world;
                if (level69 instanceof Level) {
                    Level _level69 = level69;
                    if (!_level69.isClientSide()) {
                        ItemEntity entityToSpawn69 = new ItemEntity(_level69, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.LLBSTZ_CHESTPLATE.get()));
                        entityToSpawn69.setPickUpDelay(10);
                        _level69.addFreshEntity(entityToSpawn69);
                    }
                }
                Level level70 = this.world;
                if (level70 instanceof Level) {
                    Level _level70 = level70;
                    if (!_level70.isClientSide()) {
                        ItemEntity entityToSpawn70 = new ItemEntity(_level70, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn70.setPickUpDelay(10);
                        _level70.addFreshEntity(entityToSpawn70);
                    }
                }
                Level level71 = this.world;
                if (level71 instanceof Level) {
                    Level _level71 = level71;
                    if (!_level71.isClientSide()) {
                        ItemEntity entityToSpawn71 = new ItemEntity(_level71, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn71.setPickUpDelay(10);
                        _level71.addFreshEntity(entityToSpawn71);
                    }
                }
                Level level72 = this.world;
                if (level72 instanceof Level) {
                    Level _level72 = level72;
                    if (!_level72.isClientSide()) {
                        ItemEntity entityToSpawn72 = new ItemEntity(_level72, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn72.setPickUpDelay(10);
                        _level72.addFreshEntity(entityToSpawn72);
                    }
                }
                Level level73 = this.world;
                if (level73 instanceof Level) {
                    Level _level73 = level73;
                    if (!_level73.isClientSide()) {
                        ItemEntity entityToSpawn73 = new ItemEntity(_level73, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn73.setPickUpDelay(10);
                        _level73.addFreshEntity(entityToSpawn73);
                    }
                }
                Level level74 = this.world;
                if (level74 instanceof Level) {
                    Level _level74 = level74;
                    if (!_level74.isClientSide()) {
                        ItemEntity entityToSpawn74 = new ItemEntity(_level74, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn74.setPickUpDelay(10);
                        _level74.addFreshEntity(entityToSpawn74);
                    }
                }
                Level level75 = this.world;
                if (level75 instanceof Level) {
                    Level _level75 = level75;
                    if (!_level75.isClientSide()) {
                        ItemEntity entityToSpawn75 = new ItemEntity(_level75, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn75.setPickUpDelay(10);
                        _level75.addFreshEntity(entityToSpawn75);
                    }
                }
                Level level76 = this.world;
                if (level76 instanceof Level) {
                    Level _level76 = level76;
                    if (!_level76.isClientSide()) {
                        ItemEntity entityToSpawn76 = new ItemEntity(_level76, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn76.setPickUpDelay(10);
                        _level76.addFreshEntity(entityToSpawn76);
                    }
                }
                Level level77 = this.world;
                if (level77 instanceof Level) {
                    Level _level77 = level77;
                    if (!_level77.isClientSide()) {
                        ItemEntity entityToSpawn77 = new ItemEntity(_level77, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn77.setPickUpDelay(10);
                        _level77.addFreshEntity(entityToSpawn77);
                    }
                }
                Level level78 = this.world;
                if (level78 instanceof Level) {
                    Level _level78 = level78;
                    if (!_level78.isClientSide()) {
                        ItemEntity entityToSpawn78 = new ItemEntity(_level78, x, y + 1.0d, z, new ItemStack(Blocks.CRAFTING_TABLE));
                        entityToSpawn78.setPickUpDelay(10);
                        _level78.addFreshEntity(entityToSpawn78);
                    }
                }
                Level level79 = this.world;
                if (level79 instanceof Level) {
                    Level _level79 = level79;
                    if (!_level79.isClientSide()) {
                        ItemEntity entityToSpawn79 = new ItemEntity(_level79, x, y + 1.0d, z, new ItemStack(Blocks.CRAFTING_TABLE));
                        entityToSpawn79.setPickUpDelay(10);
                        _level79.addFreshEntity(entityToSpawn79);
                    }
                }
                Level level80 = this.world;
                if (level80 instanceof Level) {
                    Level _level80 = level80;
                    if (!_level80.isClientSide()) {
                        ItemEntity entityToSpawn80 = new ItemEntity(_level80, x, y + 1.0d, z, new ItemStack(Items.MELON_SLICE));
                        entityToSpawn80.setPickUpDelay(10);
                        _level80.addFreshEntity(entityToSpawn80);
                    }
                }
                Level level81 = this.world;
                if (level81 instanceof Level) {
                    Level _level81 = level81;
                    if (!_level81.isClientSide()) {
                        ItemEntity entityToSpawn81 = new ItemEntity(_level81, x, y + 1.0d, z, new ItemStack(Items.MELON_SLICE));
                        entityToSpawn81.setPickUpDelay(10);
                        _level81.addFreshEntity(entityToSpawn81);
                    }
                }
                Level level82 = this.world;
                if (level82 instanceof Level) {
                    Level _level82 = level82;
                    if (!_level82.isClientSide()) {
                        ItemEntity entityToSpawn82 = new ItemEntity(_level82, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_CHESTPLATE.get()));
                        entityToSpawn82.setPickUpDelay(10);
                        _level82.addFreshEntity(entityToSpawn82);
                    }
                }
                Level level83 = this.world;
                if (level83 instanceof Level) {
                    Level _level83 = level83;
                    if (!_level83.isClientSide()) {
                        ItemEntity entityToSpawn83 = new ItemEntity(_level83, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_CHESTPLATE));
                        entityToSpawn83.setPickUpDelay(10);
                        _level83.addFreshEntity(entityToSpawn83);
                    }
                }
                Level level84 = this.world;
                if (level84 instanceof Level) {
                    Level _level84 = level84;
                    if (!_level84.isClientSide()) {
                        ItemEntity entityToSpawn84 = new ItemEntity(_level84, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_CHESTPLATE));
                        entityToSpawn84.setPickUpDelay(10);
                        _level84.addFreshEntity(entityToSpawn84);
                    }
                }
                Level level85 = this.world;
                if (level85 instanceof Level) {
                    Level _level85 = level85;
                    if (!_level85.isClientSide()) {
                        ItemEntity entityToSpawn85 = new ItemEntity(_level85, x, y + 1.0d, z, new ItemStack(Blocks.CRAFTING_TABLE));
                        entityToSpawn85.setPickUpDelay(10);
                        _level85.addFreshEntity(entityToSpawn85);
                    }
                }
                Level level86 = this.world;
                if (level86 instanceof Level) {
                    Level _level86 = level86;
                    if (!_level86.isClientSide()) {
                        ItemEntity entityToSpawn86 = new ItemEntity(_level86, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn86.setPickUpDelay(10);
                        _level86.addFreshEntity(entityToSpawn86);
                    }
                }
                Level level87 = this.world;
                if (level87 instanceof Level) {
                    Level _level87 = level87;
                    if (!_level87.isClientSide()) {
                        ItemEntity entityToSpawn87 = new ItemEntity(_level87, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn87.setPickUpDelay(10);
                        _level87.addFreshEntity(entityToSpawn87);
                    }
                }
                Level level88 = this.world;
                if (level88 instanceof Level) {
                    Level _level88 = level88;
                    if (!_level88.isClientSide()) {
                        ItemEntity entityToSpawn88 = new ItemEntity(_level88, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn88.setPickUpDelay(10);
                        _level88.addFreshEntity(entityToSpawn88);
                    }
                }
                Level level89 = this.world;
                if (level89 instanceof Level) {
                    Level _level89 = level89;
                    if (!_level89.isClientSide()) {
                        ItemEntity entityToSpawn89 = new ItemEntity(_level89, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn89.setPickUpDelay(10);
                        _level89.addFreshEntity(entityToSpawn89);
                    }
                }
                Level level90 = this.world;
                if (level90 instanceof Level) {
                    Level _level90 = level90;
                    if (!_level90.isClientSide()) {
                        ItemEntity entityToSpawn90 = new ItemEntity(_level90, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn90.setPickUpDelay(10);
                        _level90.addFreshEntity(entityToSpawn90);
                    }
                }
                Level level91 = this.world;
                if (level91 instanceof Level) {
                    Level _level91 = level91;
                    if (!_level91.isClientSide()) {
                        ItemEntity entityToSpawn91 = new ItemEntity(_level91, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn91.setPickUpDelay(10);
                        _level91.addFreshEntity(entityToSpawn91);
                    }
                }
                Level level92 = this.world;
                if (level92 instanceof Level) {
                    Level _level92 = level92;
                    if (!_level92.isClientSide()) {
                        ItemEntity entityToSpawn92 = new ItemEntity(_level92, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn92.setPickUpDelay(10);
                        _level92.addFreshEntity(entityToSpawn92);
                    }
                }
                Level level93 = this.world;
                if (level93 instanceof Level) {
                    Level _level93 = level93;
                    if (!_level93.isClientSide()) {
                        ItemEntity entityToSpawn93 = new ItemEntity(_level93, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn93.setPickUpDelay(10);
                        _level93.addFreshEntity(entityToSpawn93);
                    }
                }
                Level level94 = this.world;
                if (level94 instanceof Level) {
                    Level _level94 = level94;
                    if (!_level94.isClientSide()) {
                        ItemEntity entityToSpawn94 = new ItemEntity(_level94, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn94.setPickUpDelay(10);
                        _level94.addFreshEntity(entityToSpawn94);
                    }
                }
                Level level95 = this.world;
                if (level95 instanceof Level) {
                    Level _level95 = level95;
                    if (!_level95.isClientSide()) {
                        ItemEntity entityToSpawn95 = new ItemEntity(_level95, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn95.setPickUpDelay(10);
                        _level95.addFreshEntity(entityToSpawn95);
                    }
                }
                Level level96 = this.world;
                if (level96 instanceof Level) {
                    Level _level96 = level96;
                    if (!_level96.isClientSide()) {
                        ItemEntity entityToSpawn96 = new ItemEntity(_level96, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn96.setPickUpDelay(10);
                        _level96.addFreshEntity(entityToSpawn96);
                    }
                }
                Level level97 = this.world;
                if (level97 instanceof Level) {
                    Level _level97 = level97;
                    if (!_level97.isClientSide()) {
                        ItemEntity entityToSpawn97 = new ItemEntity(_level97, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn97.setPickUpDelay(10);
                        _level97.addFreshEntity(entityToSpawn97);
                    }
                }
                Level level98 = this.world;
                if (level98 instanceof Level) {
                    Level _level98 = level98;
                    if (!_level98.isClientSide()) {
                        ItemEntity entityToSpawn98 = new ItemEntity(_level98, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn98.setPickUpDelay(10);
                        _level98.addFreshEntity(entityToSpawn98);
                    }
                }
                Level level99 = this.world;
                if (level99 instanceof Level) {
                    Level _level99 = level99;
                    if (!_level99.isClientSide()) {
                        ItemEntity entityToSpawn99 = new ItemEntity(_level99, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn99.setPickUpDelay(10);
                        _level99.addFreshEntity(entityToSpawn99);
                    }
                }
                Level level100 = this.world;
                if (level100 instanceof Level) {
                    Level _level100 = level100;
                    if (!_level100.isClientSide()) {
                        ItemEntity entityToSpawn100 = new ItemEntity(_level100, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn100.setPickUpDelay(10);
                        _level100.addFreshEntity(entityToSpawn100);
                    }
                }
                Level level101 = this.world;
                if (level101 instanceof Level) {
                    Level _level101 = level101;
                    if (!_level101.isClientSide()) {
                        ItemEntity entityToSpawn101 = new ItemEntity(_level101, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn101.setPickUpDelay(10);
                        _level101.addFreshEntity(entityToSpawn101);
                    }
                }
                Level level102 = this.world;
                if (level102 instanceof Level) {
                    Level _level102 = level102;
                    if (!_level102.isClientSide()) {
                        ItemEntity entityToSpawn102 = new ItemEntity(_level102, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn102.setPickUpDelay(10);
                        _level102.addFreshEntity(entityToSpawn102);
                    }
                }
                Level level103 = this.world;
                if (level103 instanceof Level) {
                    Level _level103 = level103;
                    if (!_level103.isClientSide()) {
                        ItemEntity entityToSpawn103 = new ItemEntity(_level103, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn103.setPickUpDelay(10);
                        _level103.addFreshEntity(entityToSpawn103);
                    }
                }
                Level level104 = this.world;
                if (level104 instanceof Level) {
                    Level _level104 = level104;
                    if (!_level104.isClientSide()) {
                        ItemEntity entityToSpawn104 = new ItemEntity(_level104, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn104.setPickUpDelay(10);
                        _level104.addFreshEntity(entityToSpawn104);
                    }
                }
                Level level105 = this.world;
                if (level105 instanceof Level) {
                    Level _level105 = level105;
                    if (!_level105.isClientSide()) {
                        ItemEntity entityToSpawn105 = new ItemEntity(_level105, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn105.setPickUpDelay(10);
                        _level105.addFreshEntity(entityToSpawn105);
                    }
                }
                Level level106 = this.world;
                if (level106 instanceof Level) {
                    Level _level106 = level106;
                    if (!_level106.isClientSide()) {
                        ItemEntity entityToSpawn106 = new ItemEntity(_level106, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn106.setPickUpDelay(10);
                        _level106.addFreshEntity(entityToSpawn106);
                    }
                }
                Level level107 = this.world;
                if (level107 instanceof Level) {
                    Level _level107 = level107;
                    if (!_level107.isClientSide()) {
                        ItemEntity entityToSpawn107 = new ItemEntity(_level107, x, y + 1.0d, z, new ItemStack(Items.APPLE));
                        entityToSpawn107.setPickUpDelay(10);
                        _level107.addFreshEntity(entityToSpawn107);
                    }
                }
                Level level108 = this.world;
                if (level108 instanceof Level) {
                    Level _level108 = level108;
                    if (!_level108.isClientSide()) {
                        ItemEntity entityToSpawn108 = new ItemEntity(_level108, x, y + 1.0d, z, new ItemStack(Items.APPLE));
                        entityToSpawn108.setPickUpDelay(10);
                        _level108.addFreshEntity(entityToSpawn108);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("X_Grave_X 死了"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        if (Math.random() <= 0.5d) {
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravedead")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravedead")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure.2
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

                /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure$2$1] */
                private void run() {
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 你赢了"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure.2.1
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

                        /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure$2$1$1] */
                        private void run() {
                            if (!this.world.isClientSide() && this.world.getServer() != null) {
                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 我们太弱了"), ChatType.SYSTEM, Util.NIL_UUID);
                            }
                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure.2.1.1
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

                                /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure$2$1$1$1] */
                                private void run() {
                                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 走啊，走啊！"), ChatType.SYSTEM, Util.NIL_UUID);
                                    }
                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure.2.1.1.1
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

                                        /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure$2$1$1$1$1] */
                                        private void run() {
                                            if (!this.world.isClientSide() && this.world.getServer() != null) {
                                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 我会回去，并且变得更强！"), ChatType.SYSTEM, Util.NIL_UUID);
                                            }
                                            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure.2.1.1.1.1
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

                                                /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure$2$1$1$1$1$1] */
                                                private void run() {
                                                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                                                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 我要将这个地方夷为平地"), ChatType.SYSTEM, Util.NIL_UUID);
                                                    }
                                                    new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2DangShiTiSiWangShiProcedure.2.1.1.1.1.1
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
                                                                this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 记住我说的话！"), ChatType.SYSTEM, Util.NIL_UUID);
                                                            }
                                                            MinecraftForge.EVENT_BUS.unregister(this);
                                                        }
                                                    }.start(this.world, 52);
                                                    MinecraftForge.EVENT_BUS.unregister(this);
                                                }
                                            }.start(this.world, 50);
                                            MinecraftForge.EVENT_BUS.unregister(this);
                                        }
                                    }.start(this.world, 40);
                                    MinecraftForge.EVENT_BUS.unregister(this);
                                }
                            }.start(this.world, 75);
                            MinecraftForge.EVENT_BUS.unregister(this);
                        }
                    }.start(this.world, 48);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 70);
        }
    }
}
