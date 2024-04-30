package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.entity.GraveEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class CunQiDangShiTiGengXinKeShiProcedure {
    /* JADX WARN: Type inference failed for: r0v95, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunQiDangShiTiGengXinKeShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        float f;
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2.0d), e -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.distanceToSqr(_center);
        })).collect(Collectors.toList());
        for (Entity entity2 : _entfound) {
            if (world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e2 -> {
                return true;
            }).isEmpty()) {
                if (world.getEntitiesOfClass(GraveEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e3 -> {
                    return true;
                }).isEmpty()) {
                    if (entity instanceof LivingEntity _livEnt) {
                        itemStack = _livEnt.getMainHandItem();
                    } else {
                        itemStack = ItemStack.EMPTY;
                    }
                    if (itemStack.getItem() == Items.BOW) {
                        if (entity instanceof LivingEntity) {
                            Player player = (LivingEntity) entity;
                            ItemStack _setstack = new ItemStack(Items.BOW);
                            _setstack.setCount(1);
                            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                            if (player instanceof Player) {
                                Player _player = player;
                                _player.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            Player player2 = (LivingEntity) entity;
                            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_JIAN.get());
                            _setstack2.setCount(1);
                            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                            if (player2 instanceof Player) {
                                Player _player2 = player2;
                                _player2.getInventory().setChanged();
                            }
                        }
                        Level projectileLevel = entity.level;
                        if (!projectileLevel.isClientSide()) {
                            Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunQiDangShiTiGengXinKeShiProcedure.1
                                public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
                                    Arrow arrow = new Arrow(EntityType.ARROW, level);
                                    arrow.setOwner(shooter);
                                    arrow.setBaseDamage(damage);
                                    arrow.setKnockback(knockback);
                                    return arrow;
                                }
                            }.getArrow(projectileLevel, entity, 2.0f, 1);
                            _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
                            _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 1.0f, 0.0f);
                            projectileLevel.addFreshEntity(_entityToSpawn);
                        }
                    }
                }
            }
            if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e4 -> {
                return true;
            }).isEmpty()) {
                if ((!world.getEntitiesOfClass(GraveEntity.class, AABB.ofSize(new Vec3(x, y, z), 2.0d, 2.0d, 2.0d), e5 -> {
                    return true;
                }).isEmpty()) && (entity instanceof LivingEntity)) {
                    Player player3 = (LivingEntity) entity;
                    ItemStack _setstack3 = new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_JIAN.get());
                    _setstack3.setCount(1);
                    player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                    if (player3 instanceof Player) {
                        Player _player3 = player3;
                        _player3.getInventory().setChanged();
                    }
                }
            }
        }
        if (entity instanceof LivingEntity _livEnt2) {
            f = _livEnt2.getHealth();
        } else {
            f = -1.0f;
        }
        if (f <= 30.0f) {
            if (entity instanceof LivingEntity) {
                Player player4 = (LivingEntity) entity;
                ItemStack _setstack4 = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
                _setstack4.setCount(1);
                player4.setItemInHand(InteractionHand.OFF_HAND, _setstack4);
                if (player4 instanceof Player) {
                    Player _player4 = player4;
                    _player4.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 1));
                }
            }
        }
    }
}
