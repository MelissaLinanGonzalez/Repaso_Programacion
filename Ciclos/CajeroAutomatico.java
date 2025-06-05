import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        double saldo = 10000;

        while (opcion < 4){
            System.out.println(" ");
            System.out.println("*** Aplicación de Cajero Automático ***");
            System.out.printf("""
                    Operaciones que puedes realizar:
                    \t1. Consultar saldo
                    \t2. Retirar dinero
                    \t3. Depositar dinero
                    \t4. Salir
                    """);
            System.out.print("Elija una opción: ");

            opcion = entrada.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Su saldo es de : " + saldo + "€");
                case 2 -> {
                    System.out.print("Introduzca la cantidad de dinero que desea retirar: ");
                    double cantidad = entrada.nextDouble();
                    if (cantidad > saldo) {
                        System.out.println("No se puede retirar " + cantidad + ", fondos insuficientes");
                    } else if (cantidad < saldo) {
                        saldo -= cantidad;
                        System.out.println("Ha retirado " + cantidad + "€. Saldo actual: " + saldo + "€");
                    }
                }
                case 3 -> {
                    System.out.print("Introduzca la cantidad que desea ingresar: ");
                    double cantidad = entrada.nextDouble();
                    saldo += cantidad;
                    System.out.println("Ha ingresado: " + cantidad + "€. Saldo actual: " + saldo + "€");
                }
                case 4 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida");
            }
        }
    }
}
