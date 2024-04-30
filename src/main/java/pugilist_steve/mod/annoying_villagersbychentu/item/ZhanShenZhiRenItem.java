package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ZhanShenZhiRenDangGongJuChuXianZaiWuPinLanShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ZhanShenZhiRenDangShiTiBeiGongJuJiZhongShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ZhanShenZhiRenDangWuPinBeiHeChengHuoShaoLianShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ZhanShenZhiRenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;

import java.util.List;


public class ZhanShenZhiRenItem extends SwordItem {
    public ZhanShenZhiRenItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.ZhanShenZhiRenItem.1
            @Override
            public int getUses() {
                return 9999;
            }

            @Override
            public float getSpeed() {
                return 50.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 17.9f;
            }

            @Override
            public int getLevel() {
                return 50;
            }

            @Override
            public int getEnchantmentValue() {
                return 50;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()), new ItemStack(Items.DIAMOND));
            }
        }, 3, -0.6f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        ZhanShenZhiRenDangShiTiBeiGongJuJiZhongShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
        return retval;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ZhanShenZhiRenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
        return ar;
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemstack) {
        return new ItemStack(this);
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("传说中的武器之一"));
    }

    @Override
    public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
        super.onCraftedBy(itemstack, world, entity);
        ZhanShenZhiRenDangWuPinBeiHeChengHuoShaoLianShiProcedure.execute(itemstack);
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            ZhanShenZhiRenDangGongJuChuXianZaiWuPinLanShiProcedure.execute(entity);
        }
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemstack) {
        return true;
    }
}
