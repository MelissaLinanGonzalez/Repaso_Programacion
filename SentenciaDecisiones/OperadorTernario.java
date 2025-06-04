import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");

        // Sintaxis
        // Condicion ? expresion1 : expresion2

        // Determinar si un número es par o no
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número para determinar si es o no par: ");
        int num = entrada.nextInt();
        var resultado = (num % 2 == 0) ? "Par": "Impar";

        System.out.println(resultado);

        // Calcular si es mayor de edad
        System.out.print("Introduce la edad para determinar si es mayor de edad o no: ");
        int edad = entrada.nextInt();
        var resultado2 = (edad >= 18) ? "Mayor": "Menor";
        System.out.println(resultado2);
    }
}
