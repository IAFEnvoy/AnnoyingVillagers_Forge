package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.Mth;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.*;

import javax.annotation.Nullable;


public class GeLeiGeEntity extends Monster {
    public GeLeiGeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.GE_LEI_GE.get(), world);
    }

    public GeLeiGeEntity(EntityType<GeLeiGeEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 2.5f;
        this.xpReward = 50;
        this.setNoAi(false);
        this.setCustomName(new TextComponent("§gGregg"));
        this.setCustomNameVisible(true);
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.DIAMOND_SWORD));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Items.ENDER_PEARL));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.DIAMOND_CHESTPLATE));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.DIAMOND_BOOTS));
        this.setPathfindingMalus(BlockPathTypes.WATER, 0.0f);
        this.moveControl = new MoveControl(this) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.GeLeiGeEntity.1
            @Override
            public void tick() {
                if (GeLeiGeEntity.this.isInWater()) {
                    GeLeiGeEntity.this.setDeltaMovement(GeLeiGeEntity.this.getDeltaMovement().add(0.0d, 0.005d, 0.0d));
                }
                if (this.operation == Operation.MOVE_TO && !GeLeiGeEntity.this.getNavigation().isDone()) {
                    double dx = this.wantedX - GeLeiGeEntity.this.getX();
                    double dy = this.wantedY - GeLeiGeEntity.this.getY();
                    double dz = this.wantedZ - GeLeiGeEntity.this.getZ();
                    float f = ((float) (Mth.atan2(dz, dx) * 57.29577951308232d)) - 90.0f;
                    float f1 = (float) (this.speedModifier * GeLeiGeEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                    GeLeiGeEntity.this.setYRot(this.rotlerp(GeLeiGeEntity.this.getYRot(), f, 10.0f));
                    GeLeiGeEntity.this.yBodyRot = GeLeiGeEntity.this.getYRot();
                    GeLeiGeEntity.this.yHeadRot = GeLeiGeEntity.this.getYRot();
                    if (GeLeiGeEntity.this.isInWater()) {
                        GeLeiGeEntity.this.setSpeed((float) GeLeiGeEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                        float f2 = -((float) (Mth.atan2(dy, (float) Math.sqrt((dx * dx) + (dz * dz))) * 57.29577951308232d));
                        GeLeiGeEntity.this.setXRot(this.rotlerp(GeLeiGeEntity.this.getXRot(), Mth.clamp(Mth.wrapDegrees(f2), -85.0f, 85.0f), 5.0f));
                        float f3 = Mth.cos(GeLeiGeEntity.this.getXRot() * 0.017453292f);
                        GeLeiGeEntity.this.setZza(f3 * f1);
                        GeLeiGeEntity.this.setYya((float) (f1 * dy));
                        return;
                    }
                    GeLeiGeEntity.this.setSpeed(f1 * 0.05f);
                    return;
                }
                GeLeiGeEntity.this.setSpeed(0.0f);
                GeLeiGeEntity.this.setYya(0.0f);
                GeLeiGeEntity.this.setZza(0.0f);
            }
        };
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.26d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 0.0d).add(Attributes.FOLLOW_RANGE, 128.0d).add(ForgeMod.SWIM_SPEED.get(), 0.26d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected PathNavigation createNavigation(Level world) {
        return new WaterBoundPathNavigation(this, world);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.5d, true) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.GeLeiGeEntity.2
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, CczdzEntity.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, CunMinZhenChaBingEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, HongCunQiEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, LanCunQiEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, ZiCunQiEntity.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, LuCunQiEntity.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, GraveEntity.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, MrcolderEntity.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, JianbingguoziEntity.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, BlueDemonEntity.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, HbGaoJiFenShenEntity.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, LingZhiEntity.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, DiJiherobrineEntity.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Herobrine7Entity.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, ZaiEZhiWangEntity.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Monster.class, true, false));
        this.goalSelector.addGoal(20, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(21, new FloatGoal(this));
        this.goalSelector.addGoal(22, new RandomStrollGoal(this, 1.0d));
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
    public boolean hurt(DamageSource source, float amount) {
        GeLeiGeDangShiTiShouShangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
        if (source == DamageSource.FALL) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        GeLeiGeDangShiTiSiWangShiProcedure.execute(this);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        GeLeiGeShiTiChuShiShengChengShiProcedure.execute(world, this);
        return retval;
    }

    @Override
    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        CunMinZhenChaBing1DangZheGeShiTiShaSiLingGeShiTiProcedure.execute();
    }

    @Override
    public void baseTick() {
        super.baseTick();
        SteveDangShiTiGengXinKeShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }

    @Override
    public boolean canBreatheUnderwater() {
        return true;
    }

    @Override
    public boolean checkSpawnObstruction(LevelReader world) {
        return world.isUnobstructed(this);
    }

    @Override
    public boolean isPushedByFluid() {
        return false;
    }
}
