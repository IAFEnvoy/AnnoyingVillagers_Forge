package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class C0397x97c9b1a7 {
    /* JADX WARN: Type inference failed for: r0v48, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DanShouZhanShenZhiRenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, final ItemStack itemstack) {
        if (entity != null && entity.isShiftKeyDown()) {
            Vec3 _center = new Vec3(x, y, z);
            List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2.5d), e -> {
                return true;
            }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
                return _entcnd.distanceToSqr(_center);
            })).collect(Collectors.toList());
            for (Entity entity2 : _entfound) {
                entity2.hurt(DamageSource.MAGIC, 2.0f);
                if (entity2 instanceof LivingEntity _entity) {
                    if (!_entity.level.isClientSide()) {
                        _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 5, false, false));
                    }
                }
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle minecraft:totem_of_undying ^ ^1.5 ^ 0 0 0 1 1000");
            }
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle epicfight:air_burst ^ ^1.5 ^ 0 0 0 8 1");
            }
            if (entity instanceof Player _player) {
                _player.getCooldowns().addCooldown(itemstack.getItem(), 500);
            }
            itemstack.setHoverName(new TextComponent("§lWake up!"));
            entity.setDeltaMovement(new Vec3(0.0d, 1.2d, 0.0d));
            entity.setYRot(0.0f);
            entity.setXRot(45.0f);
            entity.setYBodyRot(entity.getYRot());
            entity.setYHeadRot(entity.getYRot());
            entity.yRotO = entity.getYRot();
            entity.xRotO = entity.getXRot();
            if (entity instanceof LivingEntity _entity2) {
                _entity2.yBodyRotO = _entity2.getYRot();
                _entity2.yHeadRotO = _entity2.getYRot();
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:wing")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:l_g_w_u")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:l_g_w_u")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level3) {
                if (!_level3.isClientSide()) {
                    _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:zhanshenzhirenjuexing")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:zhanshenzhirenjuexing")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level4) {
                if (!_level4.isClientSide()) {
                    _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
            if (entity instanceof LivingEntity _entity3) {
                if (!_entity3.level.isClientSide()) {
                    _entity3.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.NAILI.get(), 50, 1, false, false));
                }
            }
            if (entity instanceof LivingEntity _entity4) {
                if (!_entity4.level.isClientSide()) {
                    _entity4.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 50, 2, false, false));
                }
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DanShouZhanShenZhiRenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.1
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
                    itemstack.setHoverName(new TextComponent("Legendary Sword"));
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 50);
        }
    }
}
