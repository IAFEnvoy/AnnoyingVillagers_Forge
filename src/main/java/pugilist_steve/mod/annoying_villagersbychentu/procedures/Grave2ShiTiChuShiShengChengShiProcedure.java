package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class Grave2ShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2ShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v13, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2ShiTiChuShiShengChengShiProcedure$3] */
    /* JADX WARN: Type inference failed for: r0v6, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2ShiTiChuShiShengChengShiProcedure$2] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2ShiTiChuShiShengChengShiProcedure.1
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
                entity.setCustomName(new TextComponent("X_Grave_X"));
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 19);
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2ShiTiChuShiShengChengShiProcedure.2
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
                    _player.getInventory().armor.set(0, new ItemStack(Blocks.AIR));
                    _player.getInventory().setChanged();
                } else if (player instanceof LivingEntity) {
                    LivingEntity _living = player;
                    _living.setItemSlot(EquipmentSlot.FEET, new ItemStack(Blocks.AIR));
                }
                Player player2 = entity;
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().armor.set(3, new ItemStack(Blocks.AIR));
                    _player2.getInventory().setChanged();
                } else if (player2 instanceof LivingEntity) {
                    LivingEntity _living2 = player2;
                    _living2.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Blocks.AIR));
                }
                Player player3 = entity;
                if (player3 instanceof Player) {
                    Player _player3 = player3;
                    _player3.getInventory().armor.set(1, new ItemStack(Blocks.AIR));
                    _player3.getInventory().setChanged();
                } else if (player3 instanceof LivingEntity) {
                    LivingEntity _living3 = player3;
                    _living3.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Blocks.AIR));
                }
                if (entity instanceof LivingEntity) {
                    Player _player4 = (LivingEntity) entity;
                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.SHENG_QI_SHI_ZHI_JIAN.get());
                    _setstack.setCount(1);
                    _player4.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (_player4 instanceof Player) {
                        _player4.getInventory().setChanged();
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave");
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 99999, 1, false, false));
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Grave2ShiTiChuShiShengChengShiProcedure.3
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
                        _level.explode(null, x, y + 2.0d, z, 4.0f, Explosion.BlockInteraction.NONE);
                    }
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/data merge entity @s {Tags:[\"OP\"]}");
        }
    }
}
