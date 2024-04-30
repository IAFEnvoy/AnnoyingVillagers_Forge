package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BeiGanRanJianBingGuoZiEntity;


public class BeiGanRanJianBingGuoZiRenderer extends HumanoidMobRenderer<BeiGanRanJianBingGuoZiEntity, HumanoidModel<BeiGanRanJianBingGuoZiEntity>> {
    public BeiGanRanJianBingGuoZiRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
        this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
    }


    @Override
    public ResourceLocation getTextureLocation(BeiGanRanJianBingGuoZiEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/jian_bing_guo_zi__shou_shang_.png");
    }
}
