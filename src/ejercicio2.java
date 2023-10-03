import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int[][] matriz = new int[4][5];

        System.out.println("Introduzca 20 numeros en la matriz:");
        for (int fila = 0; fila < 4; fila++) {
            System.out.println();
            for (int columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + (fila+1) + ", Columna " + (columna + 1) + ": ");
                matriz[fila][columna] = lectura.nextInt();
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
                System.out.print(" " + matriz[fila][columna] + " ");
            }
            System.out.println("│ " + sumfilas[fila]);
        }

        for (int columna = 0; columna < 5; columna++) {
            System.out.print("────");
        }

        System.out.println();
        for (int columna = 0; columna < 5; columna++) {
            System.out.print(" " + sumcolumnas[columna] + " ");
        }
        System.out.println("│ " + sumaTotal);
    }
}
