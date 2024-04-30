package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;


public class HongyizombiedeahProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(Items.ENDER_PEARL));
                entityToSpawn2.setPickUpDelay(10);
                _level2.addFreshEntity(entityToSpawn2);
            }
        }
    }
}
