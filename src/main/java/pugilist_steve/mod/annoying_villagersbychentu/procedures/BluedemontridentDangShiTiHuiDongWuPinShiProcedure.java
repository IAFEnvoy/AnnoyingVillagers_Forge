package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec3;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Random;


public class BluedemontridentDangShiTiHuiDongWuPinShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        if (entity == null) {
            return;
        }
        if (entity instanceof Player _player) {
            _player.getCooldowns().addCooldown(AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get(), 200);
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get()) {
            if (entity instanceof LivingEntity _livEnt2) {
                itemStack2 = _livEnt2.getOffhandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            if (itemStack2.getItem() == AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get() && entity.isShiftKeyDown()) {
                if (world instanceof ServerLevel _level) {
                    LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
                    entityToSpawn.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 15, 20), y, z)));
                    entityToSpawn.setVisualOnly(false);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof ServerLevel _level2) {
                    LightningBolt entityToSpawn2 = EntityType.LIGHTNING_BOLT.create(_level2);
                    entityToSpawn2.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 15, 20), y, z)));
                    entityToSpawn2.setVisualOnly(false);
                    _level2.addFreshEntity(entityToSpawn2);
                }
                if (world instanceof ServerLevel _level3) {
                    LightningBolt entityToSpawn3 = EntityType.LIGHTNING_BOLT.create(_level3);
                    entityToSpawn3.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 8, 10), y, z)));
                    entityToSpawn3.setVisualOnly(false);
                    _level3.addFreshEntity(entityToSpawn3);
                }
                if (world instanceof ServerLevel _level4) {
                    LightningBolt entityToSpawn4 = EntityType.LIGHTNING_BOLT.create(_level4);
                    entityToSpawn4.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 8, 10), y, z)));
                    entityToSpawn4.setVisualOnly(false);
                    _level4.addFreshEntity(entityToSpawn4);
                }
                if (world instanceof ServerLevel _level5) {
                    LightningBolt entityToSpawn5 = EntityType.LIGHTNING_BOLT.create(_level5);
                    entityToSpawn5.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z + Mth.nextInt(new Random(), 15, 20))));
                    entityToSpawn5.setVisualOnly(false);
                    _level5.addFreshEntity(entityToSpawn5);
                }
                if (world instanceof ServerLevel _level6) {
                    LightningBolt entityToSpawn6 = EntityType.LIGHTNING_BOLT.create(_level6);
                    entityToSpawn6.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z + Mth.nextInt(new Random(), 8, 10))));
                    entityToSpawn6.setVisualOnly(false);
                    _level6.addFreshEntity(entityToSpawn6);
                }
                if (world instanceof ServerLevel _level7) {
                    LightningBolt entityToSpawn7 = EntityType.LIGHTNING_BOLT.create(_level7);
                    entityToSpawn7.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z - Mth.nextInt(new Random(), 15, 20))));
                    entityToSpawn7.setVisualOnly(false);
                    _level7.addFreshEntity(entityToSpawn7);
                }
                if (world instanceof ServerLevel _level8) {
                    LightningBolt entityToSpawn8 = EntityType.LIGHTNING_BOLT.create(_level8);
                    entityToSpawn8.moveTo(Vec3.atBottomCenterOf(new BlockPos(x, y, z - Mth.nextInt(new Random(), 8, 10))));
                    entityToSpawn8.setVisualOnly(false);
                    _level8.addFreshEntity(entityToSpawn8);
                }
                if (world instanceof ServerLevel _level9) {
                    LightningBolt entityToSpawn9 = EntityType.LIGHTNING_BOLT.create(_level9);
                    entityToSpawn9.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 8, 10), y, z + Mth.nextInt(new Random(), 8, 10))));
                    entityToSpawn9.setVisualOnly(false);
                    _level9.addFreshEntity(entityToSpawn9);
                }
                if (world instanceof ServerLevel _level10) {
                    LightningBolt entityToSpawn10 = EntityType.LIGHTNING_BOLT.create(_level10);
                    entityToSpawn10.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 8, 10), y, z - Mth.nextInt(new Random(), 8, 10))));
                    entityToSpawn10.setVisualOnly(false);
                    _level10.addFreshEntity(entityToSpawn10);
                }
                if (world instanceof ServerLevel _level11) {
                    LightningBolt entityToSpawn11 = EntityType.LIGHTNING_BOLT.create(_level11);
                    entityToSpawn11.moveTo(Vec3.atBottomCenterOf(new BlockPos(x + Mth.nextInt(new Random(), 8, 10), y, z - Mth.nextInt(new Random(), 8, 10))));
                    entityToSpawn11.setVisualOnly(false);
                    _level11.addFreshEntity(entityToSpawn11);
                }
                if (world instanceof ServerLevel _level12) {
                    LightningBolt entityToSpawn12 = EntityType.LIGHTNING_BOLT.create(_level12);
                    entityToSpawn12.moveTo(Vec3.atBottomCenterOf(new BlockPos(x - Mth.nextInt(new Random(), 8, 10), y, z + Mth.nextInt(new Random(), 8, 10))));
                    entityToSpawn12.setVisualOnly(false);
                    _level12.addFreshEntity(entityToSpawn12);
                }
                if (entity instanceof Player _player2) {
                    _player2.getCooldowns().addCooldown(AnnoyingVillagersbychentuModItems.BLUEDEMONTRIDENT.get(), 200);
                }
            }
        }
    }
}
