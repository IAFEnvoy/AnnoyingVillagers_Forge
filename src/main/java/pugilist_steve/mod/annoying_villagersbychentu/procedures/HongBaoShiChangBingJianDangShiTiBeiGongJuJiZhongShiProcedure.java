package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.world.entity.Entity;


public class HongBaoShiChangBingJianDangShiTiBeiGongJuJiZhongShiProcedure {
    public static void execute(Entity entity) {
        if (entity == null) {
            return;
        }
        entity.setSecondsOnFire(15);
    }
}
