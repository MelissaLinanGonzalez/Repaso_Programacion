public class SumaNumerosConsecutivos {
    public static void main(String[] args) {
        System.out.println("*** Suma de números consecutivos usando while ***");
        int contador = 0;
        int suma = 0;
        while (contador <= 5){
            suma += contador;
            System.out.println(suma);
            contador++;

        }
        System.out.println("Suma total: " + suma);
    }
}
