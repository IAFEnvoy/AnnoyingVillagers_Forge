package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ZhaohuansteveDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;

import java.util.List;


public class ZhaohuansteveItem extends Item {
    public ZhaohuansteveItem() {
        super(new Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1).rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("右键召唤Steve"));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemStack = ar.getObject();
        entity.getX();
        entity.getY();
        entity.getZ();
        ZhaohuansteveDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(entity);
        return ar;
    }
}
