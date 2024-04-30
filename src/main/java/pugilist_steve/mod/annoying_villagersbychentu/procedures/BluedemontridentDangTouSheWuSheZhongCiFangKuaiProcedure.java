package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.level.LevelAccessor;


public class BluedemontridentDangTouSheWuSheZhongCiFangKuaiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel _level) {
            Mob thrownTrident = new ThrownTrident(EntityType.TRIDENT, _level);
            thrownTrident.moveTo(x, y + 1.0d, z - 0.9d, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (thrownTrident instanceof Mob) {
                Mob _mobToSpawn = thrownTrident;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(thrownTrident.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(thrownTrident);
        }
    }
}
