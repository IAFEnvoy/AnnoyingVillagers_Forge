package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModParticleTypes;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class LingZhiShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v60, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiShiTiChuShiShengChengShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.KNOCKBACK, 3);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getMainHandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack3 = _livEnt3.getMainHandItem();
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.MENDING, 5);
        if (entity instanceof LivingEntity _livEnt4) {
            itemStack4 = _livEnt4.getMainHandItem();
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.SHARPNESS, 5);
        if (entity instanceof LivingEntity _livEnt5) {
            itemStack5 = _livEnt5.getMainHandItem();
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        itemStack5.enchant(Enchantments.SWEEPING_EDGE, 5);
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("Null已降临"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        world.addParticle((SimpleParticleType) AnnoyingVillagersbychentuModParticleTypes.LIGHT.get(), x, y, z, 0.0d, 0.0d, 0.0d);
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
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:null_1");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:null_2");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:null_3");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:null_4");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:null_6");
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.LingZhiShiTiChuShiShengChengShiProcedure.1
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
                Vec3 _center = new Vec3(x, y, z);
                List<Entity> _entfound = this.world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(0.5d), e -> {
                    return true;
                }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
                    return _entcnd.distanceToSqr(_center);
                })).collect(Collectors.toList());
                for (Entity entity2 : _entfound) {
                    if (entity2 instanceof LivingEntity) {
                        Player _player = (LivingEntity) entity2;
                        ItemStack _setstack = new ItemStack(Blocks.AIR);
                        _setstack.setCount(1);
                        _player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
                        if (_player instanceof Player) {
                            _player.getInventory().setChanged();
                        }
                    }
                }
                if (entity instanceof LivingEntity) {
                    Player _player2 = (LivingEntity) entity;
                    ItemStack _setstack2 = new ItemStack(Blocks.AIR);
                    _setstack2.setCount(1);
                    _player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                    if (_player2 instanceof Player) {
                        _player2.getInventory().setChanged();
                    }
                }
                if (entity instanceof LivingEntity) {
                    Player _player3 = (LivingEntity) entity;
                    ItemStack _setstack3 = new ItemStack(Blocks.AIR);
                    _setstack3.setCount(1);
                    _player3.setItemInHand(InteractionHand.OFF_HAND, _setstack3);
                    if (_player3 instanceof Player) {
                        _player3.getInventory().setChanged();
                    }
                }
                Player player = entity;
                if (player instanceof Player) {
                    Player _player4 = player;
                    _player4.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
                    _player4.getInventory().setChanged();
                } else if (player instanceof LivingEntity) {
                    LivingEntity _living = player;
                    _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
                }
                Player player2 = entity;
                if (player2 instanceof Player) {
                    Player _player5 = player2;
                    _player5.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
                    _player5.getInventory().setChanged();
                } else if (player2 instanceof LivingEntity) {
                    LivingEntity _living2 = player2;
                    _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
                }
                Player player3 = entity;
                if (player3 instanceof Player) {
                    Player _player6 = player3;
                    _player6.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
                    _player6.getInventory().setChanged();
                } else if (player3 instanceof LivingEntity) {
                    LivingEntity _living3 = player3;
                    _living3.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
                }
                Player player4 = entity;
                if (player4 instanceof Player) {
                    Player _player7 = player4;
                    _player7.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                    _player7.getInventory().setChanged();
                } else if (player4 instanceof LivingEntity) {
                    LivingEntity _living4 = player4;
                    _living4.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
    }
}
