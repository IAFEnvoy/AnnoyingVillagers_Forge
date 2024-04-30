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

public class LuCunQiEntity extends PathfinderMob {
    public LuCunQiEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.LU_CUN_QI.get(), world);
    }

    public LuCunQiEntity(EntityType<LuCunQiEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 3.0f;
        this.xpReward = 0;
        this.setNoAi(false);
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_FU_MO_JIAN.get()));
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Items.ENDER_PEARL));
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(AnnoyingVillagersbychentuModItems.GREENKNIGHTARMOR_BOOTS.get()));
    }

    @SubscribeEvent
    public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
        event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(AnnoyingVillagersbychentuModEntities.LU_CUN_QI.get(), 3, 1, 2));
    }

    public static void init() {
        SpawnPlacements.register((EntityType) AnnoyingVillagersbychentuModEntities.LU_CUN_QI.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            return world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8;
        });
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.26d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 1.0d).add(Attributes.ATTACK_DAMAGE, 1.0d).add(Attributes.FOLLOW_RANGE, 128.0d);
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
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, HbGaoJiFenShenEntity.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, LingZhiEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, DiJiherobrineEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Herobrine7Entity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, BlueDemonEntity.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, GraveEntity.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, MrcolderEntity.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, SteveEntity.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, KeLiSiEntity.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, GeLeiGeEntity.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, JianbingguoziEntity.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, WanJia1Entity.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, ZaiEZhiWangEntity.class, true, false));
        this.goalSelector.addGoal(17, new MeleeAttackGoal(this, 1.5d, true) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.LuCunQiEntity.1
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.goalSelector.addGoal(19, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(20, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(21, new FloatGoal(this));
        this.goalSelector.addGoal(22, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(23, new OpenDoorGoal(this, false));
        this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, CunZhenFuLuEntity.class, true, true));
        this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, LanCunQiFuLuEntity.class, true, true));
        this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, LvcunqifuluEntity.class, true, true));
        this.targetSelector.addGoal(27, new NearestAttackableTargetGoal(this, HongCunQiFuLuEntity.class, true, true));
        this.targetSelector.addGoal(28, new NearestAttackableTargetGoal(this, ZiCunQiFuLuEntity.class, true, true));
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
        if (source == DamageSource.FALL) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        LuCunQiDangShiTiSiWangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        LuCunQiShiTiChuShiShengChengShiProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
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
        LuCunQiDangYouJiShiTiShiProcedure.execute(world, x, y, z, this);
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
