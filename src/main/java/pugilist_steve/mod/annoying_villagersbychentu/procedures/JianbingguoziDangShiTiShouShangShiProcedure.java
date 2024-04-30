package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModMobEffects;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class JianbingguoziDangShiTiShouShangShiProcedure {
    /* JADX WARN: Type inference failed for: r0v18, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiShouShangShiProcedure$1] */
    public static void execute(LevelAccessor world, double x, double y, double z, final Entity entity) {
        LivingEntity livingEntity;
        if (entity == null) {
            return;
        }
        Vec3 _center = new Vec3(x, y, z);
        List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(45.0d), e -> {
            return true;
        }).stream().sorted(Comparator.comparingDouble(_entcnd -> {
            return _entcnd.distanceToSqr(_center);
        })).collect(Collectors.toList());
        for (Entity entity2 : _entfound) {
            if (entity instanceof Mob _mobEnt) {
                livingEntity = _mobEnt.getTarget();
            } else {
                livingEntity = null;
            }
            if (entity2 == livingEntity) {
                if (Math.random() <= 0.3d) {
                    if (entity instanceof LivingEntity) {
                        Player player = (LivingEntity) entity;
                        ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.XIAODAO.get());
                        _setstack.setCount(1);
                        player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                        if (player instanceof Player) {
                            Player _player = player;
                            _player.getInventory().setChanged();
                        }
                    }
                    if (entity instanceof LivingEntity _entity) {
                        if (!_entity.level.isClientSide()) {
                            _entity.addEffect(new MobEffectInstance(AnnoyingVillagersbychentuModMobEffects.GEDANG.get(), 1, 1, false, false));
                        }
                    }
                }
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.JianbingguoziDangShiTiShouShangShiProcedure.1
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
                        ItemStack itemStack2;
                        ItemStack itemStack3;
                        if (entity instanceof LivingEntity) {
                            Player player2 = (LivingEntity) entity;
                            ItemStack _setstack2 = new ItemStack(Items.BOW);
                            _setstack2.setCount(1);
                            player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                            if (player2 instanceof Player) {
                                Player _player2 = player2;
                                _player2.getInventory().setChanged();
                            }
                        }
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt = entity;
                            itemStack = _livEnt.getMainHandItem();
                        } else {
                            itemStack = ItemStack.EMPTY;
                        }
                        itemStack.enchant(Enchantments.POWER_ARROWS, 6);
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt2 = entity;
                            itemStack2 = _livEnt2.getMainHandItem();
                        } else {
                            itemStack2 = ItemStack.EMPTY;
                        }
                        itemStack2.enchant(Enchantments.PUNCH_ARROWS, 6);
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt3 = entity;
                            itemStack3 = _livEnt3.getMainHandItem();
                        } else {
                            itemStack3 = ItemStack.EMPTY;
                        }
                        itemStack3.enchant(Enchantments.UNBREAKING, 3);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 60);
            }
        }
    }
}
