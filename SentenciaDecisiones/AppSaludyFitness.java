import java.util.Scanner;

public class AppSaludyFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        final int META_PASOS_DIARIO = 10000;
        final double CALORIAS_POR_PASO = 0.04;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Introduce los pasos dados hoy: ");
        int pasos = entrada.nextInt();

        double calorias_quemadas = pasos * CALORIAS_POR_PASO;

        String metaAlcanzada = (pasos >= META_PASOS_DIARIO) ? "¡Si :)!": "¡No :(!";

        System.out.printf("""
                \n¡Hola %s!
                \tHas andado un total de %d pasos.
                \tHas quemado un total de %.2f kcal.
                \tMeta de pasos diarios alcanzada: %s
                """, nombre, pasos, calorias_quemadas, metaAlcanzada);
    }
}
