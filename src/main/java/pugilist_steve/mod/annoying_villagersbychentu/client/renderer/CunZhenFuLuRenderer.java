package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.Model;
import pugilist_steve.mod.annoying_villagersbychentu.entity.CunZhenFuLuEntity;


public class CunZhenFuLuRenderer extends MobRenderer<CunZhenFuLuEntity, Model<CunZhenFuLuEntity>> {
    public CunZhenFuLuRenderer(EntityRendererProvider.Context context) {
        super(context, new Model(context.bakeLayer(Model.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(CunZhenFuLuEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/cun_zhen_fu_lu_.png");
    }
}
