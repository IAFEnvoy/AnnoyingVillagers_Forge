package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class AanhejinliangaoItem extends SwordItem {
    public AanhejinliangaoItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.AanhejinliangaoItem.1
            @Override
            public int getUses() {
                return 2896;
            }

            @Override
            public float getSpeed() {
                return 16.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 6.0f;
            }

            @Override
            public int getLevel() {
                return 10;
            }

            @Override
            public int getEnchantmentValue() {
                return 30;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(AnnoyingVillagersbychentuModItems.AAHJL.get()));
            }
        }, 3, -3.0f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }
}
