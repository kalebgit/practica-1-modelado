package org.equipo404.util;

public class TerminalUI {

    public static String createLogs(String message) {
        return """
          
          ┌───────────────────────────────┐
          │ %s │
          └───────────────────────────────┘
        """.formatted( message);    }

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
