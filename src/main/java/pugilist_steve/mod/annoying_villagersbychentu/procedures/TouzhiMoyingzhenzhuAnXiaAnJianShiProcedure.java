package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.FumomoyingzhenzhuEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class TouzhiMoyingzhenzhuAnXiaAnJianShiProcedure {
    /* JADX WARN: Type inference failed for: r0v34, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.TouzhiMoyingzhenzhuAnXiaAnJianShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v70, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.TouzhiMoyingzhenzhuAnXiaAnJianShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof Player _playerHasItem) {
            if (_playerHasItem.getInventory().contains(new ItemStack(AnnoyingVillagersbychentuModItems.FUMOMOYINGZHENZHU.get()))) {
                Level projectileLevel = entity.level;
                if (!projectileLevel.isClientSide()) {
                    Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.TouzhiMoyingzhenzhuAnXiaAnJianShiProcedure.1
                        public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                            AbstractArrow entityToSpawn = new FumomoyingzhenzhuEntity(AnnoyingVillagersbychentuModEntities.FUMOMOYINGZHENZHU.get(), level);
                            entityToSpawn.setOwner(shooter);
                            entityToSpawn.setBaseDamage(damage);
                            entityToSpawn.setKnockback(knockback);
                            entityToSpawn.setSilent(true);
                            return entityToSpawn;
                        }
                    }.getArrow(projectileLevel, entity, 0.0f, 0);
                    _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.6f, 0.0f);
                    projectileLevel.addFreshEntity(_entityToSpawn);
                }
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:throw")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        return;
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:throw")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        return;
                    }
                }
                return;
            }
        }
        if (entity instanceof Player _playerHasItem2) {
            if (_playerHasItem2.getInventory().contains(new ItemStack(Items.ENDER_PEARL))) {
                if (entity instanceof Player _player) {
                    ItemStack _stktoremove = new ItemStack(Items.ENDER_PEARL);
                    _player.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove.getItem() == p.getItem();
                    }, 1, _player.inventoryMenu.getCraftSlots());
                }
                if (world instanceof Level _level2) {
                    if (!_level2.isClientSide()) {
                        _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:throw")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:throw")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                Level projectileLevel2 = entity.level;
                if (!projectileLevel2.isClientSide()) {
                    Projectile _entityToSpawn2 = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.TouzhiMoyingzhenzhuAnXiaAnJianShiProcedure.2
                        public Projectile getProjectile(Level level, Entity shooter) {
                            ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                            thrownEnderpearl.setOwner(shooter);
                            return thrownEnderpearl;
                        }
                    }.getProjectile(projectileLevel2, entity);
                    _entityToSpawn2.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                    _entityToSpawn2.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.6f, 0.0f);
                    projectileLevel2.addFreshEntity(_entityToSpawn2);
                    return;
                }
                return;
            }
        }
        if ((entity instanceof Player _player2) && ((Player) entity).getCooldowns().isOnCooldown(Items.ENDER_PEARL) && (entity instanceof Player)) {
            if (!_player2.level.isClientSide()) {
                _player2.displayClientMessage(new TextComponent("冷却中"), true);
            }
        }
    }
}
