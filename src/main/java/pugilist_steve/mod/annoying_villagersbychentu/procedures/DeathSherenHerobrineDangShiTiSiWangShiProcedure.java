package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModParticleTypes;


public class DeathSherenHerobrineDangShiTiSiWangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:big_boom")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:big_boom")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof ServerLevel) {
            ((ServerLevel) world).sendParticles(ParticleTypes.PORTAL, x, y, z, 60, 3.0d, 3.0d, 3.0d, 0.0d);
        }
        world.addParticle((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.LIGHT.get(), x, y, z, 0.0d, 0.0d, 0.0d);
        if (!entity.level.isClientSide()) {
            entity.discard();
        }
    }
}
