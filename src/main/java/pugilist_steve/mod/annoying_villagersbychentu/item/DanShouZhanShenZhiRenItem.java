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
import pugilist_steve.mod.annoying_villagersbychentu.procedures.*;

import java.util.List;


public class DanShouZhanShenZhiRenItem extends SwordItem {
    public DanShouZhanShenZhiRenItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.DanShouZhanShenZhiRenItem.1
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
                return 22.8f;
            }

            @Override
            public int getLevel() {
                return 6;
            }

            @Override
            public int getEnchantmentValue() {
                return 49;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()), new ItemStack(Items.DIAMOND), new ItemStack(Items.ENCHANTED_BOOK));
            }
        }, 3, -2.2f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }

    @Override
    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        DanShouZhanShenZhiRenDangShiTiBeiGongJuJiZhongShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
        return retval;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        C0397x97c9b1a7.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
        return ar;
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
    public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        boolean retval = super.onEntitySwing(itemstack, entity);
        DanShouZhanShenZhiRenDangShiTiHuiDongWuPinShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
        return retval;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            DanShouZhanShenZhiRenDangGongJuChuXianZaiShouZhongShiProcedure.execute(entity);
        }
        TingzhishiyongzszrshiProcedure.execute(entity);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemstack) {
        return true;
    }
}
