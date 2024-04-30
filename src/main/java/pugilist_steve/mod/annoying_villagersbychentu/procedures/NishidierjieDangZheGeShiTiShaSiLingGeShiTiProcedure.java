package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BlueDemonEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;


public class NishidierjieDangZheGeShiTiShaSiLingGeShiTiProcedure {
    /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.NishidierjieDangZheGeShiTiShaSiLingGeShiTiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity != null && Math.random() <= 0.7d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.NishidierjieDangZheGeShiTiShaSiLingGeShiTiProcedure.1
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                public void start(LevelAccessor world2, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world2;
                }

                @SubscribeEvent
                public void tick(TickEvent.ServerTickEvent event) {
                    if (event.phase == TickEvent.Phase.END) {
                        this.ticks++;
                        if (this.ticks >= this.waitTicks) {
                            this.run();
                        }
                    }
                }

                private void run() {
                    if (entity.isAlive()) {
                        if (!entity.level.isClientSide()) {
                            entity.discard();
                        }
                        ServerLevel serverLevel = this.world;
                        if (serverLevel instanceof ServerLevel) {
                            ServerLevel _level = serverLevel;
                            Mob blueDemonEntity = new BlueDemonEntity(AnnoyingVillagersbychentuModEntities.BLUE_DEMON.get(), _level);
                            blueDemonEntity.moveTo(x, y, z, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                            if (blueDemonEntity instanceof Mob) {
                                Mob _mobToSpawn = blueDemonEntity;
                                _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(blueDemonEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                            }
                            this.world.addFreshEntity(blueDemonEntity);
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 50);
        }
    }
}
