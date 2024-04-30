package pugilist_steve.mod.annoying_villagersbychentu.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;


public class Modelhongzhuangjiakuilei<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "modelhongzhuangjiakuilei"), "main");
    public final ModelPart head;
    public final ModelPart body;
    public final ModelPart arm0;
    public final ModelPart arm1;
    public final ModelPart leg0;
    public final ModelPart leg1;

    public Modelhongzhuangjiakuilei(ModelPart root) {
        this.head = root.getChild("head");
        this.body = root.getChild("body");
        this.arm0 = root.getChild("arm0");
        this.arm1 = root.getChild("arm1");
        this.leg0 = root.getChild("leg0");
        this.leg1 = root.getChild("leg1");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -12.0f, -5.5f, 8.0f, 10.0f, 8.0f, new CubeDeformation(0.0f)).texOffs(24, 0).addBox(-1.0f, -5.0f, -7.5f, 2.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -7.0f, -2.0f));
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 40).addBox(-9.0f, -2.0f, -6.0f, 18.0f, 12.0f, 11.0f, new CubeDeformation(0.0f)).texOffs(0, 70).addBox(-4.5f, 10.0f, -3.0f, 9.0f, 5.0f, 6.0f, new CubeDeformation(0.5f)), PartPose.offset(0.0f, -7.0f, 0.0f));
        partdefinition.addOrReplaceChild("arm0", CubeListBuilder.create().texOffs(60, 21).addBox(-13.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -7.0f, 0.0f));
        partdefinition.addOrReplaceChild("arm1", CubeListBuilder.create().texOffs(60, 58).addBox(9.0f, -2.5f, -3.0f, 4.0f, 30.0f, 6.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, -7.0f, 0.0f));
        partdefinition.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(37, 0).addBox(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offset(-4.0f, 11.0f, 0.0f));
        partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(60, 0).mirror().addBox(-3.5f, -3.0f, -3.0f, 6.0f, 16.0f, 5.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset(5.0f, 11.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.arm0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.arm1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.yRot = netHeadYaw / 57.295776f;
        this.head.xRot = headPitch / 57.295776f;
        this.leg0.xRot = Mth.cos(limbSwing) * 1.0f * limbSwingAmount;
        this.leg1.xRot = Mth.cos(limbSwing) * (-1.0f) * limbSwingAmount;
        this.arm1.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
        this.arm0.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
    }
}
