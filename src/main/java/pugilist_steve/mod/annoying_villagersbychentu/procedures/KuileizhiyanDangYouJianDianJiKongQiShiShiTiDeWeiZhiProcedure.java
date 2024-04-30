package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HongkuileiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LanmeikuileiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Random;


public class KuileizhiyanDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() == 0.5d) {
            if (world instanceof ServerLevel _level) {
                Mob hongkuileiEntity = new HongkuileiEntity(AnnoyingVillagersbychentuModEntities.HONGKUILEI.get(), _level);
                hongkuileiEntity.moveTo(x, y + Mth.nextDouble(new Random(), 2.0d, 10.0d), z + Mth.nextDouble(new Random(), 2.0d, 10.0d), world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (hongkuileiEntity instanceof Mob) {
                    Mob _mobToSpawn = hongkuileiEntity;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(hongkuileiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(hongkuileiEntity);
            }
        } else if (world instanceof ServerLevel _level2) {
            Mob lanmeikuileiEntity = new LanmeikuileiEntity(AnnoyingVillagersbychentuModEntities.LANMEIKUILEI.get(), _level2);
            lanmeikuileiEntity.moveTo(x, y + Mth.nextDouble(new Random(), 2.0d, 10.0d), y, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (lanmeikuileiEntity instanceof Mob) {
                Mob _mobToSpawn2 = lanmeikuileiEntity;
                _mobToSpawn2.finalizeSpawn(_level2, world.getCurrentDifficultyAt(lanmeikuileiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(lanmeikuileiEntity);
        }
        if (entity instanceof Player _player) {
            ItemStack _stktoremove = new ItemStack(AnnoyingVillagersbychentuModItems.KUILEIZHIYAN.get());
            _player.getInventory().clearOrCountMatchingItems(p -> {
                return _stktoremove.getItem() == p.getItem();
            }, 1, _player.inventoryMenu.getCraftSlots());
        }
    }
}
