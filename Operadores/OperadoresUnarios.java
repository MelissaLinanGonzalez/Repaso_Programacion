public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;

        boolean c = true;

        // Operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        // Operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // Operadores unarios incremento/decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; // Primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya incrementada: " + a);

        // Post-incremento
        a = 3;
        resultado = a++; // Primero se usa el valor y después se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a, ahora se incrementa: " + a); // Como se utiliza ahora la variable a, se incrementa

        // Pre-decremento
        b = -2;
        resultado = --b; // Primero se decrementa y después se usa el valor
        System.out.println("resultado --b = " + resultado);
        System.out.println("b ya decrementada: " + b);

        // Post-decremento
        b = -2;
        resultado = b--; // Primero se usa el valor y después se decrementa la próxima vez que se use la variable b
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b en este momento se decrementa: " + b);


    }
}
