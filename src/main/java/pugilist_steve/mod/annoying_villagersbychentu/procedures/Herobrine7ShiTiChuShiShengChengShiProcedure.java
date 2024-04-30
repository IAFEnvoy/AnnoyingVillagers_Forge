package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.HongyizombieEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;


public class Herobrine7ShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v23, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine7ShiTiChuShiShengChengShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel _level) {
            LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
            entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z)));
            entityToSpawn.setVisualOnly(true);
            _level.addFreshEntity(entityToSpawn);
        }
        if (world instanceof ServerLevel _level2) {
            Mob hongyizombieEntity = new HongyizombieEntity(AnnoyingVillagersbychentuModEntities.HONGYIZOMBIE.get(), _level2);
            hongyizombieEntity.moveTo(x + 1.0d, y + 1.0d, z + 1.0d, world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (hongyizombieEntity instanceof Mob) {
                Mob _mobToSpawn = hongyizombieEntity;
                _mobToSpawn.finalizeSpawn(_level2, world.getCurrentDifficultyAt(hongyizombieEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(hongyizombieEntity);
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("Herobrine已降临"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        if (entity instanceof Player _player) {
            _player.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
            _player.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living) {
            _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
        }
        if (entity instanceof Player _player2) {
            _player2.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
            _player2.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living2) {
            _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Herobrine7ShiTiChuShiShengChengShiProcedure.1
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
                    Player _player3 = player;
                    _player3.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                    _player3.getInventory().setChanged();
                } else if (player instanceof LivingEntity) {
                    LivingEntity _living3 = player;
                    _living3.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                }
                if (entity instanceof LivingEntity) {
                    Player _player4 = (LivingEntity) entity;
                    ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
                    _setstack.setCount(1);
                    _player4.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                    if (_player4 instanceof Player) {
                        _player4.getInventory().setChanged();
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
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
