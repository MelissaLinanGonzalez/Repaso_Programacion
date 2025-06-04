import java.util.Scanner;

public class SentenciaIf {
    public static void main(String[] args) {
        // Uso de la sentencia If

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad para determinar si eres o no mayor de edad: ");
        int edad = entrada.nextInt();

        if (edad >= 18){
            System.out.println("¡ERES MAYOR DE EDAD!");
        } else if (edad > 13 && edad < 18){
            System.out.println("Eres adelescente");
        } else {
            System.out.println("Eres un niño todavía");
        }
    }
}