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

/* renamed from: pugilist_steve.mod.annoying_villagersbychentu.client.model.Model钻石头  reason: invalid class name and case insensitive filesystem */
/* loaded from: AV.jar:pugilist_steve/mod/annoying_villagersbychentu/client/model/Model钻石头.class */
public class C1394Model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "model_zuan_shi_tou"), "main");
    public final ModelPart ArmoredHerobrineHelm;

    public C1394Model(ModelPart root) {
        this.ArmoredHerobrineHelm = root.getChild("ArmoredHerobrineHelm");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition ArmoredHerobrineHelm = partdefinition.addOrReplaceChild("ArmoredHerobrineHelm", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -4.0f, 0.0f, 0.0f, -0.7854f, 0.0f));
        ArmoredHerobrineHelm.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 25).addBox(-1.0f, -3.5f, -4.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 11).addBox(-1.0f, -6.5f, -4.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 0).addBox(-2.5385f, -3.391f, 2.8f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 8.0f, 0.0f, 0.0f, 0.7854f, 0.0f));
        ArmoredHerobrineHelm.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 11).addBox(-2.909f, -10.2615f, -0.7f, 2.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 8.0f, 0.0f, 0.0f, 0.0f, 0.3927f));
        PartDefinition Obsidain = ArmoredHerobrineHelm.addOrReplaceChild("Obsidain", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f));
        Obsidain.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 7).addBox(-17.6f, 3.2f, 7.1f, 5.0f, 2.1f, 1.9f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(8.0f, 8.0f, -8.0f, 0.0f, 0.0f, 0.7854f));
        PartDefinition Helmet = ArmoredHerobrineHelm.addOrReplaceChild("Helmet", CubeListBuilder.create(), PartPose.offset(0.0f, 0.0f, 0.0f));
        Helmet.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(24, 16).addBox(-1.0f, -6.0f, 3.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-3.0f, -7.5f, -3.0f, 6.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(8, 11).addBox(-4.0f, -2.5f, 3.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 9).addBox(0.0f, -1.5f, 3.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 7).addBox(0.0f, -2.5f, 3.0f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 20).addBox(0.0f, -6.5f, 3.0f, 3.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 19).addBox(3.0f, -6.5f, 3.0f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 15).addBox(3.0f, -3.5f, 0.0f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(5, 19).addBox(-1.0f, -5.5f, -4.0f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(-4.0f, -5.5f, 0.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(18, 25).addBox(1.0f, -7.5f, -4.0f, 1.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 24).addBox(2.0f, -6.5f, -4.0f, 2.0f, 3.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 5).addBox(2.0f, -7.5f, -4.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 13).addBox(-3.0f, -6.5f, -4.0f, 2.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 11).addBox(-3.0f, -7.5f, -4.0f, 4.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 0).addBox(-4.0f, -5.5f, -4.0f, 1.0f, 2.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(-4.0f, -7.5f, -3.0f, 1.0f, 4.0f, 3.0f, new CubeDeformation(0.0f)).texOffs(8, 19).addBox(-4.0f, -3.5f, 0.0f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-4.0f, -7.5f, 2.0f, 1.0f, 4.0f, 2.0f, new CubeDeformation(0.0f)).texOffs(25, 24).addBox(-4.0f, -7.5f, 1.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 7).addBox(3.0f, -7.5f, -3.0f, 1.0f, 4.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 17).addBox(-3.0f, -7.5f, 3.0f, 6.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 24).addBox(-3.0f, -6.5f, 3.0f, 1.0f, 4.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(0.0f, 8.0f, 0.0f, 0.0f, 0.7854f, 0.0f));
        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.ArmoredHerobrineHelm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.ArmoredHerobrineHelm.yRot = netHeadYaw / 57.295776f;
        this.ArmoredHerobrineHelm.xRot = headPitch / 57.295776f;
    }
}
