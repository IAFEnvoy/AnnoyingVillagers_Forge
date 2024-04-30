package pugilist_steve.mod.annoying_villagersbychentu.potion;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraftforge.client.EffectRenderer;

import java.util.function.Consumer;


public class FallMobEffect extends MobEffect {
    public FallMobEffect() {
        super(MobEffectCategory.HARMFUL, -11513776);
    }

    @Override
    public String getDescriptionId() {
        return "effect.annoying_villagersbychentu.fall";
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier) {
        return true;
    }

    @Override
    public void initializeClient(Consumer<EffectRenderer> consumer) {
        consumer.accept(new EffectRenderer() { // from class: pugilist_steve.mod.annoying_villagersbychentu.potion.FallMobEffect.1
            @Override
            public boolean shouldRender(MobEffectInstance effect) {
                return false;
            }

            @Override
            public boolean shouldRenderInvText(MobEffectInstance effect) {
                return false;
            }

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
