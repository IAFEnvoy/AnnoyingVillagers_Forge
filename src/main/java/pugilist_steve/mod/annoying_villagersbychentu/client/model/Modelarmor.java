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


public class Modelarmor<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "modelarmor"), "main");
    public final ModelPart Head2;

    public Modelarmor(ModelPart root) {
        this.Head2 = root.getChild("Head2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition Head2 = partdefinition.addOrReplaceChild("Head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0f, -3.0f, -1.0f, 0.0f, -1.5708f, 0.0f));
        Head2.addOrReplaceChild("back2H_r1", CubeListBuilder.create().texOffs(8, 0).addBox(-1.0f, 19.0f, -12.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 2).addBox(-1.0f, 23.0f, -14.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 14).addBox(-1.0f, 22.0f, -14.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 15).addBox(-1.0f, 21.0f, -14.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 16).addBox(-1.0f, 20.0f, -14.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 6).addBox(-1.0f, 19.0f, -14.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 8).addBox(-1.0f, 19.0f, -13.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(20, 10).addBox(-1.0f, 19.0f, -12.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(4, 21).addBox(-1.0f, 19.0f, -11.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 21).addBox(-1.0f, 19.0f, -10.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 14).addBox(-1.0f, 19.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 6).addBox(-1.0f, 20.0f, -13.0f, 1.0f, 3.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(21, 21).addBox(-1.0f, 23.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 22).addBox(-1.0f, 22.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 12).addBox(-1.0f, 21.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(15, 22).addBox(-1.0f, 20.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 16).addBox(-1.0f, 19.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 18).addBox(-1.0f, 19.0f, -8.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 15).addBox(8.0f, 19.0f, -7.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(16, 5).addBox(8.0f, 19.0f, -6.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 15).addBox(8.0f, 19.0f, -14.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 19).addBox(8.0f, 19.0f, -15.0f, 1.0f, 6.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(8.0f, 19.0f, -13.0f, 1.0f, 6.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(0, 12).addBox(8.0f, 25.0f, -13.0f, 1.0f, 1.0f, 6.0f, new CubeDeformation(0.0f)).texOffs(8, 0).addBox(8.0f, 26.0f, -12.0f, 1.0f, 1.0f, 4.0f, new CubeDeformation(0.0f)).texOffs(4, 23).addBox(6.0f, 22.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(23, 7).addBox(5.0f, 22.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(8, 23).addBox(5.0f, 23.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(23, 9).addBox(6.0f, 23.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 23).addBox(4.0f, 23.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 23).addBox(4.0f, 22.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(11, 24).addBox(4.0f, 24.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(15, 24).addBox(4.0f, 25.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 20).addBox(7.0f, 24.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 1).addBox(7.0f, 23.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(3, 25).addBox(2.0f, 22.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(7, 25).addBox(-1.0f, 23.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 11).addBox(0.0f, 23.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 13).addBox(-1.0f, 22.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 15).addBox(0.0f, 22.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 17).addBox(1.0f, 22.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(18, 25).addBox(0.0f, 20.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(22, 25).addBox(-1.0f, 20.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 22).addBox(1.0f, 20.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 24).addBox(2.0f, 20.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 26).addBox(3.0f, 20.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 3).addBox(4.0f, 20.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 5).addBox(5.0f, 20.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(26, 8).addBox(6.0f, 20.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 26).addBox(7.0f, 20.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 26).addBox(-1.0f, 21.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(25, 26).addBox(0.0f, 21.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(3, 27).addBox(1.0f, 21.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(7, 27).addBox(2.0f, 21.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(17, 27).addBox(3.0f, 21.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 19).addBox(4.0f, 21.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 27).addBox(5.0f, 21.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 28).addBox(6.0f, 21.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 0).addBox(7.0f, 22.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 28).addBox(7.0f, 21.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 10).addBox(0.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 12).addBox(-1.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 28).addBox(0.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 14).addBox(1.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 16).addBox(2.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 21).addBox(3.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 23).addBox(4.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 28).addBox(5.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 25).addBox(6.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(28, 27).addBox(7.0f, 19.0f, -15.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(29, 6).addBox(8.0f, 18.0f, -8.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(7, 29).addBox(6.0f, 22.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(17, 29).addBox(5.0f, 22.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 29).addBox(5.0f, 23.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 29).addBox(6.0f, 23.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 30).addBox(4.0f, 23.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 8).addBox(4.0f, 22.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 30).addBox(4.0f, 24.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 30).addBox(4.0f, 25.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 18).addBox(7.0f, 24.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 30).addBox(7.0f, 23.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 30).addBox(2.0f, 22.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(3, 31).addBox(-1.0f, 23.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(7, 31).addBox(-1.0f, 22.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 11).addBox(0.0f, 22.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 13).addBox(1.0f, 22.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 15).addBox(-1.0f, 20.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(17, 31).addBox(0.0f, 20.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 20).addBox(1.0f, 20.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 31).addBox(2.0f, 20.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 22).addBox(3.0f, 20.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 24).addBox(4.0f, 20.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 26).addBox(5.0f, 20.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 31).addBox(6.0f, 20.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(31, 28).addBox(7.0f, 20.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 32).addBox(-1.0f, 21.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 0).addBox(0.0f, 21.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 3).addBox(1.0f, 21.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(32, 5).addBox(2.0f, 21.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(10, 32).addBox(3.0f, 21.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(14, 32).addBox(4.0f, 21.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(24, 32).addBox(5.0f, 21.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(30, 32).addBox(6.0f, 21.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(3, 33).addBox(7.0f, 22.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(7, 33).addBox(7.0f, 21.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(33, 7).addBox(-1.0f, 19.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(33, 9).addBox(0.0f, 19.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(17, 33).addBox(1.0f, 19.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(33, 17).addBox(2.0f, 19.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(21, 33).addBox(3.0f, 19.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(27, 33).addBox(4.0f, 19.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(33, 31).addBox(5.0f, 19.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(33, 33).addBox(6.0f, 19.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 34).addBox(7.0f, 19.0f, -6.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)).texOffs(0, 0).addBox(-1.0f, 23.0f, -11.0f, 1.0f, 2.0f, 2.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, -23.0f, 10.0f, 0.0f, 0.0f, 0.0f));
        Head2.addOrReplaceChild("side10H_r1", CubeListBuilder.create().texOffs(14, 0).addBox(3.0f, 18.0f, -9.0f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, -23.0f, 4.0f, 0.0f, 0.0f, 0.0f));
        Head2.addOrReplaceChild("side11H_r1", CubeListBuilder.create().texOffs(4, 19).addBox(5.0f, 18.0f, -9.0f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, -24.0f, 4.0f, 0.0f, 0.0f, 0.0f));
        Head2.addOrReplaceChild("side13H_r1", CubeListBuilder.create().texOffs(29, 2).addBox(7.0f, 18.0f, -9.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, -26.0f, 4.0f, 0.0f, 0.0f, 0.0f));
        Head2.addOrReplaceChild("side12H_r1", CubeListBuilder.create().texOffs(0, 4).addBox(6.0f, 18.0f, -9.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, -25.0f, 4.0f, 0.0f, 0.0f, 0.0f));
        Head2.addOrReplaceChild("side20H_r1", CubeListBuilder.create().texOffs(14, 2).addBox(3.0f, 18.0f, -7.0f, 5.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, -23.0f, 11.0f, 0.0f, 0.0f, 0.0f));
        Head2.addOrReplaceChild("side23H_r1", CubeListBuilder.create().texOffs(3, 29).addBox(7.0f, 18.0f, -7.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, -26.0f, 11.0f, 0.0f, 0.0f, 0.0f));
        Head2.addOrReplaceChild("back1H_r1", CubeListBuilder.create().texOffs(29, 4).addBox(8.0f, 18.0f, -8.0f, 1.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-3.0f, -23.0f, 5.0f, 0.0f, 0.0f, 0.0f));
        Head2.addOrReplaceChild("side22H_r1", CubeListBuilder.create().texOffs(0, 12).addBox(6.0f, 18.0f, -7.0f, 2.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, -25.0f, 11.0f, 0.0f, 0.0f, 0.0f));
        Head2.addOrReplaceChild("side21H_r1", CubeListBuilder.create().texOffs(19, 4).addBox(5.0f, 18.0f, -7.0f, 3.0f, 1.0f, 1.0f, new CubeDeformation(0.0f)), PartPose.offsetAndRotation(-4.0f, -24.0f, 11.0f, 0.0f, 0.0f, 0.0f));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        this.Head2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
}