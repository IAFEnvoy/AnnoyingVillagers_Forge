package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class ZuanShiChangJianItem extends SwordItem {
    public ZuanShiChangJianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.ZuanShiChangJianItem.1
            @Override
            public int getUses() {
                return 1561;
            }

            @Override
            public float getSpeed() {
                return 8.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 4.5f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 11;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.DIAMOND), new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()));
            }
        }, 3, -2.6f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }
}
