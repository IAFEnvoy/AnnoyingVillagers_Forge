package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.SifangsherenDangGongJuChuXianZaiShouZhongShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.SifangsherenDangYouJianDianJiKongQiShiProcedure;

import java.util.List;


public class SifangsherenItem extends SwordItem {
    public SifangsherenItem() {
        super(new Tier() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.SifangsherenItem.1
            @Override
            public int getUses() {
                return 1561;
            }

            @Override
            public float getSpeed() {
                return 4.0f;
            }

            @Override
            public float getAttackDamageBonus() {
                return 18.0f;
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
                return Ingredient.of();
            }
        }, 3, -2.6f, new Properties().tab(null).fireResistant());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        SifangsherenDangYouJianDianJiKongQiShiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
        return ar;
    }

    @Override
    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("§5herobrine传说中的武器之一，释放形态"));
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected) {
            SifangsherenDangGongJuChuXianZaiShouZhongShiProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
        }
    }
}
