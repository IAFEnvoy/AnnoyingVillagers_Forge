package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.entity.ZzidanEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class ZzidanItem extends Item {
    public ZzidanItem() {
        super(new Properties().tab(CreativeModeTab.TAB_COMBAT).durability(100));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.CROSSBOW;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 72000;
    }

    @Override
    public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer entity)) {
            entity.getX();
            entity.getY();
            entity.getZ();
            ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> {
                return e.getItem() == AnnoyingVillagersbychentuModItems.ZIZIDAN.get();
            });
            if (stack == ItemStack.EMPTY) {
                int i = 0;
                while (true) {
                    if (i < entity.getInventory().items.size()) {
                        ItemStack teststack = entity.getInventory().items.get(i);
                        if (teststack == null || teststack.getItem() != AnnoyingVillagersbychentuModItems.ZIZIDAN.get()) {
                            i++;
                        } else {
                            stack = teststack;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (entity.getAbilities().instabuild || stack != ItemStack.EMPTY) {
                ZzidanEntity entityarrow = ZzidanEntity.shoot(world, entity, world.getRandom(), 3.0f, 16.0d, 5);
                itemstack.hurtAndBreak(1, entity, e2 -> {
                    e2.broadcastBreakEvent(entity.getUsedItemHand());
                });
                if (entity.getAbilities().instabuild) {
                    entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                } else if (new ItemStack(AnnoyingVillagersbychentuModItems.ZIZIDAN.get()).isDamageableItem()) {
                    if (stack.hurt(1, world.getRandom(), entity)) {
                        stack.shrink(1);
                        stack.setDamageValue(0);
                        if (stack.isEmpty()) {
                            entity.getInventory().removeItem(stack);
                        }
                    }
                } else {
                    stack.shrink(1);
                    if (stack.isEmpty()) {
                        entity.getInventory().removeItem(stack);
                    }
                }
            }
        }
    }
}
