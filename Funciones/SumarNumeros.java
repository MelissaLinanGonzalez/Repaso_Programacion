public class SumarNumeros {
    // Se define la función de sumar
    static int sumar(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int a = 3, b = 5;
        int resultado = sumar(a, b);
        System.out.println("Resultado de la suma (" + a + " + " + b + "): " + resultado);
    }
}
