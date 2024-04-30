package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;

import java.util.Random;


public class HhejinzhanrengongjiProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setSecondsOnFire(15);
        entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25d, 0.05d, 0.25d));
        entity.hurt(DamageSource.GENERIC, (float) Mth.nextDouble(new Random(), 10.0d, 100.0d));
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 120, 3));
            }
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 120, 3));
            }
        }
        if (entity instanceof LivingEntity _entity3) {
            if (!_entity3.level.isClientSide()) {
                _entity3.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 120, 3));
            }
        }
        if (entity instanceof LivingEntity _entity4) {
            if (!_entity4.level.isClientSide()) {
                _entity4.addEffect(new MobEffectInstance(MobEffects.POISON, 120, 3));
            }
        }
        if (entity instanceof LivingEntity _entity5) {
            if (!_entity5.level.isClientSide()) {
                _entity5.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 120, 3));
            }
        }
        if (entity instanceof LivingEntity _entity6) {
            if (!_entity6.level.isClientSide()) {
                _entity6.addEffect(new MobEffectInstance(MobEffects.WITHER, 120, 3));
            }
        }
        if (entity instanceof LivingEntity _entity7) {
            if (!_entity7.level.isClientSide()) {
                _entity7.addEffect(new MobEffectInstance(MobEffects.HUNGER, 120, 3));
            }
        }
        if (entity instanceof LivingEntity _entity8) {
            if (!_entity8.level.isClientSide()) {
                _entity8.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 120, 3));
            }
        }
        if (entity instanceof LivingEntity _entity9) {
            if (!_entity9.level.isClientSide()) {
                _entity9.addEffect(new MobEffectInstance(MobEffects.GLOWING, 120, 3));
            }
        }
    }
}
