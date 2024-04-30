package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;


public class ZizidanItem extends Item {
    public ZizidanItem() {
        super(new Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(16).rarity(Rarity.COMMON));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.CROSSBOW;
    }
}
