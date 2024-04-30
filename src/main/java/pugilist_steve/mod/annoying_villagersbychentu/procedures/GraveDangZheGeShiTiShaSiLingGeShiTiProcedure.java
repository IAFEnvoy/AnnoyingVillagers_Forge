package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.GraveEntity;

import java.util.Comparator;


public class GraveDangZheGeShiTiShaSiLingGeShiTiProcedure {
    /* JADX WARN: Type inference failed for: r1v6, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangZheGeShiTiShaSiLingGeShiTiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() <= 0.2d) {
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak5")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak5")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 绝望了吧?"), ChatType.SYSTEM, Util.NIL_UUID);
            }
        } else if (Math.random() <= 0.2d) {
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak4")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:gravespeak4")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 还能坚持多少个回合？"), ChatType.SYSTEM, Util.NIL_UUID);
            }
        }
        LivingEntity livingEntity = world.getEntitiesOfClass(GraveEntity.class, AABB.ofSize(new Vec3(x, y, z), 5.0d, 5.0d, 5.0d), e -> {
            return true;
        }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveDangZheGeShiTiShaSiLingGeShiTiProcedure.1
            Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                return Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_x, _y, _z);
                });
            }
        }.compareDistOf(x, y, z)).findFirst().orElse(null);
        if (livingEntity instanceof LivingEntity) {
            LivingEntity _entity = livingEntity;
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 20, 10, false, false));
            }
        }
        if (Math.random() <= 0.2d && !world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("<X_Grave_X> 还要再试一次吗？"), ChatType.SYSTEM, Util.NIL_UUID);
        }
    }
}
