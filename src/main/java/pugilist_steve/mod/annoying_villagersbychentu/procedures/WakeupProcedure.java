package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.living.AnimalTameEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Mod.EventBusSubscriber

public class WakeupProcedure {
    @SubscribeEvent
    public static void onEntityTamed(AnimalTameEvent event) {
        execute(event, event.getAnimal().level, event.getAnimal().getX(), event.getAnimal().getY(), event.getAnimal().getZ());
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        execute(null, world, x, y, z);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(2.0d), e -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.distanceToSqr(_center);
        })).collect(Collectors.toList());
        for (Entity entityiterator : _entfound) {
            if (!entityiterator.level.isClientSide() && entityiterator.getServer() != null) {
                entityiterator.getServer().getCommands().performCommand(entityiterator.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/tellraw @a {\"text\":\"已招募\",\"color\":\"yellow\"}");
            }
        }
    }
}
