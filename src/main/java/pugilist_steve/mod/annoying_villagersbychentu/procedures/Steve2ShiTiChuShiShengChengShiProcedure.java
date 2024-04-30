package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class Steve2ShiTiChuShiShengChengShiProcedure {
    /* JADX WARN: Type inference failed for: r0v9, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2ShiTiChuShiShengChengShiProcedure$1] */
    public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
        ItemStack itemStack;
        ItemStack itemStack2;
        ItemStack itemStack3;
        ItemStack itemStack4;
        ItemStack itemStack5;
        if (entity == null) {
            return;
        }
        if (entity instanceof LivingEntity) {
            Player player = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(AnnoyingVillagersbychentuModItems.DAN_SHOU_ZHAN_SHEN_ZHI_REN.get());
            _setstack.setCount(1);
            player.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (player instanceof Player) {
                Player _player = player;
                _player.getInventory().setChanged();
            }
        }
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.BLOCKS, 1.0f, 1.0f);
            } else {
                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:pop")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
            }
        }
        if (world instanceof Level _level2) {
            if (!_level2.isClientSide()) {
                _level2.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesayiwanttuseuthere")), SoundSource.BLOCKS, 1.0f, 1.0f);
            } else {
                _level2.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesayiwanttuseuthere")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
            }
        }
        if (!world.isClientSide() && world.getServer() != null) {
            world.getServer().getPlayerList().broadcastMessage(new TextComponent("<Steve> 我不敢相信我会在这里使用它"), ChatType.SYSTEM, Util.NIL_UUID);
        }
        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2ShiTiChuShiShengChengShiProcedure.1
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

            /* JADX WARN: Type inference failed for: r0v28, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2ShiTiChuShiShengChengShiProcedure$1$1] */
            private void run() {
                ItemStack itemStack6;
                ItemStack itemStack7;
                ItemStack itemStack8;
                Player player2 = entity;
                if (player2 instanceof Player) {
                    Player _player2 = player2;
                    _player2.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_HELMET.get()));
                    _player2.getInventory().setChanged();
                } else if (player2 instanceof LivingEntity) {
                    LivingEntity _living = player2;
                    _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_HELMET.get()));
                }
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level3 = level;
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.BLOCKS, 1.0f, 1.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                    }
                }
                if (entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor = entity;
                    itemStack6 = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    itemStack6 = ItemStack.EMPTY;
                }
                itemStack6.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 7);
                if (entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor2 = entity;
                    itemStack7 = _entGetArmor2.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    itemStack7 = ItemStack.EMPTY;
                }
                itemStack7.enchant(Enchantments.MENDING, 5);
                if (entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor3 = entity;
                    itemStack8 = _entGetArmor3.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    itemStack8 = ItemStack.EMPTY;
                }
                itemStack8.enchant(Enchantments.UNBREAKING, 5);
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.Steve2ShiTiChuShiShengChengShiProcedure.1.1
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
                        ItemStack itemStack9;
                        ItemStack itemStack10;
                        ItemStack itemStack11;
                        Level level2 = this.world;
                        if (level2 instanceof Level) {
                            Level _level4 = level2;
                            if (!_level4.isClientSide()) {
                                _level4.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            } else {
                                _level4.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                            }
                        }
                        Level level3 = this.world;
                        if (level3 instanceof Level) {
                            Level _level5 = level3;
                            if (!_level5.isClientSide()) {
                                _level5.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesayiwanttuseuthere")), SoundSource.BLOCKS, 1.0f, 1.0f);
                            } else {
                                _level5.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("annoying_villagersbychentu:stevesayiwanttuseuthere")), SoundSource.BLOCKS, 1.0f, 1.0f, false);
                            }
                        }
                        Player player3 = entity;
                        if (player3 instanceof Player) {
                            Player _player3 = player3;
                            _player3.getInventory().armor.set(2, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_CHESTPLATE.get()));
                            _player3.getInventory().setChanged();
                        } else if (player3 instanceof LivingEntity) {
                            LivingEntity _living2 = player3;
                            _living2.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.CCHUNZUANTAO_CHESTPLATE.get()));
                        }
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entGetArmor4 = entity;
                            itemStack9 = _entGetArmor4.getItemBySlot(EquipmentSlot.CHEST);
                        } else {
                            itemStack9 = ItemStack.EMPTY;
                        }
                        itemStack9.enchant(Enchantments.MENDING, 5);
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entGetArmor5 = entity;
                            itemStack10 = _entGetArmor5.getItemBySlot(EquipmentSlot.CHEST);
                        } else {
                            itemStack10 = ItemStack.EMPTY;
                        }
                        itemStack10.enchant(Enchantments.UNBREAKING, 5);
                        if (entity instanceof LivingEntity) {
                            LivingEntity _entGetArmor6 = entity;
                            itemStack11 = _entGetArmor6.getItemBySlot(EquipmentSlot.CHEST);
                        } else {
                            itemStack11 = ItemStack.EMPTY;
                        }
                        itemStack11.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 10);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(this.world, 20);
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }.start(world, 20);
        if (entity instanceof LivingEntity _entity) {
            if (!_entity.level.isClientSide()) {
                _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 999999, 0, false, false));
            }
        }
        if (entity instanceof LivingEntity _livEnt) {
            itemStack = _livEnt.getMainHandItem();
        } else {
            itemStack = ItemStack.EMPTY;
        }
        itemStack.enchant(Enchantments.UNBREAKING, 5);
        if (entity instanceof LivingEntity _livEnt2) {
            itemStack2 = _livEnt2.getMainHandItem();
        } else {
            itemStack2 = ItemStack.EMPTY;
        }
        itemStack2.enchant(Enchantments.SHARPNESS, 5);
        if (entity instanceof LivingEntity _livEnt3) {
            itemStack3 = _livEnt3.getMainHandItem();
        } else {
            itemStack3 = ItemStack.EMPTY;
        }
        itemStack3.enchant(Enchantments.KNOCKBACK, 1);
        if (entity instanceof LivingEntity _livEnt4) {
            itemStack4 = _livEnt4.getMainHandItem();
        } else {
            itemStack4 = ItemStack.EMPTY;
        }
        itemStack4.enchant(Enchantments.MENDING, 3);
        if (entity instanceof LivingEntity _livEnt5) {
            itemStack5 = _livEnt5.getMainHandItem();
        } else {
            itemStack5 = ItemStack.EMPTY;
        }
        itemStack5.enchant(Enchantments.MOB_LOOTING, 3);
        if (!entity.level.isClientSide() && entity.getServer() != null) {
            entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "/data merge entity @s {Tags:[\"OP\"]}");
        }
    }
}
