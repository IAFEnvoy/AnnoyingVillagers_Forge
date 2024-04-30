package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;


public class HeisezhenzhuDangTouSheWuSheZhongCiFangKuaiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        entity.teleportTo(x, y + 1.0d, z);
        if (entity instanceof ServerPlayer _serverPlayer) {
            _serverPlayer.connection.teleport(x, y + 1.0d, z, entity.getYRot(), entity.getXRot());
        }
        if (world instanceof ServerLevel) {
            ((ServerLevel) world).sendParticles(ParticleTypes.PORTAL, x, y, z, 50, 4.0d, 4.0d, 4.0d, 1.0d);
        }
    }
}
