package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
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
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.*;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class HongyizombieEntity extends Zombie {
    public HongyizombieEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.HONGYIZOMBIE.get(), world);
    }

    public HongyizombieEntity(EntityType<HongyizombieEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 2.0f;
        this.xpReward = 10;
        this.setNoAi(false);
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(Items.DIAMOND_SWORD));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Items.ENDER_PEARL));
    }

    @SubscribeEvent
    public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
        event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(AnnoyingVillagersbychentuModEntities.HONGYIZOMBIE.get(), 4, 1, 2));
    }

    public static void init() {
        SpawnPlacements.register((EntityType) AnnoyingVillagersbychentuModEntities.HONGYIZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            return world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8;
        });
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.47d).add(Attributes.MAX_HEALTH, 24.0d).add(Attributes.ARMOR, 15.0d).add(Attributes.ATTACK_DAMAGE, 2.0d).add(Attributes.FOLLOW_RANGE, 128.0d).add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, CczdzEntity.class, false, false));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, CunMinZhenChaBingEntity.class, false, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, HongCunQiEntity.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, LanCunQiEntity.class, false, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, ZiCunQiEntity.class, false, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, LuCunQiEntity.class, false, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, BlueDemonEntity.class, false, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, false, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Player.class, false, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, GraveEntity.class, false, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, MrcolderEntity.class, false, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, JianbingguoziEntity.class, false, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, SteveEntity.class, false, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, KeLiSiEntity.class, false, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, GeLeiGeEntity.class, false, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, ZaiEZhiWangEntity.class, false, false));
        this.goalSelector.addGoal(17, new MeleeAttackGoal(this, 1.5d, false) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.HongyizombieEntity.1
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.goalSelector.addGoal(18, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(19, new FollowMobGoal(this, 1.5d, 40.0f, 15.0f));
        this.targetSelector.addGoal(20, new HurtByTargetGoal(this).setAlertOthers());
        this.goalSelector.addGoal(21, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(22, new FloatGoal(this));
    }

    @Override
    public MobType getMobType() {
        return MobType.UNDEAD;
    }

    @Override
    public double getMyRidingOffset() {
        return -0.35d;
    }

    @Override
    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.ambient"));
    }

    @Override
    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.step")), 0.15f, 1.0f);
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.zombie.death"));
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        HongyizombieDangShiTiShouShangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
        if ((source.getDirectEntity() instanceof AbstractArrow) || source == DamageSource.FALL) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        HongyizombiedeahProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        HongyizombieShiTiChuShiShengChengShiProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
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
        HongyizombieDangShiTiGengXinKeShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }
}
