package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import pugilist_steve.mod.annoying_villagersbychentu.entity.NishidierjieEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModParticleTypes;


public class DierjieduannishiwangProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.addParticle((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.LIGHT.get(), x, y, z, 0.0d, 0.0d, 0.0d);
        if (world instanceof ServerLevel _level) {
            Mob nishidierjieEntity = new NishidierjieEntity(AnnoyingVillagersbychentuModEntities.NISHIDIERJIE.get(), _level);
            nishidierjieEntity.moveTo(x, y, z, 0.0f, 0.0f);
            nishidierjieEntity.setYBodyRot(0.0f);
            nishidierjieEntity.setYHeadRot(0.0f);
            nishidierjieEntity.setDeltaMovement(0.0d, 0.0d, 0.0d);
            if (nishidierjieEntity instanceof Mob) {
                Mob _mobToSpawn = nishidierjieEntity;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(nishidierjieEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(nishidierjieEntity);
        }
    }
}
