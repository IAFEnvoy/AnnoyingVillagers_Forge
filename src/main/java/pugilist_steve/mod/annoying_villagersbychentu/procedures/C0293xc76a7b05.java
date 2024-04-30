package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class C0293xc76a7b05 {
    /* JADX WARN: Type inference failed for: r0v5, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BeiganrandekelisiDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            Player player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.XIAODAO.get());
            _setstack.setCount(1);
            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (player instanceof Player) {
                Player _player = player;
                _player.getInventory().setChanged();
            }
        }
        if (entity instanceof LivingEntity) {
            Player player2 = (LivingEntity) entity;
            ItemStack _setstack2 = new ItemStack(Items.SHIELD);
            _setstack2.setCount(1);
            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
            if (player2 instanceof Player) {
                Player _player2 = player2;
                _player2.getInventory().setChanged();
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BeiganrandekelisiDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1
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
                    Player player3 = (LivingEntity) entity;
                    ItemStack _setstack3 = new ItemStack(Items.BOW);
                    _setstack3.setCount(1);
                    player3.setItemInHand(InteractionHand.MAIN_HAND, _setstack3);
                    if (player3 instanceof Player) {
                        Player _player3 = player3;
                        _player3.getInventory().setChanged();
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 40);
    }
}
