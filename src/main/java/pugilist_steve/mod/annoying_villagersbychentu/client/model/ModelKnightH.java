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


public class ModelKnightH<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "model_knight_h"), "main");
    public final ModelPart Head;

    public ModelKnightH(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(26, 14).addBox(-5.0f, -2.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 0).addBox(-5.0f, -10.0f, -5.0f, 10.0f, 7.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 12).addBox(-4.0f, -11.0f, -5.0f, 8.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 9).addBox(-5.0f, -6.0f, -5.5f, 10.0f, 1.0f, 0.5f, new CubeDeformation(0.0f)).texOffs(0, 1).addBox(-5.0f, -5.0f, -5.5f, 1.0f, 1.0f, 0.5f, new CubeDeformation(0.0f)).texOffs(5, 11).addBox(-1.0f, -4.0f, -6.0f, 2.0f, 1.0f, 0.5f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(4.0f, -5.0f, -5.5f, 1.0f, 1.0f, 0.5f, new CubeDeformation(0.0f)).texOffs(11, 14).addBox(-4.0f, -4.0f, -5.5f, 8.0f, 1.0f, 0.5f, new CubeDeformation(0.0f)).texOffs(22, 24).addBox(-1.0f, -11.7f, -5.0f, 2.0f, 1.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-5.0f, -11.0f, -4.0f, 10.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(11, 10).addBox(-4.0f, -11.0f, 4.0f, 8.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 29).addBox(-5.0f, -3.0f, -5.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(33, 12).addBox(-5.0f, -3.0f, -4.0f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(33, 8).addBox(-5.0f, -3.0f, 1.0f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(22, 15).addBox(-5.0f, -2.0f, 2.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(15, 15).addBox(-5.0f, -1.0f, 3.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(5, 25).addBox(3.0f, -3.0f, -5.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 34).addBox(-5.0f, -2.0f, -5.0f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 9).addBox(-0.5f, -13.0f, -6.0f, 1.0f, 6.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(33, 8).addBox(-0.5f, -14.0f, -6.0f, 1.0f, 1.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(0, 25).addBox(-0.5f, -15.0f, -6.0f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(7, 28).addBox(4.0f, -2.0f, -5.0f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 16).addBox(-5.0f, -10.0f, -4.0f, 1.0f, 7.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(5, 13).addBox(4.0f, -1.0f, 3.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 15).addBox(4.0f, -2.0f, 2.0f, 1.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 13).addBox(4.0f, -3.0f, 1.0f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(0, 9).addBox(4.0f, -10.0f, -4.0f, 1.0f, 7.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(-4.0f, -10.0f, 4.0f, 8.0f, 8.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 34).addBox(-3.0f, -2.0f, 4.0f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 6).addBox(-1.0f, -1.0f, 4.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 9).addBox(4.0f, -3.0f, -4.0f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(5, 9).addBox(4.0f, -2.0f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.0f, -3.0f, -6.5f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.Head.yRot = netHeadYaw / 57.295776f;
        this.Head.xRot = headPitch / 57.295776f;
    }
}
