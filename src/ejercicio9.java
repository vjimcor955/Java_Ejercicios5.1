import java.util.Arrays;
import java.util.Random;

public class ejercicio9 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] reloj = new int[12][12];
        for (int[] fila: reloj) {
            for (int columna = 0; columna < fila.length; columna++) {
                fila[columna] = rand.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(reloj));
        int[][] relojNuevo = new int[12][12];
        for (int fila = 0; fila < reloj.length-1; fila++) {
            if (fila == 10) {
                relojNuevo[0] = reloj[fila+1];
            }
            relojNuevo[fila+1] = reloj[fila];
        }
        System.out.println(Arrays.deepToString(relojNuevo));
    }
}
