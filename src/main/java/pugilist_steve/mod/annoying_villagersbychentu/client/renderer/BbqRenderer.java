package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.model.ChickenModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BbqEntity;


public class BbqRenderer extends MobRenderer<BbqEntity, ChickenModel<BbqEntity>> {
    public BbqRenderer(EntityRendererProvider.Context context) {
        super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(BbqEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/chicken.png");
    }
}
