package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.JjiandaojinengProcedure;

import java.util.List;


public class ZzuanshijiandaoItem extends ShearsItem {
    public ZzuanshijiandaoItem() {
        super(new Properties().tab(CreativeModeTab.TAB_TOOLS).durability(1650));
    }

    @Override
    public int getEnchantmentValue() {
        return 12;
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState blockstate) {
        return 8.0f;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        JjiandaojinengProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
        return ar;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("右键清除4格内的生物身上所有buff"));
    }
}
