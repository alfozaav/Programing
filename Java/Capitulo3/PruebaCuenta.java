import java.util.Scanner;

public class PruebaCuenta {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Jane Green", 50.00);
        Cuenta cuenta2 = new Cuenta("John Blue", -7.53);

        System.out.printf("El saldo de %s es: %.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("El saldo de %s es: %.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        //Objeto de entrada Scanner

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Escriba el monto a depositar para la cuenta de %s%n", cuenta1.obtenerNombre());
        double montoDeposito = entrada.nextDouble();
        System.out.printf("Depositando %.2f a la cuenta de %s%n", montoDeposito, cuenta1.obtenerNombre());
        cuenta1.depositar(montoDeposito);
        
        System.out.printf("El saldo de %s es: %.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("El saldo de %s es: %.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());

        System.out.printf("Escriba el monto a depositar para la cuenta de %s%n", cuenta2.obtenerNombre());
        montoDeposito = entrada.nextDouble();
        System.out.printf("Depositando %.2f a la cuenta de %s%n", montoDeposito, cuenta2.obtenerNombre());
        cuenta2.depositar(montoDeposito);

        System.out.printf("El saldo de %s es: %.2f%n", cuenta1.obtenerNombre(), cuenta1.obtenerSaldo());
        System.out.printf("El saldo de %s es: %.2f%n", cuenta2.obtenerNombre(), cuenta2.obtenerSaldo());
    }
}