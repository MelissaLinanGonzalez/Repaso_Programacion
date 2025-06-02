import java.util.Scanner;

/**
 * Crear un programa para solicitar los valores más importantes de una receta de cocina.
 *
 * Los valores que debe introducir el usuario son:
 * -Nombre de la Receta
 * -Ingredientes principales
 * -Tiempo de preparación (min)
 * -Dificultad (Fácil, Media o Difícil)
 *
 * Al finalizar se debe imprimir por pantalla la receta*/

public class Ejemplo_RecetaCocina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("*** Recetas de Cocina ***");

        System.out.print("Introduce el nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Introduce los ingredientes: ");
        String ingredientes = entrada.nextLine();

        System.out.print("Introduce el tiempo de preparación (min): ");
        int tiempo = entrada.nextInt();

        System.out.print("Introduce la dificultad (Fácil/Medio/Difícil): ");
        entrada.nextLine();
        String dificultad = entrada.nextLine();

        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre receta : " + nombre);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparación: " + tiempo + " minutos");
        System.out.println("\tDificultad: " + dificultad);
    }
}
