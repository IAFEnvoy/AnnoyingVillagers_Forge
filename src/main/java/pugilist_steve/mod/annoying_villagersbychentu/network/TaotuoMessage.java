package pugilist_steve.mod.annoying_villagersbychentu.network;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;
import pugilist_steve.mod.annoying_villagersbychentu.procedures.TaotuoAnXiaAnJianShiProcedure;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)

public class TaotuoMessage {
    int type;
    int pressedms;

    public TaotuoMessage(int type, int pressedms) {
        this.type = type;
        this.pressedms = pressedms;
    }

    public TaotuoMessage(FriendlyByteBuf buffer) {
        this.type = buffer.readInt();
        this.pressedms = buffer.readInt();
    }

    public static void buffer(TaotuoMessage message, FriendlyByteBuf buffer) {
        buffer.writeInt(message.type);
        buffer.writeInt(message.pressedms);
    }

    public static void handler(TaotuoMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> {
            pressAction(context.getSender(), message.type, message.pressedms);
        });
        context.setPacketHandled(true);
    }

    public static void pressAction(Player entity, int type, int pressedms) {
        Level world = entity.level;
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        if (world.hasChunkAt(entity.blockPosition()) && type == 0) {
            TaotuoAnXiaAnJianShiProcedure.execute(world, x, y, z, entity);
        }
    }

    @SubscribeEvent
    public static void registerMessage(FMLCommonSetupEvent event) {
        AnnoyingVillagersbychentuMod.addNetworkMessage(TaotuoMessage.class, TaotuoMessage::buffer, TaotuoMessage::new, TaotuoMessage::handler);
    }
}
