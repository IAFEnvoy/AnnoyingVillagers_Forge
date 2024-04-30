package pugilist_steve.mod.annoying_villagersbychentu.init;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.BasicItemListing;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)

public class AnnoyingVillagersbychentuModTrades {
    @SubscribeEvent
    public static void registerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.WEAPONSMITH) {
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 30), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_JU_JIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 23), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_JIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(AnnoyingVillagersbychentuModItems.CHONG_NENG_ZUAN_SHI_JIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.HHONGBAOSHIJIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25), new ItemStack(AnnoyingVillagersbychentuModItems.LAN_YAN_JIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.GOU_ZHUANG_ZUAN_SHI_JIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.HHONGZUANSHIJIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 26), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_WAN_BING_REN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_DAO_PIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 26), new ItemStack(AnnoyingVillagersbychentuModItems.SHENG_QI_SHI_ZHI_JIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_BI_SHOU.get()), 10, 10, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CI_YIN_JIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.TTIEZHIJUPIDAO.get()), 10, 10, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.LLBSJ.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.DIAMOND), new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 30), new ItemStack(AnnoyingVillagersbychentuModItems.LLBSTZ_CHESTPLATE.get()), new ItemStack(AnnoyingVillagersbychentuModItems.GRAVECUIRASS_CHESTPLATE.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_HELMET.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 23), new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_CHESTPLATE.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 21), new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_LEGGINGS.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_BOOTS.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.LU_BAO_SHI_CHAN.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get()), new ItemStack(Items.EMERALD, 5), new ItemStack(AnnoyingVillagersbychentuModItems.ZZIBAOSHI.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.HHEJINJI.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(AnnoyingVillagersbychentuModItems.CCBF.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CHANG_FU.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_JU_FU.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_ZHAN_FU.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_CI_YIN_JIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25), new ItemStack(AnnoyingVillagersbychentuModItems.ZUAN_SHI_JU_REN.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 27), new ItemStack(AnnoyingVillagersbychentuModItems.ZIZIBAOSHICHANGJIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 27), new ItemStack(Items.WITHER_SKELETON_SKULL), new ItemStack(Items.TOTEM_OF_UNDYING), 10, 15, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 19), new ItemStack(AnnoyingVillagersbychentuModItems.LLBSTZ_HELMET.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 19), new ItemStack(AnnoyingVillagersbychentuModItems.LLBSTZ_CHESTPLATE.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(AnnoyingVillagersbychentuModItems.LLBSTZ_LEGGINGS.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(AnnoyingVillagersbychentuModItems.LLBSTZ_BOOTS.get()), 10, 10, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(AnnoyingVillagersbychentuModItems.AAHJD.get()), new ItemStack(AnnoyingVillagersbychentuModItems.ANANHEJINTAO_HELMET.get()), 10, 15, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 25), new ItemStack(AnnoyingVillagersbychentuModItems.AAHJD.get()), new ItemStack(AnnoyingVillagersbychentuModItems.ANANHEJINTAO_CHESTPLATE.get()), 10, 15, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 23), new ItemStack(AnnoyingVillagersbychentuModItems.AAHJD.get()), new ItemStack(AnnoyingVillagersbychentuModItems.ANANHEJINTAO_LEGGINGS.get()), 10, 15, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 22), new ItemStack(AnnoyingVillagersbychentuModItems.AAHJD.get()), new ItemStack(AnnoyingVillagersbychentuModItems.ANANHEJINTAO_BOOTS.get()), 10, 15, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.STICK, 15), new ItemStack(AnnoyingVillagersbychentuModItems.YYUMIJUAN.get()), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get(), 13), new ItemStack(AnnoyingVillagersbychentuModItems.CCGEPOLANJIANDUN.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.STICK, 30), new ItemStack(Items.ENCHANTED_GOLDEN_APPLE), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.APPLE), new ItemStack(Items.GOLDEN_APPLE, 2), 100, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.ARROW, 5), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 3), new ItemStack(Items.ENDER_PEARL, 16), 100, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.OAK_PLANKS, 10), new ItemStack(Blocks.WHITE_BED), 10, 10, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(AnnoyingVillagersbychentuModItems.MUMEN.get()), new ItemStack(Items.GOLDEN_APPLE, 2), new ItemStack(AnnoyingVillagersbychentuModItems.FUMOMUMEN.get()), 10, 10, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(AnnoyingVillagersbychentuModItems.AANHEJINDAJIAN.get()), 10, 10, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(AnnoyingVillagersbychentuModItems.HHEJINZHANFUV_2.get()), 10, 10, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(AnnoyingVillagersbychentuModItems.HHEJINJUFU.get()), 10, 10, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 23), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(AnnoyingVillagersbychentuModItems.HHEJINCHANGQIANG.get()), 10, 10, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(AnnoyingVillagersbychentuModItems.MMUZHANFUV_2.get()), 10, 10, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(AnnoyingVillagersbychentuModItems.BBIANZHONGHUOYUANSUHEJINWANDAO.get()), 10, 10, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNDUZUANSHI.get(), 20), new ItemStack(Items.EXPERIENCE_BOTTLE, 64), 10, 10, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.SPYGLASS), new ItemStack(AnnoyingVillagersbychentuModItems.CCZDZ_SPAWN_EGG.get()), 10, 10, 0.05f));
            event.getTrades().get(5).add(new BasicItemListing(new ItemStack(AnnoyingVillagersbychentuModItems.GRAVECUIRASS_CHESTPLATE.get()), new ItemStack(Items.ZOMBIE_HEAD), new ItemStack(AnnoyingVillagersbychentuModItems.ZHAOHUANGRAVE.get()), 1, 5, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 10), new ItemStack(Blocks.TNT), 50, 5, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(AnnoyingVillagersbychentuModItems.JJINGOUJIAN.get()), 10, 5, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.GOLDEN_APPLE), new ItemStack(Items.FISHING_ROD), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.DIAMOND, 2), new ItemStack(AnnoyingVillagersbychentuModItems.SUNARMOUR_HELMET.get()), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 23), new ItemStack(Items.DIAMOND, 3), new ItemStack(AnnoyingVillagersbychentuModItems.SUNARMOUR_CHESTPLATE.get()), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 21), new ItemStack(Items.DIAMOND, 3), new ItemStack(AnnoyingVillagersbychentuModItems.SUNARMOUR_LEGGINGS.get()), 10, 15, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.DIAMOND, 3), new ItemStack(AnnoyingVillagersbychentuModItems.SUNARMOUR_BOOTS.get()), 10, 10, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(AnnoyingVillagersbychentuModItems.BISHOU.get()), 10, 10, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(AnnoyingVillagersbychentuModItems.LAN_CUN_QI_JIAN.get()), new ItemStack(Items.EMERALD, 25), 10, 15, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.ENDER_PEARL), new ItemStack(Items.GOLD_INGOT, 2), 10, 10, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 10), new ItemStack(Items.BOW), 10, 10, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 19), new ItemStack(Items.DIAMOND_SWORD), 10, 5, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.STICK, 45), new ItemStack(Items.SHIELD), 10, 5, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 10), new ItemStack(Items.MINECART), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.IRON_INGOT, 10), new ItemStack(AnnoyingVillagersbychentuModItems.UNLIGHTDIAMOND_HELMET.get()), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.IRON_INGOT, 10), new ItemStack(AnnoyingVillagersbychentuModItems.UNLIGHTDIAMOND_CHESTPLATE.get()), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.IRON_INGOT, 10), new ItemStack(AnnoyingVillagersbychentuModItems.UNLIGHTDIAMOND_LEGGINGS.get()), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 20), new ItemStack(Items.IRON_INGOT, 10), new ItemStack(AnnoyingVillagersbychentuModItems.UNLIGHTDIAMOND_BOOTS.get()), 10, 5, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT), new ItemStack(Blocks.OAK_PLANKS, 10), new ItemStack(Blocks.POWERED_RAIL, 4), 10, 5, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Blocks.OAK_PLANKS, 5), new ItemStack(Blocks.RAIL, 4), 10, 5, 0.05f));
            event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 5), new ItemStack(Items.NAME_TAG), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 23), new ItemStack(Items.ENDER_PEARL, 2), new ItemStack(Blocks.ENCHANTING_TABLE), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 16), new ItemStack(Items.SUGAR, 20), new ItemStack(Blocks.BREWING_STAND), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.WRITABLE_BOOK), 10, 5, 0.05f));
            event.getTrades().get(3).add(new BasicItemListing(new ItemStack(AnnoyingVillagersbychentuModItems.FUMOMOYINGZHENZHU.get()), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.ENDER_EYE), 10, 5, 0.05f));
            event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(Items.GOLD_INGOT), new ItemStack(Items.ELYTRA), 10, 5, 0.05f));
        }
    }
}
