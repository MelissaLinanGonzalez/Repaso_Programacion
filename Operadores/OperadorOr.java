public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador Or ***");
        boolean a = true, b = false;

        boolean resultado = a || b; // Devuelve true si cualquiera de los valores es true.
        System.out.println("Resultado: " + resultado);

        // Para que el resultado sea false, ambos tienen que ser false
        a = false;
        resultado = a || b;
        System.out.println("Resultado con ambos en false: " + resultado);
    }
}
