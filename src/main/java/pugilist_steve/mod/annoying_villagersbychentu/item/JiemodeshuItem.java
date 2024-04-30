package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.JiemodeshuDangWuPinZaiShouShangMeiKeFaShengProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.JiemodeshuDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;

import java.util.List;


public class JiemodeshuItem extends Item {
    public JiemodeshuItem() {
        super(new Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
    }

    @Override
    public boolean isCorrectToolForDrops(BlockState state) {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("芥末的书"));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemStack = ar.getObject();
        entity.getX();
        entity.getY();
        entity.getZ();
        JiemodeshuDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(entity);
        return ar;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            JiemodeshuDangWuPinZaiShouShangMeiKeFaShengProcedure.execute(entity);
        }
    }
}
