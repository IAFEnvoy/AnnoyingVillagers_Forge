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
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BluedemontridentDangTouSheWuSheZhongCiFangKuaiProcedure;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.BluedemontridentDangTouZhiWuJiZhongShiTiShiProcedure;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)

public class BluedemontridentEntity extends AbstractArrow implements ItemSupplier {
    public BluedemontridentEntity(PlayMessages.SpawnEntity packet, Level world) {
        super(AnnoyingVillagersbychentuModEntities.BLUEDEMONTRIDENT.get(), world);
    }

    public BluedemontridentEntity(EntityType<? extends BluedemontridentEntity> type, Level world) {
        super(type, world);
    }

    public BluedemontridentEntity(EntityType<? extends BluedemontridentEntity> type, double x, double y, double z, Level world) {
        super(type, x, y, z, world);
    }

    public BluedemontridentEntity(EntityType<? extends BluedemontridentEntity> type, LivingEntity entity, Level world) {
        super(type, entity, world);
    }

    public static BluedemontridentEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
        BluedemontridentEntity entityarrow = new BluedemontridentEntity(AnnoyingVillagersbychentuModEntities.BLUEDEMONTRIDENT.get(), entity, world);
        entityarrow.shoot(entity.getViewVector(1.0f).x, entity.getViewVector(1.0f).y, entity.getViewVector(1.0f).z, power * 2.0f, 0.0f);
        entityarrow.setSilent(true);
        entityarrow.setCritArrow(false);
        entityarrow.setBaseDamage(damage);
        entityarrow.setKnockback(knockback);
        entityarrow.setSecondsOnFire(100);
        world.addFreshEntity(entityarrow);
        world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 1.0f, (1.0f / ((random.nextFloat() * 0.5f) + 1.0f)) + (power / 2.0f));
        return entityarrow;
    }

    public static BluedemontridentEntity shoot(LivingEntity entity, LivingEntity target) {
        BluedemontridentEntity entityarrow = new BluedemontridentEntity(AnnoyingVillagersbychentuModEntities.BLUEDEMONTRIDENT.get(), entity, entity.level);
        double dx = target.getX() - entity.getX();
        double dy = (target.getY() + target.getEyeHeight()) - 1.1d;
        double dz = target.getZ() - entity.getZ();
        entityarrow.shoot(dx, (dy - entityarrow.getY()) + (Math.hypot(dx, dz) * 0.20000000298023224d), dz, 2.2f, 12.0f);
        entityarrow.setSilent(true);
        entityarrow.setBaseDamage(9.0d);
        entityarrow.setKnockback(4);
        entityarrow.setCritArrow(false);
        entityarrow.setSecondsOnFire(100);
        entity.level.addFreshEntity(entityarrow);
        entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.trident.throw")), SoundSource.PLAYERS, 1.0f, 1.0f / ((new Random().nextFloat() * 0.5f) + 1.0f));
        return entityarrow;
    }

    @Override
    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public ItemStack getItem() {
        return new ItemStack(AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get());
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
        BluedemontridentDangTouZhiWuJiZhongShiTiShiProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entityHitResult.getEntity());
    }

    @Override
    public void onHitBlock(BlockHitResult blockHitResult) {
        super.onHitBlock(blockHitResult);
        BluedemontridentDangTouSheWuSheZhongCiFangKuaiProcedure.execute(this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
    }

    @Override
    public void tick() {
        super.tick();
        if (this.inGround) {
            this.discard();
        }
    }
}
