package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class JieProcedure {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            execute(event, event.player);
        }
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        int i;
        float f;
        if (entity == null) {
            return;
        }
        if (entity instanceof Player _plr) {
            i = _plr.getFoodData().getFoodLevel();
        } else {
            i = 0;
        }
        if (i <= 4) {
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 40, 6, false, false));
                }
            }
            if (entity instanceof LivingEntity _entity2) {
                if (!_entity2.level.isClientSide()) {
                    _entity2.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 6, false, false));
                }
            }
            if (entity instanceof LivingEntity _entity3) {
                if (!_entity3.level.isClientSide()) {
                    _entity3.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 40, 50, false, false));
                }
            }
        }
        if (entity instanceof LivingEntity _livEnt) {
            f = _livEnt.getHealth();
        } else {
            f = -1.0f;
        }
        if (f <= 6.0f) {
            if (entity instanceof LivingEntity _entity4) {
                if (!_entity4.level.isClientSide()) {
                    _entity4.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, false, false));
                }
            }
            if (entity instanceof LivingEntity _entity5) {
                if (!_entity5.level.isClientSide()) {
                    _entity5.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 40, 50, false, false));
                }
            }
        }
    }
}
