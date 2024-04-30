package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.C1393Model;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LanCunQiFuLuEntity;


public class LanCunQiFuLuRenderer extends MobRenderer<LanCunQiFuLuEntity, C1393Model<LanCunQiFuLuEntity>> {
    public LanCunQiFuLuRenderer(EntityRendererProvider.Context context) {
        super(context, new C1393Model(context.bakeLayer(C1393Model.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(LanCunQiFuLuEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/lan_cun_qi_fu_lu_.png");
    }
}
