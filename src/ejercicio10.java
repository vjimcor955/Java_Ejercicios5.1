import java.util.Scanner;

public class ejercicio10 {
    public static void imprimirTablero(char[][] tablero) {
        System.out.println();

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(tablero[fila][columna]);
                if (columna < 2) {
                    System.out.print("  │  ");
                }
            }
            System.out.println();
            if (fila < 2) {
                System.out.println("─────────────");
            }
        }
        System.out.println();
    }
    public static boolean ganador(char jugador, char[][] tablero) {
        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] == jugador && tablero[fila][1] == jugador && tablero[fila][2] == jugador) {
                return true;
            }
        }
        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] == jugador && tablero[1][columna] == jugador && tablero[2][columna] == jugador) {
                return true;
            }
        }
        if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
            return true;
        }
        if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        char[][] tablero = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char ficha = 'X';
        boolean partida = true;
        int fichasTablero = 0;

        while (partida && fichasTablero < 9) {
            imprimirTablero(tablero);

            int fila;
            int columna;
            do {
                System.out.print("Jugador con las fichas " + ficha + " introduzca donde quiere colocar la ficha:\n- Fila (1-3): ");
                fila = lectura.nextInt() - 1;
                System.out.print("- Columna (1-3): ");
                columna = lectura.nextInt() - 1;
            } while (fila < 0 || fila > 2 || columna < 0 || columna > 2 || tablero[fila][columna] != ' ');
            tablero[fila][columna] = ficha;
            fichasTablero++;

            if (ganador(ficha, tablero)) {
                imprimirTablero(tablero);
                System.out.println("- Ganador: " + ficha);
                partida = false;
            } else {
                ficha = (ficha == 'X') ? 'O' : 'X';
            }
        }

        if (fichasTablero == 9) {
            imprimirTablero(tablero);
            System.out.println("- Empate");
        }
    }
}

