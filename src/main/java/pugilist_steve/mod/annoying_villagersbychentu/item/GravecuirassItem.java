package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.GravecuirassXiongJiaShiJianMeiYouXiKeProcedure;


public abstract class GravecuirassItem extends ArmorItem {
    public GravecuirassItem(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.GravecuirassItem.1
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 60;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot2) {
                return new int[]{0, 0, 25, 0}[slot2.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 20;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.EMERALD), new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()), new ItemStack(AnnoyingVillagersbychentuModItems.LLBSTZ_CHESTPLATE.get()), new ItemStack(Blocks.EMERALD_BLOCK), new ItemStack(Items.DIAMOND));
            }

            @Override
            public String getName() {
                return "gravecuirass";
            }

            @Override
            public float getToughness() {
                return 2.0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0.0f;
            }
        }, slot, properties);
    }


    public static class Chestplate extends GravecuirassItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/grave__layer_1.png";
        }

        @Override
        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            GravecuirassXiongJiaShiJianMeiYouXiKeProcedure.execute(entity);
        }
    }
}
