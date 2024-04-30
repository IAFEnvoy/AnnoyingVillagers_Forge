package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandlerModifiable;


public class CunMinZhenChaBingDangShiTiGengXinKeShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        ItemStack _setstack = new ItemStack(Items.BREAD);
        _setstack.setCount(8);
        entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
            if (capability instanceof IItemHandlerModifiable _modHandler) {
                _modHandler.setStackInSlot(2, _setstack);
            }
        });
        ItemStack _setstack2 = new ItemStack(Items.EMERALD);
        _setstack2.setCount(4);
        entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability2 -> {
            if (capability2 instanceof IItemHandlerModifiable _modHandler) {
                _modHandler.setStackInSlot(3, _setstack2);
            }
        });
        ItemStack _setstack3 = new ItemStack(Items.IRON_INGOT);
        _setstack3.setCount(2);
        entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability3 -> {
            if (capability3 instanceof IItemHandlerModifiable _modHandler) {
                _modHandler.setStackInSlot(4, _setstack3);
            }
        });
        ItemStack _setstack4 = new ItemStack(Items.WHEAT);
        _setstack4.setCount(3);
        entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability4 -> {
            if (capability4 instanceof IItemHandlerModifiable _modHandler) {
                _modHandler.setStackInSlot(5, _setstack4);
            }
        });
    }
}
