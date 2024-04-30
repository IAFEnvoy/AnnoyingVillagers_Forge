package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.LevelAccessor;


public class HerobrineDangXiaoGuoJieShuShiProcedure {
    public static void execute(LevelAccessor world, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            _entity.hurt(new DamageSource("custom").bypassArmor(), 1.0f);
        }
        if (entity instanceof ServerPlayer _player) {
            _player.setGameMode(GameType.SURVIVAL);
        }
        entity.hurt(DamageSource.IN_WALL, 1.0f);
    }
}
