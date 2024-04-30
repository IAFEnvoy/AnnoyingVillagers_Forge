package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HeisezhenzhuEntity;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.HeisezhenzhuDangYuanChengWuPinShiYongShiProcedure;

import java.util.List;


public class HeisezhenzhuItem extends Item {
    public HeisezhenzhuItem() {
        super(new Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(16));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("末影珍珠的变种，速度更快"));
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
            HeisezhenzhuEntity entityarrow = HeisezhenzhuEntity.shoot(world, entity, world.getRandom(), 1.4f, 0.0d, 0);
            itemstack.hurtAndBreak(1, entity, e -> {
                e.broadcastBreakEvent(entity.getUsedItemHand());
            });
            entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
            HeisezhenzhuDangYuanChengWuPinShiYongShiProcedure.execute(entity, itemstack);
        }
    }
}
