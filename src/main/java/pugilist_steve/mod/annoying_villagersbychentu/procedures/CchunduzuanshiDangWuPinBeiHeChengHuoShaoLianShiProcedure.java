package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.GameType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;


public class CchunduzuanshiDangWuPinBeiHeChengHuoShaoLianShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        itemstack.enchant(Enchantments.VANISHING_CURSE, 10);
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.POISON, 20, 2, false, false));
            }
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 2));
            }
        }
        entity.hurt(DamageSource.GENERIC, 5.0f);
        if (entity instanceof ServerPlayer _player) {
            _player.setGameMode(GameType.SURVIVAL);
        }
        entity.setSecondsOnFire(15);
    }
}
