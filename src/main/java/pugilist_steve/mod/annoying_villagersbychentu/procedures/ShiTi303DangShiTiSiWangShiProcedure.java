package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class ShiTi303DangShiTiSiWangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:tnt");
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.HHEIANZHIREN.get()));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y + 1.0d, z, new ItemStack(Items.TOTEM_OF_UNDYING));
                entityToSpawn2.setPickUpDelay(10);
                _level2.addFreshEntity(entityToSpawn2);
            }
        }
        if (world instanceof Level _level3) {
            if (!_level3.isClientSide()) {
                ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(Items.SKELETON_SKULL));
                entityToSpawn3.setPickUpDelay(10);
                _level3.addFreshEntity(entityToSpawn3);
            }
        }
        if (world instanceof Level _level4) {
            if (!_level4.isClientSide()) {
                ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y + 1.0d, z, new ItemStack(Items.HEART_OF_THE_SEA));
                entityToSpawn4.setPickUpDelay(10);
                _level4.addFreshEntity(entityToSpawn4);
            }
        }
    }
}
