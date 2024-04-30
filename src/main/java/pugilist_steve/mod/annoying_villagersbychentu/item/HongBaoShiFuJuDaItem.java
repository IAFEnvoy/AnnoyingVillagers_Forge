package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.HongBaoShiFuJuDaDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;


public class HongBaoShiFuJuDaItem extends SwordItem {
    public HongBaoShiFuJuDaItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HongBaoShiFuJuDaItem.1
            @Override
            public int getUses() {
                return 0;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 16.0f;
            }

            @Override
            public int getLevel() {
                return 4;
            }

            @Override
            public int getEnchantmentValue() {
                return 1;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }
        }, 3, -3.2f, new Properties().tab(CreativeModeTab.TAB_COMBAT));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        HongBaoShiFuJuDaDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(entity);
        return ar;
    }
}
