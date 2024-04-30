package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;


public class BbdShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v5, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BbdShiTiChuShiShengChengShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v6, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BbdShiTiChuShiShengChengShiProcedure$2] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity == null) {
            return;
        }
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/data merge entity @s {Invulnerable:1b}");
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BbdShiTiChuShiShengChengShiProcedure.1
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            public void start(LevelAccessor world2, int waitTicks) {
                this.waitTicks = waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world2;
            }

            @SubscribeEvent
            public void tick(TickEvent.ServerTickEvent event) {
                if (event.phase == TickEvent.Phase.END) {
                    this.ticks++;
                    if (this.ticks >= this.waitTicks) {
                        this.run();
                    }
                }
            }

            private void run() {
                ItemStack itemStack;
                if (entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor = entity;
                    itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                itemStack.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 10);
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 1);
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BbdShiTiChuShiShengChengShiProcedure.2
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            public void start(LevelAccessor world2, int waitTicks) {
                this.waitTicks = waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world2;
            }

            @SubscribeEvent
            public void tick(TickEvent.ServerTickEvent event) {
                if (event.phase == TickEvent.Phase.END) {
                    this.ticks++;
                    if (this.ticks >= this.waitTicks) {
                        this.run();
                    }
                }
            }

            private void run() {
                if (entity.isAlive()) {
                    if (Math.random() <= 0.4d) {
                        Entity _ent = entity;
                        if (!_ent.level.isClientSide() && _ent.getServer() != null) {
                            _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "summon annoying_villagersbychentu:blue_demon ^ ^ ^");
                        }
                    } else {
                        Entity _ent2 = entity;
                        if (!_ent2.level.isClientSide() && _ent2.getServer() != null) {
                            _ent2.getServer().getCommands().performCommand(_ent2.createCommandSourceStack().withSuppressedOutput().withPermission(4), "summon annoying_villagersbychentu:nishidierjie ^ ^ ^");
                        }
                    }
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 400);
    }
}
