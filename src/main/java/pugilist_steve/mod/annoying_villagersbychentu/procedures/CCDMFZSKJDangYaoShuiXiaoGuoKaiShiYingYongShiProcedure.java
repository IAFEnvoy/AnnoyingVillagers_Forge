package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import pugilist_steve.mod.annoying_villagersbychentu.init.AnnoyingVillagersbychentuModItems;


public class CCDMFZSKJDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        new C03251(entity, x, y, z).start(world, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */


    public class C03251 {
        final Entity val$entity;
        final double val$x;
        final double val$y;
        final double val$z;
        private int ticks = 0;
        private float waitTicks;
        private LevelAccessor world;

        C03251(Entity entity, double d, double d2, double d3) {
            this.val$entity = entity;
            this.val$x = d;
            this.val$y = d2;
            this.val$z = d3;
        }

        public void start(LevelAccessor world, int waitTicks) {
            this.waitTicks = waitTicks;
            MinecraftForge.EVENT_BUS.register(this);
            this.world = world;
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
            ItemStack itemStack4;
            if (this.val$entity instanceof LivingEntity) {
                LivingEntity _entGetArmor = this.val$entity;
                itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
            } else {
                itemStack = ItemStack.EMPTY;
            }
            if (itemStack.getItem() == Blocks.AIR.asItem()) {
                Level level = this.world;
                if (level instanceof Level) {
                    Level _level = level;
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(this.val$x, this.val$y, this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(this.val$x, this.val$y, this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                Player player = this.val$entity;
                if (player instanceof Player) {
                    Player _player = player;
                    _player.getInventory().armor.set(3, new ItemStack(AnnoyingVillagersbychentuModItems.CHUNCUIDEMOFAZUANSHI_HELMET.get()));
                    _player.getInventory().setChanged();
                } else if (player instanceof LivingEntity) {
                    LivingEntity _living = player;
                    _living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(AnnoyingVillagersbychentuModItems.CHUNCUIDEMOFAZUANSHI_HELMET.get()));
                }
                if (this.val$entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor2 = this.val$entity;
                    itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    itemStack2 = ItemStack.EMPTY;
                }
                itemStack2.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 1);
                if (this.val$entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor3 = this.val$entity;
                    itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    itemStack3 = ItemStack.EMPTY;
                }
                itemStack3.enchant(Enchantments.BINDING_CURSE, 1);
                if (this.val$entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor4 = this.val$entity;
                    itemStack4 = _entGetArmor4.getItemBySlot(EquipmentSlot.HEAD);
                } else {
                    itemStack4 = ItemStack.EMPTY;
                }
                itemStack4.enchant(Enchantments.VANISHING_CURSE, 1);
            }
            new C03261().start(this.world, 2);
            this.world.levelEvent(2001, new BlockPos(this.val$x, this.val$y, this.val$z), Block.getId(Blocks.DIAMOND_BLOCK.defaultBlockState()));
            MinecraftForge.EVENT_BUS.unregister(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */


        public class C03261 {
            private int ticks = 0;
            private float waitTicks;
            private LevelAccessor world;

            C03261() {
            }

            public void start(LevelAccessor world, int waitTicks) {
                this.waitTicks = waitTicks;
                MinecraftForge.EVENT_BUS.register(this);
                this.world = world;
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

            /* JADX WARN: Type inference failed for: r0v7, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CCDMFZSKJDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure$1$1$1] */
            private void run() {
                ItemStack itemStack;
                ItemStack itemStack2;
                ItemStack itemStack3;
                ItemStack itemStack4;
                if (C03251.this.val$entity instanceof LivingEntity) {
                    LivingEntity _entGetArmor = C03251.this.val$entity;
                    itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
                } else {
                    itemStack = ItemStack.EMPTY;
                }
                if (itemStack.getItem() == Blocks.AIR.asItem()) {
                    Level level = this.world;
                    if (level instanceof Level) {
                        Level _level = level;
                        if (!_level.isClientSide()) {
                            _level.playSound(null, new BlockPos(C03251.this.val$x, C03251.this.val$y, C03251.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                        } else {
                            _level.playLocalSound(C03251.this.val$x, C03251.this.val$y, C03251.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                        }
                    }
                    Player player = C03251.this.val$entity;
                    if (player instanceof Player) {
                        Player _player = player;
                        _player.getInventory().armor.set(2, new ItemStack(AnnoyingVillagersbychentuModItems.CHUNCUIDEMOFAZUANSHI_CHESTPLATE.get()));
                        _player.getInventory().setChanged();
                    } else if (player instanceof LivingEntity) {
                        LivingEntity _living = player;
                        _living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(AnnoyingVillagersbychentuModItems.CHUNCUIDEMOFAZUANSHI_CHESTPLATE.get()));
                    }
                    if (C03251.this.val$entity instanceof LivingEntity) {
                        LivingEntity _entGetArmor2 = C03251.this.val$entity;
                        itemStack2 = _entGetArmor2.getItemBySlot(EquipmentSlot.CHEST);
                    } else {
                        itemStack2 = ItemStack.EMPTY;
                    }
                    itemStack2.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 2);
                    if (C03251.this.val$entity instanceof LivingEntity) {
                        LivingEntity _entGetArmor3 = C03251.this.val$entity;
                        itemStack3 = _entGetArmor3.getItemBySlot(EquipmentSlot.CHEST);
                    } else {
                        itemStack3 = ItemStack.EMPTY;
                    }
                    itemStack3.enchant(Enchantments.BINDING_CURSE, 1);
                    if (C03251.this.val$entity instanceof LivingEntity) {
                        LivingEntity _entGetArmor4 = C03251.this.val$entity;
                        itemStack4 = _entGetArmor4.getItemBySlot(EquipmentSlot.CHEST);
                    } else {
                        itemStack4 = ItemStack.EMPTY;
                    }
                    itemStack4.enchant(Enchantments.VANISHING_CURSE, 1);
                }
                new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CCDMFZSKJDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.1.1.1
                    private int ticks = 0;
                    private float waitTicks;
                    private LevelAccessor world;

                    public void start(LevelAccessor world, int waitTicks) {
                        this.waitTicks = waitTicks;
                        MinecraftForge.EVENT_BUS.register(this);
                        this.world = world;
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

                    /* JADX WARN: Type inference failed for: r0v8, types: [pugilist_steve.mod.annoying_villagersbychentu.procedures.CCDMFZSKJDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure$1$1$1$1] */
                    private void run() {
                        ItemStack itemStack5;
                        ItemStack itemStack6;
                        ItemStack itemStack7;
                        ItemStack itemStack8;
                        if (C03251.this.val$entity instanceof LivingEntity) {
                            LivingEntity _entGetArmor5 = C03251.this.val$entity;
                            itemStack5 = _entGetArmor5.getItemBySlot(EquipmentSlot.LEGS);
                        } else {
                            itemStack5 = ItemStack.EMPTY;
                        }
                        if (itemStack5.getItem() == Blocks.AIR.asItem()) {
                            Level level2 = this.world;
                            if (level2 instanceof Level) {
                                Level _level2 = level2;
                                if (!_level2.isClientSide()) {
                                    _level2.playSound(null, new BlockPos(C03251.this.val$x, C03251.this.val$y, C03251.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                } else {
                                    _level2.playLocalSound(C03251.this.val$x, C03251.this.val$y, C03251.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                }
                            }
                            Player player2 = C03251.this.val$entity;
                            if (player2 instanceof Player) {
                                Player _player2 = player2;
                                _player2.getInventory().armor.set(1, new ItemStack(AnnoyingVillagersbychentuModItems.CHUNCUIDEMOFAZUANSHI_LEGGINGS.get()));
                                _player2.getInventory().setChanged();
                            } else if (player2 instanceof LivingEntity) {
                                LivingEntity _living2 = player2;
                                _living2.setItemSlot(EquipmentSlot.LEGS, new ItemStack(AnnoyingVillagersbychentuModItems.CHUNCUIDEMOFAZUANSHI_LEGGINGS.get()));
                            }
                            if (C03251.this.val$entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor6 = C03251.this.val$entity;
                                itemStack6 = _entGetArmor6.getItemBySlot(EquipmentSlot.LEGS);
                            } else {
                                itemStack6 = ItemStack.EMPTY;
                            }
                            itemStack6.enchant(Enchantments.VANISHING_CURSE, 1);
                            if (C03251.this.val$entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor7 = C03251.this.val$entity;
                                itemStack7 = _entGetArmor7.getItemBySlot(EquipmentSlot.LEGS);
                            } else {
                                itemStack7 = ItemStack.EMPTY;
                            }
                            itemStack7.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 2);
                            if (C03251.this.val$entity instanceof LivingEntity) {
                                LivingEntity _entGetArmor8 = C03251.this.val$entity;
                                itemStack8 = _entGetArmor8.getItemBySlot(EquipmentSlot.LEGS);
                            } else {
                                itemStack8 = ItemStack.EMPTY;
                            }
                            itemStack8.enchant(Enchantments.BINDING_CURSE, 1);
                        }
                        new Object() { // from class: pugilist_steve.mod.annoying_villagersbychentu.procedures.CCDMFZSKJDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure.1.1.1.1
                            private int ticks = 0;
                            private float waitTicks;
                            private LevelAccessor world;

                            public void start(LevelAccessor world, int waitTicks) {
                                this.waitTicks = waitTicks;
                                MinecraftForge.EVENT_BUS.register(this);
                                this.world = world;
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
                                ItemStack itemStack12;
                                if (C03251.this.val$entity instanceof LivingEntity) {
                                    LivingEntity _entGetArmor9 = C03251.this.val$entity;
                                    itemStack9 = _entGetArmor9.getItemBySlot(EquipmentSlot.FEET);
                                } else {
                                    itemStack9 = ItemStack.EMPTY;
                                }
                                if (itemStack9.getItem() == Blocks.AIR.asItem()) {
                                    Player player3 = C03251.this.val$entity;
                                    if (player3 instanceof Player) {
                                        Player _player3 = player3;
                                        _player3.getInventory().armor.set(0, new ItemStack(AnnoyingVillagersbychentuModItems.CHUNCUIDEMOFAZUANSHI_BOOTS.get()));
                                        _player3.getInventory().setChanged();
                                    } else if (player3 instanceof LivingEntity) {
                                        LivingEntity _living3 = player3;
                                        _living3.setItemSlot(EquipmentSlot.FEET, new ItemStack(AnnoyingVillagersbychentuModItems.CHUNCUIDEMOFAZUANSHI_BOOTS.get()));
                                    }
                                    Level level3 = this.world;
                                    if (level3 instanceof Level) {
                                        Level _level3 = level3;
                                        if (!_level3.isClientSide()) {
                                            _level3.playSound(null, new BlockPos(C03251.this.val$x, C03251.this.val$y, C03251.this.val$z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                                        } else {
                                            _level3.playLocalSound(C03251.this.val$x, C03251.this.val$y, C03251.this.val$z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_diamond")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                                        }
                                    }
                                    if (C03251.this.val$entity instanceof LivingEntity) {
                                        LivingEntity _entGetArmor10 = C03251.this.val$entity;
                                        itemStack10 = _entGetArmor10.getItemBySlot(EquipmentSlot.FEET);
                                    } else {
                                        itemStack10 = ItemStack.EMPTY;
                                    }
                                    itemStack10.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 1);
                                    if (C03251.this.val$entity instanceof LivingEntity) {
                                        LivingEntity _entGetArmor11 = C03251.this.val$entity;
                                        itemStack11 = _entGetArmor11.getItemBySlot(EquipmentSlot.FEET);
                                    } else {
                                        itemStack11 = ItemStack.EMPTY;
                                    }
                                    itemStack11.enchant(Enchantments.VANISHING_CURSE, 1);
                                    if (C03251.this.val$entity instanceof LivingEntity) {
                                        LivingEntity _entGetArmor12 = C03251.this.val$entity;
                                        itemStack12 = _entGetArmor12.getItemBySlot(EquipmentSlot.FEET);
                                    } else {
                                        itemStack12 = ItemStack.EMPTY;
                                    }
                                    itemStack12.enchant(Enchantments.BINDING_CURSE, 1);
                                }
                                MinecraftForge.EVENT_BUS.unregister(this);
                            }
                        }.start(this.world, 2);
                        MinecraftForge.EVENT_BUS.unregister(this);
                    }
                }.start(this.world, 2);
                MinecraftForge.EVENT_BUS.unregister(this);
            }
        }
    }
}
