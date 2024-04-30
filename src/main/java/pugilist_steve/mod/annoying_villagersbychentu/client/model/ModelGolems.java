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


public class ModelGolems<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "model_golems"), "main");
    public final ModelPart golem;

    public ModelGolems(ModelPart root) {
        this.golem = root.getChild("golem");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition golem = partdefinition.addOrReplaceChild("golem", CubeListBuilder.create(), PartPose.offset(0.0f, -7.0f, 0.0f));
        PartDefinition body = golem.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 40).addBox(-9.0f, -2.0f, -6.0f, 18.0f, 12.0f, 11.0f, new CubeDeformation(0.0f)).texOffs(0, 70).addBox(-4.5f, 10.0f, -3.0f, 9.0f, 5.0f, 6.0f, new CubeDeformation(0.5f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -12.0f, -5.5f, 8.0f, 10.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(-1.0f, -5.0f, -7.5f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(11, 23).addBox(-2.5f, -6.5f, -5.55f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 23).addBox(1.5f, -6.5f, -5.55f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, -2.0f));
        head.addOrReplaceChild("Helmet", CubeListBuilder.create().texOffs(0, 96).addBox(-5.0f, -44.0f, -8.0f, 10.0f, 12.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(0, 99).addBox(-0.5f, -45.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -45.0f, -1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(2, 98).addBox(-0.5f, -45.0f, -5.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 99).addBox(-0.5f, -45.0f, -8.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -45.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -45.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -45.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -46.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(2, 98).addBox(-0.5f, -47.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -48.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(2, 98).addBox(-0.5f, -48.0f, -8.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(1, 97).addBox(-0.5f, -47.0f, -8.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(2, 98).addBox(-0.5f, -47.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -47.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(2, 98).addBox(-0.5f, -47.0f, -5.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -47.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -45.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(1, 97).addBox(-0.5f, -47.0f, -3.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(1, 97).addBox(-0.5f, -45.0f, -3.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -47.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -45.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -46.0f, -1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(1, 97).addBox(-0.5f, -46.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -46.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(2, 98).addBox(-0.5f, -46.0f, -5.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(2, 98).addBox(-0.5f, -46.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -46.0f, -3.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 99).addBox(-0.5f, -46.0f, -2.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -46.0f, -8.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -48.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -44.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(1, 97).addBox(-0.5f, -43.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -42.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 96).addBox(-0.5f, -41.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(60, 96).addBox(-5.0f, -44.0f, -8.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(60, 98).addBox(-5.0f, -44.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(60, 100).addBox(4.0f, -44.0f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(60, 102).addBox(4.0f, -44.0f, -8.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 31.0f, 2.0f));
        golem.addOrReplaceChild("arm0", CubeListBuilder.create().texOffs(60, 21).addBox(-13.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        golem.addOrReplaceChild("arm1", CubeListBuilder.create().texOffs(60, 58).addBox(9.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        golem.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(37, 0).addBox(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-4.0f, 18.0f, 0.0f));
        golem.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset(5.0f, 18.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.golem.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
}
