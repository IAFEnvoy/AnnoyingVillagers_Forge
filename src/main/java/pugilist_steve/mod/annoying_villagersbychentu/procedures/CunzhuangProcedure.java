package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.village.VillageSiegeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class CunzhuangProcedure {
    @SubscribeEvent
    public static void onVillageSiege(VillageSiegeEvent event) {
        execute(event, event.getWorld(), event.getPlayer());
    }

    public static void execute(LevelAccessor world, Entity entity) {
        execute(null, world, entity);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CunzhuangProcedure$1] */
    private static void execute(@Nullable Event event, LevelAccessor world, final Entity entity) {
        if (entity != null && Math.random() <= 0.8d) {
            if (!entity.level.isClientSide() && entity.getServer() != null) {
                entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon firework_rocket ~ ~10 ~ {LifeTime:10,FireworksItem:{id:firework_rocket,Count:1,tag:{Fireworks:{Explosions:[{Type:3,Colors:[0],Flicker:1}]}},display:{Name:\"Black Creeper Firework\"}}}");
            }
            if (!world.isClientSide() && world.getServer() != null) {
                world.getServer().getPlayerList().broadcastMessage(new TextComponent("<村民> 救命！"), ChatType.SYSTEM, Util.NIL_UUID);
            }
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CunzhuangProcedure.1
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                public void start(LevelAccessor world2, int waitTicks) {
                    this.waitTicks = waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world2;
                }

                @SubscribeEvent
                public void tick(TickEvent.ServerTickEvent event2) {
                    if (event2.phase == TickEvent.Phase.END) {
                        this.ticks++;
                        if (this.ticks >= this.waitTicks) {
                            this.run();
                        }
                    }
                }

                private void run() {
                    if (!this.world.isClientSide() && this.world.getServer() != null) {
                        this.world.getServer().getPlayerList().broadcastMessage(new TextComponent("<村民蓝骑兵> 来了！"), ChatType.SYSTEM, Util.NIL_UUID);
                    }
                    Entity _ent = entity;
                    if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                        _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing_1 ^ ^ ^10");
                    }
                    Entity _ent2 = entity;
                    if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                        _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:cun_min_zhen_cha_bing ^ ^ ^15");
                    }
                    Entity _ent3 = entity;
                    if (!_ent3.level.isClientSide() && _ent3.getServer() != null) {
                        _ent3.getServer().getCommands().performCommand(_ent3.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/summon annoying_villagersbychentu:lan_cun_qi ^10 ^ ^20");
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 400);
        }
    }
}
