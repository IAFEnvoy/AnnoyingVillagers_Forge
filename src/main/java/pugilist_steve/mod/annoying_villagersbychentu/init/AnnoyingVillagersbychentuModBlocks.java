package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;
import pugilist_steve.mod.annoying_villagersbychentu.block.*;


public class AnnoyingVillagersbychentuModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AnnoyingVillagersbychentuMod.MODID);
    public static final RegistryObject<Block> PUGILIST_STEVE_MODEL = REGISTRY.register("pugilist_steve_model", () -> {
        return new PugilistSteveModelBlock();
    });
    public static final RegistryObject<Block> ANYINGHEIYAOSHIZHUZI = REGISTRY.register("anyingheiyaoshizhuzi", () -> {
        return new AnyingheiyaoshizhuziBlock();
    });
    public static final RegistryObject<Block> ANYINGHEIYAOSHI = REGISTRY.register("anyingheiyaoshi", () -> {
        return new AnyingheiyaoshiBlock();
    });
    public static final RegistryObject<Block> PUTONGHEIYAOSHI = REGISTRY.register("putongheiyaoshi", () -> {
        return new PutongheiyaoshiBlock();
    });
    public static final RegistryObject<Block> ANYINGHEIYAOSHI_2 = REGISTRY.register("anyingheiyaoshi_2", () -> {
        return new Anyingheiyaoshi2Block();
    });
    public static final RegistryObject<Block> PUTONGHEIYAOSHI_2 = REGISTRY.register("putongheiyaoshi_2", () -> {
        return new Putongheiyaoshi2Block();
    });

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})

    public static class ClientSideHandler {
        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {
            PugilistSteveModelBlock.registerRenderLayer();
            AnyingheiyaoshizhuziBlock.registerRenderLayer();
            AnyingheiyaoshiBlock.registerRenderLayer();
            PutongheiyaoshiBlock.registerRenderLayer();
            Anyingheiyaoshi2Block.registerRenderLayer();
            Putongheiyaoshi2Block.registerRenderLayer();
        }
    }
}
