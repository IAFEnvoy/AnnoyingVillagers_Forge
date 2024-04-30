package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;


public class DeathSherenHerobrineDangShiTiGengXinKeShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && !entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s run particle minecraft:portal ^ ^0.6 ^ 0.5 0 0.5 0.07 100 force");
        }
    }
}
