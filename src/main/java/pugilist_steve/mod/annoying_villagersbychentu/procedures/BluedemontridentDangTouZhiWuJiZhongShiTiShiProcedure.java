package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;


public class BluedemontridentDangTouZhiWuJiZhongShiTiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setSecondsOnFire(8);
        if (world instanceof ServerLevel _level) {
            LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
            entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn.setVisualOnly(true);
            _level.addFreshEntity(entityToSpawn);
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.POISON, 40, 1, false, false));
            }
        }
        if (world instanceof ServerLevel _level2) {
            Mob thrownTrident = new ThrownTrident(EntityType.TRIDENT, _level2);
            thrownTrident.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (thrownTrident instanceof Mob) {
                Mob _mobToSpawn = thrownTrident;
                _mobToSpawn.finalizeSpawn(_level2, world.getCurrentDifficultyAt(thrownTrident.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(thrownTrident);
        }
    }
}
