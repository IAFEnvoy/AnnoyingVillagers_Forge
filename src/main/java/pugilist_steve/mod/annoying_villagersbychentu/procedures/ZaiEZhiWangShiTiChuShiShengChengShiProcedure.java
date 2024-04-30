package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;


public class ZaiEZhiWangShiTiChuShiShengChengShiProcedure {
    public static void execute(Entity entity) {
        if (entity != null && !entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a[gamemode=survival] {\"text\":\"灾厄之王已诞生\"}");
        }
    }
}
