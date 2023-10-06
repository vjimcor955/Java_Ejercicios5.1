import java.util.Scanner;

public class ejercicio7 {
/*COMO EL EJERCICIO HABLA DE UN JUEGO LLAMADO "BUSCA EL TESORO", HE BUSCADO EL CODIGO YA HECHO DEL JUEGO
PARA APLICAR LA MEJORA DEL ENUNCIADO

LA PARTE DEL EJERCICIO EMPIEZA EN LA LINEA 85

*/
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // se definen constantes para representar el
        // contenido de las celdas
        final int VACIO = 0;
        final int MINA = 1;
        final int TESORO = 2;
        final int INTENTO = 3;


        int x;
        int y;
        int[][] cuadrante = new int[5][4];

        // inicializa el array
        for(x = 0; x < 4; x++) {
            for(y = 0; y < 3; y++) {
                cuadrante[x][y] = VACIO;
            }
        }
        // coloca la mina
        int minaX = (int)(Math.random() * 5);
        int minaY = (int)(Math.random() * 4);
        cuadrante[minaX][minaY] = MINA;

        // coloca el tesoro
        int tesoroX;
        int tesoroY;
        do {
            tesoroX = (int)(Math.random() * 5);
            tesoroY = (int)(Math.random() * 4);
        } while ((minaX == tesoroX) && (minaY == tesoroY));
        cuadrante[tesoroX][tesoroY] = TESORO;

        // juego
        System.out.println("¡BUSCA EL TESORO!");
        boolean salir = false;
        String c = "";
        do {
            // pinta el cuadrante
            for(y = 3; y >= 0; y--) {
                System.out.print(y + "|");
                for(x = 0; x < 5; x++) {
                    if (cuadrante[x][y] == INTENTO) {
                        System.out.print("X ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            System.out.println("  ----------\n  0 1 2 3 4\n");

            // pide las coordenadas
            System.out.print("Coordenada x: ");
            x = Integer.parseInt(userInput.nextLine());
            System.out.print("Coordenada y: ");
            y = Integer.parseInt(userInput.nextLine());

            // mira lo que hay en las coordenadas indicadas por el usuario
            switch(cuadrante[x][y]) {
                case VACIO:
                    cuadrante[x][y] = INTENTO;
                    break;
                case MINA:
                    System.out.println("Lo siento, has perdido.");
                    salir = true;
                    break;
                case TESORO:
                    System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                    salir = true;
                    break;
                default:
            }
            //PARTE DEL EJERCICIO: COMPROBAR SI HAY UNA MINA CERCA
            if ((x < 4 && x > 0) && (y > 0 && y < 3)) {
                if (cuadrante[x-1][y] == MINA || cuadrante[x-1][y-1] == MINA || cuadrante[x][y-1] == MINA || cuadrante[x-1][y+1] == MINA || cuadrante[x+1][y+1] == MINA || cuadrante[x][y+1] == MINA || cuadrante[x+1][y-1] == MINA || cuadrante[x+1][y] == MINA) {
                    System.out.println("Cuidado! Hay una mina cerca");
                }
            }
            else if (x == 0 && y == 0) {
                if (cuadrante[x+1][y+1] == MINA || cuadrante[x][y+1] == MINA || cuadrante[x+1][y] == MINA) {
                    System.out.println("Cuidado! Hay una mina cerca");
                }
            }
            else if (x == 4 && y == 0) {
                if (cuadrante[x-1][y] == MINA || cuadrante[x-1][y+1] == MINA || cuadrante[x][y+1] == MINA) {
                    System.out.println("Cuidado! Hay una mina cerca");
                }
            }
            else if (x == 0 && y == 3) {
                if (cuadrante[x][y-1] == MINA || cuadrante[x+1][y-1] == MINA || cuadrante[x+1][y] == MINA) {
                    System.out.println("Cuidado! Hay una mina cerca");
                }
            }
            else if (x == 4 && y == 3) {
                if (cuadrante[x][y-1] == MINA || cuadrante[x-1][y] == MINA || cuadrante[x-1][y-1] == MINA) {
                    System.out.println("Cuidado! Hay una mina cerca");
                }
            }
            else if (x == 0 && (y > 0 && y < 3)) {
                if (cuadrante[x][y-1] == MINA || cuadrante[x+1][y+1] == MINA || cuadrante[x][y+1] == MINA || cuadrante[x+1][y-1] == MINA || cuadrante[x+1][y] == MINA) {
                    System.out.println("Cuidado! Hay una mina cerca");
                }
            }
            else if (x == 4 && (y > 0 && y < 3)) {
                if (cuadrante[x][y-1] == MINA || cuadrante[x-1][y+1] == MINA || cuadrante[x][y+1] == MINA || cuadrante[x-1][y-1] == MINA || cuadrante[x-1][y] == MINA) {
                    System.out.println("Cuidado! Hay una mina cerca");
                }
            }
            else if ((x < 4 && x > 0) && y == 0) {
                if (cuadrante[x-1][y] == MINA || cuadrante[x-1][y+1] == MINA || cuadrante[x+1][y+1] == MINA || cuadrante[x][y+1] == MINA || cuadrante[x+1][y] == MINA) {
                    System.out.println("Cuidado! Hay una mina cerca");
                }
            }
            else if ((x < 4 && x > 0) && y == 4) {
                if (cuadrante[x-1][y] == MINA || cuadrante[x-1][y-1] == MINA || cuadrante[x+1][y-1] == MINA || cuadrante[x][y-1] == MINA || cuadrante[x+1][y] == MINA) {
                    System.out.println("Cuidado! Hay una mina cerca");
                }
            }

        } while (!salir);

        // pinta el cuadrante
        for(y = 3; y >= 0; y--) {
            System.out.print(y + " ");
            for(x = 0; x < 5; x++) {
                switch(cuadrante[x][y]) {
                    case VACIO:
                        c = "  ";
                        break;
                    case MINA:
                        c = "* ";
                        break;
                    case TESORO:
                        c = "€ ";
                        break;
                    case INTENTO:
                        c = "X ";
                        break;
                    default:
                }
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("  ----------\n  0 1 2 3 4\n");
    }
}
