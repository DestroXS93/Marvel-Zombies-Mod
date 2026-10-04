package com.destrox.marvelzombies.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class PowerGuideItem extends Item {
    public PowerGuideItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide) {
            player.sendSystemMessage(Component.literal("§6Guía de Poderes - Marvel Zombies"));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Sistema de nivelación: derrota monstruos y jefes para ganar experiencia."));
            player.sendSystemMessage(Component.literal("§7Cada nivel desbloquea mejoras, armas, materiales y habilidades especiales."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 1-3: arma inicial + guía de inicio."));
            player.sendSystemMessage(Component.literal("§7- Nivel 1: Espada de Energía."));
            player.sendSystemMessage(Component.literal("§7- Nivel 2: Kit tecnológico para fabricar armas y mejora de combate."));
            player.sendSystemMessage(Component.literal("§7- Nivel 3: Ejército de Sombras. Tu legión permanente despierta."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 5: Exotraje básico."));
            player.sendSystemMessage(Component.literal("§7- Primer exotraje desbloqueado."));
            player.sendSystemMessage(Component.literal("§7- Mejora defensa, resistencia y capacidad de combate."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 10: Rifle de plasma."));
            player.sendSystemMessage(Component.literal("§7- Arma futurista de largo alcance."));
            player.sendSystemMessage(Component.literal("§7- Excelente para enfrentamientos a distancia y jefes."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 15: Exotraje avanzado."));
            player.sendSystemMessage(Component.literal("§7- Mayor defensa y mejora de habilidades."));
            player.sendSystemMessage(Component.literal("§7- El usuario gana un mejor control del combate."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 20: Hoja del Vacío."));
            player.sendSystemMessage(Component.literal("§7- Arma de energía con gran poder de ataque."));
            player.sendSystemMessage(Component.literal("§7- Ideal para mezclar fuerza física y power energy."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 30: Exotraje legendario."));
            player.sendSystemMessage(Component.literal("§7- Defensa y resistencia extremas."));
            player.sendSystemMessage(Component.literal("§7- El cuerpo del usuario se vuelve mucho más fuerte."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 35: Tropas de sombras reforzadas."));
            player.sendSystemMessage(Component.literal("§7- Tus sombras son más rápidas, más fuertes y más numerosas."));
            player.sendSystemMessage(Component.literal("§7- El ejército ya no es solo apoyo; se vuelve arma de guerra."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 40: Arma de energía avanzada."));
            player.sendSystemMessage(Component.literal("§7- Daño elemental mucho más alto."));
            player.sendSystemMessage(Component.literal("§7- Capaz de derribar enemigos pesados con rapidez."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 50: Exotraje intermedio / definitivo."));
            player.sendSystemMessage(Component.literal("§7- La armadura definitiva del protagonista."));
            player.sendSystemMessage(Component.literal("§7- Mucha más defensa, velocidad y poder de ataque."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 75: Cañón de rayos."));
            player.sendSystemMessage(Component.literal("§7- Arma de gran alcance y devastación."));
            player.sendSystemMessage(Component.literal("§7- Se equipa como arma final de apoyo ofensivo."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Nivel 100: Poder máximo / final."));
            player.sendSystemMessage(Component.literal("§7- El jugador alcanza el máximo poder del mod."));
            player.sendSystemMessage(Component.literal("§7- El mundo queda bajo tu dominio y el Ejército de Sombras es imparable."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Materiales del mundo:"));
            player.sendSystemMessage(Component.literal("§7- Mineral de neón para armas futuristas."));
            player.sendSystemMessage(Component.literal("§7- Núcleo de sombra para exotrajes y poder oscuro."));
            player.sendSystemMessage(Component.literal("§7- Circuito del vacío para armas avanzadas y mejoras."));
            player.sendSystemMessage(Component.literal("§7- Kit tecnológico para crear y mejorar equipamiento."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
            player.sendSystemMessage(Component.literal("§7Instrucciones de uso:"));
            player.sendSystemMessage(Component.literal("§7- Usa la Espada de Energía al comenzar tu viaje."));
            player.sendSystemMessage(Component.literal("§7- El Tótem de Sombras invoca a tus sombras; úsalo otra vez para desecharlos."));
            player.sendSystemMessage(Component.literal("§7- Craftea armas y exotrajes con los materiales del mundo."));
            player.sendSystemMessage(Component.literal("§7- No te saltes la progresión: cada nivel te prepara para el siguiente desafío."));
            player.sendSystemMessage(Component.literal("§7=================================================="));
        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }
}
