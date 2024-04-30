package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;


public class Zaiezhiwang2DangShiTiShouShangShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && Math.random() <= 0.12d && !entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon minecraft:vindicator ^ ^ ^5");
        }
    }
}
