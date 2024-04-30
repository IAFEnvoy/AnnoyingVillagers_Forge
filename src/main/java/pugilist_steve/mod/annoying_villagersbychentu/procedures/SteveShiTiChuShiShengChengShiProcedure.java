package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;


public class SteveShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v63, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.SteveShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v64, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.SteveShiTiChuShiShengChengShiProcedure$2] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        ItemStack itemStack9;
        ItemStack itemStack10;
        ItemStack itemStack11;
        ItemStack itemStack12;
        ItemStack itemStack13;
        ItemStack itemStack14;
        ItemStack itemStack15;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.MENDING, 5);
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _entGetArmor4) {
            itemStack4 = _entGetArmor4.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _entGetArmor5) {
            itemStack5 = _entGetArmor5.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        itemStack5.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        if (entity instanceof LivingEntity _entGetArmor6) {
            itemStack6 = _entGetArmor6.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack6 = ItemStack.EMPTY;
        }
        itemStack6.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        if (entity instanceof LivingEntity _entGetArmor7) {
            itemStack7 = _entGetArmor7.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack7 = ItemStack.EMPTY;
        }
        itemStack7.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        if (entity instanceof LivingEntity _entGetArmor8) {
            itemStack8 = _entGetArmor8.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack8 = ItemStack.EMPTY;
        }
        itemStack8.enchant(Enchantments.MENDING, 5);
        if (entity instanceof LivingEntity _entGetArmor9) {
            itemStack9 = _entGetArmor9.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack9 = ItemStack.EMPTY;
        }
        itemStack9.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _entGetArmor10) {
            itemStack10 = _entGetArmor10.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack10 = ItemStack.EMPTY;
        }
        itemStack10.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _livEnt) {
            itemStack11 = _livEnt.getMainHandItem();
        } else {
            itemStack11 = ItemStack.EMPTY;
        }
        itemStack11.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack12 = _livEnt2.getMainHandItem();
        } else {
            itemStack12 = ItemStack.EMPTY;
        }
        itemStack12.enchant(Enchantments.SHARPNESS, 5);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack13 = _livEnt3.getMainHandItem();
        } else {
            itemStack13 = ItemStack.EMPTY;
        }
        itemStack13.enchant(Enchantments.KNOCKBACK, 1);
        if (entity instanceof LivingEntity _livEnt4) {
            itemStack14 = _livEnt4.getMainHandItem();
        } else {
            itemStack14 = ItemStack.EMPTY;
        }
        itemStack14.enchant(Enchantments.MENDING, 3);
        if (entity instanceof LivingEntity _livEnt5) {
            itemStack15 = _livEnt5.getMainHandItem();
        } else {
            itemStack15 = ItemStack.EMPTY;
        }
        itemStack15.enchant(Enchantments.MOB_LOOTING, 3);
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 9999999, 0, false, false));
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.SteveShiTiChuShiShengChengShiProcedure.1
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
                entity.setCustomName(new TextComponent("Steve"));
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevespawn")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevespawn")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                if (!this.world.isClientSide() && this.world.getServer() != null) {
                    this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Steve> 我叫Steve，我是来摧毁Herobrine的"), ChatType.SYSTEM, Util.NIL_UUID);
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 10);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.SteveShiTiChuShiShengChengShiProcedure.2
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
                    _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join ce @e[type=annoying_villagersbychentu:steve]");
                }
                Player player = entity;
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
                    _player.getInventory().setChanged();
                } else if (player instanceof LivingEntity) {
                    LivingEntity _living = player;
                    _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
                }
                Player player2 = entity;
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
                    _player2.getInventory().setChanged();
                } else if (player2 instanceof LivingEntity) {
                    LivingEntity _living2 = player2;
                    _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
                }
                Player player3 = entity;
                if (player3 instanceof Player) {
                    Player _player3 = player3;
                    _player3.getInventory().armor.set(2, new ItemStack(Blocks.AIR));
                    _player3.getInventory().setChanged();
                } else if (player3 instanceof LivingEntity) {
                    LivingEntity _living3 = player3;
                    _living3.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Blocks.AIR));
                }
                Player player4 = entity;
                if (player4 instanceof Player) {
                    Player _player4 = player4;
                    _player4.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                    _player4.getInventory().setChanged();
                } else if (player4 instanceof LivingEntity) {
                    LivingEntity _living4 = player4;
                    _living4.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/data merge entity @s {Tags:[\"OP\"]}");
        }
    }
}
