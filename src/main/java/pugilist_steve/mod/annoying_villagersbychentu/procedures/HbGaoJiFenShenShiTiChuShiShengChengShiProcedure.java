package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HongyizombieEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;

import java.util.Random;


public class HbGaoJiFenShenShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenShiTiChuShiShengChengShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel _level) {
            LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
            entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn.setVisualOnly(true);
            _level.addFreshEntity(entityToSpawn);
        }
        if (Math.random() <= 0.5d) {
            if (world instanceof ServerLevel _level2) {
                Mob hongyizombieEntity = new HongyizombieEntity(AnnoyingVillagersbychentuModEntities.HONGYIZOMBIE.get(), _level2);
                hongyizombieEntity.moveTo(x + Mth.nextInt(new Random(), 2, 5), y + 1.0d, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (hongyizombieEntity instanceof Mob) {
                    Mob _mobToSpawn = hongyizombieEntity;
                    _mobToSpawn.finalizeSpawn(_level2, world.getCurrentDifficultyAt(hongyizombieEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(hongyizombieEntity);
            }
            if (world instanceof ServerLevel _level3) {
                Mob hongyizombieEntity2 = new HongyizombieEntity(AnnoyingVillagersbychentuModEntities.HONGYIZOMBIE.get(), _level3);
                hongyizombieEntity2.moveTo(x - Mth.nextInt(new Random(), 2, 5), y + 1.0d, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (hongyizombieEntity2 instanceof Mob) {
                    Mob _mobToSpawn2 = hongyizombieEntity2;
                    _mobToSpawn2.finalizeSpawn(_level3, world.getCurrentDifficultyAt(hongyizombieEntity2.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(hongyizombieEntity2);
            }
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("Herobrine已降临"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.HbGaoJiFenShenShiTiChuShiShengChengShiProcedure.1
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
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level4 = level;
                    if (!_level4.isClientSide()) {
                        _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsaydzlsddds")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsaydzlsddds")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!this.world.isClientSide() && this.world.getServer() != null) {
                    this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> 挡在我路上的都得死！"), ChatType.SYSTEM, Util.NIL_UUID);
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrinexintu");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrine");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join herobrinexintu @s");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join herobrine @s");
        }
    }
}
