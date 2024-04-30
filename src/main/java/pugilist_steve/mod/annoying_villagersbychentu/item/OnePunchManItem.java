package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.OnePunchManDangShiTiBeiGaiWuPinJiZhongProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.OnePunchManDangShiTiHuiDongWuPinShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.OnePunchManDangWuPinZaiShouShangMeiKeFaShengProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.OnePunchManDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;


public class OnePunchManItem extends Item {
    public OnePunchManItem() {
        super(new Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1).rarity(Rarity.EPIC));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.SPEAR;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemstack) {
        return true;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemStack = ar.getObject();
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        OnePunchManDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, x, y, z);
        return ar;
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        OnePunchManDangShiTiBeiGaiWuPinJiZhongProcedure.execute(entity);
        return retval;
    }

    @Override
    public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        boolean retval = super.onEntitySwing(itemstack, entity);
        OnePunchManDangShiTiHuiDongWuPinShiProcedure.execute(entity.level, entity);
        return retval;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            OnePunchManDangWuPinZaiShouShangMeiKeFaShengProcedure.execute(entity);
        }
    }
}
