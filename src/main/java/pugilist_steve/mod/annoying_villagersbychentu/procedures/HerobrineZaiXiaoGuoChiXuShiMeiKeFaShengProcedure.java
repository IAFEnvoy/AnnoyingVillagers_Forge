package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.LevelAccessor;


public class HerobrineZaiXiaoGuoChiXuShiMeiKeFaShengProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof ServerPlayer) {
            ((ServerPlayer) entity).setGameMode(GameType.ADVENTURE);
        }
        if (entity instanceof ServerPlayer _player) {
            Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("annoying_villagersbychentu:shenbuhuiliuxue"));
            AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
            if (!_ap.isDone()) {
                for (String str : _ap.getRemainingCriteria()) {
                    _player.getAdvancements().award(_adv, str);
                }
            }
        }
        if (entity instanceof Player) {
            ((Player) entity).causeFoodExhaustion(0.1f);
        }
        if (Math.random() <= 0.001d) {
            entity.hurt(DamageSource.GENERIC, 3.5f);
        }
    }
}
