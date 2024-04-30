package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.JianbingguoziEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;

import java.util.Random;


public class GraveShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v25, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveShiTiChuShiShengChengShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add grave");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave @s");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave @e[type=annoying_villagersbychentu:mrcolder]");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave @e[type=annoying_villagersbychentu:mrcolder_2]");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join grave @e[type=annoying_villagersbychentu:enchanter]");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/data merge entity @s {Tags:[\"OP\"]}");
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.GraveShiTiChuShiShengChengShiProcedure.1
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
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 9999999, 0, false, false));
            }
        }
        if (entity instanceof LivingEntity) {
            ((LivingEntity) entity).setHealth(20.0f);
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.UNBREAKING, 4);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getMainHandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.SHARPNESS, 4);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack3 = _livEnt3.getMainHandItem();
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.SWEEPING_EDGE, 2);
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack4 = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack5 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        itemStack5.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _livEnt4) {
            itemStack6 = _livEnt4.getOffhandItem();
        } else {
            itemStack6 = ItemStack.EMPTY;
        }
        itemStack6.enchant(Enchantments.UNBREAKING, 4);
        if (entity instanceof LivingEntity _livEnt5) {
            itemStack7 = _livEnt5.getOffhandItem();
        } else {
            itemStack7 = ItemStack.EMPTY;
        }
        itemStack7.enchant(Enchantments.SHARPNESS, 4);
        if (entity instanceof LivingEntity _livEnt6) {
            itemStack8 = _livEnt6.getOffhandItem();
        } else {
            itemStack8 = ItemStack.EMPTY;
        }
        itemStack8.enchant(Enchantments.SWEEPING_EDGE, 2);
        if (Math.random() <= 0.2d && (world instanceof ServerLevel _level)) {
            Mob jianbingguoziEntity = new JianbingguoziEntity(AnnoyingVillagersbychentuModEntities.JIANBINGGUOZI.get(), _level);
            jianbingguoziEntity.moveTo(x, y + Mth.nextDouble(new Random(), 0.0d, 5.0d), z + Mth.nextDouble(new Random(), 2.0d, 5.0d), world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (jianbingguoziEntity instanceof Mob) {
                Mob _mobToSpawn = jianbingguoziEntity;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(jianbingguoziEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(jianbingguoziEntity);
        }
        if (entity.isAlive()) {
            if (world.players().size() >= 6) {
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a {\"text\":\"X_Grave_X joined the game\",\"color\":\"yellow\"}");
                }
            } else if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a {\"text\":\"X_Grave_X加入了游戏\",\"color\":\"yellow\"}");
            }
        }
    }
}
