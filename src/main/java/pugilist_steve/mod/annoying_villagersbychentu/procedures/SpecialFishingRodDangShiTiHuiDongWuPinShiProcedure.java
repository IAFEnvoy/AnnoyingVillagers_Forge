package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;


public class SpecialFishingRodDangShiTiHuiDongWuPinShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        entity.teleportTo(entity.getLookAngle().x / 10.0d, entity.getLookAngle().y / 10.0d, entity.getLookAngle().z / 10.0d);
        if (entity instanceof ServerPlayer _serverPlayer) {
            _serverPlayer.connection.teleport(entity.getLookAngle().x / 10.0d, entity.getLookAngle().y / 10.0d, entity.getLookAngle().z / 10.0d, entity.getYRot(), entity.getXRot());
        }
    }
}
