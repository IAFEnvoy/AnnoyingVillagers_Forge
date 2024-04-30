package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.Modelcustom_model;
import pugilist_steve.mod.annoying_villagersbychentu.entity.MaEntity;


public class MaRenderer extends MobRenderer<MaEntity, Modelcustom_model<MaEntity>> {
    public MaRenderer(EntityRendererProvider.Context context) {
        super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(MaEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/horse_skeleton.png");
    }
}
