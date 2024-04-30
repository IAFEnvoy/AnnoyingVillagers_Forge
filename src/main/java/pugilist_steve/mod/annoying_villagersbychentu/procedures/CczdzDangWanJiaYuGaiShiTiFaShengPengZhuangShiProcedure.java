package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class CczdzDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CczdzDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure$1] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity != null && Math.random() == 0.05d) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CczdzDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure.1
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
                    ItemStack itemStack;
                    ItemStack itemStack2;
                    if (entity instanceof LivingEntity) {
                        Player player = (LivingEntity) entity;
                        ItemStack _setstack = new ItemStack(Items.BOW);
                        _setstack.setCount(1);
                        player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                        if (player instanceof Player) {
                            Player _player = player;
                            _player.getInventory().setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt = entity;
                        itemStack = _livEnt.getOffhandItem();
                    } else {
                        itemStack = ItemStack.EMPTY;
                    }
                    itemStack.enchant(Enchantments.POWER_ARROWS, 5);
                    if (entity instanceof LivingEntity) {
                        LivingEntity _livEnt2 = entity;
                        itemStack2 = _livEnt2.getOffhandItem();
                    } else {
                        itemStack2 = ItemStack.EMPTY;
                    }
                    itemStack2.enchant(Enchantments.PUNCH_ARROWS, 2);
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 40);
        }
    }
}
