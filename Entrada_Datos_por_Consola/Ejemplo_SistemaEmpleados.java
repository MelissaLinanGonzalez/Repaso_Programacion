import java.util.Scanner;

/**
 * Se solicita crear un programa para pedir la información de un empleado. Los datos solicitados se deben introducir por consola.
 * -Nombre del Empleado
 * -Edad (int)
 * -Salario (double)
 * -Es Jefe de Departamento (boolean)
 * Una vez que se han optenido los datos, se debe imprimir por pantalla*/

public class Ejemplo_SistemaEmpleados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce el nombre del empleado: ");
        String nombre = entrada.nextLine();

        System.out.print("Introduce la edad del empleado: ");
        int edad = entrada.nextInt();

        System.out.print("Introduce el salario del empleado: ");
        double salario = entrada.nextDouble();

        entrada.nextLine();
        System.out.print("¿El empleado introducido es jefe de departamento?(true/false): ");
        String esJefe = entrada.nextLine();
        boolean jefe = Boolean.parseBoolean(esJefe);

        System.out.println("\n*** Detalles del empleado ***");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad: " + edad);
        System.out.println("\tSalario: " + salario);
        System.out.println("\t¿Es jefe de departamento? " + jefe);
    }
}
