package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenjianbingDangYouJianDianJiKongQiShiProcedure;

import java.util.List;


public class SherenjianbingItem extends Item {
    public SherenjianbingItem() {
        super(new Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("传说蛇刃的剑柄，由混合黑曜石打造"));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemStack = ar.getObject();
        entity.getX();
        entity.getY();
        entity.getZ();
        SherenjianbingDangYouJianDianJiKongQiShiProcedure.execute(entity);
        return ar;
    }
}
