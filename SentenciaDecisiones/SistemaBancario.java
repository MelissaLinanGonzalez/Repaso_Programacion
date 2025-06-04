import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos al Sistema Bancario ***");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Deseas salir del sistema? (true/false): ");
        boolean salir = entrada.nextBoolean();

        // Verificamos (aplicando lógica inversa)
        if (!salir) {
            System.out.println("Continuamos dentro del sistema ....");
        } else {
            System.out.println("Saliendo del sistema ...");
        }
    }
}
