package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class TingzhishiyongzszrshiProcedure {
    public static void execute(Entity entity) {
        ItemStack itemStack;
        int i;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.DAN_SHOU_ZHAN_SHEN_ZHI_REN.get()) {
            if (entity instanceof Player _player) {
                _player.causeFoodExhaustion(0.1f);
                return;
            }
            return;
        }
        if (entity instanceof Player _plr) {
            i = _plr.getFoodData().getFoodLevel();
        } else {
            i = 0;
        }
        if (i >= 8 || !(entity instanceof LivingEntity _entity)) {
            return;
        }
        if (!_entity.level.isClientSide()) {
            _entity.addEffect(new MobEffectInstance(MobEffects.SATURATION, 11, 0, false, false));
        }
    }
}
