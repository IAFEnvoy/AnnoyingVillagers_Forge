package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

import java.util.List;


public class JoinGraveItemItem extends Item {
    public JoinGraveItemItem() {
        super(new Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("对着Grave右键即可加入Grave的阵营"));
    }
}
