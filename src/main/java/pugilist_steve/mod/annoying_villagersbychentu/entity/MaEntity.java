package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BbqDangYouJiShiTiShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.MaDangShiTiGengXinKeShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.MaDangShiTiSiWangShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.MaDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure;


public class MaEntity extends Horse {
    public MaEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.LUEDUOZHEWANGDEMA.get(), world);
    }

    public MaEntity(EntityType<MaEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 0.6f;
        this.xpReward = 0;
        this.setNoAi(false);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.57d).add(Attributes.MAX_HEALTH, 50.0d).add(Attributes.ARMOR, 40.0d).add(Attributes.ATTACK_DAMAGE, 1.0d).add(Attributes.FOLLOW_RANGE, 128.0d).add(Attributes.ATTACK_KNOCKBACK, 1.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, HbGaoJiFenShenEntity.class, false, false));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, LingZhiEntity.class, false, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, DiJiherobrineEntity.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Herobrine7Entity.class, false, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, CczdzEntity.class, false, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, HongCunQiEntity.class, false, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, ZiCunQiEntity.class, false, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, LanCunQiEntity.class, false, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, LuCunQiEntity.class, false, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, CunMinZhenChaBingEntity.class, false, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, GraveEntity.class, false, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, MrcolderEntity.class, false, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, JianbingguoziEntity.class, false, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, SteveEntity.class, false, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, GeLeiGeEntity.class, false, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, KeLiSiEntity.class, false, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, false, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Steve2Entity.class, false, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, FennudeshidifuEntity.class, false, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, DarkHerobrineEntity.class, false, false));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Shiti303fenshenEntity.class, false, false));
        this.goalSelector.addGoal(22, new MeleeAttackGoal(this, 1.5d, false) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.MaEntity.1
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, Herobrine3Entity.class, false, false));
        this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, Herobrine2Entity.class, false, false));
        this.goalSelector.addGoal(25, new RandomStrollGoal(this, 1.0d));
        this.targetSelector.addGoal(26, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(27, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(28, new FloatGoal(this));
        this.goalSelector.addGoal(29, new MeleeAttackGoal(this, 1.5d, false) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.MaEntity.2
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.goalSelector.addGoal(30, new RandomStrollGoal(this, 1.0d));
        this.targetSelector.addGoal(31, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(32, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(33, new FloatGoal(this));
    }

    @Override
    public MobType getMobType() {
        return MobType.UNDEAD;
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton_horse.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton_horse.death"));
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if ((source.getDirectEntity() instanceof AbstractArrow) || (source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DROWN || source == DamageSource.LIGHTNING_BOLT || source.isExplosion() || source.getMsgId().equals("trident") || source == DamageSource.ANVIL || source == DamageSource.DRAGON_BREATH || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        MaDangShiTiSiWangShiProcedure.execute(this);
    }

    @Override
    public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
        sourceentity.getItemInHand(hand);
        InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        super.mobInteract(sourceentity, hand);
        sourceentity.startRiding(this);
        this.getX();
        this.getY();
        this.getZ();
        Level level = this.level;
        BbqDangYouJiShiTiShiProcedure.execute(this, sourceentity);
        return retval;
    }

    @Override
    public void baseTick() {
        super.baseTick();
        MaDangShiTiGengXinKeShiProcedure.execute(this);
    }

    @Override
    public void playerTouch(Player sourceentity) {
        super.playerTouch(sourceentity);
        MaDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.execute(this.level, this);
    }

    @Override
    public void travel(Vec3 dir) {
        Entity entity = this.getPassengers().isEmpty() ? null : this.getPassengers().get(0);
        if (this.isVehicle()) {
            this.setYRot(entity.getYRot());
            this.yRotO = this.getYRot();
            this.setXRot(entity.getXRot() * 0.5f);
            this.setRot(this.getYRot(), this.getXRot());
            this.flyingSpeed = this.getSpeed() * 0.15f;
            this.yBodyRot = entity.getYRot();
            this.yHeadRot = entity.getYRot();
            if (entity instanceof LivingEntity passenger) {
                this.setSpeed((float) this.getAttributeValue(Attributes.MOVEMENT_SPEED));
                float forward = passenger.zza;
                float strafe = passenger.xxa;
                super.travel(new Vec3(strafe, 0.0d, forward));
            }
            this.animationSpeedOld = this.animationSpeed;
            double d1 = this.getX() - this.xo;
            double d0 = this.getZ() - this.zo;
            float f1 = ((float) Math.sqrt((d1 * d1) + (d0 * d0))) * 4.0f;
            if (f1 > 1.0f) {
                f1 = 1.0f;
            }
            this.animationSpeed += (f1 - this.animationSpeed) * 0.4f;
            this.animationPosition += this.animationSpeed;
            return;
        }
        this.flyingSpeed = 0.02f;
        super.travel(dir);
    }
}
