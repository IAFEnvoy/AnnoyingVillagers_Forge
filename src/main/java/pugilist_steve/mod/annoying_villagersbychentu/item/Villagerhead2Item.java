package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.CunmingzhenyingProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.Villagerhead2DangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;

import java.util.List;


public class Villagerhead2Item extends Item {
    public Villagerhead2Item() {
        super(new Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("右键佩戴"));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemStack = ar.getObject();
        entity.getX();
        entity.getY();
        entity.getZ();
        Villagerhead2DangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(entity);
        return ar;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        CunmingzhenyingProcedure.execute(entity);
    }
}
