package pugilist_steve.mod.annoying_villagersbychentu.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;


public class Modelbluedemontrident<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "modelbluedemontrident"), "main");
    public final ModelPart trident;

    public Modelbluedemontrident(ModelPart root) {
        this.trident = root.getChild("trident");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("trident", CubeListBuilder.create().texOffs(0, 0).addBox(-0.51f, -28.01f, -0.51f, 1.02f, 31.02f, 1.02f, new CubeDeformation(0.0f)).texOffs(4, 0).addBox(-1.5f, -24.0f, -0.5f, 3.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 3).addBox(-2.5f, -27.0f, -0.5f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 3).addBox(1.5f, -27.0f, -0.5f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 24.0f, 0.0f, 0.0f, 1.5708f, -3.1416f));
        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.trident.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
