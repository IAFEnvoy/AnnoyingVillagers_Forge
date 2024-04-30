package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HerobrinejiyanEntity;


public class HerobrinejiyanItem extends Item {
    public HerobrinejiyanItem() {
        super(new Properties().tab(null).durability(100));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BOW;
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
            HerobrinejiyanEntity entityarrow = HerobrinejiyanEntity.shoot(world, entity, world.getRandom(), 0.9f, 1.0d, 0);
            itemstack.hurtAndBreak(1, entity, e -> {
                e.broadcastBreakEvent(entity.getUsedItemHand());
            });
            entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
        }
    }
}
