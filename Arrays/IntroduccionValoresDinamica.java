import java.util.Scanner;

public class IntroduccionValoresDinamica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Proporciona la longitud del array: ");
        int longitud = entrada.nextInt();

        // Creamos el array con la longitud proporcionada por el usuario
        int[] enteros = new int[longitud];

        // Solicitamos los valores del array
        for (int i = 0; i < enteros.length; i++) {
            System.out.print("Introduce el valor para el índice " + i + ": ");
            int num = entrada.nextInt();
            enteros[i] = num;
        }
        System.out.println("*** Los números introducidos son los siguientes ***");

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Índice " + i + ": " + enteros[i]);
        }
    }
}
