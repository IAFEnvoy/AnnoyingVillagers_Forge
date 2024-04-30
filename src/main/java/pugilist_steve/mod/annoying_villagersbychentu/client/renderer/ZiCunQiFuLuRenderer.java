package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.C1391Model;
import pugilist_steve.mod.annoying_villagersbychentu.entity.ZiCunQiFuLuEntity;


public class ZiCunQiFuLuRenderer extends MobRenderer<ZiCunQiFuLuEntity, C1391Model<ZiCunQiFuLuEntity>> {
    public ZiCunQiFuLuRenderer(EntityRendererProvider.Context context) {
        super(context, new C1391Model(context.bakeLayer(C1391Model.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(ZiCunQiFuLuEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/zi_cun_qi_fu_lu_.png");
    }
}
