public class OperadoresLogicos {
    public static void main(String[] args) {
        //  Crea una tabla de verdad para el valor && (AND condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "AND condicional (&&)", "false && false", (false && false),
        "false && true", (false && true),
        "true && false", (true && false),
        "true && true", (true && true) );

        //  Crea una tabla de verdad para el valor || (OR condicional)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "OR condicional (||)", "false || false", (false || false),
        "false || true", (false || true),
        "true || false", (true || false),
        "true || true", (true || true) );

        //  Crea una tabla de verdad para el valor & (AND lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "AND lógico booleano (&)", "false & false", (false & false),
        "false & true", (false & true),
        "true & false", (true & false),
        "true & true", (true & true) );

        //  Crea una tabla de verdad para el valor | (OR inclusivo lógico booleano)
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
        "OR inclusivo lógico booleano (|)", "false | false", (false | false),
        "false | true", (false | true),
        "true | false", (true | false),
        "true | true", (true | true) );

        //  Crea una tabla de verdad para el valor ! (negación lógica)
        System.out.printf("%s%n%s: %b%n%s: %b%n", "NOT logico (!)",
        "!false", (!false), "!true", (!true));
    }
}