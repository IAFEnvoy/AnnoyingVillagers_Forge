package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BeiganrandekelisiDangYouJiShiTiShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BeiganrandekelisiShiTiChuShiShengChengShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine3DangShiTiSiWangShiProcedure;

import javax.annotation.Nullable;


public class BeiganrandekelisiEntity extends PathfinderMob {
    public BeiganrandekelisiEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.BEIGANRANDEKELISI.get(), world);
    }

    public BeiganrandekelisiEntity(EntityType<BeiganrandekelisiEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 0.6f;
        this.xpReward = 7;
        this.setNoAi(false);
        this.setCustomName(new TextComponent("Chris"));
        this.setCustomNameVisible(true);
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.ENCHANTED_GOLDEN_APPLE));
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.26d).add(Attributes.MAX_HEALTH, 25.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 1.0d).add(Attributes.FOLLOW_RANGE, 32.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }

    @Override
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    @Override
    public double getMyRidingOffset() {
        return -0.35d;
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        Herobrine3DangShiTiSiWangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        BeiganrandekelisiShiTiChuShiShengChengShiProcedure.execute(this);
        return retval;
    }

    @Override
    public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
        sourceentity.getItemInHand(hand);
        InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        super.mobInteract(sourceentity, hand);
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        Level world = this.level;
        BeiganrandekelisiDangYouJiShiTiShiProcedure.execute(world, x, y, z, this);
        return retval;
    }
}
