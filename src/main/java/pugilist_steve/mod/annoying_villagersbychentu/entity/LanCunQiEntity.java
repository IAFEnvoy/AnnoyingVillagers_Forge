package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.nbt.CompoundTag;
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
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
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

public class LanCunQiEntity extends PathfinderMob {
    public LanCunQiEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.LAN_CUN_QI.get(), world);
    }

    public LanCunQiEntity(EntityType<LanCunQiEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 2.0f;
        this.xpReward = 10;
        this.setNoAi(false);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_JIAN.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Items.ENDER_PEARL));
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.LANCUNQITOUKUI.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QIARMOR_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QIARMOR_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QIARMOR_BOOTS.get()));
    }

    @SubscribeEvent
    public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
        event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(AnnoyingVillagersbychentuModEntities.LAN_CUN_QI.get(), 5, 1, 3));
    }

    public static void init() {
        SpawnPlacements.register((EntityType) AnnoyingVillagersbychentuModEntities.LAN_CUN_QI.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            return world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8;
        });
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.26d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 7.0d).add(Attributes.ATTACK_DAMAGE, 0.0d).add(Attributes.FOLLOW_RANGE, 128.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.getNavigation().getNodeEvaluator().setCanOpenDoors(true);
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setAlertOthers());
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, Monster.class, true, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Herobrine7Entity.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, HbGaoJiFenShenEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, DiJiherobrineEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, BlueDemonEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, SteveEntity.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, KeLiSiEntity.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, GeLeiGeEntity.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, JianbingguoziEntity.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, GraveEntity.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, WanJia1Entity.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, MrcolderEntity.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, Mrcolder2Entity.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, EnchanterEntity.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, MrMudgeMonkeyEntity.class, true, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, LingZhiEntity.class, true, false));
        this.goalSelector.addGoal(21, new MeleeAttackGoal(this, 1.5d, false) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.LanCunQiEntity.1
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.goalSelector.addGoal(22, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(23, new FollowMobGoal(this, 1.3d, 20.0f, 15.0f));
        this.goalSelector.addGoal(24, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(25, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(26, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(27, new FloatGoal(this));
        this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, CunZhenFuLuEntity.class, true, true));
        this.targetSelector.addGoal(29, new NearestAttackableTargetGoal(this, LanCunQiFuLuEntity.class, true, true));
        this.targetSelector.addGoal(30, new NearestAttackableTargetGoal(this, LvcunqifuluEntity.class, true, true));
        this.targetSelector.addGoal(31, new NearestAttackableTargetGoal(this, HongCunQiFuLuEntity.class, true, true));
        this.targetSelector.addGoal(32, new NearestAttackableTargetGoal(this, ZiCunQiFuLuEntity.class, true, true));
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
    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient"));
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
        LanCunQiDangShiTiShouShangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
        if (source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DRAGON_BREATH) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        LanCunQiDangShiTiBeiShaSiShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        LanCunQiShiTiChuShiShengChengShiProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
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
        LanCunQiDangYouJiShiTiShiProcedure.execute(world, x, y, z, this);
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
        LanCunQiDangShiTiGengXinKeShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }
}
