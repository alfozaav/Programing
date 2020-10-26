import java.util.Scanner;

public class PromedioClase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int total = 0;

        int contadorCalificaciones = 1;

        while (contadorCalificaciones <= 10)
        {
            System.out.print("Escriba la calificación: ");
            int calificación = entrada.nextInt();

            total = total + calificación;
            contadorCalificaciones = contadorCalificaciones + 1;
        }

        int promedio = total / 10;

        System.out.printf("El total de las 10 calificaciones es %d%n", total);
        System.out.printf("El promedio de la clase es %d%n", promedio);
    }
}