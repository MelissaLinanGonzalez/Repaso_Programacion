import java.util.Scanner;

public class TipoDeDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        //Leer tipo int
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = entrada.nextInt();
        System.out.println("Tienes " + edad + " años");

        //Leer tipo double
        System.out.print("Introduce tu altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Mides " + altura + " metros");

        //Leer tipo String
        //Es importante que una vez introducido un tipo int o double hay que limpiar el buffer para poder introducir un tipo String
        entrada.nextLine();
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Te llamas: " + nombre);
        
        //Conversion de datos para que no haya dificultad a la hora de introducir diferentes tipos de datos como en el caso anterior
        System.out.print("Introduce un número entero: ");
        String stringEntero = entrada.nextLine();
        int entero = Integer.parseInt(stringEntero); 
        System.out.println("entero = " + entero);
        
        //Tipo float
        System.out.print("Proporciona un número que sea flotante: ");
        float flotante = Float.parseFloat(entrada.nextLine());
        System.out.println("flotante = " + flotante);

        //
    }
}
