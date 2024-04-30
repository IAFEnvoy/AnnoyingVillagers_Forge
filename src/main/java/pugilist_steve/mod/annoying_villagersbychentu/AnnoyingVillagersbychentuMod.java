package pugilist_steve.mod.annoying_villagersbychentu;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pugilist_steve.mod.annoying_villagersbychentu.init.*;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Mod(AnnoyingVillagersbychentuMod.MODID)
public class AnnoyingVillagersbychentuMod {
    public static final Logger LOGGER = LogManager.getLogger(AnnoyingVillagersbychentuMod.class);
    public static final String MODID = "annoying_villagersbychentu";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION, (v1) -> true, (v1) -> true);
    private static int messageID = 0;

    public AnnoyingVillagersbychentuMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        AnnoyingVillagersbychentuModBlocks.REGISTRY.register(bus);
        AnnoyingVillagersbychentuModItems.REGISTRY.register(bus);
        AnnoyingVillagersbychentuModEntities.REGISTRY.register(bus);
        AnnoyingVillagersbychentuModFeatures.REGISTRY.register(bus);
        AnnoyingVillagersbychentuModEnchantments.REGISTRY.register(bus);
        AnnoyingVillagersbychentuModMobEffects.REGISTRY.register(bus);
        AnnoyingVillagersbychentuModPotions.REGISTRY.register(bus);
        AnnoyingVillagersbychentuModBiomes.REGISTRY.register(bus);
        AnnoyingVillagersbychentuModParticleTypes.REGISTRY.register(bus);
    }

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    }
}
