package pugilist_steve.mod.annoying_villagersbychentu.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.entity.FulubuhuoqiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.FulubuhuoqiDangYuanChengWuPinShiYongShiProcedure;

import java.util.List;


public class FulubuhuoqiItem extends Item {
    public FulubuhuoqiItem() {
        super(new Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(16));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("可投掷型手铐"));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.SPEAR;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 72000;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (slot == EquipmentSlot.MAINHAND) {
            ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
            builder.putAll(super.getDefaultAttributeModifiers(slot));
            builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Ranged item modifier", 2.0d, AttributeModifier.Operation.ADDITION));
            builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Ranged item modifier", -2.4d, AttributeModifier.Operation.ADDITION));
            return builder.build();
        }
        return super.getDefaultAttributeModifiers(slot);
    }

    @Override
    public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer entity)) {
            entity.getX();
            entity.getY();
            entity.getZ();
            FulubuhuoqiEntity entityarrow = FulubuhuoqiEntity.shoot(world, entity, world.getRandom(), 1.2f, 0.0d, 0);
            itemstack.hurtAndBreak(1, entity, e -> {
                e.broadcastBreakEvent(entity.getUsedItemHand());
            });
            entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
            FulubuhuoqiDangYuanChengWuPinShiYongShiProcedure.execute(entity);
        }
    }
}
