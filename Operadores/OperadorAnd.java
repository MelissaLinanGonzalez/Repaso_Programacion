public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador 'and' ***");
        boolean a = true, b = false;

        // and (solo regresa true si ambos valores son true)
        boolean resultado = a && b;
        System.out.println(resultado);

        // El único caso en el que el resultado es true
        b = true;
        resultado = a && b;
        System.out.println(resultado);
    }
}
