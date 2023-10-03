import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Introduzca la posición del alfil (Ejemplo d5): ");
        String posicion = lectura.nextLine();

        if (posicion.length() != 2) {
            System.out.println("Posicion incorrecta.");
            System.out.println("El formato debe ser una letra (a-h) y un numero (1-8) en ese orden. (Ejemplo: d5)");
        } else {
            char columna = posicion.charAt(0);
            char fila = posicion.charAt(1);

            if (columna < 'a' || columna > 'h' || fila < '1' || fila > '8') {
                System.out.println("Esa posicion no existe.");
                System.out.println("El formato debe ser una letra (a-h) y un numero (1-8) en ese orden. (Ejemplo: d5)");
            } else {
                System.out.println("El alfil puede moverse a las siguientes posiciones: ");
                for (int i = 1; i <= 8; i++) {
                    char columnaMenos = (char) (columna - i);
                    char filaMenos = (char) (fila - i);
                    char columnaMas = (char) (columna + i);
                    char filaMas = (char) (fila + i);

                    if (columnaMas <= 'h' && filaMas <= '8') {
                        System.out.print(columnaMas + "" + filaMas + " ");
                    }
                    if (columnaMas <= 'h' && filaMenos >= '1') {
                        System.out.print(columnaMas + "" + filaMenos + " ");
                    }
                    if (columnaMenos >= 'a' && filaMenos >= '1') {
                        System.out.print(columnaMenos + "" + filaMenos + " ");
                    }
                    if (columnaMenos >= 'a' && filaMas <= '8') {
                        System.out.print(columnaMenos + "" + filaMas + " ");
                    }
                }
            }
        }
    }
}

