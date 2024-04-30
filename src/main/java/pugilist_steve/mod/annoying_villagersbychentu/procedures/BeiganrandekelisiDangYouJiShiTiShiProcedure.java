package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import pugilist_steve.mod.annoying_villagersbychentu.entity.KeLiSiEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;


public class BeiganrandekelisiDangYouJiShiTiShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == Items.TOTEM_OF_UNDYING) {
            if (!entity.level.isClientSide()) {
                entity.discard();
            }
            if (world instanceof ServerLevel _level) {
                Mob keLiSiEntity = new KeLiSiEntity(AnnoyingVillagersbychentuModEntities.KE_LI_SI.get(), _level);
                keLiSiEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0f, 0.0f);
                if (keLiSiEntity instanceof Mob) {
                    Mob _mobToSpawn = keLiSiEntity;
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(keLiSiEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                }
                world.addFreshEntity(keLiSiEntity);
            }
            if (entity instanceof LivingEntity) {
                Player player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(Blocks.AIR);
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
        }
    }
}
