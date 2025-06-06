public class Arrays {
    public static void main(String[] args) {
        // Arrays
        int[] enteros = new int[5];

        // Modificar los elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;

        for (int i = 0; i < enteros.length; i++) {
            System.out.println("Posición " + i + ": " + enteros[i]);
        }

        System.out.printf("\nOtra forma de inicializar un array");
        // Otra manera de inicializar arrays
        int[] numeros = {24, 50, 45, 70, 80};
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("\nPosición " + i + ": " + numeros[i]);
        }
    }
}