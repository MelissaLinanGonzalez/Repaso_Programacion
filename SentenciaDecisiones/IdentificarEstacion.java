import java.util.Scanner;

public class IdentificarEstacion {
    public static void main(String[] args) {
        System.out.println("*** Identificar la Estación del Año ***");
        System.out.print("Introduce el número del mes para comprobar en qué estación se encuentra: ");

        Scanner entrada = new Scanner(System.in);
        int mes = entrada.nextInt();

        if (mes == 1 || mes == 2 || mes == 12){
            System.out.println("El mes " + mes + " es Invierno");
        } else if (mes >= 3 && mes <= 5) {
            System.out.println("El mes " + mes + " es Primavera");
        } else if (mes >= 6 && mes <= 8) {
            System.out.println("El mes " + mes + " es Verano");
        } else if (mes >= 9 && mes <= 11) {
            System.out.println("El mes " + mes + " es Otoño");
        } else {
            System.out.println("El mes " + mes + " no pertenece a ninguna estación conocida");
        }
    }
}
