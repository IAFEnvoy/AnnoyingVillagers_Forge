package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;


public class CunZhenFuLuShiTiChuShiShengChengShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && !entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/execute as @s at @s anchored eyes run setblock ^ ^-1 ^ minecraft:smithing_table");
        }
    }
}
