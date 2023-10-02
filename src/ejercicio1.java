import java.util.Arrays;

public class ejercicio1 {
    public static void main(String[] args) {
        int[][] numeros = new int[3][6];
        numeros[0][0] = 0;
        numeros[0][1] = 30;
        numeros[0][2] = 2;
        numeros[0][5] = 5;
        numeros[1][0] = 75;
        numeros[1][4] = 0;
        numeros[2][2] = -2;
        numeros[2][3] = 9;
        numeros[2][5] = 11;
        System.out.println(Arrays.toString(numeros[0]) + "\n" + Arrays.toString(numeros[1]) + "\n" +  Arrays.toString(numeros[2]));
    }
}