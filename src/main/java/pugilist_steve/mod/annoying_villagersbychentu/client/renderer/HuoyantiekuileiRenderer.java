package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.ModelGolems;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HuoyantiekuileiEntity;


public class HuoyantiekuileiRenderer extends MobRenderer<HuoyantiekuileiEntity, ModelGolems<HuoyantiekuileiEntity>> {
    public HuoyantiekuileiRenderer(EntityRendererProvider.Context context) {
        super(context, new ModelGolems(context.bakeLayer(ModelGolems.LAYER_LOCATION)), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(HuoyantiekuileiEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/firegolem.png");
    }
}
