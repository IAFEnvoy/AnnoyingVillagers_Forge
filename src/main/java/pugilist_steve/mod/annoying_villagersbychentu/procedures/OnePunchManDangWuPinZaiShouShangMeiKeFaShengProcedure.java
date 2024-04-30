package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;


public class OnePunchManDangWuPinZaiShouShangMeiKeFaShengProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1, 255, false, false));
            }
        }
        if (entity instanceof Player _player) {
            _player.getAbilities().mayfly = true;
            _player.onUpdateAbilities();
        }
    }
}
