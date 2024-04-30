package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.commands.arguments.EntityAnchorArgument;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.util.Comparator;

@Mod.EventBusSubscriber

public class BetterFishingRodProcedure {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getPlayer().getUsedItemHand()) {
            return;
        }
        execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure$4] */
    /* JADX WARN: Type inference failed for: r5v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure$1] */
    /* JADX WARN: Type inference failed for: r6v22, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure$2] */
    /* JADX WARN: Type inference failed for: r6v5, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure$5] */
    /* JADX WARN: Type inference failed for: r7v21, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure$3] */
    /* JADX WARN: Type inference failed for: r7v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure$6] */
    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == Items.FISHING_ROD) {
            if (entity instanceof LivingEntity _livEnt2) {
                itemStack6 = _livEnt2.getMainHandItem();
            } else {
                itemStack6 = ItemStack.EMPTY;
            }
            if (itemStack6.getDisplayName().getString().equals("fishing")) {
                if (entity instanceof LivingEntity _livEnt3) {
                    itemStack8 = _livEnt3.getMainHandItem();
                } else {
                    itemStack8 = ItemStack.EMPTY;
                }
                itemStack8.setHoverName(new TextComponent("fishing rod"));
                entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 50.0d, 50.0d, 50.0d), e -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure.1
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).getX(), world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 50.0d, 50.0d, 50.0d), e2 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure.2
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).getY(), world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 50.0d, 50.0d, 50.0d), e3 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure.3
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).getZ()));
                entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * 1.2d, entity.getY() * 1.2d, entity.getZ() * 1.2d));
                return;
            }
            if (entity instanceof LivingEntity _livEnt4) {
                itemStack7 = _livEnt4.getMainHandItem();
            } else {
                itemStack7 = ItemStack.EMPTY;
            }
            itemStack7.setHoverName(new TextComponent("fishing"));
            return;
        }
        if (entity instanceof LivingEntity _livEnt5) {
            itemStack2 = _livEnt5.getOffhandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (itemStack2.getItem() == Items.FISHING_ROD) {
            if (entity instanceof LivingEntity _livEnt6) {
                itemStack3 = _livEnt6.getOffhandItem();
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            if (itemStack3.getDisplayName().getString().equals("fishing")) {
                if (entity instanceof LivingEntity _livEnt7) {
                    itemStack5 = _livEnt7.getOffhandItem();
                } else {
                    itemStack5 = ItemStack.EMPTY;
                }
                itemStack5.setHoverName(new TextComponent("fishing rod"));
                entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 50.0d, 50.0d, 50.0d), e4 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure.4
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).getX(), world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 50.0d, 50.0d, 50.0d), e5 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure.5
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).getY(), world.getEntitiesOfClass(FishingHook.class, AABB.ofSize(new Vec3(x, y, z), 50.0d, 50.0d, 50.0d), e6 -> {
                    return true;
                }).stream().sorted(new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BetterFishingRodProcedure.6
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null).getZ()));
                entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * 1.2d, entity.getY() * 1.2d, entity.getZ() * 1.2d));
                return;
            }
            if (entity instanceof LivingEntity _livEnt8) {
                itemStack4 = _livEnt8.getOffhandItem();
            } else {
                itemStack4 = ItemStack.EMPTY;
            }
            itemStack4.setHoverName(new TextComponent("fishing"));
        }
    }
}
