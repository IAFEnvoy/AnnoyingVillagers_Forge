package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.entity.ZaiEZhiWangEntity;


public class ZaiEZhiWangRenderer extends HumanoidMobRenderer<ZaiEZhiWangEntity, HumanoidModel<ZaiEZhiWangEntity>> {
    public ZaiEZhiWangRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
        this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
    }


    @Override
    public ResourceLocation getTextureLocation(ZaiEZhiWangEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/jie_lue_wang_.png");
    }
}
