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

/* renamed from: pugilist_steve.mod.annoying_villagersbychentu.client.model.Model黑曜石钻石头盔  reason: invalid class name and case insensitive filesystem */
/* loaded from: AV.jar:pugilist_steve/mod/annoying_villagersbychentu/client/model/Model黑曜石钻石头盔.class */
public class C1395Model<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "model_hei_yao_shi_zuan_shi_tou_kui"), "main");
    public final ModelPart Head;

    public C1395Model(ModelPart root) {
        this.Head = root.getChild("Head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, new CubeDeformation(1.0f)).texOffs(32, 0).addBox(4.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, new CubeDeformation(0.0f)).texOffs(51, 4).addBox(-3.2385f, -3.391f, 3.8f, 2.0f, 2.0f, 3.0f, new CubeDeformation(0.0f)), PartPose.offset(0.0f, 0.0f, 0.0f));
        Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(51, 4).addBox(1.091f, 1.7385f, 0.3f, 2.0f, 6.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(2.0f, -15.0f, -2.0f, 0.0f, -0.6545f, 0.3927f));
        Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(51, 4).addBox(-3.6f, 13.2f, -9.9f, 5.0f, 2.1f, 1.9f, new CubeDeformation(0.1f)), PartPose.offsetAndRotation(10.0f, -15.0f, -10.0f, 1.0472f, -0.6545f, 0.7854f));
        return LayerDefinition.create(meshdefinition, 64, 32);
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
