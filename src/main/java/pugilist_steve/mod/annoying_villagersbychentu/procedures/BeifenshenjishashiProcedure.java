package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;


public class BeifenshenjishashiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && !entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:di_jiherobrine ^ ^ ^3");
        }
    }
}
