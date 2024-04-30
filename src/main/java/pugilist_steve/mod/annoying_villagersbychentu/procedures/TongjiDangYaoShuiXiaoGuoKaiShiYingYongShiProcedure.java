package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.CczdzEntity;
import pugilist_steve.mod.annoying_villagersbychentu.entity.CunMinZhenChaBingEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;


public class TongjiDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure {
    /* JADX WARN: Type inference failed for: r0v5, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.TongjiDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof Player _player) {
            if (!_player.level.isClientSide()) {
                _player.displayClientMessage(new TextComponent("你被通缉了！"), false);
            }
        }
        if (Math.random() <= 0.08d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.TongjiDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.1
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
                    ServerLevel serverLevel = this.world;
                    if (serverLevel instanceof ServerLevel) {
                        ServerLevel _level = serverLevel;
                        Mob cczdzEntity = new CczdzEntity(AnnoyingVillagersbychentuModEntities.CCZDZ.get(), _level);
                        cczdzEntity.moveTo(x, y, z + 10.0d, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (cczdzEntity instanceof Mob) {
                            Mob _mobToSpawn = cczdzEntity;
                            _mobToSpawn.finalizeSpawn(_level, this.world.getCurrentDifficultyAt(cczdzEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                        }
                        this.world.addFreshEntity(cczdzEntity);
                    }
                    ServerLevel serverLevel2 = this.world;
                    if (serverLevel2 instanceof ServerLevel) {
                        ServerLevel _level2 = serverLevel2;
                        Mob cczdzEntity2 = new CczdzEntity(AnnoyingVillagersbychentuModEntities.CCZDZ.get(), _level2);
                        cczdzEntity2.moveTo(x, y, z + 8.0d, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (cczdzEntity2 instanceof Mob) {
                            Mob _mobToSpawn2 = cczdzEntity2;
                            _mobToSpawn2.finalizeSpawn(_level2, this.world.getCurrentDifficultyAt(cczdzEntity2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                        }
                        this.world.addFreshEntity(cczdzEntity2);
                    }
                    ServerLevel serverLevel3 = this.world;
                    if (serverLevel3 instanceof ServerLevel) {
                        ServerLevel _level3 = serverLevel3;
                        Mob cunMinZhenChaBingEntity = new CunMinZhenChaBingEntity(AnnoyingVillagersbychentuModEntities.CUN_MIN_ZHEN_CHA_BING.get(), _level3);
                        cunMinZhenChaBingEntity.moveTo(x, y, z + 5.0d, this.world.getRandom().nextFloat() * 360.0f, 0.0f);
                        if (cunMinZhenChaBingEntity instanceof Mob) {
                            Mob _mobToSpawn3 = cunMinZhenChaBingEntity;
                            _mobToSpawn3.finalizeSpawn(_level3, this.world.getCurrentDifficultyAt(cunMinZhenChaBingEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                        }
                        this.world.addFreshEntity(cunMinZhenChaBingEntity);
                    }
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<村民侦察兵> 找到了，这里有通缉犯！"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 30);
        }
    }
}
