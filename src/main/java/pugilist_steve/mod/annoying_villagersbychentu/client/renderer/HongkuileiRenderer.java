package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.ModelGolems;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HongkuileiEntity;


public class HongkuileiRenderer extends MobRenderer<HongkuileiEntity, ModelGolems<HongkuileiEntity>> {
    public HongkuileiRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelGolems(context.bakeLayer(ModelGolems.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(HongkuileiEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/enchant_golem.png");
    }
}
