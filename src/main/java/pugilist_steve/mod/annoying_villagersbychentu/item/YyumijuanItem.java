package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.JjuanbingProcedure;


public class YyumijuanItem extends Item {
    public YyumijuanItem() {
        super(new Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(20).saturationMod(1.0f).alwaysEat().build()));
    }

    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = super.finishUsingItem(itemstack, world, entity);
        entity.getX();
        entity.getY();
        entity.getZ();
        JjuanbingProcedure.execute(entity);
        return retval;
    }
}
