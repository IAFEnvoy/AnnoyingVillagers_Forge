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
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.*;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class Herobrine7Entity extends Monster {
    public Herobrine7Entity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.HEROBRINE_7.get(), world);
    }

    public Herobrine7Entity(EntityType<Herobrine7Entity> type, Level world) {
        super(type, world);
        this.maxUpStep = 2.0f;
        this.xpReward = 50;
        this.setNoAi(false);
        this.setCustomName(new TextComponent("Herobrine 7"));
        this.setCustomNameVisible(true);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(AnnoyingVillagersbychentuModItems.HEI_YAO_SHI_ZHU.get()));
    }

    @SubscribeEvent
    public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
        event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(AnnoyingVillagersbychentuModEntities.HEROBRINE_7.get(), 1, 1, 1));
    }

    public static void init() {
        SpawnPlacements.register((EntityType) AnnoyingVillagersbychentuModEntities.HEROBRINE_7.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            return world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8;
        });
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.35d).add(Attributes.MAX_HEALTH, 40.0d).add(Attributes.ARMOR, 10.0d).add(Attributes.ATTACK_DAMAGE, 9.0d).add(Attributes.FOLLOW_RANGE, 256.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, CczdzEntity.class, true, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, CunMinZhenChaBingEntity.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, HongCunQiEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LanCunQiEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ZiCunQiEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, LuCunQiEntity.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, BlueDemonEntity.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Player.class, true, true));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, MrcolderEntity.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, GraveEntity.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, JianbingguoziEntity.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, SteveEntity.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, KeLiSiEntity.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, GeLeiGeEntity.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, ZaiEZhiWangEntity.class, true, false));
        this.goalSelector.addGoal(18, new MeleeAttackGoal(this, 1.5d, true) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.Herobrine7Entity.1
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.goalSelector.addGoal(19, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(20, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(21, new FloatGoal(this));
    }

    @Override
    public MobType getMobType() {
        return MobType.UNDEAD;
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
        Herobrine7DangShiTiShouShangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
        if ((source.getDirectEntity() instanceof AbstractArrow) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DROWN || source == DamageSource.LIGHTNING_BOLT || source.isExplosion() || source == DamageSource.ANVIL || source == DamageSource.DRAGON_BREATH || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        Herobrine7DangShiTiBeiShaSiShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        Herobrine7ShiTiChuShiShengChengShiProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
        return retval;
    }

    @Override
    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        PlayersbianhbProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity);
    }

    @Override
    public void baseTick() {
        super.baseTick();
        Herobrine7DangShiTiGengXinKeShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }

    @Override
    public void playerTouch(Player sourceentity) {
        super.playerTouch(sourceentity);
        Herobrine7DangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }
}
