package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber

public class ShitishengchengshiProcedure {
    @SubscribeEvent
    public static void onEntitySpawned(EntityJoinWorldEvent event) {
        execute(event, event.getWorld(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        execute(null, world, x, y, z);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fengliu")), SoundSource.BLOCKS, (float) Mth.nextDouble(new Random(), 0.8d, 1.0d), 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:fengliu")), SoundSource.BLOCKS, (float) Mth.nextDouble(new Random(), 0.8d, 1.0d), 1.0f, false);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:whoosh")), SoundSource.BLOCKS, 1.0f, 1.0f);
            } else {
                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:whoosh")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
            }
        }
    }
}
