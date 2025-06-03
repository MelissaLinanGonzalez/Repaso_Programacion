// Realizar un programa para saber si el valor proporcionado se encuentra dentro de un rango definido entre 0 y 5

import java.util.Scanner;

public class EjemploAnd {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Solicitar el número
        System.out.print("Introduce un valor entre 0 y 5: ");

        final int MINIMO = 0;
        final int MAXINO = 5;
        int num = entrada.nextInt();

        // Se pregunta si el número proporcionado está dentro del rango
        if (num >= MINIMO && num <= MAXINO){
            System.out.println("¡SI! El número proporcionado está dentro del rango");
        } else {
            System.out.println("¡NO! El número proporcionado está fuera del rango");
        }
    }
}
