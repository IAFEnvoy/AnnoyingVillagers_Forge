package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;


public class LuBaoShiChanItem extends ShovelItem {
    public LuBaoShiChanItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.LuBaoShiChanItem.1
            @Override
            public int getUses() {
                return 1561;
            }

            @Override
            public float getSpeed() {
                return 80.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 5.5f;
            }

            @Override
            public int getLevel() {
                return 4;
            }

            @Override
            public int getEnchantmentValue() {
                return 4;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.EMERALD));
            }
        }, 1.0f, -2.0f, new Properties().tab(CreativeModeTab.TAB_TOOLS));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemstack) {
        return true;
    }
}
