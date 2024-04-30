package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.KuileideshouDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure;


public class KuileideshouItem extends Item {
    public KuileideshouItem() {
        super(new Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        KuileideshouDangWuPinZaiBeiBaoZhongMeiKeFaShengProcedure.execute(entity);
    }
}
