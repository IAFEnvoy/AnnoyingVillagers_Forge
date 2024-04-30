package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.SherenjianDangYouJianDianJiKongQiShiProcedure;

import java.util.List;


public class SherensuipianItem extends Item {
    public SherensuipianItem() {
        super(new Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("传说蛇刃的碎刃，由铁与混合黑曜石打造的磁性合金"));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemstack = ar.getObject();
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        SherenjianDangYouJianDianJiKongQiShiProcedure.execute(world, x, y, z, entity, itemstack);
        return ar;
    }
}
