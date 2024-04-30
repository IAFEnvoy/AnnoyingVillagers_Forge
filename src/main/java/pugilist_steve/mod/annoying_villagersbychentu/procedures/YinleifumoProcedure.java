package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber

public class YinleifumoProcedure {
    @SubscribeEvent
    public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
        execute(event, event.getEntityLiving().level, event.getEntityLiving().getX(), event.getEntityLiving().getY(), event.getEntityLiving().getZ(), event.getEntityLiving());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity == null) {
            return;
        }
        Enchantment enchantment = Enchantments.CHANNELING;
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment, itemStack) != 0) {
            if (Math.random() <= 0.12d) {
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle annoying_villagersbychentu:dianhu ^ ^ ^ 0.3 1.1 0.3 0 1");
                }
                if (Math.random() <= 0.3d && (world instanceof Level _level)) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.5d), (float) Mth.nextDouble(new Random(), 0.8d, 1.1d));
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.5d), (float) Mth.nextDouble(new Random(), 0.8d, 1.1d), false);
                    }
                }
            }
            if (Math.random() <= 0.02d) {
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @e[type=minecraft:trident] run particle annoying_villagersbychentu:dianhu ^ ^ ^0.1 0.2 0.2 0.1 0 1");
                }
                if (Math.random() <= 0.9d && (world instanceof Level _level2)) {
                    if (!_level2.isClientSide()) {
                        _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.5d), (float) Mth.nextDouble(new Random(), 0.8d, 1.1d));
                        return;
                    } else {
                        _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.5d), (float) Mth.nextDouble(new Random(), 0.8d, 1.1d), false);
                        return;
                    }
                }
                return;
            }
            return;
        }
        Enchantment enchantment2 = Enchantments.CHANNELING;
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getOffhandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (EnchantmentHelper.getItemEnchantmentLevel(enchantment2, itemStack2) != 0) {
            if (Math.random() <= 0.12d) {
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle annoying_villagersbychentu:dianhu ^ ^ ^ 0.3 1.1 0.3 0 1");
                }
                if (Math.random() <= 0.1d && (world instanceof Level _level3)) {
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.5d), (float) Mth.nextDouble(new Random(), 0.8d, 1.1d));
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.5d), (float) Mth.nextDouble(new Random(), 0.8d, 1.1d), false);
                    }
                }
            }
            if (Math.random() <= 0.02d) {
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @e[type=minecraft:trident] run particle annoying_villagersbychentu:dianhu ^ ^ ^0.1 0.2 0.2 0.1 0 1");
                }
                if (Math.random() <= 0.9d && (world instanceof Level _level4)) {
                    if (!_level4.isClientSide()) {
                        _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.5d), (float) Mth.nextDouble(new Random(), 0.8d, 1.1d));
                    } else {
                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:electify")), SoundSource.NEUTRAL, (float) Mth.nextDouble(new Random(), 0.05d, 0.5d), (float) Mth.nextDouble(new Random(), 0.8d, 1.1d), false);
                    }
                }
            }
        }
    }
}
