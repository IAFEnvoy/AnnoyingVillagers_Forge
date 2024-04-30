package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;


public class FfengyuansujinengProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        if (entity instanceof Player _player) {
            _player.getCooldowns().addCooldown(itemstack.getItem(), 60);
        }
        entity.setDeltaMovement(new Vec3(0.0d, 1.5d, 0.0d));
        world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 0.0d, 1.0d, 0.0d);
        if (world instanceof ServerLevel) {
            ((ServerLevel) world).sendParticles(ParticleTypes.POOF, x, y, z, 20, 0.0d, 0.0d, 0.0d, 1.0d);
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:cooldown")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:cooldown")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
    }
}
