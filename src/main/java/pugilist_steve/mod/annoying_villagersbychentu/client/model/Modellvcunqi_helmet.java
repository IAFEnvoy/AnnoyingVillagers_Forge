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


public class Modellvcunqi_helmet<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "modellvcunqi_helmet"), "main");
    public final ModelPart Head;

    public Modellvcunqi_helmet(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(24, 22).addBox(-4.0f, -11.0f, -5.0f, 8.0f, 8.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 29).addBox(-5.0f, -11.0f, -5.0f, 1.0f, 12.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 29).addBox(4.0f, -11.0f, -5.0f, 1.0f, 12.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 14).addBox(-4.0f, -4.0f, -6.0f, 8.0f, 1.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(16, 12).addBox(4.0f, -5.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 12).addBox(-5.0f, -6.0f, -6.0f, 10.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(5, 7).addBox(-5.0f, -5.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 32).addBox(-5.0f, -8.0f, -4.0f, 1.0f, 7.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(34, 35).addBox(-5.0f, -8.0f, -3.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(29, 0).addBox(-5.0f, -8.0f, -2.0f, 1.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(30, 35).addBox(-5.0f, -8.0f, 0.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 32).addBox(-5.0f, -8.0f, 1.0f, 1.0f, 7.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 30).addBox(-5.0f, -8.0f, 2.0f, 1.0f, 8.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-5.0f, -11.0f, -4.0f, 10.0f, 3.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(14, 32).addBox(4.0f, -8.0f, -4.0f, 1.0f, 7.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(35, 0).addBox(4.0f, -8.0f, -3.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(12, 12).addBox(4.0f, -8.0f, -2.0f, 1.0f, 5.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(26, 32).addBox(4.0f, -8.0f, 0.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(6, 12).addBox(4.0f, -8.0f, 1.0f, 1.0f, 7.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 12).addBox(4.0f, -8.0f, 2.0f, 1.0f, 8.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(12, 12).addBox(-1.0f, -12.0f, -5.0f, 2.0f, 1.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(0, 12).addBox(-0.5f, -13.0f, -6.0f, 1.0f, 1.0f, 10.0f, new CubeDeformation(0.0f)).texOffs(13, 22).addBox(-0.5f, -14.0f, -6.0f, 1.0f, 1.0f, 9.0f, new CubeDeformation(0.0f)).texOffs(30, 31).addBox(-0.5f, -15.0f, -6.0f, 1.0f, 1.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(38, 6).addBox(-0.5f, -12.0f, -6.0f, 1.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 23).addBox(-5.0f, -8.0f, 4.0f, 10.0f, 5.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 17).addBox(-3.5f, -3.0f, 4.0f, 7.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 19).addBox(-2.5f, -2.0f, 4.0f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 6).addBox(-1.0f, -1.0f, 4.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.0f, -3.0f, -5.0f, 2.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 0.0f, 0.0f, -0.1047f, 0.0873f, 0.0f));
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
