package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;


public class SifangsherenDangGongJuChuXianZaiShouZhongShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && Math.random() <= 0.3d) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle annoying_villagersbychentu:pe ^ ^ ^ 0.4 1.1 0.4 0 1");
            }
            if (Math.random() <= 0.87d) {
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle annoying_villagersbychentu:pe ^ ^ ^ 0.45 1.5 0.3 0 1");
                }
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.4d), (float) Mth.nextDouble(new Random(), 0.5d, 1.2d));
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.4d), (float) Mth.nextDouble(new Random(), 0.5d, 1.2d), false);
                    }
                }
            }
        }
    }
}
