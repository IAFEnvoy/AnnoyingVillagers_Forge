package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.ModelKnightH;

import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;


public abstract class HongCunQihelmetItem extends ArmorItem {
    public HongCunQihelmetItem(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HongCunQihelmetItem.1
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 25;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot2) {
                return new int[]{4, 5, 7, 6}[slot2.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 10;
            }

            @Override
            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.of();
            }

            @Override
            public String getName() {
                return "hong_cun_qihelmet";
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


    public static class Helmet extends HongCunQihelmetItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public void initializeClient(Consumer<IItemRenderProperties> consumer) {
            consumer.accept(new IItemRenderProperties() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.HongCunQihelmetItem.Helmet.1
                @Override
                public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("head", new ModelKnightH(Minecraft.getInstance().getEntityModels().bakeLayer(ModelKnightH.LAYER_LOCATION)).Head, "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/entities/red.png";
        }
    }


    public static class Chestplate extends HongCunQihelmetItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/cun_min_qi_shi_hong_se_xiong_jia___layer_1.png";
        }
    }


    public static class Leggings extends HongCunQihelmetItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/cun_min_qi_shi_hong_se_xiong_jia___layer_2.png";
        }
    }


    public static class Boots extends HongCunQihelmetItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Properties().tab(CreativeModeTab.TAB_COMBAT));
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/models/armor/cun_min_qi_shi_hong_se_xiong_jia___layer_1.png";
        }
    }
}
