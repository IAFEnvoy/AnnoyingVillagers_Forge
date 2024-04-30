package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class AnanhejinjianItem extends SwordItem {
    public AnanhejinjianItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.AnanhejinjianItem.1
            @Override
            public int getUses() {
                return 2850;
            }

            @Override
            public float getSpeed() {
                return 8.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 11.0f;
            }

            @Override
            public int getLevel() {
                return 3;
            }

            @Override
            public int getEnchantmentValue() {
                return 30;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(AnnoyingVillagersbychentuModItems.AAHJL.get()));
            }
        }, 3, -2.4f, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
    }
}
