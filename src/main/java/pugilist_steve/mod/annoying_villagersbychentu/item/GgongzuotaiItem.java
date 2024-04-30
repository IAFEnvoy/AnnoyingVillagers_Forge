package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.GgedangProcedure;


public class GgongzuotaiItem extends AxeItem {
    public GgongzuotaiItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.GgongzuotaiItem.1
            @Override
            public int getUses() {
                return 20;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 5.0f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 4;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.STICK), new ItemStack(Blocks.STRIPPED_OAK_WOOD), new ItemStack(AnnoyingVillagersbychentuModItems.GGONGZUOTAI.get()));
            }
        }, 1.0f, -2.8f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        GgedangProcedure.execute(entity, ar.getObject());
        return ar;
    }
}
