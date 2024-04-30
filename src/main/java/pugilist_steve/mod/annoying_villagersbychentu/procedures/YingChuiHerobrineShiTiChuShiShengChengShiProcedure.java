package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
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


public class YingChuiHerobrineShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.YingChuiHerobrineShiTiChuShiShengChengShiProcedure$1] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> 该我出手了……"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.YingChuiHerobrineShiTiChuShiShengChengShiProcedure.1
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
                Player player2 = entity;
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
                    _player2.getInventory().setChanged();
                } else if (player2 instanceof LivingEntity) {
                    LivingEntity _living2 = player2;
                    _living2.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
                }
                Player player3 = entity;
                if (player3 instanceof Player) {
                    Player _player3 = player3;
                    _player3.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
                    _player3.getInventory().setChanged();
                } else if (player3 instanceof LivingEntity) {
                    LivingEntity _living3 = player3;
                    _living3.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
                }
                Player player4 = entity;
                if (player4 instanceof Player) {
                    Player _player4 = player4;
                    _player4.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
                    _player4.getInventory().setChanged();
                } else if (player4 instanceof LivingEntity) {
                    LivingEntity _living4 = player4;
                    _living4.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
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
