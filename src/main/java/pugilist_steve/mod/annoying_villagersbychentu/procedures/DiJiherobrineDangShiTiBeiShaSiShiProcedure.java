package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;


public class DiJiherobrineDangShiTiBeiShaSiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.OBSIDIAN));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                ItemEntity entityToSpawn2 = new ItemEntity(_level2, x, y, z, new ItemStack(Blocks.OBSIDIAN));
                entityToSpawn2.setPickUpDelay(10);
                _level2.addFreshEntity(entityToSpawn2);
            }
        }
        if (world instanceof Level _level3) {
            if (!_level3.isClientSide()) {
                ItemEntity entityToSpawn3 = new ItemEntity(_level3, x, y, z, new ItemStack(Items.ENDER_EYE));
                entityToSpawn3.setPickUpDelay(10);
                _level3.addFreshEntity(entityToSpawn3);
            }
        }
        if (world instanceof Level _level4) {
            if (!_level4.isClientSide()) {
                ItemEntity entityToSpawn4 = new ItemEntity(_level4, x, y, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get()));
                entityToSpawn4.setPickUpDelay(10);
                _level4.addFreshEntity(entityToSpawn4);
            }
        }
        if (world instanceof Level _level5) {
            if (!_level5.isClientSide()) {
                ItemEntity entityToSpawn5 = new ItemEntity(_level5, x, y, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get()));
                entityToSpawn5.setPickUpDelay(10);
                _level5.addFreshEntity(entityToSpawn5);
            }
        }
        if (world instanceof Level _level6) {
            if (!_level6.isClientSide()) {
                ItemEntity entityToSpawn6 = new ItemEntity(_level6, x, y, z, new ItemStack(Blocks.OBSIDIAN));
                entityToSpawn6.setPickUpDelay(10);
                _level6.addFreshEntity(entityToSpawn6);
            }
        }
        if (world instanceof Level _level7) {
            if (!_level7.isClientSide()) {
                ItemEntity entityToSpawn7 = new ItemEntity(_level7, x, y, z, new ItemStack(Blocks.OBSIDIAN));
                entityToSpawn7.setPickUpDelay(10);
                _level7.addFreshEntity(entityToSpawn7);
            }
        }
        if (world instanceof Level _level8) {
            if (!_level8.isClientSide()) {
                ItemEntity entityToSpawn8 = new ItemEntity(_level8, x, y, z, new ItemStack(Blocks.OBSIDIAN));
                entityToSpawn8.setPickUpDelay(10);
                _level8.addFreshEntity(entityToSpawn8);
            }
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon player_mobs:player_mob");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tp @r[gamemode=spectator] @s");
        }
    }
}
