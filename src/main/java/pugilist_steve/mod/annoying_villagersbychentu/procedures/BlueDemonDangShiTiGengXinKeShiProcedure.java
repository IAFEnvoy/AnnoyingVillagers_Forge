package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.entity.BluedemontridentEntity;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEntities;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class BlueDemonDangShiTiGengXinKeShiProcedure {
    /* JADX WARN: Type inference failed for: r0v3, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiGengXinKeShiProcedure$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiGengXinKeShiProcedure$2] */
    public static void execute(LevelAccessor world, final Entity entity) {
        if (entity != null && entity.fireImmune()) {
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiGengXinKeShiProcedure.1
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
                    if (entity instanceof LivingEntity) {
                        Player player = (LivingEntity) entity;
                        ItemStack _setstack = new ItemStack(Items.TRIDENT);
                        _setstack.setCount(1);
                        player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (player instanceof Player) {
                            Player _player = player;
                            _player.getInventory().setChanged();
                        }
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 3);
            new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiGengXinKeShiProcedure.2
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

                /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiGengXinKeShiProcedure$2$1] */
                private void run() {
                    Entity _shootFrom = entity;
                    Level projectileLevel = _shootFrom.level;
                    if (!projectileLevel.isClientSide()) {
                        Projectile _entityToSpawn = new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.BlueDemonDangShiTiGengXinKeShiProcedure.2.1
                            public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
                                AbstractArrow entityToSpawn = new BluedemontridentEntity(AnnoyingVillagersbychentuModEntities.BLUEDEMONTRIDENT.get(), level);
                                entityToSpawn.setOwner(shooter);
                                entityToSpawn.setBaseDamage(damage);
                                entityToSpawn.setKnockback(knockback);
                                entityToSpawn.setSilent(true);
                                entityToSpawn.setPierceLevel(piercing);
                                return entityToSpawn;
                            }
                        }.getArrow(projectileLevel, entity, 10.0f, 3, (byte) 2);
                        _entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1d, _shootFrom.getZ());
                        _entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 2.5f, 0.0f);
                        projectileLevel.addFreshEntity(_entityToSpawn);
                    }
                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            }.start(world, 9);
            if (entity instanceof LivingEntity) {
                Player player = (LivingEntity) entity;
                ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.SHUNJIANSANCHAJI.get());
                _setstack.setCount(1);
                player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().setChanged();
                }
            }
        }
    }
}
