import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        double a = 0;
        double b = 0;

        while (opcion < 5){
            System.out.println(" ");
            System.out.println("*** Calculadora en Java ***");
            System.out.printf("""
                    Operaciones que puedes realizar:
                    \t1. Suma
                    \t2. Resta
                    \t3. Multiplicación
                    \t4. División
                    \t5. Salir
                    """);
            System.out.print("Elija una opción: ");

            opcion = entrada.nextInt();

            switch (opcion){
                case 1 -> {
                    System.out.print("Introduce el primer valor: ");
                    a = entrada.nextInt();
                    System.out.print("Introduce el segundo valor: ");
                    b = entrada.nextInt();
                    System.out.println("Resultado de la suma: " + (a+  b));
                }
                case 2 -> {
                    System.out.print("Introduce el primer valor: ");
                    a = entrada.nextInt();
                    System.out.print("Introduce el segundo valor: ");
                    b = entrada.nextInt();
                    System.out.println("Resultado de la resta: " + (a - b));
                }
                case 3 -> {
                    System.out.print("Introduce el primer valor: ");
                    a = entrada.nextInt();
                    System.out.print("Introduce el segundo valor: ");
                    b = entrada.nextInt();
                    System.out.println("Resultado de la multiplicación: " + (a * b));
                }
                case 4 -> {
                    System.out.print("Introduce el primer valor: ");
                    a = entrada.nextInt();
                    System.out.print("Introduce el segundo valor: ");
                    b = entrada.nextInt();
                    if (b == 0){
                        System.out.println("Error: no se puede dividir entre 0!!!!");
                    } else {
                        System.out.println("Resultado de la división: " + (a / b));
                    }
                }
                case 5 -> System.out.println("Saliendo del programa ...");
                default -> System.out.println("Opción no válida");
            }
        }
    }
}
