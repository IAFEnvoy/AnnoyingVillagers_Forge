package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.model.PiglinModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HejinzhulinEntity;


public class HejinzhulinRenderer extends MobRenderer<HejinzhulinEntity, PiglinModel<HejinzhulinEntity>> {
    public HejinzhulinRenderer(EntityRendererProvider.Context context) {
        super(context, new PiglinModel(context.bakeLayer(ModelLayers.PIGLIN)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(HejinzhulinEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/zombified_piglin.png");
    }
}
