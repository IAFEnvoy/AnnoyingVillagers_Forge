package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;


public class AnyingheiyaoshiDangShiTiZaiFangKuaiZhongPengZhuangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
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
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute at @s run particle epicfight:hit_blunt ^ ^1.5 ^0.8 0.1 0.1 0.1 1 1");
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:heiyaoshi_hit")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 0.5d, 1.0d));
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:heiyaoshi_hit")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 0.5d, 1.0d), false);
            }
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        ItemStack _ist = itemStack;
        if (_ist.hurt((int) Mth.nextDouble(new Random(), 1.0d, 10.0d), new Random(), null)) {
            _ist.shrink(1);
            _ist.setDamageValue(0);
        }
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getOffhandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        ItemStack _ist2 = itemStack2;
        if (_ist2.hurt((int) Mth.nextDouble(new Random(), 1.0d, 10.0d), new Random(), null)) {
            _ist2.shrink(1);
            _ist2.setDamageValue(0);
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack3 = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        ItemStack _ist3 = itemStack3;
        if (_ist3.hurt((int) Mth.nextDouble(new Random(), 1.0d, 10.0d), new Random(), null)) {
            _ist3.shrink(1);
            _ist3.setDamageValue(0);
        }
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack4 = _entGetArmor2.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        ItemStack _ist4 = itemStack4;
        if (_ist4.hurt((int) Mth.nextDouble(new Random(), 1.0d, 10.0d), new Random(), null)) {
            _ist4.shrink(1);
            _ist4.setDamageValue(0);
        }
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack5 = _entGetArmor3.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        ItemStack _ist5 = itemStack5;
        if (_ist5.hurt((int) Mth.nextDouble(new Random(), 1.0d, 10.0d), new Random(), null)) {
            _ist5.shrink(1);
            _ist5.setDamageValue(0);
        }
        if (entity instanceof LivingEntity _entGetArmor4) {
            itemStack6 = _entGetArmor4.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack6 = ItemStack.EMPTY;
        }
        ItemStack _ist6 = itemStack6;
        if (_ist6.hurt((int) Mth.nextDouble(new Random(), 1.0d, 10.0d), new Random(), null)) {
            _ist6.shrink(1);
            _ist6.setDamageValue(0);
        }
        entity.hurt(DamageSource.GENERIC, 11.5f);
        entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * (-6.0d), 0.4d, entity.getLookAngle().z * (-6.0d)));
        if (Math.random() == 0.5d) {
            if (entity instanceof LivingEntity _entity) {
                if (!_entity.level.isClientSide()) {
                    _entity.addEffect(new MobEffectInstance(MobEffects.POISON, 300, 2, false, true));
                }
            }
            entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * (-8.0d), 0.4d, entity.getLookAngle().z * (-8.0d)));
            if (entity instanceof LivingEntity _entGetArmor5) {
                itemStack10 = _entGetArmor5.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack10 = ItemStack.EMPTY;
            }
            ItemStack _ist7 = itemStack10;
            if (_ist7.hurt(300, new Random(), null)) {
                _ist7.shrink(1);
                _ist7.setDamageValue(0);
            }
            if (entity instanceof LivingEntity _entGetArmor6) {
                itemStack11 = _entGetArmor6.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack11 = ItemStack.EMPTY;
            }
            ItemStack _ist8 = itemStack11;
            if (_ist8.hurt(300, new Random(), null)) {
                _ist8.shrink(1);
                _ist8.setDamageValue(0);
            }
            entity.hurt(DamageSource.GENERIC, 15.5f);
        }
        if (Math.random() == 0.09d) {
            entity.setDeltaMovement(new Vec3(entity.getLookAngle().x * (-8.0d), 0.4d, entity.getLookAngle().z * (-8.0d)));
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:heavy_hit")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 0.5d, 1.2d));
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:heavy_hit")), SoundSource.BLOCKS, 1.0f, (float) Mth.nextDouble(new Random(), 0.5d, 1.2d), false);
                }
            }
            if (entity instanceof LivingEntity _entGetArmor7) {
                itemStack7 = _entGetArmor7.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack7 = ItemStack.EMPTY;
            }
            ItemStack _ist9 = itemStack7;
            if (_ist9.hurt(1000, new Random(), null)) {
                _ist9.shrink(1);
                _ist9.setDamageValue(0);
            }
            if (entity instanceof LivingEntity _entGetArmor8) {
                itemStack8 = _entGetArmor8.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack8 = ItemStack.EMPTY;
            }
            ItemStack _ist10 = itemStack8;
            if (_ist10.hurt(1000, new Random(), null)) {
                _ist10.shrink(1);
                _ist10.setDamageValue(0);
            }
            if (entity instanceof LivingEntity _livEnt3) {
                itemStack9 = _livEnt3.getMainHandItem();
            } else {
                itemStack9 = ItemStack.EMPTY;
            }
            ItemStack _ist11 = itemStack9;
            if (_ist11.hurt((int) Mth.nextDouble(new Random(), 200.0d, 1002.0d), new Random(), null)) {
                _ist11.shrink(1);
                _ist11.setDamageValue(0);
            }
            entity.hurt(DamageSource.GENERIC, 17.5f);
        }
    }
}
