package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
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
import pugilist_steve.mod.annoying_villagersbychentu.procedures.ZibaokuileiDangShiTiSiWangShiProcedure;

@Mod.EventBusSubscriber

public class ZibaokuileiEntity extends IronGolem {
    public ZibaokuileiEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.ZIBAOKUILEI.get(), world);
    }

    public ZibaokuileiEntity(EntityType<ZibaokuileiEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 0.6f;
        this.xpReward = 10;
        this.setNoAi(false);
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_FU.get()));
    }

    @SubscribeEvent
    public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
        event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData(AnnoyingVillagersbychentuModEntities.ZIBAOKUILEI.get(), 4, 1, 1));
    }

    public static void init() {
        SpawnPlacements.register((EntityType) AnnoyingVillagersbychentuModEntities.ZIBAOKUILEI.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
            return world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8;
        });
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.5d).add(Attributes.MAX_HEALTH, 100.0d).add(Attributes.ARMOR, 25.0d).add(Attributes.ATTACK_DAMAGE, 14.0d).add(Attributes.FOLLOW_RANGE, 128.0d).add(Attributes.KNOCKBACK_RESISTANCE, 10.0d).add(Attributes.ATTACK_KNOCKBACK, 50.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2d, false) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.ZibaokuileiEntity.1
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal(this, HbGaoJiFenShenEntity.class, false, false));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Herobrine7Entity.class, false, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, DiJiherobrineEntity.class, false, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LingZhiEntity.class, false, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, BlueDemonEntity.class, false, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, ShiTi303Entity.class, false, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, KeLiSiEntity.class, false, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, GeLeiGeEntity.class, false, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, ZaiEZhiWangEntity.class, false, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Player.class, false, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Monster.class, false, false));
        this.goalSelector.addGoal(13, new MeleeAttackGoal(this, 1.5d, false) { // from class: pugilist_steve.mod.annoying_villagersbychentu.entity.ZibaokuileiEntity.2
            @Override
            protected double getAttackReachSqr(LivingEntity entity) {
                return (this.mob.getBbWidth() * this.mob.getBbWidth()) + entity.getBbWidth();
            }
        });
        this.goalSelector.addGoal(14, new RandomStrollGoal(this, 1.0d));
        this.targetSelector.addGoal(15, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(16, new FollowMobGoal(this, 1.45d, 15.0f, 12.0f));
        this.goalSelector.addGoal(17, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(18, new FloatGoal(this));
    }

    @Override
    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    @Override
    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.hurt"));
    }

    @Override
    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death"));
    }

    @Override
    public boolean hurt(DamageSource source, float amount) {
        if ((source.getDirectEntity() instanceof AbstractArrow) || source == DamageSource.FALL) {
            return false;
        }
        return super.hurt(source, amount);
    }

    @Override
    public void die(DamageSource source) {
        super.die(source);
        ZibaokuileiDangShiTiSiWangShiProcedure.execute(this);
    }
}
