package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.nbt.CompoundTag;
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

public class ZaiEZhiWangEntity extends Monster {
    public ZaiEZhiWangEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.ZAI_E_ZHI_WANG.get(), world);
    }

    public ZaiEZhiWangEntity(EntityType<ZaiEZhiWangEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 3.0f;
        this.xpReward = 0;
        this.setNoAi(false);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(AnnoyingVillagersbychentuModItems.HONG_BAO_SHI_FU_JU_DA.get()));
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.LUEDUOZHEWANGTOUKUI.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.ARMOR_THE_PLAGUE_KING_CHESTPLATE.get()));
    }

    @SubscribeEvent
    public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
        event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(AnnoyingVillagersbychentuModEntities.ZAI_E_ZHI_WANG.get(), 1, 1, 1));
    }

    public static void init() {
        SpawnPlacements.register((EntityType) AnnoyingVillagersbychentuModEntities.ZAI_E_ZHI_WANG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            return world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8;
        });
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.26d).add(Attributes.MAX_HEALTH, 40.0d).add(Attributes.ARMOR, 10.0d).add(Attributes.ATTACK_DAMAGE, 0.0d).add(Attributes.FOLLOW_RANGE, 128.0d).add(Attributes.KNOCKBACK_RESISTANCE, 3.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal(this, HbGaoJiFenShenEntity.class, false, false));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, DarkHerobrineEntity.class, false, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Herobrine2Entity.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Herobrine3Entity.class, false, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Herobrine7Entity.class, false, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, DiJiherobrineEntity.class, false, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, LingZhiEntity.class, false, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, CczdzEntity.class, false, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, CunMinZhenChaBingEntity.class, false, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, HongCunQiEntity.class, false, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, LanCunQiEntity.class, false, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, ZiCunQiEntity.class, false, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, LuCunQiEntity.class, false, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Player.class, false, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, GraveEntity.class, false, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, SteveEntity.class, false, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, KeLiSiEntity.class, false, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, EnchanterEntity.class, false, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, MrcolderEntity.class, false, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, NishidierjieEntity.class, false, false));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Grave2Entity.class, false, false));
        this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, GeLeiGeEntity.class, false, false));
        this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, JianbingguoziEntity.class, false, false));
        this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, BlueDemonEntity.class, false, false));
        this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, false, false));
        this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, MrMudgeMonkeyEntity.class, false, false));
        this.goalSelector.addGoal(27, new MeleeAttackGoal(this, 1.5d, false) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.ZaiEZhiWangEntity.1
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.goalSelector.addGoal(28, new RandomStrollGoal(this, 1.0d));
        this.targetSelector.addGoal(29, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(30, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(31, new FloatGoal(this));
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
        if ((source.getDirectEntity() instanceof AbstractArrow) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DROWN || source == DamageSource.ANVIL || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        ZaiEZhiWangDangShiTiSiWangShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    @Override
    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        ZaiEZhiWangShiTiChuShiShengChengShiProcedure.execute(this);
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
        ZaiEZhiWangDangShiTiGengXinKeShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }
}
