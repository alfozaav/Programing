import java.util.Scanner;

public class Centinela {
    public static void main(String[] args) {

        //Objeto de entrada nuevo
        Scanner entrada = new Scanner(System.in);

        //Fase de inicialización
        int total = 0;
        int contadorCalificaciones = 0;

        //Fase de Procesamiento
        System.out.print("Escriba la calificación o -1 para terminar: ");
        int calificación = entrada.nextInt();

        //Iterar hasta recibir el valor centinela del ususario
        while (calificación != -1)
        {
            total = total + calificación;
            contadorCalificaciones = contadorCalificaciones + 1;

            System.out.print("Esccriba la calificación o -1 para terminar: ");
            calificación = entrada.nextInt();
        }

        //Fase de terminación
        if (contadorCalificaciones != 0)
        {
            double promedio = (double) total / contadorCalificaciones;//(double) hace que total y contadorCalificaciones que son int sean temporalmente double para que el resultado de la division pueda ser con punto décimal
            System.out.printf("%nEl total de las %d calificaciones introducidas es %d%n", contadorCalificaciones, total);
            System.out.printf("El promedio de la clase es %.2f%n", promedio);
        }
        else
            System.out.print("No se introdujeron calificaciones");
    }
}