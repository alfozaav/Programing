//Programa que recibe números enteros y muestra la suma
import java.util.Scanner; //El programa usa la clase Scanner

public class Suma 
{
    //El método main empieza la ejecución de la aplicación
    public static void main(String[] args) {
        //Crea objeto Scanner para obtener la entrada de la vetana de Comandos
        
        Scanner entrada = new Scanner(System.in);

        int numero1; //1° Número a sumar
        int numero2; //2° Número a sumar
        int suma; //3° Suma de numero1 y numero2

        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();//Lee el primer número

        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();//Lee el segundo número

        suma = numero1 + numero2;

        System.out.printf("La suma es %d%n", suma);
    }
}