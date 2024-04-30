package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class HhejinwandaohuoyuansuProcedure {
    /* JADX WARN: Type inference failed for: r0v61, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HhejinwandaohuoyuansuProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/particle minecraft:flame ~ ~1 ~ 0.75 0.75 0.75 1 1000 force");
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.BLOCKS, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.place")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
            }
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2.0d), e -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.distanceToSqr(_center);
        })).collect(Collectors.toList());
        for (Entity entity2 : _entfound) {
            if (entity instanceof Monster) {
                world.setBlock(new BlockPos(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
                entity.setSecondsOnFire(8);
            }
        }
        Level projectileLevel = entity.level;
        if (!projectileLevel.isClientSide()) {
            Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HhejinwandaohuoyuansuProcedure.1
                public Projectile getFireball(Level level, Entity shooter, double ax, double ay, double az) {
                    LargeFireball largeFireball = new LargeFireball(EntityType.FIREBALL, level);
                    largeFireball.setOwner(shooter);
                    largeFireball.xPower = ax;
                    largeFireball.yPower = ay;
                    largeFireball.zPower = az;
                    return largeFireball;
                }
            }.getFireball(projectileLevel, entity, entity.getLookAngle().x / 10.0d, entity.getLookAngle().y / 10.0d, entity.getLookAngle().z / 10.0d);
            _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
            _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
            projectileLevel.addFreshEntity(_entityToSpawn);
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 100, 1, true, false));
            }
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 2, true, false));
            }
        }
        if (entity instanceof LivingEntity _entity3) {
            if (!_entity3.level.isClientSide()) {
                _entity3.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100, 2, true, false));
            }
        }
        if (itemstack.hurt(1, new Random(), null)) {
            itemstack.shrink(1);
            itemstack.setDamageValue(0);
        }
        if (entity instanceof Player _player) {
            _player.getCooldowns().addCooldown(itemstack.getItem(), 120);
        }
    }
}
