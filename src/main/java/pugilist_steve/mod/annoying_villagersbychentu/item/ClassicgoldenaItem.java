package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;


public abstract class ClassicgoldenaItem extends ArmorItem {
    public ClassicgoldenaItem(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.ClassicgoldenaItem.1
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 27;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot2) {
                return new int[]{3, 5, 6, 3}[slot2.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }

            @Override
            public String getName() {
                return "classicgoldena";
            }

            @Override
            public float getToughness() {
                return 0.7f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0.0f;
            }
        }, slot, properties);
    }


    public static class Helmet extends ClassicgoldenaItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/gold__layer_1.png";
        }
    }


    public static class Chestplate extends ClassicgoldenaItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/gold__layer_1.png";
        }
    }


    public static class Leggings extends ClassicgoldenaItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/gold__layer_2.png";
        }
    }


    public static class Boots extends ClassicgoldenaItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/gold__layer_1.png";
        }
    }
}
