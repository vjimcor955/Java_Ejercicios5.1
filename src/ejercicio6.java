import java.util.Random;

public class ejercicio6 {
    public static boolean contieneNumero(int numero, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int [][] numeros = new int[6][10];
        int [] numeroMaximo = {0, -1, -1};
        int [] numeroMinimo = {1001,-1,-1};
        int [] numerosIntroducidos = new int [60];
        int numeroGenerado;
        int cont = 0;

        for (int posicionFila = 0; posicionFila < numeros.length; posicionFila++) {
            for (int posicionColumna = 0; posicionColumna < numeros[posicionFila].length; posicionColumna++) {
                do {
                    numeroGenerado = rand.nextInt(1000);
                } while (contieneNumero(numeroGenerado, numerosIntroducidos));

                numerosIntroducidos[cont] = numeroGenerado;
                cont++;

                numeros[posicionFila][posicionColumna] = numeroGenerado;
                if (numeroGenerado > numeroMaximo[0]) {
                    numeroMaximo[0] = numeroGenerado;
                    numeroMaximo[1] = posicionFila;
                    numeroMaximo[2] = posicionColumna;
                }
                else if (numeroGenerado < numeroMinimo[0]) {
                    numeroMinimo[0] = numeroGenerado;
                    numeroMinimo[1] = posicionFila;
                    numeroMinimo[2] = posicionColumna;
                }
            }
        }

        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(numeros[fila][columna] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nNumero maximo " + numeroMaximo[0] + " en la fila " + numeroMaximo[1] + " y columna " + numeroMaximo[2]);
        System.out.println("Numero minimo " + numeroMinimo[0] + " en la fila " + numeroMinimo[1] + " y columna " + numeroMinimo[2]);
    }
}