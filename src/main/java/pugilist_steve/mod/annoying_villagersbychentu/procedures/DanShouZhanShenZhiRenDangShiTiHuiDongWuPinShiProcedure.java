package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;


public class DanShouZhanShenZhiRenDangShiTiHuiDongWuPinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:woosh_hard")), SoundSource.BLOCKS, (float) Mth.nextDouble(new Random(), 0.1d, 1.0d), (float) Mth.nextDouble(new Random(), 0.5d, 1.0d));
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:woosh_hard")), SoundSource.BLOCKS, (float) Mth.nextDouble(new Random(), 0.1d, 1.0d), (float) Mth.nextDouble(new Random(), 0.5d, 1.0d), false);
            }
        }
    }
}
