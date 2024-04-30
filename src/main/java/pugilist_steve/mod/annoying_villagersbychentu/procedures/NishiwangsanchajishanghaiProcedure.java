package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BlueDemonEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber

public class NishiwangsanchajishanghaiProcedure {
    @SubscribeEvent
    public static void onEntityAttacked(LivingHurtEvent event) {
        if (event != null && event.getEntity() != null) {
            execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
        }
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && !world.getEntitiesOfClass(ThrownTrident.class, AABB.ofSize(new Vec3(x, y + 1.0d, z), 2.0d, 2.0d, 2.0d), e -> {
            return true;
        }).isEmpty() && !world.getEntitiesOfClass(BlueDemonEntity.class, AABB.ofSize(new Vec3(x, y, z), 60.0d, 60.0d, 60.0d), e2 -> {
            return true;
        }).isEmpty()) {
            entity.hurt(DamageSource.GENERIC, Mth.nextInt(new Random(), 12, 30));
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.ELECTIFY.get(), 60, 1, false, false));
                }
            }
        }
    }
}
