package pugilist_steve.mod.annoying_villagersbychentu.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.IItemRenderProperties;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.Modelarmor_chestplate;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.WangzhikuijiaXiongJiaShiJianMeiYouXiKeProcedure;

import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;


public abstract class WangzhikuijiaItem extends ArmorItem {
    public WangzhikuijiaItem(EquipmentSlot slot, Properties properties) {
        super(new ArmorMaterial() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.WangzhikuijiaItem.1
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 81;
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot2) {
                return new int[]{0, 0, 24, 0}[slot2.getIndex()];
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
                return Ingredient.of(new ItemStack(Items.EMERALD), new ItemStack(AnnoyingVillagersbychentuModItems.LLBSTZ_HELMET.get()), new ItemStack(AnnoyingVillagersbychentuModItems.LLBSTZ_CHESTPLATE.get()), new ItemStack(AnnoyingVillagersbychentuModItems.GRAVECUIRASS_CHESTPLATE.get()));
            }

            @Override
            public String getName() {
                return "wangzhikuijia";
            }

            @Override
            public float getToughness() {
                return 2.5f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0.0f;
            }
        }, slot, properties);
    }


    public static class Chestplate extends WangzhikuijiaItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Properties().tab(CreativeModeTab.TAB_COMBAT).fireResistant());
        }

        @Override
        public void initializeClient(Consumer<IItemRenderProperties> consumer) {
            consumer.accept(new IItemRenderProperties() { // from class: pugilist_steve.mod.annoying_villagersbychentu.item.WangzhikuijiaItem.Chestplate.1
                @Override
                @OnlyIn(Dist.CLIENT)
                public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                    HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(), Map.of("body", new Modelarmor_chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(Modelarmor_chestplate.LAYER_LOCATION)).Body, "left_arm", new Modelarmor_chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(Modelarmor_chestplate.LAYER_LOCATION)).LeftArm, "right_arm", new Modelarmor_chestplate(Minecraft.getInstance().getEntityModels().bakeLayer(Modelarmor_chestplate.LAYER_LOCATION)).RightArm, "head", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg", new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                    armorModel.crouching = living.isShiftKeyDown();
                    armorModel.riding = defaultModel.riding;
                    armorModel.young = living.isBaby();
                    return armorModel;
                }
            });
        }

        @Override
        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "annoying_villagersbychentu:textures/entities/kuijia.png";
        }

        @Override
        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            WangzhikuijiaXiongJiaShiJianMeiYouXiKeProcedure.execute(entity);
        }
    }
}
