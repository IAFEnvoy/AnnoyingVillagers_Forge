package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pugilist_steve.mod.annoying_villagersbychentu.entity.CczdzEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.CunMinZhenChaBingEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.LanCunQiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber

public class PlayerusefireworkProcedure {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        if (event.getHand() != event.getPlayer().getUsedItemHand()) {
            return;
        }
        execute(event, event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayerusefireworkProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == Items.FIREWORK_ROCKET && !world.getEntitiesOfClass(CunMinZhenChaBingEntity.class, AABB.ofSize(new Vec3(x, y, z), 100.0d, 100.0d, 100.0d), e -> {
            return true;
        }).isEmpty()) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.PlayerusefireworkProcedure.1
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                public void start(LevelAccessor world2, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world2;
                }

                @SubscribeEvent
                public void tick(TickEvent.ServerTickEvent event2) {
                    if (event2.phase == TickEvent.Phase.END) {
                        this.ticks++;
                        if (this.ticks >= this.waitTicks) {
                            this.run();
                        }
                    }
                }

                private void run() {
                    ServerLevel serverLevel = this.world;
                    if (serverLevel instanceof ServerLevel) {
                        ServerLevel _level = serverLevel;
                        Mob lanCunQiEntity = new LanCunQiEntity(AnnoyingVillagersbychentuModEntities.LAN_CUN_QI.get(), _level);
                        lanCunQiEntity.moveTo(x + Mth.nextInt(new Random(), -10, 10), y + Mth.nextInt(new Random(), 2, 5), z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (lanCunQiEntity instanceof Mob) {
                            Mob _mobToSpawn = lanCunQiEntity;
                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(lanCunQiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                        }
                        this.world.addFreshEntity(lanCunQiEntity);
                    }
                    ServerLevel serverLevel2 = this.world;
                    if (serverLevel2 instanceof ServerLevel) {
                        ServerLevel _level2 = serverLevel2;
                        Mob cunMinZhenChaBingEntity = new CunMinZhenChaBingEntity(AnnoyingVillagersbychentuModEntities.CUN_MIN_ZHEN_CHA_BING.get(), _level2);
                        cunMinZhenChaBingEntity.moveTo(x + Mth.nextInt(new Random(), -10, 10), y + Mth.nextInt(new Random(), 2, 5), z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (cunMinZhenChaBingEntity instanceof Mob) {
                            Mob _mobToSpawn2 = cunMinZhenChaBingEntity;
                            _mobToSpawn2.finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(cunMinZhenChaBingEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                        }
                        this.world.addFreshEntity(cunMinZhenChaBingEntity);
                    }
                    ServerLevel serverLevel3 = this.world;
                    if (serverLevel3 instanceof ServerLevel) {
                        ServerLevel _level3 = serverLevel3;
                        Mob cczdzEntity = new CczdzEntity(AnnoyingVillagersbychentuModEntities.CCZDZ.get(), _level3);
                        cczdzEntity.moveTo(x + Mth.nextInt(new Random(), -10, 10), y + Mth.nextInt(new Random(), 2, 5), z + Mth.nextInt(new Random(), -10, 10), this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (cczdzEntity instanceof Mob) {
                            Mob _mobToSpawn3 = cczdzEntity;
                            _mobToSpawn3.finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(cczdzEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                        }
                        this.world.addFreshEntity(cczdzEntity);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 200);
        }
    }
}
