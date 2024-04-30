package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModEnchantments;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;

import java.util.Random;


public class ZhanShenZhiRenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure {
    /* JADX WARN: Type inference failed for: r0v196, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZhanShenZhiRenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        ItemStack itemStack;
        float f;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        ItemStack itemStack6;
        ItemStack itemStack7;
        ItemStack itemStack8;
        ItemStack itemStack9;
        ItemStack itemStack10;
        ItemStack itemStack11;
        ItemStack itemStack12;
        ItemStack itemStack13;
        ItemStack itemStack14;
        ItemStack itemStack15;
        ItemStack itemStack16;
        ItemStack itemStack17;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (itemStack.getItem() == AnnoyingVillagersbychentuModItems.ZHAN_SHEN_ZHI_REN.get() && entity.isShiftKeyDown()) {
            if (entity instanceof LivingEntity _livEnt2) {
                f = _livEnt2.getHealth();
            } else {
                f = -1.0f;
            }
            if (f <= 19.0f) {
                entity.setDeltaMovement(new Vec3(0.0d, 2.0d, 0.0d));
                if (entity instanceof LivingEntity _entity) {
                    if (!_entity.level.isClientSide()) {
                        _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 50, 4, false, false));
                    }
                }
                entity.setYRot(0.0f);
                entity.setXRot(80.0f);
                entity.setYBodyRot(entity.getYRot());
                entity.setYHeadRot(entity.getYRot());
                entity.yRotO = entity.getYRot();
                entity.xRotO = entity.getXRot();
                if (entity instanceof LivingEntity _entity2) {
                    _entity2.yBodyRotO = _entity2.getYRot();
                    _entity2.yHeadRotO = _entity2.getYRot();
                }
                if (entity instanceof LivingEntity) {
                    Player player = (LivingEntity) entity;
                    ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.JXZSZR_2.get());
                    _setstack.setCount(1);
                    player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().setChanged();
                    }
                }
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).swing(InteractionHand.MAIN_HAND, true);
                }
                world.addParticle(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1.0d, 2.0d, 2.0d);
                world.addParticle(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1.0d, 2.0d, 2.0d);
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.flap")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                world.addParticle(ParticleTypes.EXPLOSION, x, y, z, 0.0d, 2.0d, 1.0d);
                world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 1.0d, 2.0d, 0.0d);
                world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 2.0d, 1.0d);
                world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 2.0d, 0.0d);
                world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 1.0d, 0.0d);
                world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 2.0d, 1.0d);
                if (world instanceof Level _level2) {
                    if (!_level2.isClientSide()) {
                        _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.big_fall")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.big_fall")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 2.0d, 1.0d);
                world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 2.0d, 1.0d);
                world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 2.0d, 1.0d);
                if (world instanceof Level _level3) {
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate_bricks.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate_bricks.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                if (world instanceof Level _level4) {
                    if (!_level4.isClientSide()) {
                        _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:zhanshenzhirenjuexing")), SoundSource.BLOCKS, 2.0f, 1.0f);
                    } else {
                        _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:zhanshenzhirenjuexing")), SoundSource.BLOCKS, 2.0f, 1.0f, false);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "execute as @s run execute if entity @s run title @s actionbar {\"text\":\"wake up!\",\"italic\":true,\"color\":\"yellow\"}");
                }
                world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.DIAMOND_BLOCK.defaultBlockState()));
                world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
                world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.HORN_CORAL.defaultBlockState()));
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZhanShenZhiRenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.1
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

                    /* JADX WARN: Type inference failed for: r0v31, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.ZhanShenZhiRenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure$1$1] */
                    private void run() {
                        ItemStack itemStack18;
                        this.world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 2.0d, 0.0d);
                        Level level = this.world;
                        if (level instanceof Level) {
                            Level _level5 = level;
                            if (!_level5.isClientSide()) {
                                _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            } else {
                                _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.repair")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                            }
                        }
                        this.world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 2.0d, 1.0d);
                        this.world.addParticle(ParticleTypes.TOTEM_OF_UNDYING, x, y, z, 0.0d, 1.0d, 0.0d);
                        Level level2 = this.world;
                        if (level2 instanceof Level) {
                            Level _level6 = level2;
                            if (!_level6.isClientSide()) {
                                _level6.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate_bricks.break")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            } else {
                                _level6.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.deepslate_bricks.break")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                            }
                        }
                        this.world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
                        this.world.levelEvent(2001, new BlockPos(x, y, z), Block.getId(Blocks.HORN_CORAL.defaultBlockState()));
                        if (entity instanceof Player) {
                            Player _player2 = entity;
                            ItemStack _stktoremove = new ItemStack(AnnoyingVillagersbychentuModItems.JXZSZR_2.get());
                            _player2.getInventory().clearOrCountMatchingItems(p -> {
                                return _stktoremove.getItem() == p.getItem();
                            }, 1, _player2.inventoryMenu.getCraftSlots());
                        }
                        if (entity instanceof Player) {
                            Player _player3 = entity;
                            ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.ZHAN_SHEN_ZHI_REN.get());
                            _setstack2.setCount(1);
                            ItemHandlerHelper.giveItemToPlayer(_player3, _setstack2);
                        }
                        if (entity instanceof LivingEntity) {
                            LivingEntity _livEnt3 = entity;
                            itemStack18 = _livEnt3.getMainHandItem();
                        } else {
                            itemStack18 = ItemStack.EMPTY;
                        }
                        ItemStack _ist = itemStack18;
                        if (_ist.hurt(100, new Random(), null)) {
                            _ist.shrink(1);
                            _ist.setDamageValue(0);
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.ZhanShenZhiRenDangYouJianDianJiKongQiShiShiTiDeWeiZhiProcedure.1.1
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
                                ItemStack itemStack19;
                                ItemStack itemStack20;
                                ItemStack itemStack21;
                                ItemStack itemStack22;
                                ItemStack itemStack23;
                                ItemStack itemStack24;
                                ItemStack itemStack25;
                                ItemStack itemStack26;
                                ItemStack itemStack27;
                                ItemStack itemStack28;
                                ItemStack itemStack29;
                                ItemStack itemStack30;
                                ItemStack itemStack31;
                                ItemStack itemStack32;
                                ItemStack itemStack33;
                                ItemStack itemStack34;
                                ItemStack itemStack35;
                                if (entity instanceof LivingEntity) {
                                    LivingEntity _livEnt4 = entity;
                                    itemStack19 = _livEnt4.getMainHandItem();
                                } else {
                                    itemStack19 = ItemStack.EMPTY;
                                }
                                if (itemStack19.getItem() == AnnoyingVillagersbychentuModItems.ZHAN_SHEN_ZHI_REN.get()) {
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt5 = entity;
                                        itemStack20 = _livEnt5.getMainHandItem();
                                    } else {
                                        itemStack20 = ItemStack.EMPTY;
                                    }
                                    itemStack20.enchant(Enchantments.SHARPNESS, 10);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt6 = entity;
                                        itemStack21 = _livEnt6.getMainHandItem();
                                    } else {
                                        itemStack21 = ItemStack.EMPTY;
                                    }
                                    itemStack21.enchant(Enchantments.SMITE, 8);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt7 = entity;
                                        itemStack22 = _livEnt7.getMainHandItem();
                                    } else {
                                        itemStack22 = ItemStack.EMPTY;
                                    }
                                    itemStack22.enchant(Enchantments.KNOCKBACK, 9);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt8 = entity;
                                        itemStack23 = _livEnt8.getMainHandItem();
                                    } else {
                                        itemStack23 = ItemStack.EMPTY;
                                    }
                                    itemStack23.enchant(Enchantments.UNBREAKING, 7);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt9 = entity;
                                        itemStack24 = _livEnt9.getMainHandItem();
                                    } else {
                                        itemStack24 = ItemStack.EMPTY;
                                    }
                                    itemStack24.enchant(Enchantments.MENDING, 5);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt10 = entity;
                                        itemStack25 = _livEnt10.getMainHandItem();
                                    } else {
                                        itemStack25 = ItemStack.EMPTY;
                                    }
                                    itemStack25.enchant(AnnoyingVillagersbychentuModEnchantments.ENERGY.get(), 4);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt11 = entity;
                                        itemStack26 = _livEnt11.getMainHandItem();
                                    } else {
                                        itemStack26 = ItemStack.EMPTY;
                                    }
                                    itemStack26.enchant(AnnoyingVillagersbychentuModEnchantments.HEAVY_ATTACK.get(), 5);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt12 = entity;
                                        itemStack27 = _livEnt12.getMainHandItem();
                                    } else {
                                        itemStack27 = ItemStack.EMPTY;
                                    }
                                    itemStack27.enchant(AnnoyingVillagersbychentuModEnchantments.ARROW_DEFLECTION.get(), 7);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt13 = entity;
                                        itemStack28 = _livEnt13.getMainHandItem();
                                    } else {
                                        itemStack28 = ItemStack.EMPTY;
                                    }
                                    itemStack28.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 10);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt14 = entity;
                                        itemStack29 = _livEnt14.getMainHandItem();
                                    } else {
                                        itemStack29 = ItemStack.EMPTY;
                                    }
                                    itemStack29.enchant(AnnoyingVillagersbychentuModEnchantments.QUICK_DRAW.get(), 10);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt15 = entity;
                                        itemStack30 = _livEnt15.getMainHandItem();
                                    } else {
                                        itemStack30 = ItemStack.EMPTY;
                                    }
                                    itemStack30.enchant(AnnoyingVillagersbychentuModEnchantments.POSSESSION.get(), 10);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt16 = entity;
                                        itemStack31 = _livEnt16.getMainHandItem();
                                    } else {
                                        itemStack31 = ItemStack.EMPTY;
                                    }
                                    itemStack31.enchant(AnnoyingVillagersbychentuModEnchantments.HOLY_BLESSING.get(), 10);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt17 = entity;
                                        itemStack32 = _livEnt17.getMainHandItem();
                                    } else {
                                        itemStack32 = ItemStack.EMPTY;
                                    }
                                    itemStack32.enchant(AnnoyingVillagersbychentuModEnchantments.EXPERIENCE.get(), 3230);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt18 = entity;
                                        itemStack33 = _livEnt18.getMainHandItem();
                                    } else {
                                        itemStack33 = ItemStack.EMPTY;
                                    }
                                    itemStack33.enchant(AnnoyingVillagersbychentuModEnchantments.LEARNING.get(), 547);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt19 = entity;
                                        itemStack34 = _livEnt19.getMainHandItem();
                                    } else {
                                        itemStack34 = ItemStack.EMPTY;
                                    }
                                    itemStack34.enchant(AnnoyingVillagersbychentuModEnchantments.UNKNOWN.get(), 1);
                                    if (entity instanceof LivingEntity) {
                                        LivingEntity _livEnt20 = entity;
                                        itemStack35 = _livEnt20.getMainHandItem();
                                    } else {
                                        itemStack35 = ItemStack.EMPTY;
                                    }
                                    itemStack35.enchant(AnnoyingVillagersbychentuModEnchantments.ERROR_785_A.get(), 1);
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 1);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(world, 50);
                return;
            }
            if (entity instanceof LivingEntity) {
                Player player2 = (LivingEntity) entity;
                ItemStack _setstack2 = new ItemStack(AnnoyingVillagersbychentuModItems.DAN_SHOU_ZHAN_SHEN_ZHI_REN.get());
                _setstack2.setCount(1);
                player2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().setChanged();
                }
            }
            if (entity instanceof LivingEntity _livEnt3) {
                itemStack2 = _livEnt3.getMainHandItem();
            } else {
                itemStack2 = ItemStack.EMPTY;
            }
            itemStack2.enchant(Enchantments.SHARPNESS, 10);
            if (entity instanceof LivingEntity _livEnt4) {
                itemStack3 = _livEnt4.getMainHandItem();
            } else {
                itemStack3 = ItemStack.EMPTY;
            }
            itemStack3.enchant(Enchantments.SMITE, 8);
            if (entity instanceof LivingEntity _livEnt5) {
                itemStack4 = _livEnt5.getMainHandItem();
            } else {
                itemStack4 = ItemStack.EMPTY;
            }
            itemStack4.enchant(Enchantments.KNOCKBACK, 9);
            if (entity instanceof LivingEntity _livEnt6) {
                itemStack5 = _livEnt6.getMainHandItem();
            } else {
                itemStack5 = ItemStack.EMPTY;
            }
            itemStack5.enchant(Enchantments.UNBREAKING, 7);
            if (entity instanceof LivingEntity _livEnt7) {
                itemStack6 = _livEnt7.getMainHandItem();
            } else {
                itemStack6 = ItemStack.EMPTY;
            }
            itemStack6.enchant(Enchantments.MENDING, 5);
            if (entity instanceof LivingEntity _livEnt8) {
                itemStack7 = _livEnt8.getMainHandItem();
            } else {
                itemStack7 = ItemStack.EMPTY;
            }
            itemStack7.enchant(AnnoyingVillagersbychentuModEnchantments.ENERGY.get(), 4);
            if (entity instanceof LivingEntity _livEnt9) {
                itemStack8 = _livEnt9.getMainHandItem();
            } else {
                itemStack8 = ItemStack.EMPTY;
            }
            itemStack8.enchant(AnnoyingVillagersbychentuModEnchantments.HEAVY_ATTACK.get(), 5);
            if (entity instanceof LivingEntity _livEnt10) {
                itemStack9 = _livEnt10.getMainHandItem();
            } else {
                itemStack9 = ItemStack.EMPTY;
            }
            itemStack9.enchant(AnnoyingVillagersbychentuModEnchantments.ARROW_DEFLECTION.get(), 7);
            if (entity instanceof LivingEntity _livEnt11) {
                itemStack10 = _livEnt11.getMainHandItem();
            } else {
                itemStack10 = ItemStack.EMPTY;
            }
            itemStack10.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 10);
            if (entity instanceof LivingEntity _livEnt12) {
                itemStack11 = _livEnt12.getMainHandItem();
            } else {
                itemStack11 = ItemStack.EMPTY;
            }
            itemStack11.enchant(AnnoyingVillagersbychentuModEnchantments.QUICK_DRAW.get(), 10);
            if (entity instanceof LivingEntity _livEnt13) {
                itemStack12 = _livEnt13.getMainHandItem();
            } else {
                itemStack12 = ItemStack.EMPTY;
            }
            itemStack12.enchant(AnnoyingVillagersbychentuModEnchantments.POSSESSION.get(), 10);
            if (entity instanceof LivingEntity _livEnt14) {
                itemStack13 = _livEnt14.getMainHandItem();
            } else {
                itemStack13 = ItemStack.EMPTY;
            }
            itemStack13.enchant(AnnoyingVillagersbychentuModEnchantments.HOLY_BLESSING.get(), 10);
            if (entity instanceof LivingEntity _livEnt15) {
                itemStack14 = _livEnt15.getMainHandItem();
            } else {
                itemStack14 = ItemStack.EMPTY;
            }
            itemStack14.enchant(AnnoyingVillagersbychentuModEnchantments.EXPERIENCE.get(), 3230);
            if (entity instanceof LivingEntity _livEnt16) {
                itemStack15 = _livEnt16.getMainHandItem();
            } else {
                itemStack15 = ItemStack.EMPTY;
            }
            itemStack15.enchant(AnnoyingVillagersbychentuModEnchantments.LEARNING.get(), 547);
            if (entity instanceof LivingEntity _livEnt17) {
                itemStack16 = _livEnt17.getMainHandItem();
            } else {
                itemStack16 = ItemStack.EMPTY;
            }
            itemStack16.enchant(AnnoyingVillagersbychentuModEnchantments.UNKNOWN.get(), 1);
            if (entity instanceof LivingEntity _livEnt18) {
                itemStack17 = _livEnt18.getMainHandItem();
            } else {
                itemStack17 = ItemStack.EMPTY;
            }
            itemStack17.enchant(AnnoyingVillagersbychentuModEnchantments.ERROR_785_A.get(), 1);
        }
    }
}
