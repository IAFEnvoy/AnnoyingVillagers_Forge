package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;


public class DanShouZhanShenZhiRenDangShiTiBeiGongJuJiZhongShiProcedure {
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
        ItemStack itemStack12;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 25, 5, false, false));
            }
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        ItemStack _ist = itemStack;
        if (_ist.hurt(30, new Random(), null)) {
            _ist.shrink(1);
            _ist.setDamageValue(0);
        }
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.LEGS);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        ItemStack _ist2 = itemStack2;
        if (_ist2.hurt(30, new Random(), null)) {
            _ist2.shrink(1);
            _ist2.setDamageValue(0);
        }
        if (entity instanceof LivingEntity _entGetArmor3) {
            itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        ItemStack _ist3 = itemStack3;
        if (_ist3.hurt(30, new Random(), null)) {
            _ist3.shrink(1);
            _ist3.setDamageValue(0);
        }
        if (entity instanceof LivingEntity _entGetArmor4) {
            itemStack4 = _entGetArmor4.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        ItemStack _ist4 = itemStack4;
        if (_ist4.hurt(30, new Random(), null)) {
            _ist4.shrink(1);
            _ist4.setDamageValue(0);
        }
        if (Math.random() < 0.25d) {
            if (entity instanceof LivingEntity _entGetArmor5) {
                itemStack12 = _entGetArmor5.getItemBySlot(EquipmentSlot.FEET);
            } else {
                itemStack12 = ItemStack.EMPTY;
            }
            ItemStack _ist5 = itemStack12;
            if (_ist5.hurt(Mth.nextInt(new Random(), 100, 500), new Random(), null)) {
                _ist5.shrink(1);
                _ist5.setDamageValue(0);
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
        }
        if (Math.random() < 0.25d) {
            if (entity instanceof LivingEntity _entGetArmor6) {
                itemStack11 = _entGetArmor6.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack11 = ItemStack.EMPTY;
            }
            ItemStack _ist6 = itemStack11;
            if (_ist6.hurt(Mth.nextInt(new Random(), 100, 500), new Random(), null)) {
                _ist6.shrink(1);
                _ist6.setDamageValue(0);
            }
            if (world instanceof Level _level3) {
                if (!_level3.isClientSide()) {
                    _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level4) {
                if (!_level4.isClientSide()) {
                    _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
        }
        if (Math.random() < 0.25d) {
            if (entity instanceof LivingEntity _entGetArmor7) {
                itemStack10 = _entGetArmor7.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack10 = ItemStack.EMPTY;
            }
            ItemStack _ist7 = itemStack10;
            if (_ist7.hurt(Mth.nextInt(new Random(), 100, 500), new Random(), null)) {
                _ist7.shrink(1);
                _ist7.setDamageValue(0);
            }
            if (world instanceof Level _level5) {
                if (!_level5.isClientSide()) {
                    _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level6) {
                if (!_level6.isClientSide()) {
                    _level6.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
        }
        if (Math.random() < 0.25d) {
            if (entity instanceof LivingEntity _entGetArmor8) {
                itemStack9 = _entGetArmor8.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack9 = ItemStack.EMPTY;
            }
            ItemStack _ist8 = itemStack9;
            if (_ist8.hurt(Mth.nextInt(new Random(), 100, 500), new Random(), null)) {
                _ist8.shrink(1);
                _ist8.setDamageValue(0);
            }
            if (world instanceof Level _level7) {
                if (!_level7.isClientSide()) {
                    _level7.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level7.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level8) {
                if (!_level8.isClientSide()) {
                    _level8.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level8.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
        }
        if (Math.random() < 0.1d) {
            if (entity instanceof LivingEntity _entGetArmor9) {
                itemStack5 = _entGetArmor9.getItemBySlot(EquipmentSlot.FEET);
            } else {
                itemStack5 = ItemStack.EMPTY;
            }
            ItemStack _ist9 = itemStack5;
            if (_ist9.hurt(1000, new Random(), null)) {
                _ist9.shrink(1);
                _ist9.setDamageValue(0);
            }
            if (entity instanceof LivingEntity _entGetArmor10) {
                itemStack6 = _entGetArmor10.getItemBySlot(EquipmentSlot.LEGS);
            } else {
                itemStack6 = ItemStack.EMPTY;
            }
            ItemStack _ist10 = itemStack6;
            if (_ist10.hurt(1000, new Random(), null)) {
                _ist10.shrink(1);
                _ist10.setDamageValue(0);
            }
            if (entity instanceof LivingEntity _entGetArmor11) {
                itemStack7 = _entGetArmor11.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack7 = ItemStack.EMPTY;
            }
            ItemStack _ist11 = itemStack7;
            if (_ist11.hurt(1000, new Random(), null)) {
                _ist11.shrink(1);
                _ist11.setDamageValue(0);
            }
            if (entity instanceof LivingEntity _entGetArmor12) {
                itemStack8 = _entGetArmor12.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack8 = ItemStack.EMPTY;
            }
            ItemStack _ist12 = itemStack8;
            if (_ist12.hurt(1000, new Random(), null)) {
                _ist12.shrink(1);
                _ist12.setDamageValue(0);
            }
            if (world instanceof Level _level9) {
                if (!_level9.isClientSide()) {
                    _level9.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level9.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level10) {
                if (!_level10.isClientSide()) {
                    _level10.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level10.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
            if (world instanceof Level _level11) {
                if (!_level11.isClientSide()) {
                    _level11.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chain.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                } else {
                    _level11.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.chain.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                }
            }
        }
    }
}
