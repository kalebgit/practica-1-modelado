package org.equipo404.util;
/**
 * Clase utilitaria que contiene métodos para generar arte en consola, como logs y banners en píxel.
 * Estos métodos están diseñados para facilitar la presentación de mensajes o títulos de una manera visualmente atractiva en la terminal.
 * 
 * @author Emiliano Kaleb Jimenez Rivera, Bedoya Tellez Ariadna Valeria, Sanchez Soto Saul
 * @version 1.0
 */

public class TerminalUI {
     /**
     * Genera un formato de log visualmente estructurado en consola.
     * El mensaje se muestra dentro de un marco de caja.
     * 
     * @param message El mensaje que se desea mostrar en el log.
     * @return Un string que representa el log con el mensaje formateado dentro de un cuadro.
     */

    public static String createLogs(String message) {
        return """
          
          ┌───────────────────────────────┐
          │ %s │
          └───────────────────────────────┘
        """.formatted( message);    }
    /**
     * Genera un banner en píxel visual para mostrar un título en consola.
     * El banner incluye un arte previo a mostrar el título que lo rodea con un marco.
     * 
     * @param title El título que se mostrará en el banner.
     * @return Un string que representa un banner con un arte y el título formateado.
     */

    public static String createPixelArtBanner(String title) {
        return """
          ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
          ⠀⠀⠀⠀⢀⣀⣀⣀⣀⡀⠀⠀⠀⠀⠀⠀
          ⠀⠀⣠⡾⠛⠉⠉⠉⠙⠻⢦⡀⠀⠀⠀⠀
          ⠀⣾⠁⣠⡶⢶⡄⠀⢠⡶⣄⢹⡄⠀⠀⠀
          ⢸⡇⠀⠻⠿⠟⠀⠠⠘⠿⠟⠀⡇⠀⠀⠀
          ⠸⣧⡀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡇⠀⠀⠀
          ⠀⠈⠙⠒⠒⠒⠒⠒⠒⠒⠊⠁⠀⠀⠀⠀
          
          ███████████████████████████████████
          █ %s █
          ███████████████████████████████████
        """.formatted(title);    }
}
