package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownTrident;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BbdDangShiTiGengXinKeShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BbdShiTiChuShiShengChengShiProcedure;

import javax.annotation.Nullable;


public class BbdEntity extends Monster {
    public BbdEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.BBD.get(), world);
    }

    public BbdEntity(EntityType<BbdEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 0.6f;
        this.xpReward = 0;
        this.setNoAi(false);
        this.setCustomName(new TextComponent("Blue Demon"));
        this.setCustomNameVisible(true);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.BLUE_DEMONCHESTPLATE_CHESTPLATE.get()));
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.26d).add(Attributes.MAX_HEALTH, 40.0d).add(Attributes.ARMOR, 20.0d).add(Attributes.ATTACK_DAMAGE, 0.0d).add(Attributes.FOLLOW_RANGE, 128.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, Mob.class, false, false));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Player.class, false, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, ThrownTrident.class, false, false));
    }

    @Override
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    @Override
    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
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
    public boolean hurt(DamageSource source, float amount) {
        if ((source.getDirectEntity() instanceof AbstractArrow) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DROWN || source == DamageSource.LIGHTNING_BOLT || source.isExplosion() || source.getMsgId().equals("trident") || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        BbdShiTiChuShiShengChengShiProcedure.execute(world, this);
        return retval;
    }

    @Override
    public void baseTick() {
        super.baseTick();
        BbdDangShiTiGengXinKeShiProcedure.execute(this);
    }
}
