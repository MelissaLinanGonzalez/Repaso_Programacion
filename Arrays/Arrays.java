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
    }
}