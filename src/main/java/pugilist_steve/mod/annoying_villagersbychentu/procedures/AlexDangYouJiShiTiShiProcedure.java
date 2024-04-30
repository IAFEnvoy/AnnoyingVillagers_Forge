package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;


public class AlexDangYouJiShiTiShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (Math.random() <= 0.2d) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"<Alex> ？\"}");
            }
        } else if (Math.random() > 0.4d && !entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"<Alex> 啊?\"}");
        }
        if (Math.random() <= 0.2d) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"<Alex> 看来我得走了\"}");
            }
        } else if (Math.random() > 0.2d && !entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "tellraw @a {\"text\":\"<Alex> 你干嘛?\"}");
        }
    }
}
