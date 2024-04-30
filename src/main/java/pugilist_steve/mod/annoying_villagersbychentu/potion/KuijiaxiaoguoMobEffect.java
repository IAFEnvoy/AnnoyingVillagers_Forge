package pugilist_steve.mod.annoying_villagersbychentu.potion;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraftforge.client.EffectRenderer;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.KuijiaxiaoguoDangXiaoGuoJieShuShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.KuijiaxiaoguoDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure;

import java.util.function.Consumer;


public class KuijiaxiaoguoMobEffect extends MobEffect {
    public KuijiaxiaoguoMobEffect() {
        super(MobEffectCategory.HARMFUL, -16737844);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.kuijiaxiaoguo";
    }

    @Override
    public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        KuijiaxiaoguoDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    @Override
    public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        super.removeAttributeModifiers(entity, attributeMap, amplifier);
        KuijiaxiaoguoDangXiaoGuoJieShuShiProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public void initializeClient(Consumer<EffectRenderer> consumer) {
        consumer.accept(new EffectRenderer() { // from class: pugilist_steve.mod.annoying_villagersbychentu.potion.KuijiaxiaoguoMobEffect.1
            @Override
            public boolean shouldRenderHUD(MobEffectInstance effect) {
                return false;
            }

            @Override
            public void renderInventoryEffect(MobEffectInstance effect, EffectRenderingInventoryScreen<?> gui, PoseStack mStack, int x, int y, float z) {
            }

            @Override
            public void renderHUDEffect(MobEffectInstance effect, GuiComponent gui, PoseStack mStack, int x, int y, float z, float alpha) {
            }
        });
    }
}
