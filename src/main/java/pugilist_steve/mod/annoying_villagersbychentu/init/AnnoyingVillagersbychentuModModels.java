package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.*;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})

public class AnnoyingVillagersbychentuModModels {
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelScoutH.LAYER_LOCATION, ModelScoutH::createBodyLayer);
        event.registerLayerDefinition(ModelHIM_identity_group.LAYER_LOCATION, ModelHIM_identity_group::createBodyLayer);
        event.registerLayerDefinition(Modelzicunqi_helmet.LAYER_LOCATION, Modelzicunqi_helmet::createBodyLayer);
        event.registerLayerDefinition(Modelnullweapon.LAYER_LOCATION, Modelnullweapon::createBodyLayer);
        event.registerLayerDefinition(Modelgreenknight_armor.LAYER_LOCATION, Modelgreenknight_armor::createBodyLayer);
        event.registerLayerDefinition(C1395Model.LAYER_LOCATION, C1395Model::createBodyLayer);
        event.registerLayerDefinition(Modelhongzhuangjiakuilei.LAYER_LOCATION, Modelhongzhuangjiakuilei::createBodyLayer);
        event.registerLayerDefinition(ModelKnightH.LAYER_LOCATION, ModelKnightH::createBodyLayer);
        event.registerLayerDefinition(Model.LAYER_LOCATION, Model::createBodyLayer);
        event.registerLayerDefinition(ModelGolems.LAYER_LOCATION, ModelGolems::createBodyLayer);
        event.registerLayerDefinition(C1393Model.LAYER_LOCATION, C1393Model::createBodyLayer);
        event.registerLayerDefinition(Modelbluedemontrident.LAYER_LOCATION, Modelbluedemontrident::createBodyLayer);
        event.registerLayerDefinition(Modellancunqi_helmet.LAYER_LOCATION, Modellancunqi_helmet::createBodyLayer);
        event.registerLayerDefinition(Modelbaozhaxiaodao_Converted.LAYER_LOCATION, Modelbaozhaxiaodao_Converted::createBodyLayer);
        event.registerLayerDefinition(C1392Model.LAYER_LOCATION, C1392Model::createBodyLayer);
        event.registerLayerDefinition(Modelhbnull.LAYER_LOCATION, Modelhbnull::createBodyLayer);
        event.registerLayerDefinition(C1394Model.LAYER_LOCATION, C1394Model::createBodyLayer);
        event.registerLayerDefinition(Modeljianbingguozi.LAYER_LOCATION, Modeljianbingguozi::createBodyLayer);
        event.registerLayerDefinition(Modelhongcunqi_helmet.LAYER_LOCATION, Modelhongcunqi_helmet::createBodyLayer);
        event.registerLayerDefinition(Modellvcunqi_helmet.LAYER_LOCATION, Modellvcunqi_helmet::createBodyLayer);
        event.registerLayerDefinition(Modelyinshen.LAYER_LOCATION, Modelyinshen::createBodyLayer);
        event.registerLayerDefinition(Modelarmor.LAYER_LOCATION, Modelarmor::createBodyLayer);
        event.registerLayerDefinition(C1391Model.LAYER_LOCATION, C1391Model::createBodyLayer);
        event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
        event.registerLayerDefinition(Modelherobrine_1.LAYER_LOCATION, Modelherobrine_1::createBodyLayer);
        event.registerLayerDefinition(Modelhbda.LAYER_LOCATION, Modelhbda::createBodyLayer);
        event.registerLayerDefinition(Modelarmor_chestplate.LAYER_LOCATION, Modelarmor_chestplate::createBodyLayer);
    }
}
