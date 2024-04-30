package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

import java.util.Random;


public class GgedangdunProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 3));
            }
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 80, 1));
            }
        }
        if (itemstack.hurt(2, new Random(), null)) {
            itemstack.shrink(1);
            itemstack.setDamageValue(0);
        }
    }
}
