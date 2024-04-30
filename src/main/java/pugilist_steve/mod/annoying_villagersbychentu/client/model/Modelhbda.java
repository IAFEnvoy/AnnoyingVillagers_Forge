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


public class Modelhbda<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "modelhbda"), "main");
    public final ModelPart Body;
    public final ModelPart RightArm;
    public final ModelPart LeftArm;

    public Modelhbda(ModelPart root) {
        this.Body = root.getChild("Body");
        this.RightArm = root.getChild("RightArm");
        this.LeftArm = root.getChild("LeftArm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(16, 16).addBox(-4.0f, 0.0f, -2.0f, 8.0f, 12.0f, 4.0f, new CubeDeformation(1.01f)).texOffs(54, 7).addBox(-8.2385f, 1.609f, 1.8f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        Body.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 4).addBox(-1.909f, -7.2615f, 16.3f, 2.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, -15.0f, -2.0f, -1.4835f, 0.0873f, 0.0f));
        Body.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 4).addBox(-3.909f, -8.2615f, -20.7f, 2.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, -15.0f, -2.0f, 1.6552f, 0.3049f, -0.0119f));
        Body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(56, 2).addBox(-1.909f, -6.2615f, -18.7f, 2.0f, 7.0f, 2.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(2.0f, -15.0f, -2.0f, 1.4835f, 0.1745f, 0.0f));
        Body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(51, 4).addBox(5.4f, 19.2f, 4.1f, 5.0f, 2.1f, 1.9f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(10.0f, -15.0f, -10.0f, 0.0f, -1.9199f, 0.0f));
        Body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(51, 4).addBox(11.4f, 18.2f, 9.1f, 5.0f, 2.1f, 1.9f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(10.0f, -15.0f, -10.0f, 0.0f, -1.5708f, 0.0f));
        Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(52, 1).addBox(-4.2385f, 19.609f, 3.8f, 2.0f, 2.0f, 4.0f, new CubeDeformation(-0.1f)), PartPose.offsetAndRotation(2.0f, -15.0f, -2.0f, 0.0f, -0.0873f, 0.0f));
        PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(40, 16).addBox(-3.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(1.0f)).texOffs(54, 7).addBox(-3.2385f, -0.391f, 1.8f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(-5.0f, 2.0f, 0.0f));
        RightArm.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(51, 4).addBox(-12.6f, 16.2f, -18.9f, 5.0f, 2.1f, 1.9f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(15.0f, -17.0f, -10.0f, 2.1639f, 1.4137f, 2.1562f));
        RightArm.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(51, 4).addBox(-9.909f, -12.2615f, -16.7f, 2.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(7.0f, -17.0f, -2.0f, 1.7301f, 0.3982f, -0.0424f));
        RightArm.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(49, 10).addBox(4.4f, 14.2f, 15.1f, 5.0f, 2.1f, 1.9f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(15.0f, -17.0f, -10.0f, -0.81f, -1.2543f, 0.9694f));
        partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(40, 16).mirror().addBox(-1.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, new CubeDeformation(1.0f)).mirror(false), PartPose.offset(5.0f, 2.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
        this.LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.RightArm.xRot = Mth.cos((limbSwing * 0.6662f) + 3.1415927f) * limbSwingAmount;
        this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662f) * limbSwingAmount;
    }
}
