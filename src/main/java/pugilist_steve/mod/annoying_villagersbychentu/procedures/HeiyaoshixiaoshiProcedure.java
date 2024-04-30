package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;


public class HeiyaoshixiaoshiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^ ^ minecraft:air");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/kill @e[tpye=annoying_villagersbychentu:yinshenshiti]");
        }
    }
}
