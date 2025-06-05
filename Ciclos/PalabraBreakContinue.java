public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y Continue ***");

        // Ejemplo break, imprimir solo el primer número par
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
                break;
            }
        }

        // Ejemplo con continue. Imprimir solo números pares, ignorando los impares
        System.out.println("\nContinue: ");
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
