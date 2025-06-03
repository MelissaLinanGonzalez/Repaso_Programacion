public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignación ***");
        // Asignación simple =
        int miNumero = 10;
        System.out.println("Valor inicial: " + miNumero);
        // Operadores de asignación compuestos
        // +=
        miNumero += 5; // miNumero = miNumero + 5;
        System.out.println("Valor incrementado: " + miNumero);

        // -=, *=, /= y %=
        miNumero *= 2; // miNUmero = miNumero * 2 -> 30
        System.out.println("Valor de miNumero *= 2: " + miNumero);

        // Asignación de variables múltiples
        int a = 10, b = 15, c = 20;
        //Todas las variables tienen que ser del mismo tipo y cada variable tiene que inicializarse con el tipo de dato correspondiente
        System.out.printf("a = %d, b = %d, c = %d", a, b, c);
    }
}
