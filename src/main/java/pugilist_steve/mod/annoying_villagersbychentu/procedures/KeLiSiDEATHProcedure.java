package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class KeLiSiDEATHProcedure {
    /* JADX WARN: Type inference failed for: r0v2, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDEATHProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z) {
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Chris> 史蒂夫，对不起了"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.KeLiSiDEATHProcedure.1
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
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_HELMET));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
                Level level2 = this.world;
                if (level2 instanceof Level) {
                    Level _level2 = level2;
                    if (!_level2.isClientSide()) {
                        ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_CHESTPLATE));
                        entityToSpawn2.setPickUpDelay(10);
                        _level2.addFreshEntity(entityToSpawn2);
                    }
                }
                Level level3 = this.world;
                if (level3 instanceof Level) {
                    Level _level3 = level3;
                    if (!_level3.isClientSide()) {
                        ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_BOOTS));
                        entityToSpawn3.setPickUpDelay(10);
                        _level3.addFreshEntity(entityToSpawn3);
                    }
                }
                Level level4 = this.world;
                if (level4 instanceof Level) {
                    Level _level4 = level4;
                    if (!_level4.isClientSide()) {
                        ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(Items.TOTEM_OF_UNDYING));
                        entityToSpawn4.setPickUpDelay(10);
                        _level4.addFreshEntity(entityToSpawn4);
                    }
                }
                Level level5 = this.world;
                if (level5 instanceof Level) {
                    Level _level5 = level5;
                    if (!_level5.isClientSide()) {
                        ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y + 1.0d, z, new ItemStack(Items.BOW));
                        entityToSpawn5.setPickUpDelay(10);
                        _level5.addFreshEntity(entityToSpawn5);
                    }
                }
                Level level6 = this.world;
                if (level6 instanceof Level) {
                    Level _level6 = level6;
                    if (!_level6.isClientSide()) {
                        ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn6.setPickUpDelay(10);
                        _level6.addFreshEntity(entityToSpawn6);
                    }
                }
                Level level7 = this.world;
                if (level7 instanceof Level) {
                    Level _level7 = level7;
                    if (!_level7.isClientSide()) {
                        ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Items.ARROW));
                        entityToSpawn7.setPickUpDelay(10);
                        _level7.addFreshEntity(entityToSpawn7);
                    }
                }
                Level level8 = this.world;
                if (level8 instanceof Level) {
                    Level _level8 = level8;
                    if (!_level8.isClientSide()) {
                        ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y + 1.0d, z, new ItemStack(Items.ARROW));
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
                        ItemEntity entityToSpawn17 = new ItemEntity(_level17, x, y + 1.0d, z, new ItemStack(Items.SHIELD));
                        entityToSpawn17.setPickUpDelay(10);
                        _level17.addFreshEntity(entityToSpawn17);
                    }
                }
                Level level18 = this.world;
                if (level18 instanceof Level) {
                    Level _level18 = level18;
                    if (!_level18.isClientSide()) {
                        ItemEntity entityToSpawn18 = new ItemEntity(_level18, x, y + 1.0d, z, new ItemStack(Items.SPYGLASS));
                        entityToSpawn18.setPickUpDelay(10);
                        _level18.addFreshEntity(entityToSpawn18);
                    }
                }
                Level level19 = this.world;
                if (level19 instanceof Level) {
                    Level _level19 = level19;
                    if (!_level19.isClientSide()) {
                        ItemEntity entityToSpawn19 = new ItemEntity(_level19, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn19.setPickUpDelay(10);
                        _level19.addFreshEntity(entityToSpawn19);
                    }
                }
                Level level20 = this.world;
                if (level20 instanceof Level) {
                    Level _level20 = level20;
                    if (!_level20.isClientSide()) {
                        ItemEntity entityToSpawn20 = new ItemEntity(_level20, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn20.setPickUpDelay(10);
                        _level20.addFreshEntity(entityToSpawn20);
                    }
                }
                Level level21 = this.world;
                if (level21 instanceof Level) {
                    Level _level21 = level21;
                    if (!_level21.isClientSide()) {
                        ItemEntity entityToSpawn21 = new ItemEntity(_level21, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn21.setPickUpDelay(10);
                        _level21.addFreshEntity(entityToSpawn21);
                    }
                }
                Level level22 = this.world;
                if (level22 instanceof Level) {
                    Level _level22 = level22;
                    if (!_level22.isClientSide()) {
                        ItemEntity entityToSpawn22 = new ItemEntity(_level22, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn22.setPickUpDelay(10);
                        _level22.addFreshEntity(entityToSpawn22);
                    }
                }
                Level level23 = this.world;
                if (level23 instanceof Level) {
                    Level _level23 = level23;
                    if (!_level23.isClientSide()) {
                        ItemEntity entityToSpawn23 = new ItemEntity(_level23, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                        entityToSpawn23.setPickUpDelay(10);
                        _level23.addFreshEntity(entityToSpawn23);
                    }
                }
                Level level24 = this.world;
                if (level24 instanceof Level) {
                    Level _level24 = level24;
                    if (!_level24.isClientSide()) {
                        ItemEntity entityToSpawn24 = new ItemEntity(_level24, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn24.setPickUpDelay(10);
                        _level24.addFreshEntity(entityToSpawn24);
                    }
                }
                Level level25 = this.world;
                if (level25 instanceof Level) {
                    Level _level25 = level25;
                    if (!_level25.isClientSide()) {
                        ItemEntity entityToSpawn25 = new ItemEntity(_level25, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn25.setPickUpDelay(10);
                        _level25.addFreshEntity(entityToSpawn25);
                    }
                }
                Level level26 = this.world;
                if (level26 instanceof Level) {
                    Level _level26 = level26;
                    if (!_level26.isClientSide()) {
                        ItemEntity entityToSpawn26 = new ItemEntity(_level26, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn26.setPickUpDelay(10);
                        _level26.addFreshEntity(entityToSpawn26);
                    }
                }
                Level level27 = this.world;
                if (level27 instanceof Level) {
                    Level _level27 = level27;
                    if (!_level27.isClientSide()) {
                        ItemEntity entityToSpawn27 = new ItemEntity(_level27, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn27.setPickUpDelay(10);
                        _level27.addFreshEntity(entityToSpawn27);
                    }
                }
                Level level28 = this.world;
                if (level28 instanceof Level) {
                    Level _level28 = level28;
                    if (!_level28.isClientSide()) {
                        ItemEntity entityToSpawn28 = new ItemEntity(_level28, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                        entityToSpawn28.setPickUpDelay(10);
                        _level28.addFreshEntity(entityToSpawn28);
                    }
                }
                Level level29 = this.world;
                if (level29 instanceof Level) {
                    Level _level29 = level29;
                    if (!_level29.isClientSide()) {
                        ItemEntity entityToSpawn29 = new ItemEntity(_level29, x, y + 1.0d, z, new ItemStack(Items.OAK_BOAT));
                        entityToSpawn29.setPickUpDelay(10);
                        _level29.addFreshEntity(entityToSpawn29);
                    }
                }
                Level level30 = this.world;
                if (level30 instanceof Level) {
                    Level _level30 = level30;
                    if (!_level30.isClientSide()) {
                        ItemEntity entityToSpawn30 = new ItemEntity(_level30, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn30.setPickUpDelay(10);
                        _level30.addFreshEntity(entityToSpawn30);
                    }
                }
                Level level31 = this.world;
                if (level31 instanceof Level) {
                    Level _level31 = level31;
                    if (!_level31.isClientSide()) {
                        ItemEntity entityToSpawn31 = new ItemEntity(_level31, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn31.setPickUpDelay(10);
                        _level31.addFreshEntity(entityToSpawn31);
                    }
                }
                Level level32 = this.world;
                if (level32 instanceof Level) {
                    Level _level32 = level32;
                    if (!_level32.isClientSide()) {
                        ItemEntity entityToSpawn32 = new ItemEntity(_level32, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn32.setPickUpDelay(10);
                        _level32.addFreshEntity(entityToSpawn32);
                    }
                }
                Level level33 = this.world;
                if (level33 instanceof Level) {
                    Level _level33 = level33;
                    if (!_level33.isClientSide()) {
                        ItemEntity entityToSpawn33 = new ItemEntity(_level33, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                        entityToSpawn33.setPickUpDelay(10);
                        _level33.addFreshEntity(entityToSpawn33);
                    }
                }
                Level level34 = this.world;
                if (level34 instanceof Level) {
                    Level _level34 = level34;
                    if (!_level34.isClientSide()) {
                        ItemEntity entityToSpawn34 = new ItemEntity(_level34, x, y + 1.0d, z, new ItemStack(Blocks.CRAFTING_TABLE));
                        entityToSpawn34.setPickUpDelay(10);
                        _level34.addFreshEntity(entityToSpawn34);
                    }
                }
                Level level35 = this.world;
                if (level35 instanceof Level) {
                    Level _level35 = level35;
                    if (!_level35.isClientSide()) {
                        ItemEntity entityToSpawn35 = new ItemEntity(_level35, x, y + 1.0d, z, new ItemStack(Blocks.CRAFTING_TABLE));
                        entityToSpawn35.setPickUpDelay(10);
                        _level35.addFreshEntity(entityToSpawn35);
                    }
                }
                Level level36 = this.world;
                if (level36 instanceof Level) {
                    Level _level36 = level36;
                    if (!_level36.isClientSide()) {
                        ItemEntity entityToSpawn36 = new ItemEntity(_level36, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn36.setPickUpDelay(10);
                        _level36.addFreshEntity(entityToSpawn36);
                    }
                }
                Level level37 = this.world;
                if (level37 instanceof Level) {
                    Level _level37 = level37;
                    if (!_level37.isClientSide()) {
                        ItemEntity entityToSpawn37 = new ItemEntity(_level37, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn37.setPickUpDelay(10);
                        _level37.addFreshEntity(entityToSpawn37);
                    }
                }
                Level level38 = this.world;
                if (level38 instanceof Level) {
                    Level _level38 = level38;
                    if (!_level38.isClientSide()) {
                        ItemEntity entityToSpawn38 = new ItemEntity(_level38, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn38.setPickUpDelay(10);
                        _level38.addFreshEntity(entityToSpawn38);
                    }
                }
                Level level39 = this.world;
                if (level39 instanceof Level) {
                    Level _level39 = level39;
                    if (!_level39.isClientSide()) {
                        ItemEntity entityToSpawn39 = new ItemEntity(_level39, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                        entityToSpawn39.setPickUpDelay(10);
                        _level39.addFreshEntity(entityToSpawn39);
                    }
                }
                Level level40 = this.world;
                if (level40 instanceof Level) {
                    Level _level40 = level40;
                    if (!_level40.isClientSide()) {
                        ItemEntity entityToSpawn40 = new ItemEntity(_level40, x, y + 1.0d, z, new ItemStack(Items.GOLD_INGOT));
                        entityToSpawn40.setPickUpDelay(10);
                        _level40.addFreshEntity(entityToSpawn40);
                    }
                }
                Level level41 = this.world;
                if (level41 instanceof Level) {
                    Level _level41 = level41;
                    if (!_level41.isClientSide()) {
                        ItemEntity entityToSpawn41 = new ItemEntity(_level41, x, y + 1.0d, z, new ItemStack(Items.GOLD_INGOT));
                        entityToSpawn41.setPickUpDelay(10);
                        _level41.addFreshEntity(entityToSpawn41);
                    }
                }
                Level level42 = this.world;
                if (level42 instanceof Level) {
                    Level _level42 = level42;
                    if (!_level42.isClientSide()) {
                        ItemEntity entityToSpawn42 = new ItemEntity(_level42, x, y + 1.0d, z, new ItemStack(Items.GOLD_INGOT));
                        entityToSpawn42.setPickUpDelay(10);
                        _level42.addFreshEntity(entityToSpawn42);
                    }
                }
                Level level43 = this.world;
                if (level43 instanceof Level) {
                    Level _level43 = level43;
                    if (!_level43.isClientSide()) {
                        ItemEntity entityToSpawn43 = new ItemEntity(_level43, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn43.setPickUpDelay(10);
                        _level43.addFreshEntity(entityToSpawn43);
                    }
                }
                Level level44 = this.world;
                if (level44 instanceof Level) {
                    Level _level44 = level44;
                    if (!_level44.isClientSide()) {
                        ItemEntity entityToSpawn44 = new ItemEntity(_level44, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn44.setPickUpDelay(10);
                        _level44.addFreshEntity(entityToSpawn44);
                    }
                }
                Level level45 = this.world;
                if (level45 instanceof Level) {
                    Level _level45 = level45;
                    if (!_level45.isClientSide()) {
                        ItemEntity entityToSpawn45 = new ItemEntity(_level45, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn45.setPickUpDelay(10);
                        _level45.addFreshEntity(entityToSpawn45);
                    }
                }
                Level level46 = this.world;
                if (level46 instanceof Level) {
                    Level _level46 = level46;
                    if (!_level46.isClientSide()) {
                        ItemEntity entityToSpawn46 = new ItemEntity(_level46, x, y + 1.0d, z, new ItemStack(Items.EMERALD));
                        entityToSpawn46.setPickUpDelay(10);
                        _level46.addFreshEntity(entityToSpawn46);
                    }
                }
                Level level47 = this.world;
                if (level47 instanceof Level) {
                    Level _level47 = level47;
                    if (!_level47.isClientSide()) {
                        ItemEntity entityToSpawn47 = new ItemEntity(_level47, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn47.setPickUpDelay(10);
                        _level47.addFreshEntity(entityToSpawn47);
                    }
                }
                Level level48 = this.world;
                if (level48 instanceof Level) {
                    Level _level48 = level48;
                    if (!_level48.isClientSide()) {
                        ItemEntity entityToSpawn48 = new ItemEntity(_level48, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn48.setPickUpDelay(10);
                        _level48.addFreshEntity(entityToSpawn48);
                    }
                }
                Level level49 = this.world;
                if (level49 instanceof Level) {
                    Level _level49 = level49;
                    if (!_level49.isClientSide()) {
                        ItemEntity entityToSpawn49 = new ItemEntity(_level49, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn49.setPickUpDelay(10);
                        _level49.addFreshEntity(entityToSpawn49);
                    }
                }
                Level level50 = this.world;
                if (level50 instanceof Level) {
                    Level _level50 = level50;
                    if (!_level50.isClientSide()) {
                        ItemEntity entityToSpawn50 = new ItemEntity(_level50, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn50.setPickUpDelay(10);
                        _level50.addFreshEntity(entityToSpawn50);
                    }
                }
                Level level51 = this.world;
                if (level51 instanceof Level) {
                    Level _level51 = level51;
                    if (!_level51.isClientSide()) {
                        ItemEntity entityToSpawn51 = new ItemEntity(_level51, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn51.setPickUpDelay(10);
                        _level51.addFreshEntity(entityToSpawn51);
                    }
                }
                Level level52 = this.world;
                if (level52 instanceof Level) {
                    Level _level52 = level52;
                    if (!_level52.isClientSide()) {
                        ItemEntity entityToSpawn52 = new ItemEntity(_level52, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                        entityToSpawn52.setPickUpDelay(10);
                        _level52.addFreshEntity(entityToSpawn52);
                    }
                }
                Level level53 = this.world;
                if (level53 instanceof Level) {
                    Level _level53 = level53;
                    if (!_level53.isClientSide()) {
                        ItemEntity entityToSpawn53 = new ItemEntity(_level53, x, y + 1.0d, z, new ItemStack(Items.DIAMOND_SWORD));
                        entityToSpawn53.setPickUpDelay(10);
                        _level53.addFreshEntity(entityToSpawn53);
                    }
                }
                Level level54 = this.world;
                if (level54 instanceof Level) {
                    Level _level54 = level54;
                    if (!_level54.isClientSide()) {
                        ItemEntity entityToSpawn54 = new ItemEntity(_level54, x, y + 1.0d, z, new ItemStack(Items.IRON_SWORD));
                        entityToSpawn54.setPickUpDelay(10);
                        _level54.addFreshEntity(entityToSpawn54);
                    }
                }
                Level level55 = this.world;
                if (level55 instanceof Level) {
                    Level _level55 = level55;
                    if (!_level55.isClientSide()) {
                        ItemEntity entityToSpawn55 = new ItemEntity(_level55, x, y + 1.0d, z, new ItemStack(Items.IRON_PICKAXE));
                        entityToSpawn55.setPickUpDelay(10);
                        _level55.addFreshEntity(entityToSpawn55);
                    }
                }
                Level level56 = this.world;
                if (level56 instanceof Level) {
                    Level _level56 = level56;
                    if (!_level56.isClientSide()) {
                        ItemEntity entityToSpawn56 = new ItemEntity(_level56, x, y + 1.0d, z, new ItemStack(Items.IRON_AXE));
                        entityToSpawn56.setPickUpDelay(10);
                        _level56.addFreshEntity(entityToSpawn56);
                    }
                }
                Level level57 = this.world;
                if (level57 instanceof Level) {
                    Level _level57 = level57;
                    if (!_level57.isClientSide()) {
                        ItemEntity entityToSpawn57 = new ItemEntity(_level57, x, y + 1.0d, z, new ItemStack(Items.WHITE_BED));
                        entityToSpawn57.setPickUpDelay(10);
                        _level57.addFreshEntity(entityToSpawn57);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
    }
}
