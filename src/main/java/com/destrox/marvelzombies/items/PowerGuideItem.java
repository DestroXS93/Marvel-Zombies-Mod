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
            case 1 -> "⚡ Espada de Energía: arma inicial del protagonista y punto de partida del viaje.";
            case 2 -> "🔩 Kit tecnológico: materiales básicos para crear armas futuristas y mejoras.";
            case 3 -> "👥 Ejército de Sombras: desbloqueas tu legión permanente de sombras.";
            case 5 -> "🛡️ Exotraje básico: protección temprana y primeras mejoras de combate.";
            case 10 -> "🚀 Rifle de plasma: arma futurista de largo alcance con mayor potencia.";
            case 15 -> "🤖 Exotraje avanzado: mejora de defensa y habilidad especial mejorada.";
            case 20 -> "⚡ Hoja del Vacío: obtienes tu arma de energía avanzada y habilidad especial.";
            case 30 -> "🔥 Exotraje legendario: rebelde, poderoso y mucho más resistente.";
            case 35 -> "💀 Tropas de sombras reforzadas: tus sombras se vuelven más fuertes y más numerosas.";
            case 40 -> "💣 Arma de energía avanzada: nueva potencia elemental y mejor daño.";
            case 50 -> "👑 Exotraje intermedio / definitivo: preparas tu máxima fase de combate y defensa.";
            case 75 -> "🔫 Cañón de rayos: arma definitiva de ataque a gran escala.";
            case 100 -> "🏆 Poder máximo: has llegado al nivel final del mundo y dominas el poder de Marvel Zombies.";
            default -> "✨ Recompensa: mejora general de estadísticas y poder del jugador.";
        };
    }

    public static boolean isShadowUnlocked(ServerPlayer player) {
        return player.getPersistentData().getBoolean("shadow_ability_unlocked")
                || getLevel(player) >= 3;
    }

    public static void grantStarterPack(ServerPlayer player) {
        CompoundTag data = player.getPersistentData();
        if (!data.getBoolean("starter_pack_given")) {
            data.putBoolean("starter_pack_given", true);
        }
    }
}
