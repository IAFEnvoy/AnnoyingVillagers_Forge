package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class GraveDangWanJiaYuGaiShiTiFaShengPengZhuangShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        if (entity == null) {
            return;
        }
        if (Math.random() == 1.0E-4d && (world instanceof Level _level)) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:graveattack")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:graveattack")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (entity instanceof LivingEntity) {
            Player _player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.GRAVEZSCJ.get());
            _setstack.setCount(1);
            _player.setItemInHand(InteractionHand.OFF_HAND, _setstack);
            if (_player instanceof Player) {
                _player.getInventory().setChanged();
            }
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == Blocks.AIR.asItem()) {
            if (entity instanceof Player _player2) {
                _player2.getInventory().armor.set(2, new ItemStack(AnnoyingVillagersbychentuModItems.GRAVECUIRASS_CHESTPLATE.get()));
                _player2.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living) {
                _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.GRAVECUIRASS_CHESTPLATE.get()));
            }
            if (entity instanceof LivingEntity _entGetArmor2) {
                itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            itemStack2.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 4);
            if (entity instanceof LivingEntity _entGetArmor3) {
                itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.CHEST);
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            itemStack3.enchant(Enchantments.UNBREAKING, 4);
            if (world instanceof Level _level2) {
                if (!_level2.isClientSide()) {
                    _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                } else {
                    _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                }
            }
        }
    }
}
