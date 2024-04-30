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
import pugilist_steve.mod.annoying_villagersbychentu.entity.HeiyaoshitiekuileiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Random;


public class C0687x71b6dad7 {
    public static void execute(LevelAccessor world, double x, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel _level) {
            Mob heiyaoshitiekuileiEntity = new HeiyaoshitiekuileiEntity(AnnoyingVillagersbychentuModEntities.HEIYAOSHITIEKUILEI.get(), _level);
            heiyaoshitiekuileiEntity.moveTo(x, z + Mth.nextDouble(new Random(), 3.0d, 5.0d), z + Mth.nextDouble(new Random(), 3.0d, 10.0d), world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (heiyaoshitiekuileiEntity instanceof Mob) {
                Mob _mobToSpawn = heiyaoshitiekuileiEntity;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(heiyaoshitiekuileiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(heiyaoshitiekuileiEntity);
        }
        if (entity instanceof Player _player) {
            ItemStack _stktoremove = new ItemStack(AnnoyingVillagersbychentuModItems.HEIYAOSHIKUILEIZHIYAN.get());
            _player.getInventory().clearOrCountMatchingItems(p -> {
                return _stktoremove.getItem() == p.getItem();
            }, 1, _player.inventoryMenu.getCraftSlots());
        }
    }
}
