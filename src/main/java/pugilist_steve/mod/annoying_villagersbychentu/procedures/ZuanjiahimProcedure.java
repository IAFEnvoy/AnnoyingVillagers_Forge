package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HongyizombieEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;


public class ZuanjiahimProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel _level) {
            Mob hongyizombieEntity = new HongyizombieEntity(AnnoyingVillagersbychentuModEntities.HONGYIZOMBIE.get(), _level);
            hongyizombieEntity.moveTo(x, y + 1.0d, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (hongyizombieEntity instanceof Mob) {
                Mob _mobToSpawn = hongyizombieEntity;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(hongyizombieEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(hongyizombieEntity);
        }
        if (world instanceof ServerLevel _level2) {
            Mob zombie = new Zombie(EntityType.ZOMBIE, _level2);
            zombie.moveTo(x, y + 1.0d, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (zombie instanceof Mob) {
                Mob _mobToSpawn2 = zombie;
                _mobToSpawn2.finalizeSpawn(_level2, world.getCurrentDifficultyAt(zombie.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(zombie);
        }
        if (world instanceof ServerLevel _level3) {
            Mob zombie2 = new Zombie(EntityType.ZOMBIE, _level3);
            zombie2.moveTo(x, y + 1.0d, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (zombie2 instanceof Mob) {
                Mob _mobToSpawn3 = zombie2;
                _mobToSpawn3.finalizeSpawn(_level3, world.getCurrentDifficultyAt(zombie2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(zombie2);
        }
    }
}
