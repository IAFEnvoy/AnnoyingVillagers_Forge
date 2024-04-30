package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class Mrcolder2ShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2ShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v35, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2ShiTiChuShiShengChengShiProcedure$2] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (world.players().size() >= 5) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"Mr_colder joined the game\",\"color\":\"yellow\"}");
            }
        } else if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"Mr_colder加入了游戏\",\"color\":\"yellow\"}");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add ce");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join ce @s");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join ce @e[type=annoying_villagersbychentu:steve]");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join ce @e[type=annoying_villagersbychentu:steve_2]");
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2ShiTiChuShiShengChengShiProcedure.1
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
                entity.setCustomName(new TextComponent("Mr_colder"));
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 10);
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999999, 1, false, false));
            }
        }
        if (entity instanceof LivingEntity _entity2) {
            if (!_entity2.level.isClientSide()) {
                _entity2.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 999999, 0, false, false));
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Mrcolder2ShiTiChuShiShengChengShiProcedure.2
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
                Player player = entity;
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                    _player.getInventory().setChanged();
                } else if (player instanceof LivingEntity) {
                    LivingEntity _living = player;
                    _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                }
                if (entity instanceof LivingEntity) {
                    Player _player2 = (LivingEntity) entity;
                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.CCGEPOLANJIANDUN.get());
                    _setstack.setCount(1);
                    _player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (_player2 instanceof Player) {
                        _player2.getInventory().setChanged();
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
    }
}
