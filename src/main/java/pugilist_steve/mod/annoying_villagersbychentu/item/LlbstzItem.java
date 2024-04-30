package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.KkxtsProcedure;


public abstract class LlbstzItem extends ArmorItem {
    public LlbstzItem(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.LlbstzItem.1
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 48;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot2) {
                return new int[]{5, 6, 8, 6}[slot2.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 10;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.EMERALD));
            }

            @Override
            public String getName() {
                return "llbstz";
            }

            @Override
            public float getToughness() {
                return 2.0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0.2f;
            }
        }, slot, properties);
    }


    public static class Helmet extends LlbstzItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/ik__e_layer_1.png";
        }

        @Override
        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            KkxtsProcedure.execute(entity);
        }
    }


    public static class Chestplate extends LlbstzItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/ik__e_layer_1.png";
        }

        @Override
        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            KkxtsProcedure.execute(entity);
        }
    }


    public static class Leggings extends LlbstzItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/ik__e_layer_2.png";
        }

        @Override
        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            KkxtsProcedure.execute(entity);
        }
    }


    public static class Boots extends LlbstzItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/ik__e_layer_1.png";
        }

        @Override
        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            KkxtsProcedure.execute(entity);
        }
    }
}
