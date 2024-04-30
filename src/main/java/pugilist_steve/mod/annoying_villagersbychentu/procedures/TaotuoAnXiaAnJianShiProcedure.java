package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Random;


public class TaotuoAnXiaAnJianShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && (entity instanceof LivingEntity _livEnt)) {
            if (_livEnt.hasEffect(AnnoyingVillagersbychentuModMobEffects.BLEED.get())) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:whoosh")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.5d, 0.9d), 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:whoosh")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.5d, 0.9d), 1.0f, false);
                    }
                }
                if (world instanceof Level _level2) {
                    if (!_level2.isClientSide()) {
                        _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:get_out")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.5d, 0.9d), 1.0f);
                    } else {
                        _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:get_out")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.5d, 0.9d), 1.0f, false);
                    }
                }
                if (world instanceof Level _level3) {
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:cooldown")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.5d, 0.9d), 1.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:cooldown")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.5d, 0.9d), 1.0f, false);
                    }
                }
                if (world instanceof Level _level4) {
                    if (!_level4.isClientSide()) {
                        _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.5d, 0.9d), 1.0f);
                    } else {
                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.5d, 0.9d), 1.0f, false);
                    }
                }
                entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * Math.max(-2, -3), 0.1d, entity.getLookAngle().z * Math.max(-3, -3)));
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.POOF, x, y, z, 30, 2.0d, 2.0d, 2.0d, 0.1d);
                }
                if (entity instanceof LivingEntity _entity) {
                    _entity.removeEffect(AnnoyingVillagersbychentuModMobEffects.BLEED.get());
                }
                if (entity instanceof Player _player) {
                    _player.causeFoodExhaustion(10.0f);
                }
            }
        }
    }
}
