package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LianyingfenshengEntity;


public class LianyingfenshengRenderer extends HumanoidMobRenderer<LianyingfenshengEntity, HumanoidModel<LianyingfenshengEntity>> {
    public LianyingfenshengRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
        this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
        this.addLayer(new EyesLayer<LianyingfenshengEntity, HumanoidModel<LianyingfenshengEntity>>(this) { // from class: pugilist_steve.mod.annoying_villagersbychentu.client.renderer.LianyingfenshengRenderer.1
            @Override
            public RenderType renderType() {
                return RenderType.eyes(new ResourceLocation("annoying_villagersbychentu:textures/entities/di_jie_fen_shen__eyes.png"));
            }
        });
    }


    @Override
    public ResourceLocation getTextureLocation(LianyingfenshengEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/s_herobrine.png");
    }
}
