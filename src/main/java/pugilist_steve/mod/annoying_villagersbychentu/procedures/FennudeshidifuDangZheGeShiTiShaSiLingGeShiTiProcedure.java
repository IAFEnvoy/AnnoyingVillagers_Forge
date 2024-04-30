package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.entity.FennudeshidifuEntity;

import java.util.Comparator;


public class FennudeshidifuDangZheGeShiTiShaSiLingGeShiTiProcedure {
    /* JADX WARN: Type inference failed for: r1v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangZheGeShiTiShaSiLingGeShiTiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z) {
        LivingEntity livingEntity = world.getEntitiesOfClass(FennudeshidifuEntity.class, AABB.ofSize(new Vec3(x, y, z), 4.0d, 4.0d, 4.0d), e -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuDangZheGeShiTiShaSiLingGeShiTiProcedure.1
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null);
        if (livingEntity instanceof LivingEntity) {
            LivingEntity _entity = livingEntity;
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 2, false, false));
            }
        }
    }
}
