package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;


public class XiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.XiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity, final ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.BLOCKS, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.XiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.1
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
                if (entity instanceof LivingEntity) {
                    LivingEntity _livEnt = entity;
                    itemStack = _livEnt.getOffhandItem();
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                if (itemStack.getItem() == Blocks.TNT.asItem()) {
                    Entity _ent = entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:tnt ^ ^2.5 ^2");
                    }
                    if (entity instanceof Player) {
                        Player _player = entity;
                        ItemStack _stktoremove = new ItemStack(Blocks.TNT);
                        _player.getInventory().clearOrCountMatchingItems(p -> {
                            return _stktoremove.getItem() == p.getItem();
                        }, 1, _player.inventoryMenu.getCraftSlots());
                    }
                    entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * (-2.0d), entity.getLookAngle().y * (-2.0d), entity.getLookAngle().z * (-2.0d)));
                    ItemStack _ist = itemstack;
                    if (_ist.hurt(2, new Random(), null)) {
                        _ist.shrink(1);
                        _ist.setDamageValue(0);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 3);
    }
}
