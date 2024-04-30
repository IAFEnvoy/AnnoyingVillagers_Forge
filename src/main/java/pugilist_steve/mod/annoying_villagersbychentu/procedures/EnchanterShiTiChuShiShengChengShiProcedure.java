package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class EnchanterShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v41, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.EnchanterShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v65, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.EnchanterShiTiChuShiShengChengShiProcedure$2] */
    public static void execute(LevelAccessor world, final Entity entity) {
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
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.UNBREAKING, 4);
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
        if (entity instanceof LivingEntity _entGetArmor4) {
            itemStack4 = _entGetArmor4.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.UNBREAKING, 4);
        if (entity instanceof LivingEntity _entGetArmor5) {
            itemStack5 = _entGetArmor5.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        itemStack5.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
        if (entity instanceof LivingEntity _entGetArmor6) {
            itemStack6 = _entGetArmor6.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack6 = ItemStack.EMPTY;
        }
        itemStack6.enchant(Enchantments.UNBREAKING, 4);
        if (entity instanceof LivingEntity _livEnt) {
            itemStack7 = _livEnt.getOffhandItem();
        } else {
            itemStack7 = ItemStack.EMPTY;
        }
        itemStack7.enchant(Enchantments.UNBREAKING, 4);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack8 = _livEnt2.getOffhandItem();
        } else {
            itemStack8 = ItemStack.EMPTY;
        }
        itemStack8.enchant(Enchantments.SHARPNESS, 4);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack9 = _livEnt3.getMainHandItem();
        } else {
            itemStack9 = ItemStack.EMPTY;
        }
        itemStack9.enchant(Enchantments.SHARPNESS, 4);
        if (entity instanceof LivingEntity _livEnt4) {
            itemStack10 = _livEnt4.getMainHandItem();
        } else {
            itemStack10 = ItemStack.EMPTY;
        }
        itemStack10.enchant(Enchantments.UNBREAKING, 4);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.EnchanterShiTiChuShiShengChengShiProcedure.1
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
                entity.setCustomName(new TextComponent("Enchanter"));
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 10);
        if (world.players().size() >= 5) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"Enchanter joined the game\",\"color\":\"yellow\"}");
            }
        } else if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"Enchanter加入了游戏\",\"color\":\"yellow\"}");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add ce");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join ce @s");
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 0, false, false));
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.EnchanterShiTiChuShiShengChengShiProcedure.2
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
