package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BeiganrandekelisiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;


public class Herobrine3DangShiTiSiWangShi2Procedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel _level) {
            Mob beiganrandekelisiEntity = new BeiganrandekelisiEntity(AnnoyingVillagersbychentuModEntities.BEIGANRANDEKELISI.get(), _level);
            beiganrandekelisiEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (beiganrandekelisiEntity instanceof Mob) {
                Mob _mobToSpawn = beiganrandekelisiEntity;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(beiganrandekelisiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(beiganrandekelisiEntity);
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("Herobrine3号分身已被摧毁"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 0.0d, 1.0d, 0.0d);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "effect clear @e annoying_villagersbychentu:herobrine");
        }
    }
}
