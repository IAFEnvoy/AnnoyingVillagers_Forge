package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Random;


public class C1367xa4b1898e {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:blue_demon ^ ^20 ^9");
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
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getOffhandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.ZHAOHUANGNISHIWANGDE.get() && (entity instanceof LivingEntity)) {
            Player player2 = (LivingEntity) entity;
            ItemStack _setstack2 = new ItemStack(Blocks.AIR);
            _setstack2.setCount(1);
            player2.setItemInHand(InteractionHand.OFF_HAND, _setstack2);
            if (player2 instanceof Player) {
                Player _player2 = player2;
                _player2.getInventory().setChanged();
            }
        }
        if (world instanceof ServerLevel _level) {
            LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
            entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 5, 10), y, z + Mth.nextInt(new Random(), 5, 10))));
            entityToSpawn.setVisualOnly(false);
            _level.addFreshEntity(entityToSpawn);
        }
        if (world instanceof ServerLevel _level2) {
            LightningBolt entityToSpawn2 = EntityType.LIGHTNING_BOLT.create(_level2);
            entityToSpawn2.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 5, 10), y, z + Mth.nextInt(new Random(), 5, 10))));
            entityToSpawn2.setVisualOnly(false);
            _level2.addFreshEntity(entityToSpawn2);
        }
        if (world instanceof ServerLevel _level3) {
            LightningBolt entityToSpawn3 = EntityType.LIGHTNING_BOLT.create(_level3);
            entityToSpawn3.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), -5, -10), y, z + Mth.nextInt(new Random(), -5, -10))));
            entityToSpawn3.setVisualOnly(false);
            _level3.addFreshEntity(entityToSpawn3);
        }
        if (world instanceof ServerLevel _level4) {
            LightningBolt entityToSpawn4 = EntityType.LIGHTNING_BOLT.create(_level4);
            entityToSpawn4.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), -5, -10), y, z + Mth.nextInt(new Random(), -5, -10))));
            entityToSpawn4.setVisualOnly(false);
            _level4.addFreshEntity(entityToSpawn4);
        }
    }
}
