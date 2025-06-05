import java.util.Scanner;

public class DibujarTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibujar un triángulo con altura proporcionada ***");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el número de filas para el triángulo: ");
        int filas = entrada.nextInt();

        for (int i = 1; i <= filas; i++) {
            String espacioBlanco = " ".repeat(filas - i);
            String asterisco = "*".repeat(2 * i - 1);
            System.out.println(espacioBlanco + asterisco);
        }
    }
}
