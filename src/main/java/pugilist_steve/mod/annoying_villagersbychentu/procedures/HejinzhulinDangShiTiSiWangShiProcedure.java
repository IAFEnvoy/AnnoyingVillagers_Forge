package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class HejinzhulinDangShiTiSiWangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() == 0.2d && (world instanceof Level _level)) {
            if (!_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.NETHERITE_HELMET));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
        }
        if (Math.random() == 0.2d && (world instanceof Level _level2)) {
            if (!_level2.isClientSide()) {
                ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack(Items.NETHERITE_CHESTPLATE));
                entityToSpawn2.setPickUpDelay(10);
                _level2.addFreshEntity(entityToSpawn2);
            }
        }
        if (Math.random() == 0.2d && (world instanceof Level _level3)) {
            if (!_level3.isClientSide()) {
                ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack(Items.NETHERITE_LEGGINGS));
                entityToSpawn3.setPickUpDelay(10);
                _level3.addFreshEntity(entityToSpawn3);
            }
        }
        if (Math.random() == 0.2d && (world instanceof Level _level4)) {
            if (!_level4.isClientSide()) {
                ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack(Items.NETHERITE_BOOTS));
                entityToSpawn4.setPickUpDelay(10);
                _level4.addFreshEntity(entityToSpawn4);
            }
        }
        if (Math.random() == 0.2d && (world instanceof Level _level5)) {
            if (!_level5.isClientSide()) {
                ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y, z, new ItemStack(AnnoyingVillagersbychentuModItems.HHEJINJUFU.get()));
                entityToSpawn5.setPickUpDelay(10);
                _level5.addFreshEntity(entityToSpawn5);
            }
        }
    }
}
