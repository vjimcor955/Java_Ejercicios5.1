import java.util.Arrays;
import java.util.Random;

public class ejercicio5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [][] numeros = new int[6][10];
        int[] numeroMaximo = {0, -1, -1};
        int[] numeroMinimo = {1001,-1,-1};
        int numeroGenerado;
        for (int posicionFila = 0; posicionFila < numeros.length; posicionFila++) {
            for (int posicionColumna = 0; posicionColumna < numeros[posicionFila].length; posicionColumna++) {
                numeroGenerado = rand.nextInt(1000);
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
        System.out.println(Arrays.deepToString(numeros));
        System.out.println("Numero maximo " + numeroMaximo[0] + " en la fila " + numeroMaximo[1] + " y columna " + numeroMaximo[2]);
        System.out.println("Numero minimo " + numeroMinimo[0] + " en la fila " + numeroMinimo[1] + " y columna " + numeroMinimo[2]);
    }
}