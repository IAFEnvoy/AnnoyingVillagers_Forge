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
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BeiGanRanJianBingGuoZiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class HbGaoJiFenShenDangShiTiBeiShaSiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel _level) {
            LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
            entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn.setVisualOnly(false);
            _level.addFreshEntity(entityToSpawn);
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.explode(null, x, y, z, 4.0f, Explosion.BlockInteraction.DESTROY);
            }
        }
        if (world instanceof ServerLevel _level3) {
            Mob beiGanRanJianBingGuoZiEntity = new BeiGanRanJianBingGuoZiEntity(AnnoyingVillagersbychentuModEntities.BEI_GAN_RAN_JIAN_BING_GUO_ZI.get(), _level3);
            beiGanRanJianBingGuoZiEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (beiGanRanJianBingGuoZiEntity instanceof Mob) {
                Mob _mobToSpawn = beiGanRanJianBingGuoZiEntity;
                _mobToSpawn.finalizeSpawn(_level3, world.getCurrentDifficultyAt(beiGanRanJianBingGuoZiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(beiGanRanJianBingGuoZiEntity);
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("Herobrine:分身已被摧毁，数据已传入终端"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        if (world instanceof Level _level4) {
            if (!_level4.isClientSide()) {
                ItemEntity entityToSpawn2 = new ItemEntity(_level4, x, y, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                entityToSpawn2.setPickUpDelay(10);
                _level4.addFreshEntity(entityToSpawn2);
            }
        }
        if (world instanceof Level _level5) {
            if (!_level5.isClientSide()) {
                ItemEntity entityToSpawn3 = new ItemEntity(_level5, x, y, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                entityToSpawn3.setPickUpDelay(10);
                _level5.addFreshEntity(entityToSpawn3);
            }
        }
        if (world instanceof Level _level6) {
            if (!_level6.isClientSide()) {
                ItemEntity entityToSpawn4 = new ItemEntity(_level6, x, y, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                entityToSpawn4.setPickUpDelay(10);
                _level6.addFreshEntity(entityToSpawn4);
            }
        }
        if (world instanceof Level _level7) {
            if (!_level7.isClientSide()) {
                ItemEntity entityToSpawn5 = new ItemEntity(_level7, x, y, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                entityToSpawn5.setPickUpDelay(10);
                _level7.addFreshEntity(entityToSpawn5);
            }
        }
        if (world instanceof Level _level8) {
            if (!_level8.isClientSide()) {
                ItemEntity entityToSpawn6 = new ItemEntity(_level8, x, y, z, new ItemStack(AnnoyingVillagersbychentuModBlocks.ANYINGHEIYAOSHI.get()));
                entityToSpawn6.setPickUpDelay(10);
                _level8.addFreshEntity(entityToSpawn6);
            }
        }
        if (world instanceof Level _level9) {
            if (!_level9.isClientSide()) {
                ItemEntity entityToSpawn7 = new ItemEntity(_level9, x, y, z, new ItemStack(AnnoyingVillagersbychentuModItems.ANYINGHEIYAOSHIWUQI.get()));
                entityToSpawn7.setPickUpDelay(10);
                _level9.addFreshEntity(entityToSpawn7);
            }
        }
        if (world instanceof Level _level10) {
            if (!_level10.isClientSide()) {
                ItemEntity entityToSpawn8 = new ItemEntity(_level10, x, y, z, new ItemStack(Items.ENDER_EYE));
                entityToSpawn8.setPickUpDelay(10);
                _level10.addFreshEntity(entityToSpawn8);
            }
        }
        if (world instanceof Level _level11) {
            if (!_level11.isClientSide()) {
                ItemEntity entityToSpawn9 = new ItemEntity(_level11, x, y, z, new ItemStack(Items.ENDER_EYE));
                entityToSpawn9.setPickUpDelay(10);
                _level11.addFreshEntity(entityToSpawn9);
            }
        }
        if (world instanceof Level _level12) {
            if (!_level12.isClientSide()) {
                ItemEntity entityToSpawn10 = new ItemEntity(_level12, x, y, z, new ItemStack(Items.SPLASH_POTION));
                entityToSpawn10.setPickUpDelay(10);
                _level12.addFreshEntity(entityToSpawn10);
            }
        }
        if (world instanceof Level _level13) {
            if (!_level13.isClientSide()) {
                ItemEntity entityToSpawn11 = new ItemEntity(_level13, x, y, z, new ItemStack(Blocks.DIAMOND_BLOCK));
                entityToSpawn11.setPickUpDelay(10);
                _level13.addFreshEntity(entityToSpawn11);
            }
        }
        if (world instanceof Level _level14) {
            if (!_level14.isClientSide()) {
                ItemEntity entityToSpawn12 = new ItemEntity(_level14, x, y, z, new ItemStack(Items.IRON_SWORD));
                entityToSpawn12.setPickUpDelay(10);
                _level14.addFreshEntity(entityToSpawn12);
            }
        }
    }
}
