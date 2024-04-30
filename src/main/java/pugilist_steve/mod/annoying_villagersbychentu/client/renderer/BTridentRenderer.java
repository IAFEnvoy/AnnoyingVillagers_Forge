package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BTridentEntity;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BTridentShiTiZhanDouTiaoJianProcedure;


public class BTridentRenderer extends HumanoidMobRenderer<BTridentEntity, HumanoidModel<BTridentEntity>> {
    public BTridentRenderer(EntityRendererProvider.Context context) {
        super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
        this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
    }


    @Override
    public ResourceLocation getTextureLocation(BTridentEntity entity) {
        return new ResourceLocation("annoying_villagersbychentu:textures/entities/heiyaoshishiti.png");
    }


    @Override
    public boolean isShaking(BTridentEntity _ent) {
        Level level = _ent.level;
        _ent.getX();
        _ent.getY();
        _ent.getZ();
        return BTridentShiTiZhanDouTiaoJianProcedure.execute();
    }
}
