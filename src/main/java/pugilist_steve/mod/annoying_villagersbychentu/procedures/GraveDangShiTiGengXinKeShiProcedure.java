package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;


public class GraveDangShiTiGengXinKeShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        float f;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            f = _livEnt.getHealth();
        } else {
            f = -1.0f;
        }
        if (f <= 60.0f) {
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:jinshiyinxiao")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:jinshiyinxiao")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 10));
                }
            }
        }
    }
}
