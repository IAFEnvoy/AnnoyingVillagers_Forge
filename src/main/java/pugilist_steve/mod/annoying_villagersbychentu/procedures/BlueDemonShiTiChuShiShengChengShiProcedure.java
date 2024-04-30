package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
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


public class BlueDemonShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v14, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonShiTiChuShiShengChengShiProcedure$2] */
    /* JADX WARN: Type inference failed for: r0v43, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonShiTiChuShiShengChengShiProcedure$3] */
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
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 5);
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.UNBREAKING, 10);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"有一只溺尸已经变成了王\"}");
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonShiTiChuShiShengChengShiProcedure.1
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
                entity.setCustomName(new TextComponent("Blue_Demon"));
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 10);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonShiTiChuShiShengChengShiProcedure.2
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
                if (!this.world.isClientSide() && this.world.getServer() != null) {
                    this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<溺尸王> 是时候重生了，玩家"), ChatType.SYSTEM, Util.NIL_UUID);
                }
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonspawn")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:blue_demonspawn")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        if (entity instanceof LivingEntity _livEnt) {
            itemStack3 = _livEnt.getOffhandItem();
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack4 = _livEnt2.getOffhandItem();
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.IMPALING, 50);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack5 = _livEnt3.getOffhandItem();
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        itemStack5.enchant(Enchantments.SHARPNESS, 5);
        if (entity instanceof LivingEntity _livEnt4) {
            itemStack6 = _livEnt4.getMainHandItem();
        } else {
            itemStack6 = ItemStack.EMPTY;
        }
        itemStack6.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _livEnt5) {
            itemStack7 = _livEnt5.getMainHandItem();
        } else {
            itemStack7 = ItemStack.EMPTY;
        }
        itemStack7.enchant(Enchantments.IMPALING, 50);
        if (entity instanceof LivingEntity _livEnt6) {
            itemStack8 = _livEnt6.getMainHandItem();
        } else {
            itemStack8 = ItemStack.EMPTY;
        }
        itemStack8.enchant(Enchantments.SHARPNESS, 5);
        if (entity instanceof LivingEntity _livEnt7) {
            itemStack9 = _livEnt7.getMainHandItem();
        } else {
            itemStack9 = ItemStack.EMPTY;
        }
        itemStack9.enchant(Enchantments.SWEEPING_EDGE, 3);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonShiTiChuShiShengChengShiProcedure.3
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
                    Player _player = player;
                    _player.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                    _player.getInventory().setChanged();
                } else if (player instanceof LivingEntity) {
                    LivingEntity _living = player;
                    _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
    }
}
