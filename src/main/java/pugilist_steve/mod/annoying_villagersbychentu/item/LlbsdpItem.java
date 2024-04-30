package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.GgedangdunProcedure;


public class LlbsdpItem extends SwordItem {
    public LlbsdpItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.LlbsdpItem.1
            @Override
            public int getUses() {
                return 1850;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 5.5f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 18;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.EMERALD));
            }
        }, 3, -3.0f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        GgedangdunProcedure.execute(entity, ar.getObject());
        return ar;
    }
}
