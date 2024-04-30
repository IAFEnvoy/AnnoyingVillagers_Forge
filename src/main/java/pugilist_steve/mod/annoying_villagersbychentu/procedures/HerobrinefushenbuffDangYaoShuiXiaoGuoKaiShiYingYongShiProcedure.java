package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import pugilist_steve.mod.annoying_villagersbychentu.entity.DiJiherobrineEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HerobrinefenshenEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;


public class HerobrinefushenbuffDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure {
    /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefushenbuffDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof ServerPlayer _player) {
            _player.setGameMode(GameType.SPECTATOR);
        }
        if (new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HerobrinefushenbuffDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.1
            public boolean checkGamemode(Entity _ent) {
                if (_ent instanceof ServerPlayer _serverPlayer) {
                    return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
                } else if (_ent.level.isClientSide() && (_ent instanceof Player _player2)) {
                    return Minecraft.getInstance().getConnection().getPlayerInfo(_player2.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player2.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
                } else {
                    return false;
                }
            }
        }.checkGamemode(entity)) {
            if (Math.random() <= 0.3d) {
                if (world instanceof ServerLevel _level) {
                    Mob herobrinefenshenEntity = new HerobrinefenshenEntity(AnnoyingVillagersbychentuModEntities.HEROBRINEFENSHEN.get(), _level);
                    herobrinefenshenEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                    if (herobrinefenshenEntity instanceof Mob) {
                        Mob _mobToSpawn = herobrinefenshenEntity;
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(herobrinefenshenEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    }
                    world.addFreshEntity(herobrinefenshenEntity);
                }
            } else if (world instanceof ServerLevel _level2) {
                Mob diJiherobrineEntity = new DiJiherobrineEntity(AnnoyingVillagersbychentuModEntities.DI_JIHEROBRINE.get(), _level2);
                diJiherobrineEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (diJiherobrineEntity instanceof Mob) {
                    Mob _mobToSpawn2 = diJiherobrineEntity;
                    _mobToSpawn2.finalizeSpawn(_level2, world.getCurrentDifficultyAt(diJiherobrineEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(diJiherobrineEntity);
            }
        }
    }
}
