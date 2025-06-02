/*
 * Se solita un programa para generar un valor de ID (Identificador) único para cada persona.
 *El programa debe solicitar al usuario:
 * -Nombre
 * -Apellido
 * -Año de Nacimiento (YYYY)
 *
 * El programa deberá generar un valor aleatorio de 4 dígitos, entre 1 y 1999. Si el número generado es menor a 4 dígitos se debe completar el valor con ceros a la izquierda.
 *
 * Finalmente con los datos obtenidos se debe generar un valor de ID único, uniendo los valores de la siguiente forma:
 * Nombre: Juan -> JU
 * Apellido: Perez -> PE
 * Año: 1995 -> 95
 * Aleatorio: 0736
 * ID Único: JUPE950736
 * */

import java.util.Random;
import java.util.Scanner;

public class Ejemplo_GeneradorIDUnico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("*** Sistema Generador de ID Único ***");

        // Introducción del nombre
        System.out.print("Introduce tu nombre: ");
        String nombre = entrada.nextLine();

        // Introducción del apellido
        System.out.print("Introduce tu apellido: ");
        String apellido = entrada.nextLine();

        // Introducción del año de nacimiento, en String ya que es más fácil de manejar y obtener los 2 últimos dígitos
        System.out.print("Introduce tu año de nacimiento (YYYY): ");
        String anio = entrada.nextLine();

        // Seleccionamos los valores deseados, del nombre y apellido, las dos primeras y del año las dos últimas
        String nom = nombre.substring(0,2).toUpperCase();
        String ape = apellido.substring(0,2).toUpperCase();
        String an = anio.substring(anio.length() - 2);

        // Se genera el número aleatorio entre 1 y 1999 y se formatea a 4 dígitos, añadiendo 0 a la izquierda si no tiene 4 dígitos
        Random random = new Random();
        int num = random.nextInt(1999) + 1;
        String numeroFormateado = String.format("%04d", num);

        // Se concatenan los valores deseados del orden pedido
        String ID = nom + ape + an + numeroFormateado;

        System.out.printf("""
                %nHola %s
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \tFELICIDADES!
                """, nombre.substring(0,1).toUpperCase() + nombre.substring(1), ID);
    }
}
