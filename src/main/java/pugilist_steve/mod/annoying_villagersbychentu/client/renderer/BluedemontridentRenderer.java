package pugilist_steve.mod.annoying_villagersbychentu.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import pugilist_steve.mod.annoying_villagersbychentu.client.model.Modelbluedemontrident;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BluedemontridentEntity;


public class BluedemontridentRenderer extends EntityRenderer<BluedemontridentEntity> {
    private static final ResourceLocation texture = new ResourceLocation("annoying_villagersbychentu:textures/entities/bluedemontrident.png");
    private final Modelbluedemontrident model;

    public BluedemontridentRenderer(EntityRendererProvider.Context context) {
        super(context);
        this.model = new Modelbluedemontrident(context.bakeLayer(Modelbluedemontrident.LAYER_LOCATION));
    }


    @Override
    public void render(BluedemontridentEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
        VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
        poseStack.pushPose();
        poseStack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90.0f));
        poseStack.mulPose(Vector3f.ZP.rotationDegrees(90.0f + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
        this.model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1.0f, 1.0f, 1.0f, 0.0625f);
        poseStack.popPose();
        super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
    }


    @Override
    public ResourceLocation getTextureLocation(BluedemontridentEntity entity) {
        return texture;
    }
}
