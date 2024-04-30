package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.XiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure;


public class XiaodaoItem extends SwordItem {
    public XiaodaoItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.XiaodaoItem.1
            @Override
            public int getUses() {
                return 500;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 2.0f;
            }

            @Override
            public int getLevel() {
                return 1;
            }

            @Override
            public int getEnchantmentValue() {
                return 8;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(Blocks.COBBLESTONE));
            }
        }, 3, -2.2f, new Properties().tab(null));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        XiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, ar.getObject());
        return ar;
    }
}
