package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pugilist_steve.mod.annoying_villagersbychentu.AnnoyingVillagersbychentuMod;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)

public class AnnoyingVillagersbychentuModSounds {
    public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap();

    static {
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "wusheng"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "wusheng")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "jinshiyinxiao"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "jinshiyinxiao")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "shiqu"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "shiqu")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "fangzhiheiyaoshi"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "fangzhiheiyaoshi")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "areyoutalkingaboutme"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "areyoutalkingaboutme")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "graveattack"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "graveattack")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravedead"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravedead")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "steveattack"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "steveattack")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesaywhyfighting"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesaywhyfighting")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevechuanqi"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevechuanqi")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesayiwanttuseuthere"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesayiwanttuseuthere")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevespawn"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevespawn")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevewin"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevewin")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevetesugongji"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevetesugongji")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "graveswordwillbroken"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "graveswordwillbroken")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesaywhy"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesaywhy")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesayno"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesayno")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevecallsbgetouthere"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevecallsbgetouthere")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himsayheisgod"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himsayheisgod")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevequantaozuanjia"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevequantaozuanjia")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himsaydzlsddds"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himsaydzlsddds")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "tobecontinued"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "tobecontinued")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "andnow"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "andnow")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "zhanshenzhirenjuexing"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "zhanshenzhirenjuexing")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesayok"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "stevesayok")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "steve2"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "steve2")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "heiyaoshijixu"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "heiyaoshijixu")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "humchuanqi"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "humchuanqi")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeakwhenspawn"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeakwhenspawn")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeakwhenspawn2"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeakwhenspawn2")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravesaydie"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravesaydie")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravesayhekillhe"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravesayhekillhe")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "youareweak"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "youareweak")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak3"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak3")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak4"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak4")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak6"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak6")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak5"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak5")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak2"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "gravespeak2")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonwin"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonwin")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonspawn"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonspawn")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay2"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay2")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay3"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay3")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay4"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay4")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsanchajikuanghuanjie"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsanchajikuanghuanjie")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay5"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "blue_demonsay5")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "heiyaoshi_hit"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "heiyaoshi_hit")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "heavy_hit"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "heavy_hit")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himattack"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himattack")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himattack2"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himattack2")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himsaytaiyuchunle"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himsaytaiyuchunle")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himsayenough"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "himsayenough")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "electify"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "electify")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "sword_swing"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "sword_swing")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "woosh_hard"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "woosh_hard")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "throw"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "throw")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "pop"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "pop")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "hit"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "hit")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "obplace"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "obplace")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "dead"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "dead")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "l_g_w_u"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "l_g_w_u")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "fengliu"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "fengliu")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "bloom"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "bloom")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "sword_clash"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "sword_clash")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "whoosh"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "whoosh")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "fog"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "fog")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "get_out"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "get_out")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "cooldown"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "cooldown")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "wing"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "wing")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "paoxiao"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "paoxiao")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "absorb"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "absorb")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "big_boom"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "big_boom")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "ender_shot"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "ender_shot")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "break_wp"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "break_wp")));
        REGISTRY.put(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "end_sr"), new SoundEvent(new ResourceLocation(AnnoyingVillagersbychentuMod.MODID, "end_sr")));
    }

    @SubscribeEvent
    public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
        for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet()) {
            event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
        }
    }
}
