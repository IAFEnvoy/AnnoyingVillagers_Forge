package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.nbt.CompoundTag;
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
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
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
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BTridentDangShiTiGengXinKeShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BTridentDangShiTiSiWangShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BTridentShiTiChuShiShengChengShiProcedure;

import javax.annotation.Nullable;


public class BTridentEntity extends PathfinderMob {
    public BTridentEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.B_TRIDENT.get(), world);
    }

    public BTridentEntity(EntityType<BTridentEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 0.6f;
        this.xpReward = 0;
        this.setNoAi(false);
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.TRIDENT));
        this.setPathfindingMalus(BlockPathTypes.WATER, 0.0f);
        this.moveControl = new MoveControl(this) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.BTridentEntity.1
            @Override
            public void tick() {
                if (BTridentEntity.this.isInWater()) {
                    BTridentEntity.this.setDeltaMovement(BTridentEntity.this.getDeltaMovement().add(0.0d, 0.005d, 0.0d));
                }
                if (this.operation == Operation.MOVE_TO && !BTridentEntity.this.getNavigation().isDone()) {
                    double dx = this.wantedX - BTridentEntity.this.getX();
                    double dy = this.wantedY - BTridentEntity.this.getY();
                    double dz = this.wantedZ - BTridentEntity.this.getZ();
                    float f = ((float) (Mth.atan2(dz, dx) * 57.29577951308232d)) - 90.0f;
                    float f1 = (float) (this.speedModifier * BTridentEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                    BTridentEntity.this.setYRot(this.rotlerp(BTridentEntity.this.getYRot(), f, 10.0f));
                    BTridentEntity.this.yBodyRot = BTridentEntity.this.getYRot();
                    BTridentEntity.this.yHeadRot = BTridentEntity.this.getYRot();
                    if (BTridentEntity.this.isInWater()) {
                        BTridentEntity.this.setSpeed((float) BTridentEntity.this.getAttribute(Attributes.MOVEMENT_SPEED).getValue());
                        float f2 = -((float) (Mth.atan2(dy, (float) Math.sqrt((dx * dx) + (dz * dz))) * 57.29577951308232d));
                        BTridentEntity.this.setXRot(this.rotlerp(BTridentEntity.this.getXRot(), Mth.clamp(Mth.wrapDegrees(f2), -85.0f, 85.0f), 5.0f));
                        float f3 = Mth.cos(BTridentEntity.this.getXRot() * 0.017453292f);
                        BTridentEntity.this.setZza(f3 * f1);
                        BTridentEntity.this.setYya((float) (f1 * dy));
                        return;
                    }
                    BTridentEntity.this.setSpeed(f1 * 0.05f);
                    return;
                }
                BTridentEntity.this.setSpeed(0.0f);
                BTridentEntity.this.setYya(0.0f);
                BTridentEntity.this.setZza(0.0f);
            }
        };
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.3d).add(Attributes.MAX_HEALTH, 10.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(ForgeMod.SWIM_SPEED.get(), 0.3d);
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
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    @Override
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if ((source.getDirectEntity() instanceof AbstractArrow) || (source.getDirectEntity() instanceof Player) || (source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DROWN || source == DamageSource.LIGHTNING_BOLT || source.isExplosion() || source.getMsgId().equals("trident") || source == DamageSource.ANVIL || source == DamageSource.DRAGON_BREATH || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        BTridentDangShiTiSiWangShiProcedure.execute(this);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        BTridentShiTiChuShiShengChengShiProcedure.execute(world, this);
        return retval;
    }

    @Override
    public void baseTick() {
        super.baseTick();
        BTridentDangShiTiGengXinKeShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
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

    @Override
    public boolean isPushable() {
        return false;
    }

    @Override
    protected void doPush(Entity entityIn) {
    }

    @Override
    protected void pushEntities() {
    }
}
