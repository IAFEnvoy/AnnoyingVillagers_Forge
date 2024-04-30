package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class BaozhaxiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    /* JADX WARN: Type inference failed for: r0v15, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BaozhaxiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v40, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BaozhaxiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.BAOZHAXIAODAO.get()) {
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BaozhaxiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.1
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
                    Entity _ent = entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:tnt ^ ^2.5 ^2");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 3);
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
            entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * (-2.0d), entity.getLookAngle().y * (-2.0d), entity.getLookAngle().z * (-2.0d)));
            return;
        }
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getOffhandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (itemStack2.getItem() == AnnoyingVillagersbychentuModItems.BAOZHAXIAODAO.get()) {
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            if (entity instanceof LivingEntity) {
                Player player2 = (LivingEntity) entity;
                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.XIAODAO.get());
                _setstack2.setCount(1);
                player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().setChanged();
                }
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BaozhaxiaodaoDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.2
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
                    Entity _ent = entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:tnt ^ ^2.5 ^2");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 3);
            entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * (-2.0d), entity.getLookAngle().y * (-2.0d), entity.getLookAngle().z * (-2.0d)));
        }
    }
}
