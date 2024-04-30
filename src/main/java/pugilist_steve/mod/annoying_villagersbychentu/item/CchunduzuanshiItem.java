package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.CchunduzuanshiDangWuPinBeiHeChengHuoShaoLianShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.CchunduzuanshiDangWuPinYouWanJiaDiaoLuoProcedure;

import java.util.List;


public class CchunduzuanshiItem extends Item {
    public CchunduzuanshiItem() {
        super(new Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.EPIC));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("被压缩的钻石，质量最好，硬度最硬"));
    }

    @Override
    public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
        super.onCraftedBy(itemstack, world, entity);
        CchunduzuanshiDangWuPinBeiHeChengHuoShaoLianShiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, itemstack);
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
        CchunduzuanshiDangWuPinYouWanJiaDiaoLuoProcedure.execute(entity.level, entity);
        return true;
    }
}
