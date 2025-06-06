import java.util.Scanner;

public class MatrizPorConsola {
    public static void main(String[] args) {
        System.out.println("*** Matrices ***");
        Scanner entrada = new Scanner(System.in);

        System.out.print("Cuántas filas: ");
        int filas = entrada.nextInt();
        System.out.print("Cuántas columnas: ");
        int columnas = entrada.nextInt();

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Introduce el valor para la posición [" + i + "][" + j + "]: ");
                int num = entrada.nextInt();
                matriz[i][j] = num;
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("[" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}
