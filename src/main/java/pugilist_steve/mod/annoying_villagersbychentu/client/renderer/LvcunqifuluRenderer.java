package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.C1393Model;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LvcunqifuluEntity;


public class LvcunqifuluRenderer extends MobRenderer<LvcunqifuluEntity, C1393Model<LvcunqifuluEntity>> {
    public LvcunqifuluRenderer(EntityRendererProvider.Context context) {
        super(context, new C1393Model(context.bakeLayer(C1393Model.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(LvcunqifuluEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/lv_cun_qi_fu_lu_.png");
    }
}
