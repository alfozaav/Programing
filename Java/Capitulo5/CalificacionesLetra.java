//  Calificaciones con letra usando Switch
import java.util.Scanner;

public class CalificacionesLetra {
    public static void main(String[] args) {
        //  Variables
        int total = 0;
        int contador = 0;
        int aCuenta = 0;
        int bCuenta = 0;
        int cCuenta = 0;
        int dCuenta = 0;
        int fCuenta = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.printf("%s%n%s%n %s%n %s%n", 
        "Introduzca las calificaciones en un rango de 0-100",
        "Escriba el indicador de fin de archivo para terminar la entrada;",
        "En UNIX/Linux/MacOs escriba <Ctrl> D y oprima Intro",
        "En Windows escriba <Ctrl> Z y oprima Intro");

        //  Itera hasta que el usuario introduzca el indicador de fin de archivo
        while (entrada.hasNext())
        {
            int calificacion = entrada.nextInt();
            total += calificacion;
            ++contador;

            //  Incrementa el contador de letra apropiado
            switch (calificacion / 10) 
            {
                case 9:
                case 10:
                    ++aCuenta;
                    break;
                
                case 8:
                    ++bCuenta;
                    break;

                case 7:
                    ++cCuenta;
                    break;

                case 6:
                    ++dCuenta;
                    break;

                default:
                    ++fCuenta;
                    break;
            }
        }

        //  Muestra reporte de calificaciones
        System.out.printf("%n Reporte de Calificaciones: %n");

        //  Si el usuario introdujo al menos una calificacion
        if (contador != 0)
        {
            //  Calcula el promedio
            double promedio = (double) total / contador;

            //  Muestra el resumen en pantalla
            System.out.printf("El total de las %d calificaciones introducidas es %d%n", contador, total);
            System.out.printf("El promedio de la clase es %.2f%n", promedio);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
            "A: ", aCuenta,
            "B: ", bCuenta,
            "C: ", cCuenta,
            "D: ", dCuenta,
            "F: ", fCuenta);
        }
        else
            System.out.print("No se introdujeron calificaciones");
    }
}