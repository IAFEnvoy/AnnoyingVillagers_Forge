package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;


public class JxZhanshenzhirenDangShiTiBeiGongJuJiZhongShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        world.addParticle(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1.0d, 1.0d, 1.0d);
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate_bricks.hit")), SoundSource.NEUTRAL, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate_bricks.hit")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
            }
        }
        world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 1.0d, 1.0d, 1.0d);
        world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
        world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.AMETHYST_CLUSTER.defaultBlockState()));
        world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.REDSTONE_WIRE.defaultBlockState()));
        if (Math.random() <= 0.35d && !entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "kill @s");
        }
    }
}
