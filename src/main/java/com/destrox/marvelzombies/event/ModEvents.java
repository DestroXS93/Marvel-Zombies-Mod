package com.destrox.marvelzombies.util;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public final class PlayerProgress {
    private static final String TAG = "marvel_zombies_progress";

    public static void addXp(ServerPlayer player, int amount) {
        CompoundTag data = player.getPersistentData();
        CompoundTag progressData = data.getCompound(TAG);

        int level = progressData.getInt("level");
        int xp = progressData.getInt("xp");
        int next = progressData.getInt("next");

        if (level <= 0) {
            level = 1;
        }
        if (next <= 0) {
            next = 50;
        }

        xp += amount;
        while (xp >= next && level < 100) {
            xp -= next;
            level += 1;
            next = getNextLevelRequirement(level);
            player.displayClientMessage(Component.literal("§6Nivel " + level + " alcanzado. Recompensa desbloqueada."), false);
            player.displayClientMessage(Component.literal("§7" + getRewardDescription(level)), false);
        }

        if (level >= 100 && xp > 0) {
            xp = next - 1;
        }

        progressData.putInt("level", level);
        progressData.putInt("xp", xp);
        progressData.putInt("next", next);
        data.put(TAG, progressData);

        if (level >= 3 && !data.getBoolean("shadow_ability_unlocked")) {
            data.putBoolean("shadow_ability_unlocked", true);
            player.displayClientMessage(Component.literal("§eTu Ejército de Sombras ha despertado. Ya puedes invocarlo."), false);
        }
    }

    public static int getLevel(ServerPlayer player) {
        CompoundTag data = player.getPersistentData();
        CompoundTag progressData = data.getCompound(TAG);
        return Math.max(1, progressData.getInt("level"));
    }

    public static int getXp(ServerPlayer player) {
        CompoundTag data = player.getPersistentData();
        CompoundTag progressData = data.getCompound(TAG);
        return progressData.getInt("xp");
    }

    public static int getNextLevelRequirement(int level) {
        return 50 + Math.max(0, level - 1) * 25;
    }

    public static String getRewardDescription(int level) {
        return switch (level) {
            case 3 -> "Recompensa: desbloqueas el Ejército de Sombras permanente.";
            case 5 -> "Recompensa: mejoras en tus armas y se activa la habilidad de exotraje básico.";
            case 10 -> "Recompensa: desbloqueas el rifle de plasma y más daño en todas las armas.";
            case 20 -> "Recompensa: obtienes la Hoja del Vacío y el arma de nivel medio.";
            case 35 -> "Recompensa: se fortalece el Ejército de Sombras con más soldados y mejor combate.";
            case 50 -> "Recompensa: obtienes el exotraje de nivel intermedio y la mejora del combate.";
            case 75 -> "Recompensa: desbloqueas el Cañón de Rayos y el conjunto de exotrama elite.";
            case 100 -> "Recompensa final: logras el máximo poder y dominas el mundo.";
            default -> "Recompensa: mejora de estadísticas del jugador.";
        };
    }

    public static boolean isShadowUnlocked(ServerPlayer player) {
        return player.getPersistentData().getBoolean("shadow_ability_unlocked");
                || getLevel(player) >= 3;
    }

    public static void grantStarterPack(ServerPlayer player) {
        CompoundTag data = player.getPersistentData();
        if (!data.getBoolean("starter_pack_given")) {
            data.putBoolean("starter_pack_given", true);
        }
    }
}
