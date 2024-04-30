package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;


public class HongyizombieDangShiTiSiWangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(Items.GOLDEN_APPLE));
                entityToSpawn2.setPickUpDelay(10);
                _level2.addFreshEntity(entityToSpawn2);
            }
        }
        if (world instanceof Level _level3) {
            if (!_level3.isClientSide()) {
                ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(Items.ROTTEN_FLESH));
                entityToSpawn3.setPickUpDelay(10);
                _level3.addFreshEntity(entityToSpawn3);
            }
        }
        if (world instanceof Level _level4) {
            if (!_level4.isClientSide()) {
                ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(Items.ROTTEN_FLESH));
                entityToSpawn4.setPickUpDelay(10);
                _level4.addFreshEntity(entityToSpawn4);
            }
        }
        if (world instanceof Level _level5) {
            if (!_level5.isClientSide()) {
                ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y + 1.0d, z, new ItemStack(Items.IRON_SWORD));
                entityToSpawn5.setPickUpDelay(10);
                _level5.addFreshEntity(entityToSpawn5);
            }
        }
        if (world instanceof Level _level6) {
            if (!_level6.isClientSide()) {
                ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                entityToSpawn6.setPickUpDelay(10);
                _level6.addFreshEntity(entityToSpawn6);
            }
        }
        if (world instanceof Level _level7) {
            if (!_level7.isClientSide()) {
                ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                entityToSpawn7.setPickUpDelay(10);
                _level7.addFreshEntity(entityToSpawn7);
            }
        }
        if (world instanceof Level _level8) {
            if (!_level8.isClientSide()) {
                _level8.addFreshEntity(new ExperienceOrb(_level8, x, y, z, 20));
            }
        }
        if (world instanceof Level _level9) {
            if (!_level9.isClientSide()) {
                ItemEntity entityToSpawn8 = new ItemEntity(_level9, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                entityToSpawn8.setPickUpDelay(10);
                _level9.addFreshEntity(entityToSpawn8);
            }
        }
        if (world instanceof Level _level10) {
            if (!_level10.isClientSide()) {
                ItemEntity entityToSpawn9 = new ItemEntity(_level10, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                entityToSpawn9.setPickUpDelay(10);
                _level10.addFreshEntity(entityToSpawn9);
            }
        }
        if (world instanceof Level _level11) {
            if (!_level11.isClientSide()) {
                ItemEntity entityToSpawn10 = new ItemEntity(_level11, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn10.setPickUpDelay(10);
                _level11.addFreshEntity(entityToSpawn10);
            }
        }
        if (world instanceof Level _level12) {
            if (!_level12.isClientSide()) {
                ItemEntity entityToSpawn11 = new ItemEntity(_level12, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn11.setPickUpDelay(10);
                _level12.addFreshEntity(entityToSpawn11);
            }
        }
        if (world instanceof Level _level13) {
            if (!_level13.isClientSide()) {
                ItemEntity entityToSpawn12 = new ItemEntity(_level13, x, y + 1.0d, z, new ItemStack(Items.IRON_INGOT));
                entityToSpawn12.setPickUpDelay(10);
                _level13.addFreshEntity(entityToSpawn12);
            }
        }
        if (world instanceof Level _level14) {
            if (!_level14.isClientSide()) {
                ItemEntity entityToSpawn13 = new ItemEntity(_level14, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                entityToSpawn13.setPickUpDelay(10);
                _level14.addFreshEntity(entityToSpawn13);
            }
        }
        if (world instanceof Level _level15) {
            if (!_level15.isClientSide()) {
                ItemEntity entityToSpawn14 = new ItemEntity(_level15, x, y + 1.0d, z, new ItemStack(Items.DIAMOND));
                entityToSpawn14.setPickUpDelay(10);
                _level15.addFreshEntity(entityToSpawn14);
            }
        }
        if (world instanceof Level _level16) {
            if (!_level16.isClientSide()) {
                ItemEntity entityToSpawn15 = new ItemEntity(_level16, x, y + 1.0d, z, new ItemStack(Items.WATER_BUCKET));
                entityToSpawn15.setPickUpDelay(10);
                _level16.addFreshEntity(entityToSpawn15);
            }
        }
    }
}
