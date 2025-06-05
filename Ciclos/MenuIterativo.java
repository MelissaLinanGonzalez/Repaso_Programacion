import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        while (opcion < 3){
            System.out.println(" ");
            System.out.println("*** Sistema de Administración de Cuentas ***");
            System.out.printf("""
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    """);
            System.out.println(" ");
            System.out.print("Elija una opción: ");

            opcion = entrada.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Creando cuenta ...");
                case 2 -> System.out.println("Eliminando cuenta ...");
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida");
            }
        }
    }
}
