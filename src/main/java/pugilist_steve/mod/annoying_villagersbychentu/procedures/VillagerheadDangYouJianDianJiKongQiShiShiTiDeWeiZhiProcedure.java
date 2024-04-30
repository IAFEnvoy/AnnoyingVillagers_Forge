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
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class VillagerheadDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.BLOCKS, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_leather")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
            }
        }
        if (entity instanceof Player _player) {
            _player.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.VILLAGERHEAD.get()));
            _player.getInventory().setChanged();
        } else if (entity instanceof LivingEntity _living) {
            _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.VILLAGERHEAD.get()));
        }
        if (entity instanceof LivingEntity) {
            Player player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(Blocks.AIR);
            _setstack.setCount(1);
            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (player instanceof Player) {
                Player _player2 = player;
                _player2.getInventory().setChanged();
            }
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getOffhandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.VILLAGERHEAD.get() && (entity instanceof LivingEntity)) {
            Player player2 = (LivingEntity) entity;
            ItemStack _setstack2 = new ItemStack(Blocks.AIR);
            _setstack2.setCount(1);
            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
            if (player2 instanceof Player) {
                Player _player3 = player2;
                _player3.getInventory().setChanged();
            }
        }
    }
}
