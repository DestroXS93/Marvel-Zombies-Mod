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
        while (xp >= next) {
            xp -= next;
            level += 1;
            next = 50 + (level - 1) * 25;
        }

        progressData.putInt("level", level);
        progressData.putInt("xp", xp);
        progressData.putInt("next", next);
        data.put(TAG, progressData);

        if (level >= 3) {
            player.displayClientMessage(Component.literal("§6Ejército de sombras desbloqueado: nivel 3 alcanzado."), false);
        }
    }

    public static int getLevel(ServerPlayer player) {
        CompoundTag data = player.getPersistentData();
        CompoundTag progressData = data.getCompound(TAG);
        return Math.max(1, progressData.getInt("level"));
    }

    public static void grantStarterPack(ServerPlayer player) {
        CompoundTag data = player.getPersistentData();
        if (!data.getBoolean("starter_pack_given")) {
            data.putBoolean("starter_pack_given", true);
        }
    }
}
