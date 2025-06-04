import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("*** Casa de los Espejos ***");
        Scanner entradad = new Scanner(System.in);
        System.out.print("¿Cuántos años tienes?: ");
        int edad = entradad.nextInt();
        System.out.print("¿Te da miedo la oscuridad? (true/false): ");
        boolean miedo = entradad.nextBoolean();

        final int EDAD_MINIMA_PERMITIDA = 10;

        if (edad >= EDAD_MINIMA_PERMITIDA && !miedo){
            System.out.printf("""
                    !Perfecto, cumples con los siguientes requisitos!:
                    Edad: %d años.
                    Miedo a la oscuridad: %b.
                    """, edad, miedo);
        } else {
            System.out.println("No puedes entrar a la Casa de los Espejos");
        }
    }
}
