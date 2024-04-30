package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;


public class BTridentShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BTridentShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BTridentShiTiChuShiShengChengShiProcedure$2] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BTridentShiTiChuShiShengChengShiProcedure.1
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
                    Player _player = (LivingEntity) entity;
                    ItemStack _setstack = new ItemStack(Blocks.AIR);
                    _setstack.setCount(1);
                    _player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (_player instanceof Player) {
                        _player.getInventory().setChanged();
                    }
                }
                Player player = entity;
                if (player instanceof Player) {
                    Player _player2 = player;
                    _player2.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
                    _player2.getInventory().setChanged();
                } else if (player instanceof LivingEntity) {
                    LivingEntity _living = player;
                    _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
                }
                Player player2 = entity;
                if (player2 instanceof Player) {
                    Player _player3 = player2;
                    _player3.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
                    _player3.getInventory().setChanged();
                } else if (player2 instanceof LivingEntity) {
                    LivingEntity _living2 = player2;
                    _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
                }
                Player player3 = entity;
                if (player3 instanceof Player) {
                    Player _player4 = player3;
                    _player4.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
                    _player4.getInventory().setChanged();
                } else if (player3 instanceof LivingEntity) {
                    LivingEntity _living3 = player3;
                    _living3.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
                }
                if (entity instanceof LivingEntity) {
                    Player _player5 = (LivingEntity) entity;
                    ItemStack _setstack2 = new ItemStack(Blocks.AIR);
                    _setstack2.setCount(1);
                    _player5.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                    if (_player5 instanceof Player) {
                        _player5.getInventory().setChanged();
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.FULU.get(), 900, 1, false, false));
            }
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 900, 1, false, false));
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BTridentShiTiChuShiShengChengShiProcedure.2
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
                if (entity.isAlive() && !entity.level.isClientSide()) {
                    entity.discard();
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 200);
    }
}
