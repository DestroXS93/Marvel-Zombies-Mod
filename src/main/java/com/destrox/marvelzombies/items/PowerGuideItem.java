package com.destrox.marvelzombies.items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

/**
 * PowerGuideItem - Guía de Poderes de Marvel Zombies
 * Libro interactivo con toda la información del mod en español.
 * Contiene: progresión 1-100, armas, exotrajes, materiales, sombras y recompensas.
 */
public class PowerGuideItem extends Item {
    public PowerGuideItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide) {
            mostrarGuia(player);
        }

        return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
    }

    /**
     * Muestra la guía completa de Marvel Zombies en el jugador.
     */
    private void mostrarGuia(Player player) {
        player.sendSystemMessage(Component.literal("§6========== GUÍA DE PODERES - MARVEL ZOMBIES =========="));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6Bienvenido al mundo de Marvel Zombies"));
        player.sendSystemMessage(Component.literal("§7Tu viaje comienza con la Espada de Energía y la guía del poder."));
        player.sendSystemMessage(Component.literal("§7Derrota monstruos y jefes para ganar experiencia y desbloquear poder."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6========== SISTEMA DE NIVELACIÓN =========="));
        player.sendSystemMessage(Component.literal("§7Niveles: 1 al 100"));
        player.sendSystemMessage(Component.literal("§7- Derrota monstruos y jefes para ganar XP."));
        player.sendSystemMessage(Component.literal("§7- Cada nivel desbloquea armas, mejoras, exotrajes y habilidades."));
        player.sendSystemMessage(Component.literal("§7- La progresión es continua y sin saltos obligatorios."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6========== PROGRESIÓN PRINCIPAL (1-100) =========="));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 1-3: ARMA INICIAL + GUÍA"));
        player.sendSystemMessage(Component.literal("§7Nivel 1: Espada de Energía"));
        player.sendSystemMessage(Component.literal("§7  - Tu arma inicial del protagonista."));
        player.sendSystemMessage(Component.literal("§7  - Daño: 7 | Velocidad: 1.6 | Efecto: encendimiento pasivo."));
        player.sendSystemMessage(Component.literal("§7Nivel 2: Kit tecnológico"));
        player.sendSystemMessage(Component.literal("§7  - Materiales base para fabricar armas y mejoras iniciales."));
        player.sendSystemMessage(Component.literal("§7Nivel 3: Ejército de Sombras"));
        player.sendSystemMessage(Component.literal("§7  - Desbloqueas tu legión permanente de guerreros oscuros."));
        player.sendSystemMessage(Component.literal("§7  - Invoca: 3 sombras base | Salud: 24 HP | Daño: 6."));
        player.sendSystemMessage(Component.literal("§7  - Usa el Tótem de Sombras para convocar o descartar."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 5: EXOTRAJE BÁSICO"));
        player.sendSystemMessage(Component.literal("§7Mejora defensa, resistencia y movilidad inicial."));
        player.sendSystemMessage(Component.literal("§7  - Defensa: +2 | Toughness: 1.0 | Knockback Resistance: 5%."));
        player.sendSystemMessage(Component.literal("§7  - Habilidad especial: salto potenciado (+0.5 altura)."));
        player.sendSystemMessage(Component.literal("§7  - Receta: 4x Mineral de Neón + 2x Núcleo de Sombra."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 10: RIFLE DE PLASMA"));
        player.sendSystemMessage(Component.literal("§7Arma futurista potente para enfrentamientos a distancia."));
        player.sendSystemMessage(Component.literal("§7  - Daño: 9 | Velocidad: 0.9 | Efecto: encendimiento 2s."));
        player.sendSystemMessage(Component.literal("§7  - Receta: 3x Mineral de Neón + 2x Núcleo de Sombra + 1x Circuito del Vacío."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 15: EXOTRAJE AVANZADO"));
        player.sendSystemMessage(Component.literal("§7Mejora significativa de defensa y capacidad de combate."));
        player.sendSystemMessage(Component.literal("§7  - Defensa: +3 | Toughness: 2.0 | Knockback Resistance: 8%."));
        player.sendSystemMessage(Component.literal("§7  - Habilidad especial: resistencia al daño +15%."));
        player.sendSystemMessage(Component.literal("§7  - Receta: 6x Mineral de Neón + 3x Núcleo de Sombra + 2x Circuito del Vacío."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 20: HOJA DEL VACÍO"));
        player.sendSystemMessage(Component.literal("§7Arma de energía con gran poder de ataque melee."));
        player.sendSystemMessage(Component.literal("§7  - Daño: 12 | Velocidad: 0.8 | Efecto: debilitamiento de enemigos 1s."));
        player.sendSystemMessage(Component.literal("§7  - Receta: 4x Núcleo de Sombra + 2x Circuito del Vacío + 1x Espada de Energía."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 30: EXOTRAJE LEGENDARIO"));
        player.sendSystemMessage(Component.literal("§7Defensa y resistencia extremas de batalla legendaria."));
        player.sendSystemMessage(Component.literal("§7  - Defensa: +4 | Toughness: 3.0 | Knockback Resistance: 10%."));
        player.sendSystemMessage(Component.literal("§7  - Habilidad especial: regeneración pasiva (1 corazón cada 5s)."));
        player.sendSystemMessage(Component.literal("§7  - Receta: 7x Mineral de Neón + 4x Núcleo de Sombra + 3x Circuito del Vacío."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 35: TROPAS DE SOMBRAS REFORZADAS"));
        player.sendSystemMessage(Component.literal("§7Tus sombras se vuelven más fuertes, rápidas y numerosas."));
        player.sendSystemMessage(Component.literal("§7  - Invoca: 8 sombras reforzadas | Salud: 30 HP | Daño: 8."));
        player.sendSystemMessage(Component.literal("§7  - El ejército se convierte en arma de guerra, no solo apoyo."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 40: ARMA DE ENERGÍA AVANZADA"));
        player.sendSystemMessage(Component.literal("§7Arma elemental con daño avanzado y efectos combinados."));
        player.sendSystemMessage(Component.literal("§7  - Daño: 14 | Velocidad: 0.75 | Efecto: quema + debilitamiento 2s."));
        player.sendSystemMessage(Component.literal("§7  - Receta: 5x Mineral de Neón + 3x Circuito del Vacío + 2x Esencia del Vacío."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 50: EXOTRAJE INTERMEDIO / DEFINITIVO"));
        player.sendSystemMessage(Component.literal("§7La armadura definitiva del protagonista con máximo poder."));
        player.sendSystemMessage(Component.literal("§7  - Defensa: +5 | Toughness: 4.0 | Knockback Resistance: 15%."));
        player.sendSystemMessage(Component.literal("§7  - Habilidad especial: velocidad +20%, velocidad de ataque +25%."));
        player.sendSystemMessage(Component.literal("§7  - Receta: 8x Mineral de Neón + 5x Núcleo de Sombra + 4x Circuito del Vacío + 2x Esencia del Vacío."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 75: CAÑÓN DE RAYOS"));
        player.sendSystemMessage(Component.literal("§7Arma definitiva de ataque a gran escala y devastación."));
        player.sendSystemMessage(Component.literal("§7  - Daño: 16 | Velocidad: 0.7 | Efecto: rayo + knockback aumentado 3s."));
        player.sendSystemMessage(Component.literal("§7  - Receta: 5x Mineral de Neón + 3x Circuito del Vacío + 2x Esencia del Vacío."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6NIVEL 100: PODER MÁXIMO / FINAL"));
        player.sendSystemMessage(Component.literal("§7El jugador alcanza el máximo poder del mundo de Marvel Zombies."));
        player.sendSystemMessage(Component.literal("§7  - Todas las armas y habilidades desbloqueadas completamente."));
        player.sendSystemMessage(Component.literal("§7  - Sombras máximas: 15 unidades | Salud: 50 HP | Daño: 10."));
        player.sendSystemMessage(Component.literal("§7  - El mundo queda bajo tu dominio. Eres prácticamente invencible."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6========== MATERIALES DEL MUNDO =========="));
        player.sendSystemMessage(Component.literal("§7Recolecta estos materiales para fabricar armas y exotrajes:"));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6Mineral de Neón"));
        player.sendSystemMessage(Component.literal("§7  - Base principal de todas las armas futuristas."));
        player.sendSystemMessage(Component.literal("§7  - Encontrado en el mundo en vetas de mineral."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6Núcleo de Sombra"));
        player.sendSystemMessage(Component.literal("§7  - Material oscuro para exotrajes y poder de sombra."));
        player.sendSystemMessage(Component.literal("§7  - Encontrado en cuevas oscuras y estructuras del Nether."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6Circuito del Vacío"));
        player.sendSystemMessage(Component.literal("§7  - Tecnología avanzada para armas legendarias."));
        player.sendSystemMessage(Component.literal("§7  - Encontrado en estructuras futuristas y el End."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6Kit Tecnológico"));
        player.sendSystemMessage(Component.literal("§7  - Recursos iniciales para fabricación básica."));
        player.sendSystemMessage(Component.literal("§7  - Obtenido como recompensa del nivel 2."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6Esencia del Vacío"));
        player.sendSystemMessage(Component.literal("§7  - Recurso raro y poderoso para armas finales."));
        player.sendSystemMessage(Component.literal("§7  - Encontrado raramente en ruinas antiguas y el End."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6========== EJÉRCITO DE SOMBRAS =========="));
        player.sendSystemMessage(Component.literal("§7Cómo funciona tu legión permanente de guerreros oscuros:"));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§7Nivel 3: desbloquea la habilidad."));
        player.sendSystemMessage(Component.literal("§7  - Invoca: 3 sombras | Salud: 24 HP | Daño: 6."));
        player.sendSystemMessage(Component.literal("§7Nivel 35: mejora permanente."));
        player.sendSystemMessage(Component.literal("§7  - Invoca: 8 sombras | Salud: 30 HP | Daño: 8."));
        player.sendSystemMessage(Component.literal("§7Nivel 100: poder máximo."));
        player.sendSystemMessage(Component.literal("§7  - Invoca: 15 sombras | Salud: 50 HP | Daño: 10."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§7Uso del Tótem de Sombras:"));
        player.sendSystemMessage(Component.literal("§7  - Primer uso: invoca a tus sombras."));
        player.sendSystemMessage(Component.literal("§7  - Segundo uso: desecha a tus sombras (sin destruirlas)."));
        player.sendSystemMessage(Component.literal("§7  - Las sombras son permanentes y obedecen al dueño."));
        player.sendSystemMessage(Component.literal("§7  - Cooldown: 200 ticks (10 segundos) entre usos."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6========== INSTRUCCIONES DE USO =========="));
        player.sendSystemMessage(Component.literal("§7Paso a paso para jugar correctamente:"));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§71. Inicio: recibirás Espada de Energía, Guía de Poderes y Tótem de Sombras."));
        player.sendSystemMessage(Component.literal("§72. Derrota monstruos y jefes para ganar experiencia."));
        player.sendSystemMessage(Component.literal("§73. Recolecta materiales del mundo (Neón, Sombra, Vacío)."));
        player.sendSystemMessage(Component.literal("§74. Craftea armas y exotrajes con mesa de trabajo."));
        player.sendSystemMessage(Component.literal("§75. Al nivel 3, usa el Tótem para invocar sombras."));
        player.sendSystemMessage(Component.literal("§76. Equípate con exotrajes para mejor defensa."));
        player.sendSystemMessage(Component.literal("§77. Sube de nivel y desbloquea nuevas armas."));
        player.sendSystemMessage(Component.literal("§78. No saltees progresión: cada nivel prepara el siguiente desafío."));
        player.sendSystemMessage(Component.literal("§79. Llega al nivel 100 y domina el mundo."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6========== OBJETIVO FINAL =========="));
        player.sendSystemMessage(Component.literal("§7Tu misión en Marvel Zombies:"));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§7  ✦ Alcanza el nivel 100."));
        player.sendSystemMessage(Component.literal("§7  ✦ Domina el Ejército de Sombras."));
        player.sendSystemMessage(Component.literal("§7  ✦ Crea todas las armas futuristas."));
        player.sendSystemMessage(Component.literal("§7  ✦ Desbloquea todos los exotrajes."));
        player.sendSystemMessage(Component.literal("§7  ✦ Supera todos los desafíos del mundo."));
        player.sendSystemMessage(Component.literal("§7  ✦ Conviértete en el héroe supremo de Marvel Zombies."));
        player.sendSystemMessage(Component.literal("§7"));
        player.sendSystemMessage(Component.literal("§6========== FIN DE LA GUÍA =========="));
        player.sendSystemMessage(Component.literal("§7¡Que tu viaje sea legendario, héroe!"));
    }
}
