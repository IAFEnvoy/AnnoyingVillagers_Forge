package pugilist_steve.mod.annoying_villagersbychentu.recipes.brewing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModPotions;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)

public class UayspfBrewingRecipe implements IBrewingRecipe {
    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            return Boolean.valueOf(BrewingRecipeRegistry.addRecipe(new UayspfBrewingRecipe()));
        });
    }

    @Override
    public boolean isInput(ItemStack input) {
        return Ingredient.of(new ItemStack(AnnoyingVillagersbychentuModItems.UNLIGHTDIAMOND_CHESTPLATE.get())).test(input);
    }

    @Override
    public boolean isIngredient(ItemStack ingredient) {
        return Ingredient.of(new ItemStack(Items.DIAMOND)).test(ingredient);
    }

    @Override
    public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
        if (this.isInput(input) && this.isIngredient(ingredient)) {
            return PotionUtils.setPotion(new ItemStack(Items.POTION), AnnoyingVillagersbychentuModPotions.UNLIGHTAYS.get());
        }
        return ItemStack.EMPTY;
    }
}
