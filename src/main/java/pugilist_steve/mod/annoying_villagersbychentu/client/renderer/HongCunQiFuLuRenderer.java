package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.C1392Model;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HongCunQiFuLuEntity;


public class HongCunQiFuLuRenderer extends MobRenderer<HongCunQiFuLuEntity, C1392Model<HongCunQiFuLuEntity>> {
    public HongCunQiFuLuRenderer(EntityRendererProvider.Context context) {
        super(context, new C1392Model(context.bakeLayer(C1392Model.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(HongCunQiFuLuEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/hong_cun_qi_fu_lu_.png");
    }
}
