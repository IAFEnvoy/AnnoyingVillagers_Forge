package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.state.BlockState;


public class PutongheiyaoshizhuItem extends Item {
    public PutongheiyaoshizhuItem() {
        super(new Properties().tab(null).stacksTo(64).fireResistant().rarity(Rarity.EPIC));
    }

    @Override
    public boolean isCorrectToolForDrops(BlockState state) {
        return true;
    }
}
