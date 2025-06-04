import java.util.Scanner;

public class IdentificarEstacion {
    public static void main(String[] args) {
        System.out.println("*** Identificar la Estación del Año ***");
        System.out.print("Introduce el número del mes para comprobar en qué estación se encuentra: ");

        Scanner entrada = new Scanner(System.in);
        int mes = entrada.nextInt();


        switch (mes){
            case 1,2,12:
                System.out.println("Invierno");
                break;
            case 3,4,5:
                System.out.println("Primavera");
                break;
            case 6,7,8:
                System.out.println("Verano");
                break;
            case 9,10,11:
                System.out.println("Otoño");
                break;
            default:
                System.out.println("Mes inválido");
                break;
        }
    }
}
