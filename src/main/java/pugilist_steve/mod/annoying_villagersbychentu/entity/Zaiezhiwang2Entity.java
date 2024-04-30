package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
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
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.CunMinZhenChaBing1DangZheGeShiTiShaSiLingGeShiTiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiGengXinKeShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ZaiEZhiWangDangShiTiShouShangShiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.Zaiezhiwang2DangShiTiSiWangShiProcedure;


public class Zaiezhiwang2Entity extends Monster {
    public Zaiezhiwang2Entity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.ZAIEZHIWANG_2.get(), world);
    }

    public Zaiezhiwang2Entity(EntityType<Zaiezhiwang2Entity> type, Level world) {
        super(type, world);
        this.maxUpStep = 2.8f;
        this.xpReward = 80;
        this.setNoAi(false);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(AnnoyingVillagersbychentuModItems.HONG_BAO_SHI_FU_JU_DA.get()));
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.LUEDUOZHEWANGTOUKUI.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.ARMOR_THE_PLAGUE_KING_CHESTPLATE.get()));
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.26d).add(Attributes.MAX_HEALTH, 40.0d).add(Attributes.ARMOR, 10.0d).add(Attributes.ATTACK_DAMAGE, 10.0d).add(Attributes.FOLLOW_RANGE, 256.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, DarkHerobrineEntity.class, false, false));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, HbGaoJiFenShenEntity.class, false, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, DijiyinfenshenEntity.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, false, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LianyingfenshengEntity.class, false, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Herobrine3Entity.class, false, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Herobrine7Entity.class, false, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, GaojiherobrineEntity.class, false, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, DiJiherobrineEntity.class, false, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, SherenherobrineEntity.class, false, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, LingZhiEntity.class, false, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, HerobrinefenshenEntity.class, false, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, CczdzEntity.class, false, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, CunMinZhenChaBingEntity.class, false, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, HongCunQiEntity.class, false, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, LanCunQiEntity.class, false, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, ZiCunQiEntity.class, false, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, LuCunQiEntity.class, false, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Player.class, false, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, GraveEntity.class, false, false));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Grave2Entity.class, false, false));
        this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, SteveEntity.class, false, false));
        this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, Steve2Entity.class, false, false));
        this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, FennudeshidifuEntity.class, false, false));
        this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, KeLiSiEntity.class, false, false));
        this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, GeLeiGeEntity.class, false, false));
        this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, JianbingguoziEntity.class, false, false));
        this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, BlueDemonEntity.class, false, false));
        this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, NishidierjieEntity.class, false, false));
        this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, false, false));
        this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, MrMudgeMonkeyEntity.class, false, false));
        this.goalSelector.addGoal(32, new MeleeAttackGoal(this, 1.5d, false) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.Zaiezhiwang2Entity.1
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.goalSelector.addGoal(33, new RandomStrollGoal(this, 1.0d));
        this.targetSelector.addGoal(34, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(35, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(36, new FloatGoal(this));
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
    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.ambient"));
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.pillager.death"));
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        ZaiEZhiWangDangShiTiShouShangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
        if ((source.getDirectEntity() instanceof AbstractArrow) || source == DamageSource.FALL) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        Zaiezhiwang2DangShiTiSiWangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    @Override
    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        CunMinZhenChaBing1DangZheGeShiTiShaSiLingGeShiTiProcedure.execute();
    }

    @Override
    public void baseTick() {
        super.baseTick();
        ZaiEZhiWangDangShiTiGengXinKeShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }
}
