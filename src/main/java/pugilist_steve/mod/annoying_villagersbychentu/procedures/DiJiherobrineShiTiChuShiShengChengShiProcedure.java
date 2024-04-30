package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class DiJiherobrineShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v5, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineShiTiChuShiShengChengShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            Player _player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.OBSIDIANWEAPONS.get());
            _setstack.setCount(1);
            _player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (_player instanceof Player) {
                _player.getInventory().setChanged();
            }
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("Herobrine已降临"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.DiJiherobrineShiTiChuShiShengChengShiProcedure.1
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
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsayheisgod")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:himsayheisgod")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!this.world.isClientSide() && this.world.getServer() != null) {
                    this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Herobrine> I'm god ! ! !"), ChatType.SYSTEM, Util.NIL_UUID);
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 50);
        if (entity instanceof Player _player2) {
            _player2.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
            _player2.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living) {
            _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
        }
        if (entity instanceof Player _player3) {
            _player3.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
            _player3.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living2) {
            _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
        }
        if (entity instanceof Player _player4) {
            _player4.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
            _player4.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living3) {
            _living3.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
        }
        if (entity instanceof Player _player5) {
            _player5.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
            _player5.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living4) {
            _living4.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrinexintu");
        }
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
