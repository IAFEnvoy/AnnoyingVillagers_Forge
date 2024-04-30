package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class AlexVillagerEntity extends Villager {
    public AlexVillagerEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(AnnoyingVillagersbychentuModEntities.ALEX_VILLAGER.get(), world);
    }

    public AlexVillagerEntity(EntityType<AlexVillagerEntity> type, Level world) {
        super(type, world);
        this.maxUpStep = 0.6f;
        this.xpReward = 10;
        this.setNoAi(false);
        this.setPersistenceRequired();
        this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(AnnoyingVillagersbychentuModItems.JIEMODESHU.get()));
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.VILLAGERHEAD_3.get()));
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        return builder.add(Attributes.MOVEMENT_SPEED, 0.3d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 1.0d).add(Attributes.ATTACK_DAMAGE, 0.0d).add(Attributes.FOLLOW_RANGE, 128.0d).add(Attributes.KNOCKBACK_RESISTANCE, 5.0d);
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new LookAtPlayerGoal(this, AlexEntity.class, 12.0f));
        this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(4, new FloatGoal(this));
        this.goalSelector.addGoal(6, new FollowMobGoal(this, 1.0d, 10.0f, 5.0f));
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
        if ((source.getDirectEntity() instanceof AbstractArrow) || (source.getDirectEntity() instanceof Player) || (source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DROWN || source == DamageSource.LIGHTNING_BOLT || source.isExplosion() || source.getMsgId().equals("trident") || source == DamageSource.ANVIL || source == DamageSource.DRAGON_BREATH || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return super.hurt(source, amount);
    }
}
