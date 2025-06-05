public class SumaNumerosConsecutivos {
    public static void main(String[] args) {
        System.out.println("*** Suma de números consecutivos usando while ***");
        int contador = 0;
        int suma = 0;
        while (contador <= 5){
            System.out.println("(Suma inicial + número a sumar) -> " + suma + " + " + contador);
            suma += contador;
            System.out.println("Suma resultante: " + suma);
            contador++;

        }
        System.out.println("Suma total: " + suma);
    }
}
