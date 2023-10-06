import java.util.Random;

public class ejercicio4 {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int[][] matriz = new int[4][5];

        System.out.println("Introduciendo 20 numeros en la matriz:");
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                matriz[fila][columna] = rand.nextInt(899)+100;
            }
        }

        int[] sumfilas = new int[4];
        int[] sumcolumnas = new int[5];
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                sumfilas[fila] += matriz[fila][columna];
                sumcolumnas[columna] += matriz[fila][columna];
            }
        }

        int sumaTotal = 0;
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                sumaTotal += matriz[fila][columna];
            }
        }

        System.out.println();
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 5; columna++) {
            System.out.print("  " + matriz[fila][columna] + "  ");
            }
            Thread.sleep(1000);
            System.out.println("│ " + sumfilas[fila]);
            Thread.sleep(250);
        }

        for (int columna = 0; columna < 5; columna++) {
            System.out.print("─────────");
        }

        System.out.println();
        for (int columna = 0; columna < 5; columna++) {
            System.out.print("  " + sumcolumnas[columna] + " ");
        }
        Thread.sleep(1000);
        System.out.println("│ " + sumaTotal);
        Thread.sleep(250);
    }
}
