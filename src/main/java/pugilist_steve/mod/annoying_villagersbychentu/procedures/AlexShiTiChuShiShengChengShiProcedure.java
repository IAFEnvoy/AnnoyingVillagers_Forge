package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.AlexVillagerEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;

import java.util.Random;


public class AlexShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v30, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexShiTiChuShiShengChengShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.SMITE, 4);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getMainHandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.SHARPNESS, 9);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack3 = _livEnt3.getMainHandItem();
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.SWEEPING_EDGE, 4);
        if (world instanceof ServerLevel _level) {
            Mob alexVillagerEntity = new AlexVillagerEntity(AnnoyingVillagersbychentuModEntities.ALEX_VILLAGER.get(), _level);
            alexVillagerEntity.moveTo(x + Mth.nextDouble(new Random(), 1.0d, 10.0d), y + Mth.nextDouble(new Random(), 1.0d, 10.0d), z + Mth.nextDouble(new Random(), 1.0d, 10.0d), world.getRandom().nextFloat() * 360.0f, 0.0f);
            if (alexVillagerEntity instanceof Mob) {
                Mob _mobToSpawn = alexVillagerEntity;
                _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(alexVillagerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
            }
            world.addFreshEntity(alexVillagerEntity);
        }
        if (world.players().size() >= 4) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a {\"text\":\"Alex joined the game\",\"color\":\"yellow\"}");
            }
        } else if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a {\"text\":\"Alex加入了游戏\",\"color\":\"yellow\"}");
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999999, 0, false, false));
            }
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.AlexShiTiChuShiShengChengShiProcedure.1
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
