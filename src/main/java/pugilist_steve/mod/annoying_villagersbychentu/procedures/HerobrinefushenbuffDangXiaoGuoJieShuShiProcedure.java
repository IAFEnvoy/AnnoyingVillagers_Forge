package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.GameType;


public class HerobrinefushenbuffDangXiaoGuoJieShuShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && (entity instanceof ServerPlayer _player)) {
            _player.setGameMode(GameType.SURVIVAL);
        }
    }
}
