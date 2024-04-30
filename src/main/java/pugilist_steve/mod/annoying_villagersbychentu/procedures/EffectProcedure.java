package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class EffectProcedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingAttackEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity());
        }
    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }


    /* JADX WARN: Removed duplicated region for block: B:61:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void execute(@Nullable Event event, Entity entity) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            if (_livEnt.hasEffect(MobEffects.DAMAGE_BOOST)) {
                i = _livEnt.getEffect(MobEffects.DAMAGE_BOOST).getAmplifier();
                if (i >= 4 && (entity instanceof LivingEntity _entity)) {
                    _entity.removeEffect(MobEffects.DAMAGE_BOOST);
                }
                if (entity instanceof LivingEntity _livEnt2) {
                    if (_livEnt2.hasEffect(MobEffects.DAMAGE_RESISTANCE)) {
                        i2 = _livEnt2.getEffect(MobEffects.DAMAGE_RESISTANCE).getAmplifier();
                        if (i2 >= 4 && (entity instanceof LivingEntity _entity2)) {
                            _entity2.removeEffect(MobEffects.DAMAGE_RESISTANCE);
                        }
                        if (entity instanceof LivingEntity _livEnt3) {
                            if (_livEnt3.hasEffect(MobEffects.REGENERATION)) {
                                i3 = _livEnt3.getEffect(MobEffects.REGENERATION).getAmplifier();
                                if (i3 >= 6 && (entity instanceof LivingEntity _entity3)) {
                                    _entity3.removeEffect(MobEffects.REGENERATION);
                                }
                                if (entity instanceof LivingEntity _livEnt4) {
                                    if (_livEnt4.hasEffect(MobEffects.MOVEMENT_SPEED)) {
                                        i4 = _livEnt4.getEffect(MobEffects.MOVEMENT_SPEED).getAmplifier();
                                        if (i4 >= 10 && (entity instanceof LivingEntity _entity4)) {
                                            _entity4.removeEffect(MobEffects.MOVEMENT_SPEED);
                                        }
                                        if (entity instanceof LivingEntity _livEnt5) {
                                            if (_livEnt5.hasEffect(MobEffects.DIG_SPEED)) {
                                                i5 = _livEnt5.getEffect(MobEffects.DIG_SPEED).getAmplifier();
                                                if (i5 < 5 && (entity instanceof LivingEntity _entity5)) {
                                                    _entity5.removeEffect(MobEffects.DIG_SPEED);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        i5 = 0;
                                        if (i5 < 5) {
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i4 = 0;
                                if (i4 >= 10) {
                                    LivingEntity _entity42 = (LivingEntity) entity;
                                    _entity42.removeEffect(MobEffects.MOVEMENT_SPEED);
                                }
                                if (entity instanceof LivingEntity) {
                                }
                                i5 = 0;
                                if (i5 < 5) {
                                }
                            }
                        }
                        i3 = 0;
                        if (i3 >= 6) {
                            LivingEntity _entity32 = (LivingEntity) entity;
                            _entity32.removeEffect(MobEffects.REGENERATION);
                        }
                        if (entity instanceof LivingEntity) {
                        }
                        i4 = 0;
                        if (i4 >= 10) {
                        }
                        if (entity instanceof LivingEntity) {
                        }
                        i5 = 0;
                        if (i5 < 5) {
                        }
                    }
                }
                i2 = 0;
                if (i2 >= 4) {
                    LivingEntity _entity22 = (LivingEntity) entity;
                    _entity22.removeEffect(MobEffects.DAMAGE_RESISTANCE);
                }
                if (entity instanceof LivingEntity) {
                }
                i3 = 0;
                if (i3 >= 6) {
                }
                if (entity instanceof LivingEntity) {
                }
                i4 = 0;
                if (i4 >= 10) {
                }
                if (entity instanceof LivingEntity) {
                }
                i5 = 0;
                if (i5 < 5) {
                }
            }
        }
        i = 0;
        if (i >= 4) {
            LivingEntity _entity6 = (LivingEntity) entity;
            _entity6.removeEffect(MobEffects.DAMAGE_BOOST);
        }
        if (entity instanceof LivingEntity) {
        }
        i2 = 0;
        if (i2 >= 4) {
        }
        if (entity instanceof LivingEntity) {
        }
        i3 = 0;
        if (i3 >= 6) {
        }
        if (entity instanceof LivingEntity) {
        }
        i4 = 0;
        if (i4 >= 10) {
        }
        if (entity instanceof LivingEntity) {
        }
        i5 = 0;
        if (i5 < 5) {
        }
    }
}
