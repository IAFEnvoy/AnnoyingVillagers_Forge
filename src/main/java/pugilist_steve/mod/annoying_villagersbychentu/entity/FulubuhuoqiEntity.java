package pugilist_steve.mod.annoying_villagersbychentu.entity;

import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModBlocks;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.FulubuhuoqiDangTouSheWuSheZhongZheGeFangKuaiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.FulubuhuoqiDangTouZhiWuJiZhongShiTiShiProcedure;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)

public class FulubuhuoqiEntity extends AbstractArrow implements ItemSupplier {
    public FulubuhuoqiEntity(PlayMessages.SpawnEntity packet, Level world) {
        super(AnnoyingVillagersbychentuModEntities.FULUBUHUOQI.get(), world);
    }

    public FulubuhuoqiEntity(EntityType<? extends FulubuhuoqiEntity> type, Level world) {
        super(type, world);
    }

    public FulubuhuoqiEntity(EntityType<? extends FulubuhuoqiEntity> type, double x, double y, double z, Level world) {
        super(type, x, y, z, world);
    }

    public FulubuhuoqiEntity(EntityType<? extends FulubuhuoqiEntity> type, LivingEntity entity, Level world) {
        super(type, entity, world);
    }

    public static FulubuhuoqiEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
        FulubuhuoqiEntity entityarrow = new FulubuhuoqiEntity(AnnoyingVillagersbychentuModEntities.FULUBUHUOQI.get(), entity, world);
        entityarrow.shoot(entity.getViewVector(1.0f).x, entity.getViewVector(1.0f).y, entity.getViewVector(1.0f).z, power * 2.0f, 0.0f);
        entityarrow.setSilent(true);
        entityarrow.setCritArrow(false);
        entityarrow.setBaseDamage(damage);
        entityarrow.setKnockback(knockback);
        world.addFreshEntity(entityarrow);
        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0f, (1.0f / ((random.nextFloat() * 0.5f) + 1.0f)) + (power / 2.0f));
        return entityarrow;
    }

    public static FulubuhuoqiEntity shoot(LivingEntity entity, LivingEntity target) {
        FulubuhuoqiEntity entityarrow = new FulubuhuoqiEntity(AnnoyingVillagersbychentuModEntities.FULUBUHUOQI.get(), entity, entity.level);
        double dx = target.getX() - entity.getX();
        double dy = (target.getY() + target.getEyeHeight()) - 1.1d;
        double dz = target.getZ() - entity.getZ();
        entityarrow.shoot(dx, (dy - entityarrow.getY()) + (Math.hypot(dx, dz) * 0.20000000298023224d), dz, 2.4f, 12.0f);
        entityarrow.setSilent(true);
        entityarrow.setBaseDamage(0.0d);
        entityarrow.setKnockback(0);
        entityarrow.setCritArrow(false);
        entity.level.addFreshEntity(entityarrow);
        entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0f, 1.0f / ((new Random().nextFloat() * 0.5f) + 1.0f));
        return entityarrow;
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack getItem() {
        return new ItemStack(AnnoyingVillagersbychentuModBlocks.PUTONGHEIYAOSHI.get());
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }

    @Override
    protected void doPostHurtEffects(LivingEntity entity) {
        super.doPostHurtEffects(entity);
        entity.setArrowCount(entity.getArrowCount() - 1);
    }

    @Override
    public void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        FulubuhuoqiDangTouZhiWuJiZhongShiTiShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entityHitResult.getEntity());
    }

    @Override
    public void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        FulubuhuoqiDangTouSheWuSheZhongZheGeFangKuaiProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
    }

    @Override
    public void tick() {
        super.tick();
        if (this.inGround) {
            this.discard();
        }
    }
}
