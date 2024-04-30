package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;


public class FennudeshidifuShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v16, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuShiTiChuShiShengChengShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v17, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuShiTiChuShiShengChengShiProcedure$4] */
    /* JADX WARN: Type inference failed for: r0v38, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuShiTiChuShiShengChengShiProcedure$2] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuShiTiChuShiShengChengShiProcedure.1
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
                if (this.world.players().size() >= 6) {
                    Entity _ent = entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"Steve left the game\",\"color\":\"yellow\"}");
                    }
                } else {
                    Entity _ent2 = entity;
                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"Steve退出了游戏\",\"color\":\"yellow\"}");
                    }
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 5000);
        entity.setYRot(0.0f);
        entity.setXRot(180.0f);
        entity.setYBodyRot(entity.getYRot());
        entity.setYHeadRot(entity.getYRot());
        entity.yRotO = entity.getYRot();
        entity.xRotO = entity.getXRot();
        if (entity instanceof LivingEntity _entity) {
            _entity.yBodyRotO = _entity.getYRot();
            _entity.yHeadRotO = _entity.getYRot();
        }
        Level projectileLevel = entity.level;
        if (!projectileLevel.isClientSide()) {
            Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuShiTiChuShiShengChengShiProcedure.2
                public Projectile getProjectile(Level level, Entity shooter) {
                    ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(EntityType.ENDER_PEARL, level);
                    thrownEnderpearl.setOwner(shooter);
                    return thrownEnderpearl;
                }
            }.getProjectile(projectileLevel, entity);
            _entityToSpawn.setPos(entity.getX(), entity.getEyeY() - 0.1d, entity.getZ());
            _entityToSpawn.shoot(entity.getLookAngle().x, entity.getLookAngle().y, entity.getLookAngle().z, 2.0f, 0.0f);
            projectileLevel.addFreshEntity(_entityToSpawn);
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuShiTiChuShiShengChengShiProcedure.3
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
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:steve2")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:steve2")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!this.world.isClientSide() && this.world.getServer() != null) {
                    this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Steve> 我会杀了你！"), ChatType.SYSTEM, Util.NIL_UUID);
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 10);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.FennudeshidifuShiTiChuShiShengChengShiProcedure.4
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
                if (entity instanceof LivingEntity) {
                    LivingEntity _entity2 = entity;
                    if (!_entity2.level.isClientSide()) {
                        _entity2.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.KUIJIAXIAOGUO.get(), 2000, 1));
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 40);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join ce");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/data merge entity @s {Tags:[\"OP\"]}");
        }
    }
}
