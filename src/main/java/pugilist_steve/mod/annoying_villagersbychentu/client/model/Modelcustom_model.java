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


public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "modelcustom_model"), "main");
    public final ModelPart Body;
    public final ModelPart TailA;
    public final ModelPart Leg1A;
    public final ModelPart Leg2A;
    public final ModelPart Leg3A;
    public final ModelPart Leg4A;
    public final ModelPart Head;
    public final ModelPart Ear1;
    public final ModelPart Ear2;
    public final ModelPart MuleEarL;
    public final ModelPart MuleEarR;
    public final ModelPart Neck;
    public final ModelPart Bag1;
    public final ModelPart Bag2;
    public final ModelPart Saddle;
    public final ModelPart SaddleMouthL;
    public final ModelPart SaddleMouthR;
    public final ModelPart SaddleMouthLine;
    public final ModelPart SaddleMouthLineR;
    public final ModelPart HeadSaddle;

    public Modelcustom_model(ModelPart root) {
        this.Body = root.getChild("Body");
        this.TailA = root.getChild("TailA");
        this.Leg1A = root.getChild("Leg1A");
        this.Leg2A = root.getChild("Leg2A");
        this.Leg3A = root.getChild("Leg3A");
        this.Leg4A = root.getChild("Leg4A");
        this.Head = root.getChild("Head");
        this.Ear1 = root.getChild("Ear1");
        this.Ear2 = root.getChild("Ear2");
        this.MuleEarL = root.getChild("MuleEarL");
        this.MuleEarR = root.getChild("MuleEarR");
        this.Neck = root.getChild("Neck");
        this.Bag1 = root.getChild("Bag1");
        this.Bag2 = root.getChild("Bag2");
        this.Saddle = root.getChild("Saddle");
        this.SaddleMouthL = root.getChild("SaddleMouthL");
        this.SaddleMouthR = root.getChild("SaddleMouthR");
        this.SaddleMouthLine = root.getChild("SaddleMouthLine");
        this.SaddleMouthLineR = root.getChild("SaddleMouthLineR");
        this.HeadSaddle = root.getChild("HeadSaddle");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 32).addBox(-5.0f, -8.0f, -20.0f, 10.0f, 10.0f, 22.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 11.0f, 9.0f));
        partdefinition.addOrReplaceChild("TailA", CubeListBuilder.create().texOffs(42, 36).addBox(-1.5f, 0.0f, -2.0f, 3.0f, 14.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 4.0f, 11.0f, 0.5236f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Leg1A", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-2.0f, 0.0f, -2.0f, 4.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset(3.0f, 13.0f, 9.0f));
        partdefinition.addOrReplaceChild("Leg2A", CubeListBuilder.create().texOffs(48, 21).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-3.0f, 13.0f, 9.0f));
        partdefinition.addOrReplaceChild("Leg3A", CubeListBuilder.create().texOffs(48, 21).mirror().addBox(-2.0f, 0.0f, -2.0f, 4.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offset(3.0f, 13.0f, -9.0f));
        partdefinition.addOrReplaceChild("Leg4A", CubeListBuilder.create().texOffs(48, 21).addBox(-2.0f, 0.0f, -2.0f, 4.0f, 11.0f, 4.0f, new CubeDeformation(0.0f)), PartPose.offset(-3.0f, 13.0f, -9.0f));
        partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 13).addBox(-3.0f, -5.0f, -6.0f, 6.0f, 5.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(0, 25).addBox(-2.0f, -5.0f, -11.0f, 4.0f, 5.0f, 5.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, -4.0f, -11.0f, 0.5476f, -0.0099f, -0.0083f));
        partdefinition.addOrReplaceChild("Ear1", CubeListBuilder.create().texOffs(19, 16).mirror().addBox(-0.5f, -18.0f, 2.99f, 2.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(0.0f, 7.0f, -8.0f, 0.5236f, 0.0f, 0.0873f));
        partdefinition.addOrReplaceChild("Ear2", CubeListBuilder.create().texOffs(19, 16).addBox(-1.5f, -18.0f, 2.99f, 2.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.0f, -8.0f, 0.5236f, 0.0f, -0.0873f));
        partdefinition.addOrReplaceChild("MuleEarL", CubeListBuilder.create().texOffs(0, 12).mirror().addBox(-3.0f, -22.0f, 2.99f, 2.0f, 7.0f, 1.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(0.0f, 7.0f, -8.0f, 0.5236f, 0.0f, 0.2618f));
        partdefinition.addOrReplaceChild("MuleEarR", CubeListBuilder.create().texOffs(0, 12).addBox(1.0f, -22.0f, 2.99f, 2.0f, 7.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.0f, -8.0f, 0.5236f, 0.0f, -0.2618f));
        partdefinition.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(0, 35).addBox(-2.0f, -11.0f, -3.0f, 4.0f, 12.0f, 7.0f, new CubeDeformation(0.0f)).texOffs(56, 36).addBox(-1.0f, -16.0f, 4.0f, 2.0f, 16.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.0f, -8.0f, 0.5236f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("Bag1", CubeListBuilder.create().texOffs(26, 21).addBox(-9.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-5.0f, 3.0f, 11.0f, 0.0f, -1.5708f, 0.0f));
        partdefinition.addOrReplaceChild("Bag2", CubeListBuilder.create().texOffs(26, 21).mirror().addBox(1.0f, 0.0f, 0.0f, 8.0f, 8.0f, 3.0f, new CubeDeformation(0.0f)).mirror(false), PartPose.offsetAndRotation(5.0f, 3.0f, 11.0f, 0.0f, 1.5708f, 0.0f));
        partdefinition.addOrReplaceChild("Saddle", CubeListBuilder.create().texOffs(26, 0).addBox(-5.0f, 1.0f, -5.5f, 10.0f, 9.0f, 9.0f, new CubeDeformation(0.5f)), PartPose.offset(0.0f, 2.0f, 2.0f));
        partdefinition.addOrReplaceChild("SaddleMouthL", CubeListBuilder.create().texOffs(29, 5).addBox(2.0f, -14.0f, -6.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.0f, -8.0f, 0.5236f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("SaddleMouthR", CubeListBuilder.create().texOffs(29, 5).addBox(-3.0f, -14.0f, -6.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 7.0f, -8.0f, 0.5236f, 0.0f, 0.0f));
        partdefinition.addOrReplaceChild("SaddleMouthLine", CubeListBuilder.create().texOffs(32, 2).addBox(3.1f, -10.0f, -11.5f, 0.0f, 3.0f, 16.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 7.0f, -8.0f));
        partdefinition.addOrReplaceChild("SaddleMouthLineR", CubeListBuilder.create().texOffs(32, 2).addBox(-3.1f, -10.0f, -11.5f, 0.0f, 3.0f, 16.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 7.0f, -8.0f));
        partdefinition.addOrReplaceChild("HeadSaddle", CubeListBuilder.create().texOffs(19, 0).addBox(-2.0f, -16.0f, -5.0f, 4.0f, 5.0f, 2.0f, new CubeDeformation(0.25f)).texOffs(0, 0).addBox(-3.0f, -16.0f, -3.0f, 6.0f, 5.0f, 7.0f, new CubeDeformation(0.25f)), PartPose.offsetAndRotation(0.0f, 7.0f, -8.0f, 0.5236f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.TailA.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Leg1A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Leg2A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Leg3A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Leg4A.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Ear1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Ear2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.MuleEarL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.MuleEarR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Neck.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Bag1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Bag2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.Saddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.SaddleMouthL.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.SaddleMouthR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.SaddleMouthLine.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.SaddleMouthLineR.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.HeadSaddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}
