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
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public abstract class SunarmourItem extends ArmorItem {
    public SunarmourItem(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.SunarmourItem.1
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 25;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot2) {
                return new int[]{4, 6, 7, 5}[slot2.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 9;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(AnnoyingVillagersbychentuModItems.HHONGBAOSHI.get()));
            }

            @Override
            public String getName() {
                return "sunarmour";
            }

            @Override
            public float getToughness() {
                return 0.0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0.0f;
            }
        }, slot, properties);
    }


    public static class Helmet extends SunarmourItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/sun_layer_1.png";
        }
    }


    public static class Chestplate extends SunarmourItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/sun_layer_1.png";
        }
    }


    public static class Leggings extends SunarmourItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/sun_layer_2.png";
        }
    }


    public static class Boots extends SunarmourItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/sun_layer_1.png";
        }
    }
}
