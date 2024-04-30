package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.gameevent.GameEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.Right_click_fishing_rodProcedure;


public class SpecialFishingRodItem extends FishingRodItem {
    public SpecialFishingRodItem() {
        super(new Properties().tab(CreativeModeTab.TAB_COMBAT).durability(200));
    }

    @Override
    public boolean isValidRepairItem(ItemStack itemstack, ItemStack repairitem) {
        return Ingredient.of(new ItemStack(Items.FISHING_ROD), new ItemStack(Items.STICK), new ItemStack(Blocks.OAK_PLANKS)).test(repairitem);
    }

    @Override
    public int getEnchantmentValue() {
        return 2;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        ItemStack itemstack = entity.getItemInHand(hand);
        if (entity.fishing != null) {
            if (!world.isClientSide()) {
                itemstack.hurtAndBreak(entity.fishing.retrieve(itemstack), entity, i -> {
                    i.broadcastBreakEvent(hand);
                });
            }
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.FISHING_BOBBER_RETRIEVE, SoundSource.NEUTRAL, 1.0f, 0.4f / ((world.getRandom().nextFloat() * 0.4f) + 0.8f));
            world.gameEvent(entity, GameEvent.FISHING_ROD_REEL_IN, entity);
        } else {
            world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), SoundEvents.FISHING_BOBBER_THROW, SoundSource.NEUTRAL, 0.5f, 0.4f / ((world.getRandom().nextFloat() * 0.4f) + 0.8f));
            if (!world.isClientSide()) {
                int k = EnchantmentHelper.getFishingSpeedBonus(itemstack);
                int j = EnchantmentHelper.getFishingLuckBonus(itemstack);
                world.addFreshEntity(new FishingHook(entity, world, j, k) { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.SpecialFishingRodItem.1
                    public boolean shouldStopFishing(Player player) {
                        if (!player.isRemoved() && player.isAlive() && ((player.getMainHandItem().is(AnnoyingVillagersbychentuModItems.SPECIAL_FISHING_ROD.get()) || player.getOffhandItem().is(AnnoyingVillagersbychentuModItems.SPECIAL_FISHING_ROD.get())) && this.distanceToSqr(player) <= 1024.0d)) {
                            return false;
                        }
                        this.discard();
                        return true;
                    }
                });
            }
            entity.awardStat(Stats.ITEM_USED.get(this));
            world.gameEvent(entity, GameEvent.FISHING_ROD_CAST, entity);
        }
        Right_click_fishing_rodProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
        return InteractionResultHolder.sidedSuccess(itemstack, world.isClientSide());
    }
}
