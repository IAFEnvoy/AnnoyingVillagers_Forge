package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
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

import java.util.Random;


public class BishouDangShiTiHuiDongWuPinShiProcedure {
    /* JADX WARN: Type inference failed for: r0v28, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BishouDangShiTiHuiDongWuPinShiProcedure$1] */
    public static void execute(LevelAccessor world, final Entity entity, ItemStack itemstack) {
        ItemStack itemStack;
        if (entity != null && (entity instanceof Player _playerHasItem)) {
            if (_playerHasItem.getInventory().contains(new ItemStack(Blocks.TNT))) {
                if (entity instanceof LivingEntity _livEnt) {
                    itemStack = _livEnt.getMainHandItem();
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.BISHOU.get()) {
                    if (itemstack.getDamageValue() >= 1) {
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BishouDangShiTiHuiDongWuPinShiProcedure.1
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
                                ItemStack itemStack2;
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt2 = entity;
                                    itemStack2 = _livEnt2.getMainHandItem();
                                } else {
                                    itemStack2 = ItemStack.EMPTY;
                                }
                                ItemStack _ist = itemStack2;
                                if (_ist.hurt(10, new Random(), null)) {
                                    _ist.shrink(1);
                                    _ist.setDamageValue(0);
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(world, 1);
                    }
                    if (entity instanceof LivingEntity) {
                        Player player = (LivingEntity) entity;
                        ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.BAOZHABISHOU.get());
                        _setstack.setCount(1);
                        player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (player instanceof Player) {
                            Player _player = player;
                            _player.getInventory().setChanged();
                        }
                    }
                }
            }
        }
    }
}
