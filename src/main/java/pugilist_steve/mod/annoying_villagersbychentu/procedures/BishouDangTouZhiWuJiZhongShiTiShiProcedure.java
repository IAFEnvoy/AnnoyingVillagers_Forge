package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Random;


public class BishouDangTouZhiWuJiZhongShiTiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _entGetArmor) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        ItemStack _ist = itemStack;
        if (_ist.hurt(Mth.nextInt(new Random(), 1, 20), new Random(), null)) {
            _ist.shrink(1);
            _ist.setDamageValue(0);
        }
        if (entity instanceof LivingEntity _entGetArmor2) {
            itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        if (itemStack2.getItem() == Blocks.AIR.asItem()) {
            if (entity instanceof Player _player) {
                _player.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.BISHOU.get()));
                _player.getInventory().setChanged();
            } else if (entity instanceof LivingEntity _living) {
                _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.BISHOU.get()));
            }
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:hit")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    return;
                } else {
                    _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:hit")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    return;
                }
            }
            return;
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:hit")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:hit")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof Level _level3) {
            if (!_level3.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level3, x, y + 1.0d, z, new ItemStack(AnnoyingVillagersbychentuModItems.BISHOU.get()));
                entityToSpawn.setPickUpDelay(10);
                _level3.addFreshEntity(entityToSpawn);
            }
        }
    }
}
