package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;
import pugilist_steve.mod.annoying_villagersbychentu.network.TaotuoMessage;
import pugilist_steve.mod.annoying_villagersbychentu.network.TouzhiMoyingzhenzhuMessage;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})

public class AnnoyingVillagersbychentuModKeyMappings {
    public static final KeyMapping TOUZHI_MOYINGZHENZHU = new KeyMapping("key.annoying_villagersbychentu.touzhi_moyingzhenzhu", 70, "key.categories.misc");
    public static final KeyMapping TAOTUO = new KeyMapping("key.annoying_villagersbychentu.taotuo", 69, "key.categories.misc");

    @SubscribeEvent
    public static void registerKeyBindings(FMLClientSetupEvent event) {
        ClientRegistry.registerKeyBinding(TOUZHI_MOYINGZHENZHU);
        ClientRegistry.registerKeyBinding(TAOTUO);
    }

    @Mod.EventBusSubscriber({Dist.CLIENT})

    public static class KeyEventListener {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.KeyInputEvent event) {
            if (Minecraft.getInstance().screen == null) {
                if (event.getKey() == AnnoyingVillagersbychentuModKeyMappings.TOUZHI_MOYINGZHENZHU.getKey().getValue() && event.getAction() == 1) {
                    AnnoyingVillagersbychentuMod.PACKET_HANDLER.sendToServer(new TouzhiMoyingzhenzhuMessage(0, 0));
                    TouzhiMoyingzhenzhuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
                }
                if (event.getKey() == AnnoyingVillagersbychentuModKeyMappings.TAOTUO.getKey().getValue() && event.getAction() == 1) {
                    AnnoyingVillagersbychentuMod.PACKET_HANDLER.sendToServer(new TaotuoMessage(0, 0));
                    TaotuoMessage.pressAction(Minecraft.getInstance().player, 0, 0);
                }
            }
        }
    }
}
