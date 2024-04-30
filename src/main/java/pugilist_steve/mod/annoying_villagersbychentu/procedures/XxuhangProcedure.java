package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;


public class XxuhangProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 80, 5));
            }
        }
        if (entity instanceof Player _player) {
            _player.getCooldowns().addCooldown(itemstack.getItem(), 100);
        }
    }
}
