package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;


public class C0933xe1b52421 {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team add herobrinexintu");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/titles add @s titles:herobrinexintu");
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/team join herobrinexintu @s");
        }
        if (entity instanceof Player _player) {
            if (!_player.level.isClientSide()) {
                _player.displayClientMessage(new TextComponent("Herobrine is love!"), false);
            }
        }
        if (entity instanceof ServerPlayer _player2) {
            Advancement _adv = _player2.server.getAdvancements().getAdvancement(new ResourceLocation("annoying_villagersbychentu:herobrine_is_love"));
            AdvancementProgress _ap = _player2.getAdvancements().getOrStartProgress(_adv);
            if (!_ap.isDone()) {
                for (String str : _ap.getRemainingCriteria()) {
                    _player2.getAdvancements().award(_adv, str);
                }
            }
        }
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 900000, 1, false, false));
            }
        }
    }
}
