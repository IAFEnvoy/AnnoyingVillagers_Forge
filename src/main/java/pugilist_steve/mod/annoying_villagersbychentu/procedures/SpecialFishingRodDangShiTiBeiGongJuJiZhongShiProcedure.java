package pugilist_steve.mod.annoying_villagersbychentu.procedures;

import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.scores.Objective;
import net.minecraft.world.scores.Scoreboard;
import net.minecraft.world.scores.criteria.ObjectiveCriteria;


public class SpecialFishingRodDangShiTiBeiGongJuJiZhongShiProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return;
        }
        if (world instanceof ServerLevel _level) {
            _level.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", new TextComponent(""), _level.getServer(), null).withSuppressedOutput(), "execute at @e[type=minecraft:fishing_bobber] run scoreboard players set @e[dx=2,dy=2,dz=2] rod 1");
        }
        if (world instanceof ServerLevel _level2) {
            _level2.getServer().getCommands().performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level2, 4, "", new TextComponent(""), _level2.getServer(), null).withSuppressedOutput(), "tp @e[scores={rod=1}] @p[scores={Frod=0}]");
        }
        Scoreboard _sc = entity.getLevel().getScoreboard();
        Objective _so = _sc.getObjective("scoreboard players set @e rod ");
        if (_so == null) {
            _so = _sc.addObjective("scoreboard players set @e rod ", ObjectiveCriteria.DUMMY, new TextComponent("scoreboard players set @e rod "), ObjectiveCriteria.RenderType.INTEGER);
        }
        _sc.getOrCreatePlayerScore(entity.getScoreboardName(), _so).setScore(0);
        Scoreboard _sc2 = entity.getLevel().getScoreboard();
        Objective _so2 = _sc2.getObjective("scoreboard players set @e Frod ");
        if (_so2 == null) {
            _so2 = _sc2.addObjective("scoreboard players set @e Frod ", ObjectiveCriteria.DUMMY, new TextComponent("scoreboard players set @e Frod "), ObjectiveCriteria.RenderType.INTEGER);
        }
        _sc2.getOrCreatePlayerScore(entity.getScoreboardName(), _so2).setScore(0);
    }
}
