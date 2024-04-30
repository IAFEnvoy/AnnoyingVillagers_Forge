package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class JianbingguoziShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v1, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziShiTiChuShiShengChengShiProcedure$1] */
    public static void execute(LevelAccessor world, final Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        if (entity == null) {
            return;
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziShiTiChuShiShengChengShiProcedure.1
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
                entity.setCustomName(new TextComponent("Themostmoistburrit0"));
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 2);
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 3);
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.UNBREAKING, 2);
        if (entity instanceof LivingEntity _entGetArmor4) {
            itemStack4 = _entGetArmor4.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.MENDING, 2);
        if (entity instanceof LivingEntity _livEnt) {
            itemStack5 = _livEnt.getMainHandItem();
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        itemStack5.enchant(Enchantments.POWER_ARROWS, 6);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack6 = _livEnt2.getMainHandItem();
        } else {
            itemStack6 = ItemStack.EMPTY;
        }
        itemStack6.enchant(Enchantments.PUNCH_ARROWS, 6);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack7 = _livEnt3.getMainHandItem();
        } else {
            itemStack7 = ItemStack.EMPTY;
        }
        itemStack7.enchant(Enchantments.UNBREAKING, 3);
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999999, 0, false, false));
            }
        }
        if (world.players().size() >= 4) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a {\"text\":\"Themostmoistburrit0 joined the game\",\"color\":\"yellow\"}");
            }
        } else if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a {\"text\":\"Themostmoistburrit0加入了游戏\",\"color\":\"yellow\"}");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave @s");
        }
    }
}
