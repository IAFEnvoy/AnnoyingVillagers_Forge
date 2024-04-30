package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.model.CowModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.entity.CowEntity;


public class CowRenderer extends MobRenderer<CowEntity, CowModel<CowEntity>> {
    public CowRenderer(EntityRendererProvider.Context context) {
        super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(CowEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/cow.png");
    }
}
