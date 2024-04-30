package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;


public class SherenjianDangYouJianDianJiKongQiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return;
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.item.break")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        if (entity instanceof Player _player) {
            _player.getInventory().clearOrCountMatchingItems(p -> {
                return itemstack.getItem() == p.getItem();
            }, 1, _player.inventoryMenu.getCraftSlots());
        }
        if (entity instanceof Player _player2) {
            ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
            _setstack.setCount(1);
            ItemHandlerHelper.giveItemToPlayer(_player2, _setstack);
        }
        if (entity instanceof Player _player3) {
            ItemStack _setstack2 = new ItemStack(Blocks.OBSIDIAN);
            _setstack2.setCount(1);
            ItemHandlerHelper.giveItemToPlayer(_player3, _setstack2);
        }
        if (entity instanceof Player _player4) {
            ItemStack _setstack3 = new ItemStack(Blocks.CRYING_OBSIDIAN);
            _setstack3.setCount(1);
            ItemHandlerHelper.giveItemToPlayer(_player4, _setstack3);
        }
    }
}
