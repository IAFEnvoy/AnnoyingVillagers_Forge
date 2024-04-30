package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.Random;


public class LleijiandunProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 160, 2));
            }
        }
        if (itemstack.hurt(1, new Random(), null)) {
            itemstack.shrink(1);
            itemstack.setDamageValue(0);
        }
        if (entity instanceof Player _player) {
            _player.getCooldowns().addCooldown(itemstack.getItem(), 175);
        }
    }
}
