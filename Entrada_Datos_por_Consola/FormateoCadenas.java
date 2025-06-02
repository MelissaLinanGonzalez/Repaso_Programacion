public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de cadenas ***");
        String nombre = "Matías";
        int edad = 35;
        double salario = 21000.50;

        // String.format
        String mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n", nombre, edad, salario);
    }
}
