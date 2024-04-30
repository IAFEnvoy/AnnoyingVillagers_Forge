package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Comparator;


public class AlexDangZheGeShiTiShaSiLingGeShiTiProcedure {
    /* JADX WARN: Type inference failed for: r1v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangZheGeShiTiShaSiLingGeShiTiProcedure$1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangZheGeShiTiShaSiLingGeShiTiProcedure$2] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() < 0.2d && !entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"<Alex> 呵，手下败将\"}");
        }
        if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.0d, 1.0d, 1.0d), e -> {
            return true;
        }).isEmpty()) {
            if (!world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.0d, 1.0d, 1.0d), e2 -> {
                return true;
            }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangZheGeShiTiShaSiLingGeShiTiProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null).level.isClientSide()) {
                world.getEntitiesOfClass(ItemEntity.class, AABB.ofSize(new Vec3(x, y, z), 1.0d, 1.0d, 1.0d), e3 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexDangZheGeShiTiShaSiLingGeShiTiProcedure.2
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).discard();
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
    }
}
