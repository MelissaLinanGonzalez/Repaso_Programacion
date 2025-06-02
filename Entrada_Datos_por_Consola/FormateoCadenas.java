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

        int numeroEmpleado = 12; // Se va a mostrar con 4 digítos si el valor introducido no cumple esta condición, si no lo cumpliese se añadirian los 0 necesarios a la izquierda
        // Formateo con text block
        mensaje = """
                %nDetalle Persona:\s
                -------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: %.2f €
                """.formatted(nombre, numeroEmpleado, edad, salario);

        System.out.println(mensaje);

        // Formateo con text block y printf
        System.out.printf("""
                %nDetalle Persona:\s
                -------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: %.2f €
                """, nombre, numeroEmpleado, edad, salario);
    }
}
