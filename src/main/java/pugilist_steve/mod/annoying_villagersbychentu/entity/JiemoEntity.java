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
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.JiemoDangShiTiShouShangShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.JiemoShiTiChuShiShengChengShiProcedure;

import javax.annotation.Nullable;


public class JiemoEntity extends PathfinderMob {
    public JiemoEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.JIEMO.get(), world);
    }

    public JiemoEntity(EntityType<JiemoEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 0.6f;
        this.xpReward = 10;
        this.setNoAi(false);
        this.setCustomName(new TextComponent("芥末"));
        this.setCustomNameVisible(true);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(AnnoyingVillagersbychentuModItems.JIEMODESHU.get()));
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.4d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 50.0d).add(Attributes.ATTACK_DAMAGE, 13.0d).add(Attributes.FOLLOW_RANGE, 1000.0d).add(Attributes.KNOCKBACK_RESISTANCE, 10.0d).add(Attributes.ATTACK_KNOCKBACK, 30.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2d, false) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.JiemoEntity.1
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, HbGaoJiFenShenEntity.class, false, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Herobrine7Entity.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, DiJiherobrineEntity.class, false, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LingZhiEntity.class, false, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, LanCunQiEntity.class, false, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, LuCunQiEntity.class, false, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, HongCunQiEntity.class, false, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, ZiCunQiEntity.class, false, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CunMinZhenChaBingEntity.class, false, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, CczdzEntity.class, false, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, BlueDemonEntity.class, false, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, false, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, SteveEntity.class, false, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, KeLiSiEntity.class, false, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, GeLeiGeEntity.class, false, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, ZaiEZhiWangEntity.class, false, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Monster.class, false, false));
        this.goalSelector.addGoal(19, new PanicGoal(this, 1.2d));
        this.goalSelector.addGoal(20, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(21, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(22, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(23, new MoveBackToVillageGoal(this, 0.6d, false));
        this.targetSelector.addGoal(24, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(25, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(26, new FloatGoal(this));
        this.goalSelector.addGoal(27, new AvoidEntityGoal(this, Player.class, 10.0f, 1.5d, 1.72d));
        this.goalSelector.addGoal(28, new AvoidEntityGoal(this, Mob.class, 10.0f, 1.5d, 1.72d));
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
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        JiemoDangShiTiShouShangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
        if ((source.getDirectEntity() instanceof AbstractArrow) || (source.getDirectEntity() instanceof Player) || (source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DROWN || source == DamageSource.LIGHTNING_BOLT || source.getMsgId().equals("trident") || source == DamageSource.ANVIL || source == DamageSource.DRAGON_BREATH || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        JiemoShiTiChuShiShengChengShiProcedure.execute(world, this);
        return retval;
    }
}
