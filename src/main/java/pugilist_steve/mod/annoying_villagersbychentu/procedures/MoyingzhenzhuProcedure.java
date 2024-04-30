package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber

public class MoyingzhenzhuProcedure {
    @SubscribeEvent
    public static void onEntityFall(LivingFallEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && !world.getEntitiesOfClass(ThrownEnderpearl.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e -> {
            return true;
        }).isEmpty()) {
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 1.0d, 2.0d), 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.enderman.teleport")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 1.0d, 2.0d), 1.0f, false);
                }
            }
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.FALL.get(), 2, 1, false, false));
                }
            }
        }
    }
}
