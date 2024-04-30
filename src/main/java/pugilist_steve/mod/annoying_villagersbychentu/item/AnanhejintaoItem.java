package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public abstract class AnanhejintaoItem extends ArmorItem {
    public AnanhejintaoItem(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.AnanhejintaoItem.1
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 65;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot2) {
                return new int[]{6, 7, 9, 6}[slot2.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 30;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(AnnoyingVillagersbychentuModItems.AAHJL.get()), new ItemStack(AnnoyingVillagersbychentuModItems.AAHJD.get()), new ItemStack(Items.NETHERITE_INGOT));
            }

            @Override
            public String getName() {
                return "ananhejintao";
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


    public static class Helmet extends AnanhejintaoItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/gcd__layer_1.png";
        }
    }


    public static class Chestplate extends AnanhejintaoItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/gcd__layer_1.png";
        }
    }


    public static class Leggings extends AnanhejintaoItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/gcd__layer_2.png";
        }
    }


    public static class Boots extends AnanhejintaoItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/gcd__layer_1.png";
        }
    }
}
