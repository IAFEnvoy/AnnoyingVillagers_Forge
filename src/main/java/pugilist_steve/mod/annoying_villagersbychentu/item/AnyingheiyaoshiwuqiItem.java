package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.AnyinghaiyaoshiProcedure;


public class AnyingheiyaoshiwuqiItem extends SwordItem {
    public AnyingheiyaoshiwuqiItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.AnyingheiyaoshiwuqiItem.1
            @Override
            public int getUses() {
                return 3000;
            }

            @Override
            public float getSpeed() {
                return 50.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 16.0f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 0;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Blocks.OBSIDIAN));
            }
        }, 3, 0.5f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        AnyinghaiyaoshiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
        return ar;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        AnyinghaiyaoshiProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
        return InteractionResult.SUCCESS;
    }

    @Override
    public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        boolean retval = super.onEntitySwing(itemstack, entity);
        AnyinghaiyaoshiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
        return retval;
    }
}
