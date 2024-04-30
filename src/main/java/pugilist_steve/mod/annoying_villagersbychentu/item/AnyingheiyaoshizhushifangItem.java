package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.state.BlockState;


public class AnyingheiyaoshizhushifangItem extends Item {
    public AnyingheiyaoshizhushifangItem() {
        super(new Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.EPIC));
    }

    @Override
    public boolean isCorrectToolForDrops(BlockState state) {
        return true;
    }
}
