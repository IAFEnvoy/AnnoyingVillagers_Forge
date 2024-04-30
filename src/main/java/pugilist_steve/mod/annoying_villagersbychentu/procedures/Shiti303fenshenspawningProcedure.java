package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
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

import java.util.Random;


public class Shiti303fenshenspawningProcedure {
    /* JADX WARN: Type inference failed for: r0v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Shiti303fenshenspawningProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v2, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Shiti303fenshenspawningProcedure$2] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Shiti303fenshenspawningProcedure.1
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
                    _player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                    if (_player instanceof Player) {
                        _player.getInventory().setChanged();
                    }
                }
                Player player = entity;
                if (player instanceof Player) {
                    Player _player2 = player;
                    _player2.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                    _player2.getInventory().setChanged();
                } else if (player instanceof LivingEntity) {
                    LivingEntity _living = player;
                    _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Shiti303fenshenspawningProcedure.2
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
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, Mth.nextInt(new Random(), 90, 300));
    }
}
