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
import pugilist_steve.mod.annoying_villagersbychentu.entity.HuoyantiekuileiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Random;


public class C0919xc4d6abc2 {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel _level) {
            Mob huoyantiekuileiEntity = new HuoyantiekuileiEntity(AnnoyingVillagersbychentuModEntities.HUOYANTIEKUILEI.get(), _level);
            huoyantiekuileiEntity.moveTo(x, y, z + Mth.nextDouble(new Random(), 1.0d, 10.0d), world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (huoyantiekuileiEntity instanceof Mob) {
                Mob _mobToSpawn = huoyantiekuileiEntity;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(huoyantiekuileiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(huoyantiekuileiEntity);
        }
        if (entity instanceof Player _player) {
            ItemStack _stktoremove = new ItemStack(AnnoyingVillagersbychentuModItems.HUOYANKUILEIZHIYAN.get());
            _player.getInventory().clearOrCountMatchingItems(p -> {
                return _stktoremove.getItem() == p.getItem();
            }, 1, _player.inventoryMenu.getCraftSlots());
        }
    }
}
